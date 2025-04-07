function Greeting({ avatar }) {
    return (
      <section className="greetings">
        <div className="greetings-text">
          <h1>Good Morning, Wonwoo!</h1>
          <p>Check all your incoming and outgoing transactions here</p>
        </div>
        <div className="profile">
          <div className="profile-name">
            <h3>Jeon Wonwoo</h3>
            <p>Personal Account</p>
          </div>
          <img src={avatar} height="100px" width="100px" />
        </div>
      </section>
    );
  }
  
  export default Greeting;