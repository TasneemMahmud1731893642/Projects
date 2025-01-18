import logo from './logo.svg';
import './App.css';
import { FiSmartphone } from 'react-icons/fi';
import bharatiyaImage from './img/bharatiya.png';
import me from './img/me.png';
import monitor from './img/monitor.png';
import notes from './img/notes.png';
import learning from './img/learning.png';
import movie from './img/movie.png';
import linkedin from './img/linkedin.png';
import { FiMonitor } from 'react-icons/fi'; 

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <div className="texts1">
          <h1>Tasneem Mahmud</h1>
          <i>"The best way to predict the future is to create it."</i>

        </div>
        <img src={me} alt="me"/>
     
      </header>
      <div className="about">
      <div className="texts2">
          <h1>About me</h1>
          <p>I am an undergraduate from the esteemed North South University in Bangladesh, where I have gained a solid foundation in computer science and software engineering. With a strong passion for technology and problem-solving, I have developed into a proficient full-stack developer. I specialize in a wide range of programming languages and frameworks, including C, C++, Java, Python, HTML, CSS, JavaScript, ReactJS, NodeJS, PHP, MongoDB, and PostgreSQL. Throughout my academic journey, I have worked on various projects, from building dynamic web applications to optimizing back-end processes, which have honed my skills in both front-end and back-end development. I am particularly enthusiastic about learning new technologies and methodologies, always striving to stay up-to-date with the latest trends in the tech industry. As someone who thrives in collaborative environments, I enjoy solving complex problems and contributing to meaningful projects. Whether it’s building user-centric websites or developing robust server-side applications, my goal is to create efficient, scalable, and user-friendly solutions. I am always open to new challenges and eager to grow both professionally and personally in the world of software development.</p>

      </div>
      


      </div>
      <div className="bharatiya">
      <div className="texts">
          <h1>Bharatiya</h1>
          <p>A smart solution for the expansive rental market, designed to make property searches easier and more efficient. Utilizing Mapbox, this project visualizes listings with markers on an interactive map, categorizing them based on rental prices, which are displayed through colored circles. The platform also includes a built-in messaging system that allows renters to directly connect with property owners. Powered by Google Firebase for backend services and featuring Google’s secure authentication system, the project ensures a reliable and safe user experience, complemented by its own user registration system for added flexibility.</p>

      </div>
      <img className="moni" src={bharatiyaImage}/>
      


      </div>
      <div className="notes">
      <div className="texts">
          <h1>Notes App</h1>
          <p>An innovative application designed to help multiple users efficiently store and manage their notes in one unified platform. Each note includes key details such as the title, author’s name, and the content itself, making organization effortless. In addition to shared notes, the application also provides users with a secure space to store personal notes privately. With powerful features like a search function and the ability to sort notes based on various parameters, users can easily find and manage their content. Built using ReactJS, the application is not only comprehensive in its functionality but also concise, ensuring smooth performance and a user-friendly experience.</p>

      </div>
      <img className="monitor1" src={notes}/>
      
      


      </div>
      <div className="learn">
      <div className="texts">
          <h1>Learning Platform</h1>
          <p>A platform crafted to revolutionize learning by offering all the essential resources needed to master a wide range of topics. Tailored for modern learners, it combines traditional educational tools with the latest advancements in technology. In this age of artificial intelligence, the platform stands out with a seamlessly integrated AI chatbot powered by OpenAI's ChatGPT. This powerful feature provides instant access to personalized assistance, in-depth explanations, and a wealth of information, making learning more interactive and engaging. With its unique ability to deliver unlimited knowledge and resources in one centralized location, this platform is truly a one-of-a-kind solution for learners of all ages and backgrounds.</p>

      </div>
      <img className="monitor2" src={learning}/>
      
      


      </div>
      <div className="movie">
      <div className="texts">
          <h1>Movie Theatre</h1>
          <p>An indispensable platform for every movie theater: an advanced online ticketing and user management system. This platform enables users to explore movie options, watch trailers, and conveniently purchase tickets for their favorite films. With a robust SQL database, it ensures efficient storage and management of user and ticketing data. The backend, powered by PHP, handles all server-side operations, including secure transactions and user authentication, providing a smooth and reliable experience. This system streamlines theater operations while enhancing the user experience, making it a must-have for modern cinemas.</p>

      </div>
      <img className="monitor3" src={movie}/>
      
      


      </div>
      <div className="more">
        <h1>More Projects</h1>
        <p>More projects such a online compiler, food deliver app, Disease Predictor, etc are in my GitHub repository</p>
        <a href="https://github.com/TasneemMahmud1731893642/Projects.git" target="_blank" class="github-link">
            <button class="github-button">
               <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" class="github-icon"/>
               GitHub Repository
            </button>
        </a>

        

      </div>
      <footer className="footer">
      <a href="https://www.linkedin.com/in/tasneem-mahmud-74bb35158/" target="_blank" class="linkedin-link">
          <button class="linkedin-button">
              <img src={linkedin} alt="LinkedIn Logo" class="linkedin-icon"/>
              Linkedin Profile
          </button>
      </a>

        <a href="https://github.com/TasneemMahmud1731893642" target="_blank" class="github-link">
            <button class="github-button">
               <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" class="github-icon"/>
               GitHub Repository
            </button>
        </a>
        
      </footer>
    </div>
    
  );
}

export default App;
