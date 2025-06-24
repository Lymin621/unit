package kr.co.unit.build;

public class User {
    private String uid;
    private String upw;
    private String unm;
    private String utel;

    public User(UserBuilder ubd) {
        this.uid=ubd.uid;
        this.upw=ubd.upw;
        this.unm=ubd.unm;
        this.utel=ubd.utel;
    }

    public String toString(){
        return """
                =====================================
                User결과
                uid : %s, upw : %s, unm : %s, utel : %s
                =====================================\n
                """.formatted(uid,upw,unm,utel);
    }
    //inner class : 클래스 내부에 선언된 또 다른 클래스를 말함
    //외부에서 객체 생성이 바로 되지 않으므로 static 클래스로 생성하여
    //외부에서 접근하여 객체 생성을 해주거나,
    // 아니면 메인클래스 내부에서 객체생성을 할 수 있다.
    public static class UserBuilder{
        private String uid;
        private String upw;
        private String unm;
        private String utel;

        public UserBuilder uid(String uid){
            this.uid=uid;
            return this;
        }

        public UserBuilder upw(String upw){
            this.upw=upw;
            return this;
        }

        public UserBuilder unm(String unm){
            this.unm=unm;
            return this;
        }

        public UserBuilder utel(String utel){
            this.utel=utel;
            return this;
        }

        public User build(){return new User(this);}
    }
}
