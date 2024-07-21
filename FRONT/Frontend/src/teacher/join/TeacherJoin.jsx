import join from "./TeacherJoin.module.css";
import round1 from "../../assets/round1.png";
import round2 from "../../assets/round2.png";
import human from "../../assets/human.png";
import lock from "../../assets/lock.png";
import mail from "../../assets/mail.png";
import search from "../../assets/search.png";
import calendar from "../../assets/calendar.png";
import phone from "../../assets/phone.png";

const TeacherJoin = () => {
  return (
    <div className={join.joinArray}>
      <h1 className={join.joinTitle}>회원가입</h1>
      <div className={join.joinFormArray}>
        <div className={join.joinBackground}>
          <form action="" className={join.joinForm}>
            <div>
              <img src={human} className={join.joinIcon} alt="human" />
              <input type="text" placeholder="아이디" />
            </div>
            <hr />
            <div>
              <img src={lock} className={join.joinIcon} alt="lock" />
              <input type="password" placeholder="비밀번호" />
            </div>
            <hr />
            <div>
              <img src={mail} className={join.joinIcon} alt="mail" />
              <input type="email" placeholder="이메일" />
            </div>
            <hr />
            <div>
              <img src={search} className={join.joinIcon} alt="search" />
              <input type="search" placeholder="학교 검색" />
            </div>
            <hr />
            <div>
              <img src={human} className={join.joinIcon} alt="human" />
              <input type="text" placeholder="이름" />
            </div>
            <hr />
            <div>
              <img src={calendar} className={join.joinIcon} alt="calendar" />
              <input type="text" placeholder="생년월일 8자리" />
            </div>
            <hr />
            <div>
              <img src={phone} className={join.joinIcon} alt="phone" />
              <input type="tel" placeholder="휴대전화 번호" />
            </div>
            <div className={join.joinBtnArray}>
              <button className={join.joinBtn}>가입</button>
              <button className={join.joinBtn}>취소</button>
            </div>
          </form>
        </div>
      </div>

      <img src={round1} className={join.round1} alt="round1" />
      <img src={round2} className={join.round2} alt="round2" />
      <img src={round1} className={join.round3} alt="round1" />
    </div>
  );
};

export default TeacherJoin;
