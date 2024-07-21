// 서브 페이지 선택란

import select from "./TeacherSelect.module.css";
import classroom from "../../assets/classroom.png"
import question from "../../assets/question.png"
import appointment from "../../assets/appointment.png"

const Select = () => {
  return (
    <div className={select.menuArray}>
      <hr />
      <h1 className={select.inviteCodeBox}></h1>
      <div className={select.menuBoxArray}>
        <div className={select.menuBox}>
          <div className={select.menuTxt}>
            <h1>학급 정보</h1>
            <h3>우리 학급을 보여줍니다</h3>
            <img src={classroom} className={select.classroomImg} alt="classroom" />
          </div>
        </div>
        <div className={select.menuBox}>
          <div className={select.menuTxt}>
            <h1>문의 사항</h1>
            <h3>문의 사항을 남겨주세요</h3>
            <img src={question} className={select.questionImg} alt="question" />
          </div>
        </div>
        <div className={select.menuBox}>
          <div className={select.menuTxt}>
            <h1>상담 예약</h1>
            <h3>상담 시간을 예약하세요</h3>
            <img src={appointment} className={select.appointmentImg} alt="appointment" />
          </div>
        </div>
      </div>
      <p className={select.scroll}>Scroll ▽</p>
    </div>
  );
};

export default Select;
