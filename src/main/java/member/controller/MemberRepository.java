package member.controller;

import member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;


public class MemberRepository {

    private List<Member> memberList = new ArrayList<>(10);

    public MemberRepository() {

    }

    public void insertMember(Member member) throws OverMemberException {
        if(memberList.size() < 10 ){
            memberList.add(member);
        } else {
            throw new OverMemberException("Member List is full");
        }


    }

    public void printData(){
        try{
            for (Member member : memberList) {
                System.out.println(member.getGrade() + "등급 회원 " + member.getName() + "의 포인트는 " + member.getPoint() +
                        "이고, 이자 포인트는 " + member.calculatePoint() + "입니다.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printBuyInfo(int price){

        try {
            for (Member member : memberList) {
                System.out.println(member.getGrade() + " 등급 회원 " + member.getName() + "는" + price + "원 상품을 "
                        + member.buy(price) + "원에 구매합니다");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
