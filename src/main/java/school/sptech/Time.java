package school.sptech;

import org.apache.commons.lang3.ClassUtils;

public class Time {
    String nome;
    Integer vitorias;
    Integer derrotas;
    Integer empates;


    public Time(){
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }

    public void registrarVitoria(){
        vitorias += 1;
    }

    public void registrarDerrota(){
        derrotas += 1;
    }
    public void registrarEmpate(){
        empates += 1;
    }

    public  Integer getPontos(){
        int pontos = 0;

        pontos = (vitorias*3)+(empates);

        System.out.println(pontos);
        return pontos;
    }
    public Integer getTotalPartidas(){
        Integer partidas ;

        partidas = vitorias+derrotas+empates;

        System.out.println(partidas);
        return partidas;
    }
    public Integer getAproveitamento(){

        double Aproveitamento = 0;

        Aproveitamento = ((double)vitorias / getTotalPartidas()) * 100;


        return (int)Aproveitamento;
    }
    public void compararAproveitamento(Time adversario) {
        getAproveitamento();
        Integer aproveitamentoAdv = adversario.getAproveitamento();

        if (aproveitamentoAdv > getAproveitamento()){
            System.out.println("Time: "+nome+"\n" +
                    "Vitórias: "+vitorias+"\n" +
                    "Empates: "+empates+"\n" +
                    "Derrotas: "+derrotas+"\n" +
                    "Pontos: "+getPontos()+"\n" +
                    "Total de Partidas: "+getTotalPartidas()+"\n" +
                    "Aproveitamento: "+getAproveitamento()+"%\n" +
                    "\n \n ----"+
                    "Time: "+adversario.nome+"\n" +
                    "Vitórias: "+adversario.vitorias+"\n" +
                    "Empates: "+adversario.empates+"\n" +
                    "Derrotas: "+adversario.derrotas+"\n" +
                    "Pontos: "+adversario.getPontos()+"\n" +
                    "Total de Partidas: "+adversario.getTotalPartidas()+"\n" +
                    "Aproveitamento: "+adversario.getAproveitamento()+"%\n" +
                    "O time "+ adversario.nome +
                    " teve um aproveitamento maior que o time"+ nome+".");
        } else if (aproveitamentoAdv < getAproveitamento()) {
            System.out.println("Time: "+nome+"\n" +
                    "Vitórias: "+vitorias+"\n" +
                    "Empates: "+empates+"\n" +
                    "Derrotas: "+derrotas+"\n" +
                    "Pontos: "+getPontos()+"\n" +
                    "Total de Partidas: "+getTotalPartidas()+"\n" +
                    "Aproveitamento: "+getAproveitamento()+"%\n" +
                    "\n \n ----"+
                    "Time: "+adversario.nome+"\n" +
                    "Vitórias: "+adversario.vitorias+"\n" +
                    "Empates: "+adversario.empates+"\n" +
                    "Derrotas: "+adversario.derrotas+"\n" +
                    "Pontos: "+adversario.getPontos()+"\n" +
                    "Total de Partidas: "+adversario.getTotalPartidas()+"\n" +
                    "Aproveitamento: "+adversario.getAproveitamento()+"%\n" +
                    "O time "+ nome +
                    " teve um aproveitamento maior que o time "+ adversario.nome+".");
        }else if (aproveitamentoAdv.equals(getAproveitamento())){
            System.out.println("O time"+ adversario.nome+ " e "+
                    nome +" têm o mesmo aproveitamento.");
        }
    }
}
