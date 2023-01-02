package MethodsFrames;

import AddingFrames.JFrameAddCorporate;
import AddingFrames.JFrameAddCompany;
import AddingFrames.JFrameAddFlight;
import AddingFrames.JFrameAddAirport;

public class MDIPrincipal extends javax.swing.JFrame {

    public MDIPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Aeropuerto");       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuAirportManager = new javax.swing.JMenu();
        mniAddAirport = new javax.swing.JMenuItem();
        mniConsultAirport = new javax.swing.JMenuItem();
        mnuCorporate = new javax.swing.JMenu();
        mniAddCorporate = new javax.swing.JMenuItem();
        mniShowCompanies = new javax.swing.JMenuItem();
        mnuCompany = new javax.swing.JMenu();
        mniAddCompany = new javax.swing.JMenuItem();
        mniShowCompaniesByAirportName = new javax.swing.JMenuItem();
        mnuFlights = new javax.swing.JMenu();
        mniAddFlight = new javax.swing.JMenuItem();
        mniShowFlightsById = new javax.swing.JMenuItem();
        mniShowDestinations = new javax.swing.JMenuItem();
        mniShowFlights = new javax.swing.JMenuItem();
        mniListFlightsByCompanyName = new javax.swing.JMenuItem();
        mnuPassenger = new javax.swing.JMenu();
        mniAddPassenger = new javax.swing.JMenuItem();
        mnuOptions = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuAirportManager.setText("Manejo de Aeropuertos");

