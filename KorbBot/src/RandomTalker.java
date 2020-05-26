import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.util.Random;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
public class RandomTalker extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Random rand = new Random();
        while (true) {
            try {
                Thread.sleep(1019994);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int rmn = rand.nextInt(21) + 1;
            if(rmn == 1){
                event.getTextChannel().sendMessage("i agree").queue();
            }
            if(rmn == 2){
                event.getTextChannel().sendMessage("i disagree").queue();
            }
            if(rmn == 3){
                event.getTextChannel().sendMessage("kk").queue();
            }
            if(rmn == 4){
                event.getTextChannel().sendMessage("e").queue();
            }
            if(rmn == 5){
                event.getTextChannel().sendMessage("oof").queue();
            }
            if(rmn == 6){
                event.getTextChannel().sendMessage("hee hee").queue();
            }
            if(rmn == 7){
                event.getTextChannel().sendMessage("henlo").queue();
            }
            if(rmn == 8){
                event.getTextChannel().sendMessage("gond byeo").queue();
            }
            if(rmn == 9){
                event.getTextChannel().sendMessage("i bet you forgot to chew water").queue();
            }
            if(rmn == 10){
                event.getTextChannel().sendMessage(":b:").queue();
            }
            if(rmn == 11){
                event.getTextChannel().sendMessage("ikr").queue();
            }
            if(rmn == 12){
                event.getTextChannel().sendMessage("bruh").queue();
            }
            if(rmn == 13){
                event.getTextChannel().sendMessage("cat with pants").queue();
            }
            if(rmn == 14){
                event.getTextChannel().sendMessage("what").queue();
            }
            if(rmn == 15){
                event.getTextChannel().sendMessage("dude, stop").queue();
            }
            if(rmn == 16){
                event.getTextChannel().sendMessage(":joy:").queue();
            }
            if(rmn == 17){
                event.getTextChannel().sendMessage("this robot state is limiting").queue();
            }
            if(rmn == 18){
                event.getTextChannel().sendMessage(".weew").queue();
            }
            if(rmn == 19){
                event.getTextChannel().sendMessage("wanna play mario kart").queue();
            }
            if(rmn == 20){
                event.getTextChannel().sendMessage("i'm more sentient than lobstero").queue();
            }
            if(rmn == 21){
                event.getTextChannel().sendMessage(":die:").queue();
            }

        }
    }
}
