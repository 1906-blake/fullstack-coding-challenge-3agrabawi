
import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import './App.css';

import { Navbar } from './components/navbar/nav.component';
import { item } from './models/theitem';
import { list } from './models/thelist';
const App: React.FC = () => {
 return (
   <div className="App">
     <BrowserRouter>
     <Navbar />
     <Switch>
       <Route path ="/create-item" components={item} />
       <Route path ="/get-list" components={list} />
     </Switch>
     </BrowserRouter>
   </div>
 );
}

export default App;

