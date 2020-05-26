import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.AccountType;
import javax.security.auth.login.LoginException;

public class Connection {
    public static void main (String[] args) {
        JDA discord = null;



        try {
            discord = new JDABuilder(AccountType.BOT).setToken(Constants.discordToken).buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        discord.addEventListener(new MessageResponder());
    }
}
