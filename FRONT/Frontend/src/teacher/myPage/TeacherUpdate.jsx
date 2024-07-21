import update from "./TeacherUpdate.module.css";

const TeacherUpdate = () => {
  return (
    <div>
      <div className={update.menuArray}>
        <div className={update.updateMenu}>
          <h1>회원정보 수정</h1>
        </div>
        <div className={update.changeMenu}>
          <h1>비밀번호 변경</h1>
        </div>
      </div>
      <div className={update.infoArray}>

      </div>
    </div>
  );
};

export default TeacherUpdate;
