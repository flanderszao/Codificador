import java.time.LocalDate;

public class CodificadorZenitPolar implements Codificador {
    @Override
    public String getNome() {
        return "Codificador ZenitPolar";
    }

    @Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    @Override
    public int getNivelSeguranca(){
        return 1;
    }

    @Override
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            
            String aux = Character.toString(c).toLowerCase();

            switch (aux){
                case "z" -> encoded.append((char) (c - 10));

                case "e" -> encoded.append((char) (c + 10));

                case "n" -> encoded.append((char) (c - 2));

                case "i" -> encoded.append((char) (c - 8));

                case "t" -> encoded.append((char) (c - 2));

                case "p" -> encoded.append((char) (c + 10));

                case "o" -> encoded.append((char) (c - 10));

                case "l" -> encoded.append((char) (c + 2));

                case "a" -> encoded.append((char) (c + 8));

                case "r" -> encoded.append((char) (c + 2));

                default -> encoded.append(c);
            }
        }

        return encoded.toString();
    }

    @Override
    public String decodifica(String str) {
        return this.codifica(str); //Pois o ZenitPolar funciona em ambas as direções, tanto pra codificar quando pra decodificar
    }
}