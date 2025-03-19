
import java.time.LocalDate;

public class CodificadorLetrasAlfabeticas implements Codificador {

  @Override
  public String getNome() {
    return "Codificador Letras Alfabeticas";
  }

  @Override
  public LocalDate getDataCriacao() {
    return LocalDate.of(2024, 3, 19);
  }

  @Override
  public int getNivelSeguranca() {
    return 1;
  }

  @Override
  public String codifica(String str) {
    StringBuilder encoded = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        encoded.append((char) ('z' - c + 'a'));
      } else if (c >= 'A' && c <= 'Z') {
        encoded.append((char) ('Z' - c + 'A'));
      } else {
        encoded.append(c);
      }
    }
    return encoded.toString();
  }

  @Override
  public String decodifica(String str) {
    StringBuilder encoded = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        encoded.append((char) ('z' - c + 'a'));
      } else if (c >= 'A' && c <= 'Z') {
        encoded.append((char) ('Z' - c + 'A'));
      } else {
        encoded.append(c);
      }
    }
    return encoded.toString();
  }

}
