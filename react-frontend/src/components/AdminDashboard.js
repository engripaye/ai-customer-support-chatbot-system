import React, { useEffect, useState } from 'react';
import axios from 'axios';

const AdminDashboard = () => {
    const [chatLogs, setChatLogs] = useState([]);

    useEffect(() => {
        const fetchChatLogs = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/admin/chatlogs', {
                    headers: { Authorization: `Bearer ${localStorage.getItem('token')}` },
                });
                setChatLogs(response.data);
            } catch (error) {
                console.error('Error fetching chat logs:', error);
            }
        };
        fetchChatLogs();
    }, []);

    return (
        <div>
            <h2>Admin Dashboard</h2>
            <h3>Chat Logs</h3>
            <ul>
                {chatLogs.map((log) => (
                    <li key={log.id}>
                        User: {log.userId} | Message: {log.message} | Response: {log.response}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default AdminDashboard;