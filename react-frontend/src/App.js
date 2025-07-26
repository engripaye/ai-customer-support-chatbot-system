import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Chat from './components/Chat';
import AdminDashboard from './components/AdminDashboard';

const App = () => {
  return (
      <Router>
        <Switch>
          <Route path="/chat" component={Chat} />
          <Route path="/admin" component={AdminDashboard} />
        </Switch>
      </Router>
  );
};

export default App;