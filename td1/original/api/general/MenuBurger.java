package original.api.general;
import td1.original.api.general.Sauce;

import java.util.ArrayList;

public class MenuBurger{
ArrayList<Proteine> ChoixProteine;
ArrayList<TailleProteine> ChoixTailleProteine;
Sauce.SauceType sauce;
String Suplement;

MenuBurger(ArrayList<Proteine> ChoixProteine, ArrayList<TailleProteine> ChoixTailleProteine, String Suplement, Sauce.SauceType sauce){
    this.Suplement= Suplement;
    this.ChoixProteine = (ArrayList<Proteine>) ChoixProteine;
    this.ChoixTailleProteine = (ArrayList<TailleProteine>) ChoixTailleProteine;
    this.sauce =sauce;
}


}
