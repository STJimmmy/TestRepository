package ArrayListExtended28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExtended<E> extends ArrayList<E> {

    //nie musimy tworzyc takiego konstruktora bo bedzie on utworzony w sposob automatyczny
    //konstruktor domyslny
    public ArrayListExtended() {
        super(); //trzeba wywolywac konstruktor klasy nadrzednej, poniewaz nie wiemy co on robi
    }

    //rozwiazanie klasyczne
    public ArrayList<E> getNthElement(int ind, int skip){
        ArrayList<E> arrayList = new ArrayList<>();

        for(int i=ind; i<this.size(); i+=skip+1){ //zaczynamy od elementu o indeksie ind, przeskakujemy skip elementow
            arrayList.add(this.get(i)); //dodajemy kolejne elementy do listy
        }

        return arrayList;
    }

    //rozwiazanie na streamach
    public List<E> getNthElementS(int ind, int skip){
        return IntStream.range(0, this.size()) //w ten sposob otrzymujemy stream z indeksami naszej listy
                //teraz metoda filter odrzucamy te indeksy, ktore nie sa potrzebne
                .filter(i->(i-ind)%(skip+1)==0&&i-ind>=0)
                .mapToObj(this::get)//mapper ten zamienia indeksy na konkretne wartosci z listy
                .collect(Collectors.toList());
    }

}

