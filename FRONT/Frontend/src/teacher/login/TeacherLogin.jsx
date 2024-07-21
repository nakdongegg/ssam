import login from "./TeacherLogin.module.css";
import round1 from "../../assets/round1.png";
import round2 from "../../assets/round2.png";
import google from "../../assets/google.png";
import naver from "../../assets/naver.png";
import kakao from "../../assets/kakao.png";

const TeacherLogin = () => {
  return (
    <div className={login.loginArray}>
      <h1 className={login.loginTitle}>로그인</h1>
      <div className={login.loginFormArray}>
        <div className={login.loginBackground}>
          <form action="" className={login.loginForm}>
            <input type="text" placeholder="아이디" />
            <input type="password" placeholder="비밀번호" />
            <button className={login.loginBtn}>로그인</button>
            <div className={login.loginRoute}>
              <p>회원가입</p>
              <p>아이디 / 비밀번호 찾기</p>
            </div>
            <button className={login.googleBtn}>
              <img src={google} className={login.googleImg} alt="google" />
              <p>구글로 시작하세요</p>
            </button>
            <button className={login.naverBtn}>
              <img src={naver} className={login.naverImg} alt="naver" />
              <p>네이버로 시작하세요</p>
            </button>
            <button className={login.kakaoBtn}>
              <img src={kakao} className={login.kakaoImg} alt="kakao" />
              <p>카카오로 시작하세요</p>
            </button>
          </form>
        </div>
      </div>
      <img src={round1} className={login.round1} alt="round1" />
      <img src={round2} className={login.round2} alt="round2" />
      <img src={round1} className={login.round3} alt="round1" />
    </div>
  );
};

export default TeacherLogin;
