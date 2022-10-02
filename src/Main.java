public class Main {
    public static void main(String[] args) {
        Game game1= new Game(1,"Counter Strike",15500);
        Game game2 =new Game(2,"game of thrones",33500);
        Game game3 =new Game(3,"Süper Mario",1500);

        Member member1 =new Member(1,"Aslan","Balcı",1007,183736);



        Campaign campaign =new Campaign(1,"Öğrenci",20);


        MemberManager memberManager =new MemberManager();
        GameManager gameManager=new GameManager();
        CampaignManager campaignManager =new CampaignManager();
        SalesManager salesManager =new SalesManager();



        memberManager.add(member1);
        gameManager.add(game1);
        campaignManager.update(campaign);
        salesManager.Sales(member1,game3);
        salesManager.SalesWithCampaign(member1,game2,campaign);



    }
}