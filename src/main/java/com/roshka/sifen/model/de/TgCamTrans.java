package com.roshka.sifen.model.de;

import com.roshka.sifen.model.Constants;
import com.roshka.sifen.model.de.types.TiNatRec;
import com.roshka.sifen.model.de.types.TiTipDoc;
import com.roshka.sifen.model.paises.PaisType;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

public class TgCamTrans {
    private TiNatRec iNatTrans;
    private String dNomTrans;
    private String dRucTrans;
    private short dDVTrans;
    private TiTipDoc iTipIDTrans;
    private String dNumIDTrans;
    private PaisType cNacTrans;
    private String dNumIDChof;
    private String dNomChof;
    private String dDomFisc;
    private String dDirChof;
    private String dNombAg;
    private String dRucAg;
    private short dDVAg;
    private String dDirAge;

    public void setupSOAPElements(SOAPElement gTransp) throws SOAPException {
        SOAPElement gCamTrans = gTransp.addChildElement("gCamTrans", Constants.SIFEN_NS_PREFIX);
        gCamTrans.addChildElement("iNatTrans", Constants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.iNatTrans.getVal()));
        gCamTrans.addChildElement("dNomTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.dNomTrans);

        if (this.iNatTrans.getVal() == 1) {
            gCamTrans.addChildElement("dRucTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.dRucTrans);
            gCamTrans.addChildElement("dDVTrans", Constants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dDVTrans));
        } else if (this.iNatTrans.getVal() == 2) {
            gCamTrans.addChildElement("iTipIDTrans", Constants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.iTipIDTrans.getVal()));
            gCamTrans.addChildElement("dDTipIDTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.iTipIDTrans.getDescripcion());
            gCamTrans.addChildElement("dNumIDTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.dNumIDTrans);
        }

        if (this.cNacTrans != null) {
            gCamTrans.addChildElement("cNacTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.cNacTrans.toString());
            gCamTrans.addChildElement("dDesNacTrans", Constants.SIFEN_NS_PREFIX).setTextContent(this.cNacTrans.getNombre());
        }

        gCamTrans.addChildElement("dNumIDChof", Constants.SIFEN_NS_PREFIX).setTextContent(this.dNumIDChof);
        gCamTrans.addChildElement("dNomChof", Constants.SIFEN_NS_PREFIX).setTextContent(this.dNomChof);

        if (this.dDomFisc != null)
            gCamTrans.addChildElement("dDomFisc", Constants.SIFEN_NS_PREFIX).setTextContent(this.dDomFisc);

        if (this.dDirChof != null)
            gCamTrans.addChildElement("dDirChof", Constants.SIFEN_NS_PREFIX).setTextContent(this.dDirChof);

        if (this.dNombAg != null)
            gCamTrans.addChildElement("dNombAg", Constants.SIFEN_NS_PREFIX).setTextContent(this.dNombAg);

        if (this.dRucAg != null) {
            gCamTrans.addChildElement("dRucAg", Constants.SIFEN_NS_PREFIX).setTextContent(this.dRucAg);
            gCamTrans.addChildElement("dDVAg", Constants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dDVAg));
        }

        if (this.dNombAg != null)
            gCamTrans.addChildElement("dDirAge", Constants.SIFEN_NS_PREFIX).setTextContent(this.dDirAge);
    }

    public TiNatRec getiNatTrans() {
        return iNatTrans;
    }

    public void setiNatTrans(TiNatRec iNatTrans) {
        this.iNatTrans = iNatTrans;
    }

    public String getdNomTrans() {
        return dNomTrans;
    }

    public void setdNomTrans(String dNomTrans) {
        this.dNomTrans = dNomTrans;
    }

    public String getdRucTrans() {
        return dRucTrans;
    }

    public void setdRucTrans(String dRucTrans) {
        this.dRucTrans = dRucTrans;
    }

    public short getdDVTrans() {
        return dDVTrans;
    }

    public void setdDVTrans(short dDVTrans) {
        this.dDVTrans = dDVTrans;
    }

    public TiTipDoc getiTipIDTrans() {
        return iTipIDTrans;
    }

    public void setiTipIDTrans(TiTipDoc iTipIDTrans) {
        this.iTipIDTrans = iTipIDTrans;
    }

    public String getdNumIDTrans() {
        return dNumIDTrans;
    }

    public void setdNumIDTrans(String dNumIDTrans) {
        this.dNumIDTrans = dNumIDTrans;
    }

    public PaisType getcNacTrans() {
        return cNacTrans;
    }

    public void setcNacTrans(PaisType cNacTrans) {
        this.cNacTrans = cNacTrans;
    }

    public String getdNumIDChof() {
        return dNumIDChof;
    }

    public void setdNumIDChof(String dNumIDChof) {
        this.dNumIDChof = dNumIDChof;
    }

    public String getdNomChof() {
        return dNomChof;
    }

    public void setdNomChof(String dNomChof) {
        this.dNomChof = dNomChof;
    }

    public String getdDomFisc() {
        return dDomFisc;
    }

    public void setdDomFisc(String dDomFisc) {
        this.dDomFisc = dDomFisc;
    }

    public String getdDirChof() {
        return dDirChof;
    }

    public void setdDirChof(String dDirChof) {
        this.dDirChof = dDirChof;
    }

    public String getdNombAg() {
        return dNombAg;
    }

    public void setdNombAg(String dNombAg) {
        this.dNombAg = dNombAg;
    }

    public String getdRucAg() {
        return dRucAg;
    }

    public void setdRucAg(String dRucAg) {
        this.dRucAg = dRucAg;
    }

    public short getdDVAg() {
        return dDVAg;
    }

    public void setdDVAg(short dDVAg) {
        this.dDVAg = dDVAg;
    }

    public String getdDirAge() {
        return dDirAge;
    }

    public void setdDirAge(String dDirAge) {
        this.dDirAge = dDirAge;
    }
}
