import { Data } from "@angular/router"
import { Postagem } from "./postagem"

export class User{
    public id: number
    public nome: string
    public usuario: string
    public senha: string
    public foto: string
    public tipo: string  
    public dataNascimento: Data
    public postagem: Postagem[]
}