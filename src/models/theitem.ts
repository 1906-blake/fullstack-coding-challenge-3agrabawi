import { list } from "./thelist";

export class item{
    constructor (
    public itemId:number,
    public description:string,
    public price:number,
    public List:list
    ){}
}