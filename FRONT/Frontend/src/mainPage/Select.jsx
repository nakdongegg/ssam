// 메인 페이지 선택란

import select from "./Select.module.css";
import teacher from "../assets/teacher.png";
import parents from "../assets/parents.png";
import round1 from "../assets/round1.png";
import round2 from "../assets/round2.png";
// import arrow from "../assets/arrow.png";

const Select = () => {
  return (
    <div className={select.selectArray}>
      <h1 className={select.mainTxt}>온라인 화상 상담 시스템, SSAM</h1>
      <div className={select.menuBoxArray}>
        <div className={select.menuBox}>
          <div className={select.menuTxt}>
            <h1>선생님 →</h1>
            <h3>선생님으로 시작하세요</h3>
          </div>
          {/* <img src={arrow} className="arrowimg1" alt="arrow" /> */}
          <img src={teacher} className={select.teacherImg} alt="teacher" />
        </div>
        <div className={select.menuBox}>
          <div className={select.menuTxt}>
            <h1>학생 / 학부모 →</h1>
            <h3>학생과 자녀가 있는 학부모</h3>
          </div>
          {/* <img src={arrow} className="arrowimg2" alt="arrow" /> */}
          <img src={parents} className={select.parentsImg} alt="parents" />
        </div>
      </div>
      <img src={round1} className={select.round1} alt="round1" />
      <img src={round2} className={select.round2} alt="round2" />
      <img src={round1} className={select.round3} alt="round1" />
      <p className={select.scroll}>Scroll ▽</p>
    </div>
  );
};

export default Select;
