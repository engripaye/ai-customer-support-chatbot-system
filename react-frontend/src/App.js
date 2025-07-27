import React from 'react';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Chat from './components/Chat';
import AdminDashboard from './components/AdminDashboard';
import OauthSuccess from './components/OauthSuccess'; // ✅ Import the page

const App = () => {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Navigate to="/chat" />} />
                <Route path="/chat" element={<Chat />} />
                <Route path="/admin" element={<AdminDashboard />} />
                <Route path="/oauth-success" element={<OauthSuccess />} /> {/* ✅ Add this */}
            </Routes>
        </Router>
    );
};

export default App;
