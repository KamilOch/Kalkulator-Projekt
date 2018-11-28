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
            @RequestParam(value = "pierwsza", required = true) double pierwsza,
            @RequestParam(value = "druga", required = true) double druga,
            @RequestParam(value = "dzalanie", required = true) String dzialanie,
            Model model
            ){


        Kalkulator kalkulator = new Kalkulator(6666, 9999);
        kalkulator.setPierwsza(pierwsza);
            kalkulator.setDruga(druga);

            if (dzialanie.equals("dodawanie")){
                kalkulator.setWynik(pierwsza + druga);
            }
            else if (dzialanie.equals("odejmowanie")){
                kalkulator.setWynik (pierwsza - druga);
            }
            else if (dzialanie.equals("mnozenie")){
                kalkulator.setWynik (pierwsza * druga);
            }
            else if (dzialanie.equals("dzielenie")){
                kalkulator.setWynik (pierwsza / druga);
            }

            model.addAttribute("wynik" , kalkulator.getWynik());
      return "kalkulator_form";

    }
}
