import React from 'react';
import { Label, Input, Button } from 'reactstrap';

interface IState {
    item: {
        itemId: number,
        description: string,
        price: number,
        list:string
        
    }
    message: string
}
export class Createitem extends React.Component<{}, IState>{
    constructor(props: any) {
        super(props);
        this.state = {
            item: {
                itemId: 0,
                description: '',
                price: 0,
                list:''
            },
            message: ''

        }
        this.clear = this.clear.bind(this);
        this.handleChange = this.handleChange.bind(this);
    }



    clear = () => {
        this.setState({
            ...this.state,
            item: {
                itemId: 0,
                description: '',
                price: 0,
                list:''
            }

        })

    }

    handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        this.setState({
            ...this.state,
            item: {
                ...this.state.item,
                [event.target.name]: event.target.value
            }
        })
    }
    submit = async (event: any) => {
        event.preventDefault();
        const newitem = {
            ...this.state.item,
            itemId: 0,
            list: null
        }

        const resp = await fetch('http://localhost:8012/items', {


            credentials: 'include',
            method: 'Post',
            headers: {
                'content-type': 'application/json'

            },

            body: JSON.stringify(newitem)
        })

        const itemFromServer = await resp.json();

        this.setState({

            ...this.state,
            message: 'item created with ID =' + itemFromServer.itemId
        })



    }

    render() {
        return (
            <form onSubmit={this.submit}>
                <p>{this.state.message}</p>
                <Label>item ID</Label>
                <Input
                    type="text"
                    name="itemId"
                    value={this.state.item.itemId}
                    onChange={this.handleChange}
                ></Input>
                <label>description</label>

                <Input
                    type="text"
                    name="description"
                    value={this.state.item.description}
                    onChange={this.handleChange}
                ></Input>

                <label>price</label>
                <Input
                    type="number"
                    name="price"
                    value={this.state.item.price}
                    onChange={this.handleChange}
                ></Input>

                <Button className="btn-lg btn-primary" type="submit">Create</Button>
                <Button className="btn-lg btn-secondary" onClick={this.clear}>Clear</Button>



            </form>
        )
    }

}