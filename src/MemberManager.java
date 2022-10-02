public class MemberManager implements IMemberService{


    @Override
    public void add(Member member) {
        System.out.println("Sayın " + member.getFirstName()  + "Kaydınız tamamlandı. ");
    }

    @Override
    public void update(Member member) {
        System.out.println(" oyuncu " + member.getFirstName() + "bilgileriniz güncellendi.");
    }

    @Override
    public void delete(Member member) {
        System.out.println(" oyuncu " + member.getFirstName() + "bilgileriniz silindi.");
    }
}
