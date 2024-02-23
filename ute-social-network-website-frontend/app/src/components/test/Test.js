import React, { useEffect, useState } from 'react';
import axios from 'axios'

export const Test = (props) => {
    const data = [
        {
            "id" : 1,
            "name": "Tan"
        },
        {
            "id": 2,
            "name" : "trieu"
        }
    ]
    useEffect (()=>{
        axios.get("https://reqres.in/api/users?page=2").then(data=>
        {
            console.log("checkkkkkk", data)
        })     
    },[])
  return (
    <div>
        <h2> List Employee</h2>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Tên</th>
                </tr>
            </thead>
            <tbody>
            {
                data.map(employee =>
                <tr key={employee.id}>
                    <td>{employee.id}</td>
                    <td>{employee.name}</td>
                </tr>)
            }
               
            </tbody>
        </table>
    </div>
  )
}
