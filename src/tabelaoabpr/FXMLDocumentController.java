/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelaoabpr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

/**
 *
 * @author johnbox
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ComboBox comboBox;

    @FXML
    private WebView loadTabela;

    @FXML
    private Label lblComboBox;

    @FXML
    private ImageView tela;

    /*
     * update lblComboBox
     */
    public void updatelblComboBox() {

        if (comboBox.getValue().equals("CAPÍTULO II - ATOS AVULSOS")) {
            this.lblComboBox.setText(comboBox.getValue().toString());
            URL url1 = getClass().getResource("tabela_cap2.html");
            loadTabela.getEngine().load(url1.toExternalForm());
            // create webview

        //} else if (comboBox.getValue().equals("CAPÍTULO II - ATOS AVULSOS")) {
       //     URL url1 = getClass().getResource("tabela_cap2.html");
       //     loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO III - ADVOCACIA EXTRAJUDICIAL")) {
            URL url1 = getClass().getResource("tabela_cap3.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO IV - ADVOCACIA DE PARTIDO")) {
            URL url1 = getClass().getResource("tabela_cap4.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO V - AÇÕES DE PREVISÃO CONSTITUCIONAL - PARA CASOS NÃO PREVISTOS NOS DEMAIS CAPÍTULOS")) {
            URL url1 = getClass().getResource("tabela_cap5.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("SEÇÃO I - ADVOCACIA CÍVEL")) {
            URL url1 = getClass().getResource("tabela_secao_i_advocacia_civil.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("SEÇÃO II - ADVOCACIA COMERCIAL")) {
            URL url1 = getClass().getResource("tabela_secao_ii_advocacia_comercial.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("SEÇÃO III - ADVOCACIA NA ÁREA DE FAMÍLIA")) {
            URL url1 = getClass().getResource("tabela_secao_iii_advocacia_familia.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("SEÇÃO IV - SUCESSÕES - ARROLAMENTOS E INVENTÁRIOS")) {
            URL url1 = getClass().getResource("tabela_secao_iv_advocacia_sucessoes.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("SEÇÃO V - REGISTROS PÚBLICOS")) {
            URL url1 = getClass().getResource("tabela_secao_v_advocacia_registro_publico.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO VII - ADVOCACIA CRIMINAL")) {
            URL url1 = getClass().getResource("tabela_cap7_adv_criminal.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO VIII - ADVOCACIA PERANTE A JUSTIÇA MILITAR")) {
            URL url1 = getClass().getResource("tabela_cap8_adv_militar.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO IX - ADVOCACIA NA ÁREA TRABALHISTA")) {
            URL url1 = getClass().getResource("tabela_cap9_adv_trabalhista.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO X - ADVOCACIA NA ÁREA FISCAL")) {
            URL url1 = getClass().getResource("tabela_cap10_adv_fiscal.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XI-ADVOCACIA NA ÁREA PREVIDENCIÁRIA")) {
            URL url1 = getClass().getResource("tabela_cap11_adv_previdenciaria.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XII - ADMINISTRAÇÃO PÚBLICA")) {
            URL url1 = getClass().getResource("tabela_cap12_adv_adm_publica.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XIII- ADVOCACIA NO ÂMBITO DA JUSTIÇA ELEITORAL")) {
            URL url1 = getClass().getResource("tabela_cap13_adv_eleitoral.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XIV - DIREITO AMBIENTAL")) {
            URL url1 = getClass().getResource("tabela_cap14_adv_ambiental.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XV - ADVOCACIA PERANTE A JUSTIÇA DESPORTIVA")) {
            URL url1 = getClass().getResource("tabela_cap15_adv_desportiva.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XVI - ADVOCACIA PERANTE OS JUIZADOS ESPECIAIS")) {
            URL url1 = getClass().getResource("tabela_cap16_adv_juizadoEspecial.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XVII - ADVOCACIA PERANTE OS TRIBUNAIS")) {
            URL url1 = getClass().getResource("tabela_cap17_adv_tribunais.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XVIII - DIÁRIAS DE VIAGEM E DESPESAS DE LOCOMOÇÃO")) {
            URL url1 = getClass().getResource("tabela_cap18_adv_diarias.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XIX - TABELA DE DILIGÊNCIAS")) {
            URL url1 = getClass().getResource("tabela_cap19_adv_diligencias.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else if (comboBox.getValue().equals("CAPÍTULO XX - PISO ÉTICO DE REMUNERAÇÃO")) {
            URL url1 = getClass().getResource("tabela_cap20_adv_pisoetico.html");
            loadTabela.getEngine().load(url1.toExternalForm());
        } else {
            this.lblComboBox.setText("logo.png");
            // create webview
            URL url1 = getClass().getResource("tabelaValor2.html");
            loadTabela.getEngine().load(url1.toExternalForm());

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        URL url1 = getClass().getResource("inicio.html");
        //      loadTabela.getEngine().load(url1.toExternalForm());
        lblComboBox.setText("Consulta:");

        comboBox.getItems().addAll(
                "CAPÍTULO II - ATOS AVULSOS",
                "CAPÍTULO III - ADVOCACIA EXTRAJUDICIAL",
                "CAPÍTULO IV - ADVOCACIA DE PARTIDO",
                "CAPÍTULO V - AÇÕES DE PREVISÃO CONSTITUCIONAL - PARA CASOS NÃO PREVISTOS NOS DEMAIS CAPÍTULOS",
         //       "CAPÍTULO VI - ADVOCACIA NO CIVEL, COMERCIAL E DA FAMÍLIA E SUCESSÕES",
                "SEÇÃO I - ADVOCACIA CÍVEL",
                "SEÇÃO II - ADVOCACIA COMERCIAL",
                "SEÇÃO III - ADVOCACIA NA ÁREA DE FAMÍLIA",
                "SEÇÃO IV - SUCESSÕES - ARROLAMENTOS E INVENTÁRIOS",
                "SEÇÃO V - REGISTROS PÚBLICOS",
                "CAPÍTULO VII - ADVOCACIA CRIMINAL",
                "CAPÍTULO VIII - ADVOCACIA PERANTE A JUSTIÇA MILITAR",
                "CAPÍTULO IX - ADVOCACIA NA ÁREA TRABALHISTA",
                "CAPÍTULO X - ADVOCACIA NA ÁREA FISCAL",
                "CAPÍTULO XI-ADVOCACIA NA ÁREA PREVIDENCIÁRIA",
                "CAPÍTULO XII - ADMINISTRAÇÃO PÚBLICA",
                "CAPÍTULO XIII- ADVOCACIA NO ÂMBITO DA JUSTIÇA ELEITORAL",
                "CAPÍTULO XIV - DIREITO AMBIENTAL",
                "CAPÍTULO XV - ADVOCACIA PERANTE A JUSTIÇA DESPORTIVA",
                "CAPÍTULO XVI - ADVOCACIA PERANTE OS JUIZADOS ESPECIAIS",
                "CAPÍTULO XVII - ADVOCACIA PERANTE OS TRIBUNAIS",
                "CAPÍTULO XVIII - DIÁRIAS DE VIAGEM E DESPESAS DE LOCOMOÇÃO",
                "CAPÍTULO XIX - TABELA DE DILIGÊNCIAS",
                "CAPÍTULO XX - PISO ÉTICO DE REMUNERAÇÃO");

        /* comboBox.getItems().addAll(
                "CAPÍTULO II - ATOS AVULSOS",
                "CAPÍTULO III - ADVOCACIA EXTRAJUDICIAL",
                "CAPÍTULO IV - ADVOCACIA DE PARTIDO",
                "CAPÍTULO V - AÇÕES DE PREVISÃO CONSTITUCIONAL - PARA CASOS NÃO PREVISTOS NOS DEMAIS CAPÍTULOS",
                "-----------------",
                "CAPÍTULO VI - ADVOCACIA NO CIVEL, COMERCIAL E DA FAMÍLIA E SUCESSÕES",
                "SEÇÃO I - ADVOCACIA CÍVEL",
                "SEÇÃO II - ADVOCACIA COMERCIAL",
                "SEÇÃO III - ADVOCACIA NA ÁREA DE FAMÍLIA",
                "SEÇÃO IV - SUCESSÕES - ARROLAMENTOS E INVENTÁRIOS",
                "SEÇÃO V-REGISTROSPÚBLICOS"); */
    }

}
