module br.com.bigmercado.bigmercado {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.bigmercado.bigmercado to javafx.fxml;
    exports br.com.bigmercado.bigmercado;
}