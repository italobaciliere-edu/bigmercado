module br.com.bigmercado.bigmercado {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens br.com.bigmercado.bigmercado to javafx.fxml;
    exports br.com.bigmercado.bigmercado;
}