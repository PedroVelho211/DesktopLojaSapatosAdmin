/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Util.SideMenuUtil;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class FormCaixa extends javax.swing.JFrame {

    FormMenu menu;
    String acesso = "Administrador";
    SideMenuUtil sideMenu = new SideMenuUtil();
    /**
     * Creates new form FormCaixa
     * @param menu
     * @param acesso
     */
    
    public FormCaixa(FormMenu menu, String acesso) {
        initComponents();
        subPanelClientes.setVisible(false);
        subPanelProdutos.setVisible(false);
        subPanelVendas.setVisible(false);
        btnCaixa.setEnabled(false);
        
        lblPremium.setVisible(false); // if cpf not belong to preemium client
        
        this.acesso=acesso;
        this.menu=menu;
        
        
        //Acesso Caixa SideMenu
        if(acesso.equals("Caixa")){
            btnProdutos.setEnabled(false);
            btnListaVenda.setVisible(false);
            btnListaCliente1.setVisible(false);
        }
        //atendente wont come here and admin has acces to all
    }
    
    
    public FormCaixa(FormMenu menu) {
        initComponents();
        subPanelClientes.setVisible(false);
        subPanelProdutos.setVisible(false);
        subPanelVendas.setVisible(false);
        btnCaixa.setEnabled(false);
        
        lblPremium.setVisible(false); // if cpf not belong to preemium client
        
        this.menu=menu;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        subPanelClientes = new javax.swing.JPanel();
        btnCadCliente1 = new javax.swing.JButton();
        btnListaCliente1 = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        subPanelProdutos = new javax.swing.JPanel();
        btnCadProduto1 = new javax.swing.JButton();
        btnListaProduto1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        subPanelVendas = new javax.swing.JPanel();
        btnCaixa = new javax.swing.JButton();
        btnListaVenda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        txtSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        SidePanel.setBackground(new java.awt.Color(51, 0, 153));

        btnMenu.setBackground(new java.awt.Color(169, 200, 231));
        btnMenu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(174, 43, 43));
        btnSair.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(169, 200, 231));
        btnClientes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setAlignmentX(0.5F);
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(169, 200, 231));
        btnVendas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVendas.setText("VENDAS");
        btnVendas.setAlignmentX(0.5F);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        subPanelClientes.setBackground(new java.awt.Color(51, 0, 153));

        btnCadCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadCliente1.setText("Cadastro de Clientes");
        btnCadCliente1.setBorder(null);
        btnCadCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCliente1ActionPerformed(evt);
            }
        });

        btnListaCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnListaCliente1.setText("Lista de Clientes");
        btnListaCliente1.setBorder(null);
        btnListaCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelClientesLayout = new javax.swing.GroupLayout(subPanelClientes);
        subPanelClientes.setLayout(subPanelClientesLayout);
        subPanelClientesLayout.setHorizontalGroup(
            subPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelClientesLayout.setVerticalGroup(
            subPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelClientesLayout.createSequentialGroup()
                .addComponent(btnCadCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnProdutos.setBackground(new java.awt.Color(169, 200, 231));
        btnProdutos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnProdutos.setText("PRODUTOS");
        btnProdutos.setAlignmentX(0.5F);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        subPanelProdutos.setBackground(new java.awt.Color(51, 0, 153));

        btnCadProduto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadProduto1.setText("Cadastro de Produtos");
        btnCadProduto1.setBorder(null);
        btnCadProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProduto1ActionPerformed(evt);
            }
        });

        btnListaProduto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnListaProduto1.setText("Lista de Produtos");
        btnListaProduto1.setBorder(null);
        btnListaProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProduto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelProdutosLayout = new javax.swing.GroupLayout(subPanelProdutos);
        subPanelProdutos.setLayout(subPanelProdutosLayout);
        subPanelProdutosLayout.setHorizontalGroup(
            subPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelProdutosLayout.setVerticalGroup(
            subPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelProdutosLayout.createSequentialGroup()
                .addComponent(btnCadProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoe-200-200.jpg"))); // NOI18N
        jLabel4.setAlignmentX(0.5F);

        subPanelVendas.setBackground(new java.awt.Color(51, 0, 153));
        subPanelVendas.setForeground(new java.awt.Color(255, 255, 255));

        btnCaixa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCaixa.setText("Controle de Caixa");
        btnCaixa.setBorder(null);
        btnCaixa.setPreferredSize(new java.awt.Dimension(42, 15));
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });

        btnListaVenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnListaVenda.setText("Histórico de Vendas");
        btnListaVenda.setBorder(null);
        btnListaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelVendasLayout = new javax.swing.GroupLayout(subPanelVendas);
        subPanelVendas.setLayout(subPanelVendasLayout);
        subPanelVendasLayout.setHorizontalGroup(
            subPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelVendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelVendasLayout.setVerticalGroup(
            subPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelVendasLayout.createSequentialGroup()
                .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(subPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Controle de Caixa");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descrição");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CPF do Cliente");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data");

        txtCPF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCPF.setText("000.000.000.00");

        txtData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtData.setText("12/12/1212");

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(255, 165, 0));
        btnEnviar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtSaldo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSaldo.setText("10.000.00");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Saldo Total");

        lblPremium.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lblPremium.setForeground(new java.awt.Color(204, 0, 102));
        lblPremium.setText("10% de Desconto PREMIUM!");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setText("Muzuni333");

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setText("Muzuni222");

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setText("Muzuni Harumasa *LIMITED EDITION*");

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("6");

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("2");

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("1");

        jTextField8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("1");

        jTextField9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField9.setText("Muzuni111");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Qnt:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 50, Short.MAX_VALUE)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSaldo)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29))
                                    .addComponent(lblPremium, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        FormLogin tela = new FormLogin();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        //shows sub panel form selected button and hides the others
        sideMenu.enablePanel(subPanelClientes, subPanelProdutos, subPanelVendas);

        //change color of button when pressed, first will highlight the others will reset to default
        sideMenu.styleButton2(btnClientes, btnProdutos, btnVendas);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed

        //shows sub panel form selected button and hides the others
        sideMenu.enablePanel(subPanelVendas, subPanelProdutos, subPanelClientes);

        //change color of button when pressed, first will highlight the others will reset to default
        sideMenu.styleButton2(btnVendas, btnProdutos, btnClientes);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnCadCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCliente1ActionPerformed
        FormCadClientes tela = new FormCadClientes(menu, acesso);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadCliente1ActionPerformed

    private void btnListaCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaCliente1ActionPerformed
        FormListaClientes tela = new FormListaClientes(menu);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaCliente1ActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed

        //shows sub panel form selected button and hides the others
        sideMenu.enablePanel(subPanelProdutos, subPanelVendas, subPanelClientes);

        //change color of button when pressed, first will highlight the others will reset to default
        sideMenu.styleButton2(btnProdutos, btnVendas, btnClientes);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProduto1ActionPerformed
        FormCadProdutos tela = new FormCadProdutos(menu);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadProduto1ActionPerformed

    private void btnListaProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProduto1ActionPerformed
        FormListaProdutos tela = new FormListaProdutos(menu);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaProduto1ActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnListaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVendaActionPerformed
        FormListaVendas tela = new FormListaVendas(menu);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaVendaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        txtData.setText("");
        txtCPF.setText("");
        txtSaldo.setText("");
        lblPremium.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        JOptionPane.showMessageDialog(this, "Sucesso!");
        //Save new sale to Db
        
    }//GEN-LAST:event_btnEnviarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormCaixa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton btnCadCliente1;
    private javax.swing.JButton btnCadProduto1;
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListaCliente1;
    private javax.swing.JButton btnListaProduto1;
    private javax.swing.JButton btnListaVenda;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JPanel subPanelClientes;
    private javax.swing.JPanel subPanelProdutos;
    private javax.swing.JPanel subPanelVendas;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
