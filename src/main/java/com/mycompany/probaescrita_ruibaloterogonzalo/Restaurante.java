/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package probaEscritaUD1ACT4;

/**
 *
 * @author DAM2
 */
public class Restaurante {
    private String CIF;
    private String nome;
    private String propietario;
    private String enderezo;
    private String provincia;
    private String localidade;
    private String telefono;
    private String especialidade;
    private int garfos;
    private boolean menuDoDia;

    public Restaurante(String CIF, String nome, String propietario, String enderezo, String provincia, String localidade, String telefono, String especialidade, int garfos, boolean menuDoDia) {
        this.CIF = CIF;
        this.nome = nome;
        this.propietario = propietario;
        this.enderezo = enderezo;
        this.provincia = provincia;
        this.localidade = localidade;
        this.telefono = telefono;
        this.especialidade = especialidade;
        this.garfos = garfos;
        this.menuDoDia = menuDoDia;
    }

    @Override
    public String toString() {
        //return "Restaurante{" + "CIF=" + getCIF() + ", nome=" + getNome() + ", propietario=" + getPropietario() + ", enderezo=" + getEnderezo() + ", provincia=" + getProvincia() + ", localidade=" + getLocalidade() + ", telefono=" + getTelefono() + ", especialidade=" + getEspecialidade() + ", garfos=" + getGarfos() + ", menuDoDia=" + isMenuDoDia() + '}';
        return getNome();
    }

    /**
     * @return the CIF
     */
    public String getCIF() {
        return CIF;
    }

    /**
     * @param CIF the CIF to set
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the enderezo
     */
    public String getEnderezo() {
        return enderezo;
    }

    /**
     * @param enderezo the enderezo to set
     */
    public void setEnderezo(String enderezo) {
        this.enderezo = enderezo;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the localidade
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * @param localidade the localidade to set
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the garfos
     */
    public int getGarfos() {
        return garfos;
    }

    /**
     * @param garfos the garfos to set
     */
    public void setGarfos(int garfos) {
        this.garfos = garfos;
    }

    /**
     * @return the menuDoDia
     */
    public boolean isMenuDoDia() {
        return menuDoDia;
    }

    /**
     * @param menuDoDia the menuDoDia to set
     */
    public void setMenuDoDia(boolean menuDoDia) {
        this.menuDoDia = menuDoDia;
    }
    
    
    
    
    
    
    
}
