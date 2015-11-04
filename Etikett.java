public interface Etikett {
    int laenge();     // Laenge des Holzstuecks
    String datum();   // Datum der letzten Etikettierung
    Etikett alt();    // Falls Holzstueck aus anderem Holzstueck
        // erzeugt oder mit neuem Etikett versehen: Das ist das
        // vorherige Holzstueck bzw. alte Etikett. Sonst null.
}