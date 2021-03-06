package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.KoscheiTheDeathless;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

   @Bean
   public static KoscheiTheDeathless koscheiTheDeathless(){
       return new KoscheiTheDeathless();
   }
    @Bean
    public Ocean1 ocean1(){
        return new Ocean1();
    }

    @Bean
    public static Island2 island2(Wood3 wood){
        return new Island2(wood);
    }

    @Bean
    public static Wood3 wood3(Rabbit4 rabbit4){
        return new Wood3(rabbit4);
    }

    @Bean
    public static Rabbit4 rabbit4(Duck5 duck5){
        return new Rabbit4(duck5);
    }

    @Bean
    public static Duck5 duck5(Egg6 egg6){
        return new Duck5(egg6);
    }

    @Bean
    public static Egg6 egg6(Needle7 needle7){
        return new Egg6(needle7);
    }

    @Bean
    public static Needle7 needle7() {
        return new Needle7();
    }

    @Bean
    public static Deth8 deth8(){
       return new Deth8();
    }

}