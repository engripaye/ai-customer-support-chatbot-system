// src/pages/OAuthSuccess.js
import { useEffect, useState } from "react";
import axios from "axios";

export default function OAuthSuccess() {
    const [user, setUser] = useState(null);
    const [error, setError] = useState("");

    const API_BASE_URL = import.meta.env.PROD
        ? "https://ai-customer-support-chatbot-system.onrender.com"
        : "http://localhost:8081";

    useEffect(() => {
        axios.get(`${API_BASE_URL}/api/user/me`, {
            withCredentials: true,
        })
            .then(res => {
                setUser(res.data);
            })
            .catch(err => {
                console.error("❌ Failed to fetch user", err);
                setError("Could not fetch user. Make sure you're authenticated.");
            });
    }, []);


    if (error) return <p style={{ color: "red" }}>{error}</p>;
    if (!user) return <p>Loading user info...</p>;

    return (
        <div style={{ padding: "2rem", textAlign: "center" }}>
            <h2>✅ Welcome, {user.name}!</h2>
            <p>Email: {user.email}</p>
            <img src={user.picture} alt="User avatar" style={{ width: 100, borderRadius: "50%" }} />
        </div>
    );
}
