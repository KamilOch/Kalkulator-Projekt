package paczka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Kalkulator_Controler {



    @RequestMapping("/kalkulator_form")
    public String pobieranieLiczb (
            @RequestParam(value = "pierwsza", required = false) Double pierwsza,
            @RequestParam(value = "druga", required = false) Double druga,
            @RequestParam(value = "dzialanie", required = false) String dzialanie,
            Model model
            ){


            Kalkulator kalkulator = new Kalkulator(6666.0, 9999.0);
            kalkulator.setPierwsza(pierwsza);
            kalkulator.setDruga(druga);

            if (dzialanie.equals("dodawanie")){
                kalkulator.dodawanie(pierwsza, druga);
            }
            else if (dzialanie.equals("odejmowanie")){
                kalkulator.odejmowanie (pierwsza, druga);
            }
            else if (dzialanie.equals("mnozenie")){
                kalkulator.mnozenie (pierwsza,  druga);
            }
            else if (dzialanie.equals("dzielenie")){
                kalkulator.dzielenie (pierwsza, druga);
            }

            model.addAttribute("wynik" , kalkulator.getWynik());
            model.addAttribute("operaca" , dzialanie);
            model.addAttribute("test" , "a kuku ");

      return "wynik";




    }

    @RequestMapping("/")
    public String wyswierlanie (){
        return "kalkulator_form";
    }

}
