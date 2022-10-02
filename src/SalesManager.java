public class SalesManager implements ISalesService {




   @Override
   public void Sales(Member member, Game game) {
      System.out.println(member.getFirstName() + " oyuncusuna ait " + game.getGameName() + " oyunu satıldı");
   }

   @Override
   public void SalesWithCampaign(Member member, Game game, Campaign campaign) {
      System.out.println(member.getFirstName() + " oyuncusuna ait " +
              campaign.getCampaingName() + " kampanyasıyla " + game.getGameName() + " oyununa "
              + campaign.getDiscount() + " % indirimi " + game.getGameName() + " oyunu satıldı. " );
   }
}
