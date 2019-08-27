import React from 'react';
import { Link } from 'react-router-dom';
export class Navbar extends React.Component {
   render() {
       return (
           <nav className="navbar navbar-expand-lg navbar-light bg-light">
               <Link to="iteminfo" className="navbar-brand"></Link>
               <div className="navbar-nav">
                   <Link to="/list" className="nav-item nav-link active">List</Link>
                   <Link to="/item" className="nav-item nav-link">Item</Link>
               </div>
           </nav>
       )
   }
}