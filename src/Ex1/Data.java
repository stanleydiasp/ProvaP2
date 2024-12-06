package Ex1;

import java.time.LocalDate;

public class Data {

    private int dia;

    private int mes;

    private int ano;

    public Data(int dia, int mes, int ano) {
        this.ano = ano;

        if (mes < 1 || mes > 12) {
            this.dia = 0;
            this.mes = 0;
            return;
        }

        int maxDias;
        if (mes == 2) {
            maxDias = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDias = 30;
        } else {
            maxDias = 31;
        }

        if (dia < 1 || dia > maxDias) {
            this.dia = 0;
            this.mes = 0;
        } else {
            this.dia = dia;
            this.mes = mes;
        }
    }


    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    public void aumentarDias(int nDeDias) {

        while (nDeDias > 0) {
            int diasNoMesAtual;

            if (this.mes == 2) {
                diasNoMesAtual = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMesAtual = 30;
            } else {
                diasNoMesAtual = 31;
            }

            if (this.dia + nDeDias > diasNoMesAtual) {
                nDeDias -= (diasNoMesAtual - dia + 1);
                this.dia = 1;
                this.mes++;
                if (this.mes > 12) {
                    this.mes = 1;
                    this.ano++;
                }
            } else {
                this.dia += nDeDias;
                nDeDias = 0;
            }
        }

    }

    public void retrocederDias(int nDeDias) {
        while (nDeDias > 0) {
            if (nDeDias >= this.dia) {
                nDeDias -= this.dia;
                this.mes--;
                if (this.mes < 1) {
                    this.mes = 12;
                    this.ano--;
                }

                if (this.mes == 2) {
                        this.dia = 28;
                } else if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
                    this.dia = 30;
                } else {
                    this.dia = 31;
                }
            } else {
                this.dia -= nDeDias;
                nDeDias = 0;
            }
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
