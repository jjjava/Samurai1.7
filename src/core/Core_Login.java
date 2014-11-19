package core;

import interfaces.DB_Set_Frist_Time;
import interfaces.Login;
import interfaces.Main;
import sql.select.SQL_Select_Users;

/**
 *
 * @author Hudson
 * @since 1.5
 * @version 1.1
 *
 */
public class Core_Login {

    private Login login;

    public Core_Login(Login login) {
        this.login = login;
    }

    public void Autentication() {
        SQL_Select_Users sql = new SQL_Select_Users();

        if (login.getLogin().equalsIgnoreCase("admin") && login.getPassword().equalsIgnoreCase("master")) {

            login.dispose();
            // DB_Set_Frist_Time db_set = new DB_Set_Frist_Time();
            // db_set.setVisible(true);
            Main main = new Main(login.run);
            main.setVisible(true);
            main.createStartInternalFrame();
        } else {
            if (sql.validUser(login.getLogin(), login.getPassword())) {
                Main main = new Main(login.run);
                main.setVisible(true);
                main.createStartInternalFrame();
                login.dispose();
            }
        }
    }
}