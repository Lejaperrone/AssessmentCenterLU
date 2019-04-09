public class ServicioExterno {

    public void enviarMail(String asunto, String cuerpo, String destinatario){
        System.out.println("Se ha enviado un mail a " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
}
