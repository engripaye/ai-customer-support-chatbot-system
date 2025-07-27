// pages/OAuthSuccess.js
import { useEffect, useState } from "react";
import axios from "axios";

export default function OAuthSuccess() {
    const [user, setUser] = useState(null);

    useEffect(() => {
        axios.get("http://localhost:8081/api/user/me", { withCredentials: true })
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
            <img src={user.picture} alt="User avatar" style={{ width: 100 }} />
        </div>
    );
}
