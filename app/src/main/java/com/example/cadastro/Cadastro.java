package com.example.cadastro;

public class Cadastro {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String sexo;
    private boolean interesseEmail;
    private String cidade;
    private String uf;

    public Cadastro(String nomeCompleto, String telefone, String email, String sexo, boolean interesseEmail, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.interesseEmail = interesseEmail;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Cadastro() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isInteresseEmail() {
        return interesseEmail;
    }

    public void setInteresseEmail(boolean interesseEmail) {
        this.interesseEmail = interesseEmail;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf(String s) {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", interesseEmail=" + interesseEmail +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
