import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.util.*;
public class MessageResponder extends ListenerAdapter{

    private int leaveCount = 0;
    private int buttonCount = 0;

    public void onMessageReceived(MessageReceivedEvent event) {
        Random rand = new Random();
        int gp = 0;
        List<Guild> guilds = event.getJDA().getGuilds();

        // Get Guild
        Guild guild = event.getTextChannel().getGuild();

        // Get Name Of Text Channel
        String cname = event.getTextChannel().getName();

        // Get Whoever Sent The Message
        String name = event.getAuthor().getName();

        // Get Message Itself
        String message = event.getMessage().getContentRaw();

        // Commands / Responses

            if(message.startsWith(";guilds")){
                int gnum = guilds.toArray().length;
                event.getTextChannel().sendMessage("KorbBot is currently in " + gnum + " guilds.").queue();
                System.out.println(guilds.toString());
            }



        if(message.startsWith(";bruh")){
            int bruh = rand.nextInt(7) + 1;
            if(bruh == 1) {
                event.getTextChannel().sendMessage("https://twitter.com/cursedvideos/status/1100430807762653184?lang=en").queue();
            }

            if(bruh == 2) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=2ZIpFytCSVc").queue();
            }

            if(bruh == 3) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=sryu31VcrmU").queue();
            }

