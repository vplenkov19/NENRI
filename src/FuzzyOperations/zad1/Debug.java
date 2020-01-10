package zad1;

import zad2.IFuzzySet;

public class Debug {
  public static void print(IDomain domain, String headingText) {
    if (headingText != null) {
      System.out.println(headingText);
    }
    for (DomainElement e : domain) {
      System.out.println("Element domene: " + e);
    }
    System.out.println("Kardinalitet domene je: " + domain.getCardinality());
    System.out.println();
  }

    public static void print(IFuzzySet set, String headingText) {
        if(headingText != null) {
            System.out.println(headingText);
        }

        for(DomainElement element : set.getDomain()) {
            System.out.printf("d(%s)=%.6f\n", element, set.getValueAt(element));
        }
        System.out.println();
    }
}