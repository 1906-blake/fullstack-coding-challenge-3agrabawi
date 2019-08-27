import React from 'react';
import { Table, Input, Button } from 'reactstrap';
import { list } from '../../models/thelist';


interface IState {
    lists: list[]
    listId: number
}

export class Getlists extends React.Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
            lists: [],
            listId: 0
        };
        this.handleChange = this.handleChange.bind(this);
    }
    componentDidMount = async () => {
        const resp = await fetch('http://localhost:8012/list', {
            credentials: 'include'
        })
        const lists = await resp.json();
        this.setState({
            ...this.state,
            lists
        })
    }


    handleChange(event: any) {
        this.setState({
            ...this.state,
            listId: event.target.value
        })
    }

    findById = async () => {
        const resp = await fetch('http://localhost:8012/lists/' + this.state.listId, {
            credentials: 'include'
        })
        const list = await resp.json();
        this.setState({
            ...this.state,
            lists: [list]
        })
    }
    render() {
        const lists = this.state.lists
        return (
            <div>
                <Input
                    type="number"
                    value={this.state.listId}
                    onChange={this.handleChange}
                >

                </Input>
                <Button onClick={this.findById}>Find</Button>

                <Table>
                    <thead>
                        <tr>
                            <th>list ID</th>
                            <th>list Name</th>
                            <th>quantity</th>
                            <th>type </th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            lists && lists.map(list =>
                                <tr>
                                    <th scope="row">{list.listId}</th>
                                    <td>{list.listName}</td>
                                    <td>{list.quantity} value</td>
                                    <td>{list.type}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </Table>
            </div>
        )
    }
}






// import React from 'react';
// import { list } from '../../models/thelist';
// import { item } from '../../models/theitem';


// interface IlistCardProps {
//   list: list;
// }

// export class listCardComponent extends React.PureComponent<IlistCardProps> {
//   render() {
//     const list = this.props.list;
//     console.log(list);
//     return (
//       <div className="card">
//         <div className="card-body">
//           <h5 className="card-title">{list.listName}</h5>
//         </div>
//         <ul className="list-group list-group-flush">
//           <li className="list-group-item">list ID: {list.listId}</li>
//           <li className="list-group-item">Quantity: {list.quantity}</li>
//           <li className="list-group-item">Type: {list.type}</li>
//           <li className="list-group-item">
//             <button className="btn btn-danger">remove</button>
//           </li>
//         </ul>
//       </div>
//     )
//   }
// }