            if(bruh == 4) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=V263ad2e2uk").queue();
            }

            if(bruh == 5) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=beQMZ9-Ovs4").queue();
            }

            if(bruh == 6) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=BwVZ_tPryDc").queue();
            }

            if(bruh == 7) {
                event.getTextChannel().sendMessage("https://www.youtube.com/watch?v=lyIhcRkeomY").queue();
            }

        }

        if(message.startsWith(";thebutton")){
            buttonCount++;
            event.getTextChannel().sendMessage("You have pressed the button. The button has been pressed " + buttonCount + " times.").queue();
        }



        if(message.startsWith(";secret")){
            int s = rand.nextInt(100) + 1;
            if(s != 31) {
                event.getTextChannel().sendMessage("fuck off you fat slag").queue();
            }
            if(s == 31) {
                event.getTextChannel().sendMessage("i took a fat shit yesterday").queue();
            }
        }

        if(message.startsWith(";porn")){
            event.getTextChannel().sendMessage("fella just go to rule34.xxx").queue();
        }

        if(message.startsWith("https://media.discordapp.net/attachments/534167003519254549/595732708681056275/fall.gif")){
            event.getTextChannel().sendMessage("they catch me riding dirty").queue();
        }


        if(message.startsWith(";owo")){
            event.getTextChannel().sendMessage("fuck off fat slag" ).queue();
        }


        if(message.startsWith(";fact")){
            int f = rand.nextInt(15) + 1;
            if(f == 1){
                event.getTextChannel().sendMessage("piss off wanker you don't get a fun fact").queue();
            }
            if(f == 2){
                event.getTextChannel().sendMessage("i am god").queue();
            }
            if(f == 3){
                event.getTextChannel().sendMessage("i wank to anime girls").queue();
            }
            if(f == 4){
                event.getTextChannel().sendMessage("penis").queue();
            }
            if(f == 5){
                event.getTextChannel().sendMessage("i love fat women").queue();
            }
            if(f == 6)
            {
                event.getTextChannel().sendMessage("venzo backwards is ozwald").queue();
            }
            if(f == 7)
            {
                event.getTextChannel().sendMessage("https://tenor.com/view/gordas-fat-stripper-dancing-twerking-gif-15532528").queue();
            }
            if(f == 8)
            {
                event.getTextChannel().sendMessage("yeah my face is 24/7 covered in cum").queue();
            }
            if(f == 9)
            {
                event.getTextChannel().sendMessage("breakfast is transgender").queue();
            }
            if(f == 10)
            {
                event.getTextChannel().sendMessage("my dick is constipated bc i cant piss").queue();
            }
            if(f == 11)
            {
                event.getTextChannel().sendMessage("https://media.discordapp.net/attachments/638568583663976461/683092113474584579/meme.png?width=375&height=375").queue();
            }
            if(f == 12)
            {
                event.getTextChannel().sendMessage("my cum is blue").queue();
            }
            if(f == 13)
            {
                event.getTextChannel().sendMessage("AmIOkay is the best youtube channel").queue();
            }
            if(f == 14)
            {
                event.getTextChannel().sendMessage("your grandad is a knee").queue();
            }
            if(f == 15)
            {
                event.getTextChannel().sendMessage("leonardo simon goes wiki waka battle").queue();
            }


        }

        if(message.startsWith(";venzo")){
            int f = rand.nextInt(11) + 1;
            if(f == 1){
                event.getTextChannel().sendMessage("leonardo simon wiki waka").queue();
            }
            if(f == 2){
                event.getTextChannel().sendMessage("D-Do you wanna wiki waka b B b waka wiki b-b-b-ba-a-a-battle?").queue();
            }
            if(f == 3){
                event.getTextChannel().sendMessage("dj hero").queue();
            }
            if(f == 4){
                event.getTextChannel().sendMessage("ozwald").queue();
            }
            if(f == 5){
                event.getTextChannel().sendMessage("Wiki waka?").queue();
            }
            if(f == 6)
            {
                event.getTextChannel().sendMessage("Skr skr wiki baba wr-shr battle?").queue();
            }
            if(f == 7)
            {
                event.getTextChannel().sendMessage("ROUND 4").queue();
            }
            if(f == 8)
            {
                event.getTextChannel().sendMessage("Wiki waka!").queue();
            }
            if(f == 9)
            {
                event.getTextChannel().sendMessage("https://cdn.discordapp.com/attachments/638568583663976461/658718352918839319/IMG_20191217_063452.jpg").queue();
            }
            if(f == 10)
            {
                event.getTextChannel().sendMessage("https://cdn.discordapp.com/attachments/638568583663976461/658718354005295134/IMG_20191217_063456.jpg").queue();
            }
            if(f == 11)
            {
                event.getTextChannel().sendMessage("https://cdn.discordapp.com/attachments/620121291407753229/714634157501710388/venzo_face_reveal.PNG").queue();
            }
        }

        if(message.startsWith(";ping")){
            long ping = event.getJDA().getPing();
            event.getTextChannel().sendMessage(":ping_pong: pong " +ping + " ms").queue();
        }

        if(message.contains(";sauce")){
            event.getTextChannel().sendMessage("https://cdn.discordapp.com/attachments/712486460665888769/714634484028276756/Nutaku-hentai-hot-sauce-01-merch-store2x.png").queue();
        }

        if(message.contains("A") && message.length() == 1){
            event.getTextChannel().sendMessage("R").queue();
        }
        if(message.contains("augh") && message.length() == 4){
            event.getTextChannel().sendMessage("eugh").queue();
        }
        if (message.startsWith("https://cdn.discordapp.com/attachments/353186746906705931/610500118881370112/461.gif")) {
            event.getTextChannel().sendMessage("haha funny penguin dance").queue();
        }

        if (message.startsWith(";number")) {
            int n = rand.nextInt(10000) + 1;
            event.getTextChannel().sendMessage(String.valueOf(n)).queue();
        }

        if (message.startsWith(";math")) {
            int n1 = rand.nextInt(1000) + 1;
            int n2 = rand.nextInt(1000) + 1;
            int t = rand.nextInt(4) + 1;
            String mid = "";
            String th = "";
            int ans = 0;

            if(t == 1){
                ans = n1+n2;
                mid = " + ";
                th = " = ";
            }
            if(t == 2){
                ans = n1-n2;
                mid = " - ";
                th = " = ";
            }
            if(t == 3){
                ans = n1*n2;
                mid = " * ";
                th = " = ";
            }
            if(t == 4){
                ans = Math.round(n1/n2);
                mid = " / ";
                th = " ≈ ";
            }
            event.getTextChannel().sendMessage(n1 + mid + n2 + th + ans).queue();
        }


        if (message.startsWith(";help")) {

            String response1 = "ok " + name + ", go to korbbot.tk on chrome or something like that";

            event.getTextChannel().sendMessage(response1).queue();
        }


        if (message.startsWith(";vibecheck")){
            int status = rand.nextInt(2) + 1;

            if(status == 1) {
                event.getTextChannel().sendMessage("https://cdn.discordapp.com/attachments/620416006350962699/645036640062144553/congratulations-you-passed-your-vibe-check-65293183.png").queue();
            }
            else if(status == 2){
                event.getTextChannel().sendMessage("vibe check failed. https://cdn.discordapp.com/attachments/557732299668455434/649071613521821716/Untitled_4.mp4").queue();
            }

        }

    }
}




