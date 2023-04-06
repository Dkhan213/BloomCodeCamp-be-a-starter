import React, { Component } from 'react';
import './App.css';
import { getAllUsers } from './client';
import {
  Table
} from 'antd'

class App extends Component {

  state = {
    users: []
  }

  componentDidMount () {
    this.fetchUsers();
  }

  fetchUsers = () => {
    getAllUsers()
      .then(res => res.json()
      .then(users => {
        console.log(users);
        this.setState({
          users
        })
      }));
  }

  render() {

    const { users } = this.state;

    if (users && users.length) {

      const columns = [
        {
          title: 'UserId',
          dataIndex: 'id',
          key: 'id'
        },
        {
          title: 'Cohort Start Date',
          dataIndex: 'cohortStartDate',
          key: 'cohortStartDate'
        }
      ]

      return (
        <Table 
        dataSource={users}
        columns={columns}
        rowKey='id'/>
      );
    }

    return <h1>No Users Found</h1>
  };
}

export default App;
