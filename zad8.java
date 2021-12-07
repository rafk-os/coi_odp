String[] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba" };
Iterator<String> it = Arrays.stream(drzewa).iterator();
while(it.hasNext()) System.out.println(it.next());
