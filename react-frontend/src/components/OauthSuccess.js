// src/pages/OAuthSuccess.js
import { useEffect, useState } from "react";
import axios from "axios";

export default function OAuthSuccess() {
    const [user, setUser] = useState(null);

    // Set base URL depending on environment
    const API_BASE_URL = import.meta.env.PROD
        ? "https://ai-customer-support-chatbot-system.onrender.com"
        : "http://localhost:8081"; // Your Spring Boot port locally

    useEffect(() => {
        axios.get(`${API_BASE_URL}/api/user/me`, {
            withCredentials: true, // Needed to send cookies
        })
            .then(res => {
                setUser(res.data);
            })
            .catch(err => {
                console.error("Failed to fetch user", err);
            });
    }, []);

    if (!user) return <p>Loading user info...</p>;

    return (
        <div>
            <h2>Welcome, {user.name}!</h2>
            <p>Email: {user.email}</p>
            <img src={user.picture} alt="User avatar" style={{ width: 100, borderRadius: "50%" }} />
        </div>
    );
}
