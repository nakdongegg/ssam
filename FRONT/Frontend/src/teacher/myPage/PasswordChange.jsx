import change from "./PasswordChange.module.css"

const PasswordChange = () => {
  return (
    <div>
      <div className={change.menuArray}>
        <div className={change.updateMenu}>
          <h1>회원정보 수정</h1>
        </div>
        <div className={change.changeMenu}>
          <h1>비밀번호 변경</h1>
        </div>
      </div>
      <h1>비밀번호 변경</h1>
    </div>
  );
};

export default PasswordChange;