        mniAddAirport.setText("Añadir aeropuerto");
        mniAddAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddAirportActionPerformed(evt);
            }
        });
        mnuAirportManager.add(mniAddAirport);

        mniConsultAirport.setText("Consultar aeropuerto");
        mniConsultAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConsultAirportActionPerformed(evt);
            }
        });
        mnuAirportManager.add(mniConsultAirport);

        menuBar.add(mnuAirportManager);

        mnuCorporate.setText("Empresas");

        mniAddCorporate.setText("Añadir empresa");
        mniAddCorporate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddCorporateActionPerformed(evt);
            }
        });
        mnuCorporate.add(mniAddCorporate);

        mniShowCompanies.setText("Mostrar empresas");
        mniShowCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniShowCompaniesActionPerformed(evt);
            }
        });
        mnuCorporate.add(mniShowCompanies);

        menuBar.add(mnuCorporate);

        mnuCompany.setText("Compañias");

        mniAddCompany.setText("Añadir compañias");
        mniAddCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddCompanyActionPerformed(evt);
            }
        });
        mnuCompany.add(mniAddCompany);

        mniShowCompaniesByAirportName.setText("Mostrar compañias por aeropuerto");
        mniShowCompaniesByAirportName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniShowCompaniesByAirportNameActionPerformed(evt);
            }
        });
        mnuCompany.add(mniShowCompaniesByAirportName);

        menuBar.add(mnuCompany);

        mnuFlights.setText("Vuelos");

        mniAddFlight.setText("Añadir vuelo");
        mniAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddFlightActionPerformed(evt);
            }
        });
        mnuFlights.add(mniAddFlight);

        mniShowFlightsById.setText("Mostrar vuelos por id");
        mniShowFlightsById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniShowFlightsByIdActionPerformed(evt);
            }
        });
        mnuFlights.add(mniShowFlightsById);

        mniShowDestinations.setText("Mostrar destinos");
        mniShowDestinations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniShowDestinationsActionPerformed(evt);
            }
        });
        mnuFlights.add(mniShowDestinations);

        mniShowFlights.setText("Mostrar vuelos");
        mniShowFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniShowFlightsActionPerformed(evt);
            }
        });
        mnuFlights.add(mniShowFlights);

        mniListFlightsByCompanyName.setText("Listar vuelos por compania");
        mniListFlightsByCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListFlightsByCompanyNameActionPerformed(evt);
            }
        });
        mnuFlights.add(mniListFlightsByCompanyName);

        menuBar.add(mnuFlights);

        mnuPassenger.setText("Pasajero");

        mniAddPassenger.setText("Añadir Pasajero");
        mniAddPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddPassengerActionPerformed(evt);
            }
        });
        mnuPassenger.add(mniAddPassenger);

        menuBar.add(mnuPassenger);

        mnuOptions.setText("Opciones");

        mniExit.setText("salir");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuOptions.add(mniExit);

        menuBar.add(mnuOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAddAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddAirportActionPerformed
        JFrameAddAirport airport = new JFrameAddAirport();
        desktopPane.add(airport);
        airport.toFront();
        airport.show();
    }//GEN-LAST:event_mniAddAirportActionPerformed

    private void mniConsultAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConsultAirportActionPerformed
        JFrameConsultAirport consultAirports = new JFrameConsultAirport();
        desktopPane.add(consultAirports);
        consultAirports.toFront();
        consultAirports.show();
    }//GEN-LAST:event_mniConsultAirportActionPerformed

    private void mniShowDestinationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniShowDestinationsActionPerformed
        JFrameShowDestinations showDestinations = new JFrameShowDestinations();
        desktopPane.add(showDestinations);
        showDestinations.toFront();;
        showDestinations.show();
    }//GEN-LAST:event_mniShowDestinationsActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniShowFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniShowFlightsActionPerformed
         JFrameFlightsInfo flightInfo = new JFrameFlightsInfo();
         desktopPane.add(flightInfo);
         flightInfo.toFront();
         flightInfo.show();
    }//GEN-LAST:event_mniShowFlightsActionPerformed

    private void mniShowFlightsByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniShowFlightsByIdActionPerformed
        JFrameShowFlightById showFLightById = new JFrameShowFlightById();
        desktopPane.add(showFLightById);
        showFLightById.toFront();
        showFLightById.show();
    }//GEN-LAST:event_mniShowFlightsByIdActionPerformed

    private void mniListFlightsByCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListFlightsByCompanyNameActionPerformed
        JFrameListCompanies listComopanies = new JFrameListCompanies();
        desktopPane.add(listComopanies);
        listComopanies.toFront();
        listComopanies.show();
    }//GEN-LAST:event_mniListFlightsByCompanyNameActionPerformed

    private void mniShowCompaniesByAirportNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniShowCompaniesByAirportNameActionPerformed
        JframeShowCompaniesByAirportName showCompaniesByAirportName = new JframeShowCompaniesByAirportName();
        desktopPane.add(showCompaniesByAirportName);
        showCompaniesByAirportName.toFront();
        showCompaniesByAirportName.show();
    }//GEN-LAST:event_mniShowCompaniesByAirportNameActionPerformed

    private void mniShowCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniShowCompaniesActionPerformed
        JFrameShowCorporates corporates = new JFrameShowCorporates();
        desktopPane.add(corporates);
        corporates.toFront();
        corporates.show();
    }//GEN-LAST:event_mniShowCompaniesActionPerformed

    private void mniAddPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddPassengerActionPerformed
        JFramePasajero pasajero = new JFramePasajero();
        desktopPane.add(pasajero);
        pasajero.toFront();
        pasajero.show();
    }//GEN-LAST:event_mniAddPassengerActionPerformed

    private void mniAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddFlightActionPerformed
        JFrameAddFlight addFlight = new JFrameAddFlight();
        desktopPane.add(addFlight);
        addFlight.toFront();
        addFlight.show();
    }//GEN-LAST:event_mniAddFlightActionPerformed

    private void mniAddCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddCompanyActionPerformed
        JFrameAddCompany addCompany = new JFrameAddCompany();
        desktopPane.add(addCompany);
        addCompany.toFront();
        addCompany.show();
    }//GEN-LAST:event_mniAddCompanyActionPerformed

    private void mniAddCorporateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddCorporateActionPerformed
        JFrameAddCorporate addCorporate = new JFrameAddCorporate();
        desktopPane.add(addCorporate);
        addCorporate.toFront();
        addCorporate.show();
    }//GEN-LAST:event_mniAddCorporateActionPerformed

    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(() -> {
                new MDIPrincipal().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniAddAirport;
    private javax.swing.JMenuItem mniAddCompany;
    private javax.swing.JMenuItem mniAddCorporate;
    private javax.swing.JMenuItem mniAddFlight;
    private javax.swing.JMenuItem mniAddPassenger;
    private javax.swing.JMenuItem mniConsultAirport;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniListFlightsByCompanyName;
    private javax.swing.JMenuItem mniShowCompanies;
    private javax.swing.JMenuItem mniShowCompaniesByAirportName;
    private javax.swing.JMenuItem mniShowDestinations;
    private javax.swing.JMenuItem mniShowFlights;
    private javax.swing.JMenuItem mniShowFlightsById;
    private javax.swing.JMenu mnuAirportManager;
    private javax.swing.JMenu mnuCompany;
    private javax.swing.JMenu mnuCorporate;
    private javax.swing.JMenu mnuFlights;
    private javax.swing.JMenu mnuOptions;
    private javax.swing.JMenu mnuPassenger;
    // End of variables declaration//GEN-END:variables

}
