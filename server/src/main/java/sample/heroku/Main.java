package sample.heroku;

import fish.payara.micro.PayaraMicro;

public class Main {
    
    public static void main(String[] args) throws Exception {
        PayaraMicro.getInstance()
            .setHttpPort(Integer.parseInt(System.getenv("PORT")))
            .addDeployment("webapp/build/libs/webapp.war")
            .bootStrap();
    }
}
