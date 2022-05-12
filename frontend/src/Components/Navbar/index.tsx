import { ReactComponent as GithubIcon } from 'Assets/img/github.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/ArethaQ/DSMovie-projeto.git">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Gitdsmovieprojeto</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>

    );
}

export default Navbar;