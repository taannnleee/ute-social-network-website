import React from 'react';
import styled from "styled-components";
import 'bootstrap/dist/css/bootstrap.min.css';


const StyledFormLogin = styled.button`
    background-color: red;
    /* Thêm các thuộc tính CSS tùy chỉnh cho nút ở đây */
`;

// Hàm bên dưới là sử dụng bootstrap á mấy ní. mấy ní muososn dùng thì nhớ phải có cái inport ở dòng 3
const FormLogin = (props) => {
    return (
        <div className="container">

            {/* <StyledFormLogin>{props.children}</StyledFormLogin> */}

            <div className="row">
                <div className="col-md-6">
                    <form action="/customer_authentication/login" method="post">
                        <h3>Login</h3>
                        <h3><a href="/home"><i id="homeIcon" className="fa-solid fa-house "></i></a></h3>
                        <div className="form-group">
                            <label htmlFor="email">Email</label>
                            <input type="text" className="form-control" placeholder="Email" name="email" id="email" />
                        </div>
                        <div className="form-group">
                            <label htmlFor="password">Password</label>
                            <input type="password" className="form-control" placeholder="Password" name="password" id="password" />
                        </div>
                        {/* <label th:text="${result}"></label> */}
                        <button type="submit" className="btn btn-primary">Login</button>
                        <p><a href="/customer_authentication/changePassword">Change password</a></p>
                        <p><a href="/customer_authentication/forgot-pass">Forgot password?</a></p>
                        <p>Don't have an account? <a href="/customer_authentication/register">Register here</a></p>
                        <div className="social">
                            <div className="go"><i className="fab fa-google"></i>  Google</div>
                            <div className="fb"><i className="fab fa-facebook"></i>  Facebook</div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
};

export default FormLogin;
