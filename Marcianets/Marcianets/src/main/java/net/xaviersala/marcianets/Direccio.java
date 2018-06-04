package net.xaviersala.marcianets;

/**
 * Defineix les direccions segons el angle que formen.
 *
 * @author xavier
 *
 */
public enum Direccio {
    /**
     * En dalt és 270 graus.
     */
    AMUNT(270d),
    /**
     * L'esquerra està a 0 graus.
     */
    ESQUERRA(0d),
    /**
     * Avall és a 90 graus.
     */
    AVALL(90d),
    /**
     * La dreta està a 180 graus.
     */
    DRETA(180d),
    /**
     * La volta sencera és 360 graus.
     */
    VOLTA(360d);

/**
 * Valor de la variable.
 */
    private double valor;

    /**
     * Crea una direcció.
     * @param quina Direcció a crear
     */
    Direccio(final double quina) {
        valor = quina;
    }

    /**
     * @return Retorna el valor de la direcció.
     */
    double getValor() {
        return valor;
    }

}
