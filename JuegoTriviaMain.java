package zzJuegoTriviaULTIMO;

import java.util.Random;

public class JuegoTriviaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("BIENVENIDOS A JUEGOTRIVIA");	
	
	
	//**************************ARTE Y LITERATURA***************************
	
	//INSTANCIAMOS LA PREGUNTA
	Pregunta pregunta1 = new Pregunta("¿Quién escribió 'El túnel'?");
	//INSTANCIAMOS RESPUESTAS
	Respuesta respuesta1A = new Respuesta("Gabrial García Márquez", 0);
	Respuesta respuesta1B = new Respuesta("Mario Vargas Llosa", 0);
	Respuesta respuesta1C = new Respuesta("Jorge Luis Borges", 0);
	Respuesta respuesta1D = new Respuesta("Ernesto Sabato", 1);
	//AGREGO RESPUESTAS AL ARRAY
	pregunta1.agregarRespuesta(respuesta1A);
	pregunta1.agregarRespuesta(respuesta1B);
	pregunta1.agregarRespuesta(respuesta1C);
	pregunta1.agregarRespuesta(respuesta1D);
	

	Pregunta pregunta2 = new Pregunta("¿Cómo se llama a la gente que no posee magia en la saga de Harry Potter?");
	Respuesta respuesta2A = new Respuesta("Muggles", 1);
	Respuesta respuesta2B = new Respuesta("Simplón", 0);
	Respuesta respuesta2C = new Respuesta("Impuro", 0);
	Respuesta respuesta2D = new Respuesta("Humano", 0);
	pregunta2.agregarRespuesta(respuesta2A);
	pregunta2.agregarRespuesta(respuesta2B);
	pregunta2.agregarRespuesta(respuesta2C);
	pregunta2.agregarRespuesta(respuesta2D);
	
	
	Pregunta pregunta3 = new Pregunta("¿Quién fue Antonio Lucio Vivaldi?");
	Respuesta respuesta3A = new Respuesta("Tenor de Opera", 0);
	Respuesta respuesta3B = new Respuesta("Violinista y Compositor del Barroco", 1);
	Respuesta respuesta3C = new Respuesta("Guitarrista Clásico", 0);
	Respuesta respuesta3D = new Respuesta("Clavesista Italiano", 0);
	pregunta3.agregarRespuesta(respuesta3A);
	pregunta3.agregarRespuesta(respuesta3B);
	pregunta3.agregarRespuesta(respuesta3C);
	pregunta3.agregarRespuesta(respuesta3D);
	
	
	Pregunta pregunta4 = new Pregunta("¿Qué filósofo dijo 'solo sé que no sé nada'?");
	Respuesta respuesta4A = new Respuesta("Heráclito", 0);
	Respuesta respuesta4B = new Respuesta("Platón", 0);
	Respuesta respuesta4C = new Respuesta("Sócrates", 1);
	Respuesta respuesta4D = new Respuesta("Tales de Mileto", 0);
	pregunta4.agregarRespuesta(respuesta4A);
	pregunta4.agregarRespuesta(respuesta4B);
	pregunta4.agregarRespuesta(respuesta4C);
	pregunta4.agregarRespuesta(respuesta4D);

	
	Pregunta pregunta5 = new Pregunta("¿Quién es el autor de 'El principito'?");
	Respuesta respuesta5A = new Respuesta("Cuahutemoc Sanchez", 0);
	Respuesta respuesta5B = new Respuesta("Beatriz Espejo", 0);
	Respuesta respuesta5C = new Respuesta("Antoine de Saint-Exupery", 1);
	Respuesta respuesta5D = new Respuesta("Ninguna es correcta", 0);
	pregunta1.agregarRespuesta(respuesta5A);
	pregunta1.agregarRespuesta(respuesta5B);
	pregunta1.agregarRespuesta(respuesta5C);
	pregunta1.agregarRespuesta(respuesta5D);

	
	Pregunta pregunta6 = new Pregunta("¿Cuál es el género teatral intermedio entre la comedia y la tragedia?");
	Respuesta respuesta6A = new Respuesta("Zarzuela", 0);
	Respuesta respuesta6B = new Respuesta("Entremés", 0);
	Respuesta respuesta6C = new Respuesta("Farsa", 0);
	Respuesta respuesta6D = new Respuesta("Drama", 1);
	pregunta6.agregarRespuesta(respuesta6A);
	pregunta6.agregarRespuesta(respuesta6B);
	pregunta6.agregarRespuesta(respuesta6C);
	pregunta6.agregarRespuesta(respuesta6D);
	
	
	Pregunta pregunta7 = new Pregunta("¿Cómo se llama el arte japones de la papiroflexia?");
	Respuesta respuesta7A = new Respuesta("Origami", 1);
	Respuesta respuesta7B = new Respuesta("Haiku", 0);
	Respuesta respuesta7C = new Respuesta("Ikebana", 0);
	Respuesta respuesta7D = new Respuesta("Ukiyo-e", 0);
	pregunta7.agregarRespuesta(respuesta7A);
	pregunta7.agregarRespuesta(respuesta7B);
	pregunta7.agregarRespuesta(respuesta7C);
	pregunta7.agregarRespuesta(respuesta7D);
	
	
	Pregunta pregunta8 = new Pregunta("¿Quién dirigió la película 'Lo Que El Viento Se Llevó'?");
	Respuesta respuesta8A = new Respuesta("Alfred Hitchcock", 0);
	Respuesta respuesta8B = new Respuesta("Victor Fleming", 1);
	Respuesta respuesta8C = new Respuesta("Orson Walles", 0);
	Respuesta respuesta8D = new Respuesta("Clark Gable", 0);
	pregunta8.agregarRespuesta(respuesta8A);
	pregunta8.agregarRespuesta(respuesta8B);
	pregunta8.agregarRespuesta(respuesta8C);
	pregunta8.agregarRespuesta(respuesta8D);
	
	
	Pregunta pregunta9 = new Pregunta("¿En qué año se publicó la primera parte del Quijote?");
	Respuesta respuesta9A = new Respuesta("1615", 0);
	Respuesta respuesta9B = new Respuesta("1625", 0);
	Respuesta respuesta9C = new Respuesta("1605", 1);
	Respuesta respuesta9D = new Respuesta("1635", 0);
	pregunta9.agregarRespuesta(respuesta9A);
	pregunta9.agregarRespuesta(respuesta9B);
	pregunta9.agregarRespuesta(respuesta9C);
	pregunta9.agregarRespuesta(respuesta9D);
	
	
	Pregunta pregunta10 = new Pregunta("¿Quién pintó 'Las Meninas'?");
	Respuesta respuesta10A = new Respuesta("Van Gogh", 0);
	Respuesta respuesta10B = new Respuesta("Goya", 0);
	Respuesta respuesta10C = new Respuesta("Monet", 0);
	Respuesta respuesta10D = new Respuesta("Velázquez", 1);
	pregunta10.agregarRespuesta(respuesta10A);
	pregunta10.agregarRespuesta(respuesta10B);
	pregunta10.agregarRespuesta(respuesta10C);
	pregunta10.agregarRespuesta(respuesta10D);
	
	
	//************************CIENCIA Y TECNOLOGIA***********************
	
	Pregunta pregunta11 = new Pregunta("¿Qué es más pequeño, un átomo o una molécula?");
	Respuesta respuesta11A = new Respuesta("Son de igual tamaño", 0);
	Respuesta respuesta11B = new Respuesta("Una molécula", 0);
	Respuesta respuesta11C = new Respuesta("Un átomo", 1);
	Respuesta respuesta11D = new Respuesta("Todas las anteriores son correctas", 0);
	pregunta11.agregarRespuesta(respuesta11A);
	pregunta11.agregarRespuesta(respuesta11B);
	pregunta11.agregarRespuesta(respuesta11C);
	pregunta11.agregarRespuesta(respuesta11D);
	
	
	Pregunta pregunta12 = new Pregunta("¿¿Cuál de las sisguientes enfermedades ataca al higado?");
	Respuesta respuesta12A = new Respuesta("Hepatitis", 1);
	Respuesta respuesta12B = new Respuesta("Diabetes", 0);
	Respuesta respuesta12C = new Respuesta("Artrósis", 0);
	Respuesta respuesta12D = new Respuesta("Cifoescoliosis", 0);
	pregunta12.agregarRespuesta(respuesta12A);
	pregunta12.agregarRespuesta(respuesta12B);
	pregunta12.agregarRespuesta(respuesta12C);
	pregunta12.agregarRespuesta(respuesta12D);
	
	
	Pregunta pregunta13 = new Pregunta("¿Qué estudia la icitología?");
	Respuesta respuesta13A = new Respuesta("Las rocas", 0);
	Respuesta respuesta13B = new Respuesta("Los insectos", 0);
	Respuesta respuesta13C = new Respuesta("Las plantas", 0);
	Respuesta respuesta13D = new Respuesta("Los peces", 1);
	pregunta13.agregarRespuesta(respuesta13A);
	pregunta13.agregarRespuesta(respuesta13B);
	pregunta13.agregarRespuesta(respuesta13C);
	pregunta13.agregarRespuesta(respuesta13D);
	
	
	Pregunta pregunta14 = new Pregunta("¿Cuál es la ciencia que estudia la aplicación de la informática y las comunicaciones al hogar?");
	Respuesta respuesta14A = new Respuesta("Robótica", 0);
	Respuesta respuesta14B = new Respuesta("Domótica", 1);
	Respuesta respuesta14C = new Respuesta("Casática", 0);
	Respuesta respuesta14D = new Respuesta("Autología", 0);
	pregunta14.agregarRespuesta(respuesta14A);
	pregunta14.agregarRespuesta(respuesta14B);
	pregunta14.agregarRespuesta(respuesta14C);
	pregunta14.agregarRespuesta(respuesta14D);
	
	
	Pregunta pregunta15 = new Pregunta("¿Cuál es la fórmula química del agua?");
	Respuesta respuesta15A = new Respuesta("H2O", 1);
	Respuesta respuesta15B = new Respuesta("HO", 0);
	Respuesta respuesta15C = new Respuesta("HO2", 0);
	Respuesta respuesta15D = new Respuesta("Agu", 0);
	pregunta15.agregarRespuesta(respuesta15A);
	pregunta15.agregarRespuesta(respuesta15B);
	pregunta15.agregarRespuesta(respuesta15C);
	pregunta15.agregarRespuesta(respuesta15D);
	
	
	Pregunta pregunta16 = new Pregunta("¿Cuál es el mineral más duro del planeta?");
	Respuesta respuesta16A = new Respuesta("Diamante", 1);
	Respuesta respuesta16B = new Respuesta("Mármol", 0);
	Respuesta respuesta16C = new Respuesta("Cuarzo", 0);
	Respuesta respuesta16D = new Respuesta("Adamantio", 0);
	pregunta16.agregarRespuesta(respuesta16A);
	pregunta16.agregarRespuesta(respuesta16B);
	pregunta16.agregarRespuesta(respuesta16C);
	pregunta16.agregarRespuesta(respuesta16D);
	
	
	Pregunta pregunta17 = new Pregunta("¿Qué animal representa al Sistema Operativo Linux?");
	Respuesta respuesta17A = new Respuesta("Gato", 0);
	Respuesta respuesta17B = new Respuesta("Oso panda", 0);
	Respuesta respuesta17C = new Respuesta("León", 0);
	Respuesta respuesta17D = new Respuesta("Pingüino", 1);
	pregunta17.agregarRespuesta(respuesta17A);
	pregunta17.agregarRespuesta(respuesta17B);
	pregunta17.agregarRespuesta(respuesta17C);
	pregunta17.agregarRespuesta(respuesta17D);
	
	
	Pregunta pregunta18 = new Pregunta("¿Cómo se llama el movimiento que realiza la Tierra alrededor del Sol?");
	Respuesta respuesta18A = new Respuesta("La Tierra no se mueve", 0);
	Respuesta respuesta18B = new Respuesta("Rotación", 0);
	Respuesta respuesta18C = new Respuesta("Traslación", 1);
	Respuesta respuesta18D = new Respuesta("Órbita", 0);
	pregunta18.agregarRespuesta(respuesta18A);
	pregunta18.agregarRespuesta(respuesta18B);
	pregunta18.agregarRespuesta(respuesta18C);
	pregunta18.agregarRespuesta(respuesta18D);
	
	
	Pregunta pregunta19 = new Pregunta("¿Cuál es la combinación de las teclas que copia texto en un PC?");
	Respuesta respuesta19A = new Respuesta("ctrl + c", 1);
	Respuesta respuesta19B = new Respuesta("ctrl + v", 0);
	Respuesta respuesta19C = new Respuesta("ctrl + p", 0);
	Respuesta respuesta19D = new Respuesta("ctrl + q", 0);
	pregunta19.agregarRespuesta(respuesta19A);
	pregunta19.agregarRespuesta(respuesta19B);
	pregunta19.agregarRespuesta(respuesta19C);
	pregunta19.agregarRespuesta(respuesta19D);
	
	
	Pregunta pregunta20 = new Pregunta("¿Qué hace un procastinador?");
	Respuesta respuesta20A = new Respuesta("Se obsesiona con el sexo", 0);
	Respuesta respuesta20B = new Respuesta("Presume sus logros", 0);
	Respuesta respuesta20C = new Respuesta("Pospone sus actividades", 1);
	Respuesta respuesta20D = new Respuesta("Es hiperactivo", 0);
	pregunta20.agregarRespuesta(respuesta20A);
	pregunta20.agregarRespuesta(respuesta20B);
	pregunta20.agregarRespuesta(respuesta20C);
	pregunta20.agregarRespuesta(respuesta20D);
	
	
	//******************************DEPORTES***********************************
	
	Pregunta pregunta21 = new Pregunta("¿Cuál es el estilo de natación más rápido?");
	Respuesta respuesta21A = new Respuesta("Espalda", 0);
	Respuesta respuesta21B = new Respuesta("Pecho", 0);
	Respuesta respuesta21C = new Respuesta("Mariposa", 0);
	Respuesta respuesta21D = new Respuesta("Crol", 1);
	pregunta21.agregarRespuesta(respuesta21A);
	pregunta21.agregarRespuesta(respuesta21B);
	pregunta21.agregarRespuesta(respuesta21C);
	pregunta21.agregarRespuesta(respuesta21D);
	

	Pregunta pregunta22 = new Pregunta("¿Cuántos jugadores componen un equipo de rugby?");
	Respuesta respuesta22A = new Respuesta("12", 0);
	Respuesta respuesta22B = new Respuesta("11", 0);
	Respuesta respuesta22C = new Respuesta("15", 1);
	Respuesta respuesta22D = new Respuesta("21", 0);
	pregunta22.agregarRespuesta(respuesta22A);
	pregunta22.agregarRespuesta(respuesta22B);
	pregunta22.agregarRespuesta(respuesta22C);
	pregunta22.agregarRespuesta(respuesta22D);

	
	Pregunta pregunta23 = new Pregunta("¿Quién inventó el arte marcial llamado Jeet Kune Do?");
	Respuesta respuesta23A = new Respuesta("Bruce Lee", 1);
	Respuesta respuesta23B = new Respuesta("David Carradine", 0);
	Respuesta respuesta23C = new Respuesta("Kato Mimoko", 0);
	Respuesta respuesta23D = new Respuesta("Ninguna es correcta", 0);
	pregunta23.agregarRespuesta(respuesta23A);
	pregunta23.agregarRespuesta(respuesta23B);
	pregunta23.agregarRespuesta(respuesta23C);
	pregunta23.agregarRespuesta(respuesta23D);
	
	
	Pregunta pregunta24 = new Pregunta("¿Cuál es el estadio de fútbol con mayor capacidad en América?");
	Respuesta respuesta24A = new Respuesta("Estadio Maracaná (Brasil)", 0);
	Respuesta respuesta24B = new Respuesta("Estadio Monumental (Argentina)", 0);
	Respuesta respuesta24C = new Respuesta("Estadio Azteca (México)", 1);
	Respuesta respuesta24D = new Respuesta("Estadio Morumbi (Brasil)", 0);
	pregunta24.agregarRespuesta(respuesta24A);
	pregunta24.agregarRespuesta(respuesta24B);
	pregunta24.agregarRespuesta(respuesta24C);
	pregunta24.agregarRespuesta(respuesta24D);
	
	
	Pregunta pregunta25 = new Pregunta("¿Qué tipo de competición es el Giro de Italia?");
	Respuesta respuesta25A = new Respuesta("Una carrera ciclista", 1);
	Respuesta respuesta25B = new Respuesta("Una competición de vela", 0);
	Respuesta respuesta25C = new Respuesta("Un maratón", 0);
	Respuesta respuesta25D = new Respuesta("Una carrera automovilística", 0);
	pregunta25.agregarRespuesta(respuesta25A);
	pregunta25.agregarRespuesta(respuesta25B);
	pregunta25.agregarRespuesta(respuesta25C);
	pregunta25.agregarRespuesta(respuesta25D);
	
	
	Pregunta pregunta26 = new Pregunta("¿De qué nacionalidad es el entrenador de fútbol Tata Martino?");
	Respuesta respuesta26A = new Respuesta("Italia", 0);
	Respuesta respuesta26B = new Respuesta("Argentina", 1);
	Respuesta respuesta26C = new Respuesta("España", 0);
	Respuesta respuesta26D = new Respuesta("Brasil", 0);
	pregunta26.agregarRespuesta(respuesta26A);
	pregunta26.agregarRespuesta(respuesta26B);
	pregunta26.agregarRespuesta(respuesta26C);
	pregunta26.agregarRespuesta(respuesta26D);
	
	
	Pregunta pregunta27 = new Pregunta("¿Dónde se inventó el tenis de mesa?");
	Respuesta respuesta27A = new Respuesta("Corea del Sur", 0);
	Respuesta respuesta27B = new Respuesta("China", 0);
	Respuesta respuesta27C = new Respuesta("Japón", 0);
	Respuesta respuesta27D = new Respuesta("Inglaterra", 1);
	pregunta27.agregarRespuesta(respuesta27A);
	pregunta27.agregarRespuesta(respuesta27B);
	pregunta27.agregarRespuesta(respuesta27C);
	pregunta27.agregarRespuesta(respuesta27D);
	
	
	Pregunta pregunta28 = new Pregunta("¿A qué jugador de fútbol le apodan 'El Apache'?");
	Respuesta respuesta28A = new Respuesta("Lionel Messi", 0);
	Respuesta respuesta28B = new Respuesta("Sergio Ramos", 0);
	Respuesta respuesta28C = new Respuesta("Carlos Tévez", 1);
	Respuesta respuesta28D = new Respuesta("Cristiano Ronaldo", 0);
	pregunta28.agregarRespuesta(respuesta28A);
	pregunta28.agregarRespuesta(respuesta28B);
	pregunta28.agregarRespuesta(respuesta28C);
	pregunta28.agregarRespuesta(respuesta28D);
	
	
	Pregunta pregunta29 = new Pregunta("¿Cuál es la última cinta en las artes marciales?");
	Respuesta respuesta29A = new Respuesta("Café ", 0);
	Respuesta respuesta29B = new Respuesta("Negra", 1);
	Respuesta respuesta29C = new Respuesta("Roja", 0);
	Respuesta respuesta29D = new Respuesta("Blanca", 0);
	pregunta29.agregarRespuesta(respuesta29A);
	pregunta29.agregarRespuesta(respuesta29B);
	pregunta29.agregarRespuesta(respuesta29C);
	pregunta29.agregarRespuesta(respuesta29D);
	
	
	Pregunta pregunta30 = new Pregunta("¿De qué colores es la camiseta del Atlético de Madrid?");
	Respuesta respuesta30A = new Respuesta("Rojo y blanco", 1);
	Respuesta respuesta30B = new Respuesta("Rojo y negro", 0);
	Respuesta respuesta30C = new Respuesta("Azul y amarillo", 0);
	Respuesta respuesta30D = new Respuesta("Blanco y verde", 0);
	pregunta30.agregarRespuesta(respuesta30A);
	pregunta30.agregarRespuesta(respuesta30B);
	pregunta30.agregarRespuesta(respuesta30C);
	pregunta30.agregarRespuesta(respuesta30D);
	
	//***************************ENTRETENIMIENTO*******************************
	
	Pregunta pregunta31 = new Pregunta("¿A qué se le llama 'manga'?");
	Respuesta respuesta31A = new Respuesta("Al comic estadounidense", 0);
	Respuesta respuesta31B = new Respuesta("Al comic frances", 0);
	Respuesta respuesta31C = new Respuesta("Al comic chino", 0);
	Respuesta respuesta31D = new Respuesta("Al comic japones", 1);
	pregunta31.agregarRespuesta(respuesta31A); 
	pregunta31.agregarRespuesta(respuesta31B);
	pregunta31.agregarRespuesta(respuesta31C);
	pregunta31.agregarRespuesta(respuesta31D);
	
	
	Pregunta pregunta32 = new Pregunta("¿Qué actor protagonizó la película 'Grease'?");
	Respuesta respuesta32A = new Respuesta("Barry Gibb", 0);
	Respuesta respuesta32B = new Respuesta("Tom Cruise", 0);
	Respuesta respuesta32C = new Respuesta("Jonh Travolta", 1);
	Respuesta respuesta32D = new Respuesta("Kevin Costner", 0);
	pregunta32.agregarRespuesta(respuesta32A); 
	pregunta32.agregarRespuesta(respuesta32B);
	pregunta32.agregarRespuesta(respuesta32C);
	pregunta32.agregarRespuesta(respuesta32D);
	
	Pregunta pregunta33 = new Pregunta("¿A quién se considera el Rey del Pop?");
	Respuesta respuesta33A = new Respuesta("Justin Bieber", 0);
	Respuesta respuesta33B = new Respuesta("Michael Jackson", 1);
	Respuesta respuesta33C = new Respuesta("Zayn Malik", 0);
	Respuesta respuesta33D = new Respuesta("Zac Efron", 0);
	pregunta33.agregarRespuesta(respuesta33A); 
	pregunta33.agregarRespuesta(respuesta33B);
	pregunta33.agregarRespuesta(respuesta33C);
	pregunta33.agregarRespuesta(respuesta33D);
	
	Pregunta pregunta34 = new Pregunta("¿Qué es Assasin's Creed?");
	Respuesta respuesta34A = new Respuesta("Una tienda de ropa", 0);
	Respuesta respuesta34B = new Respuesta("Una obra de teatro", 0);
	Respuesta respuesta34C = new Respuesta("Un país", 0);
	Respuesta respuesta34D = new Respuesta("Un videojuego", 1);
	pregunta34.agregarRespuesta(respuesta34A); 
	pregunta34.agregarRespuesta(respuesta34B);
	pregunta34.agregarRespuesta(respuesta34C);
	pregunta34.agregarRespuesta(respuesta34D);
	
	Pregunta pregunta35 = new Pregunta("¿Cuál es el nombre real de Lady Gaga?");
	Respuesta respuesta35A = new Respuesta("Robyn Fenty", 0);
	Respuesta respuesta35B = new Respuesta("Stefani Germanotta", 1);
	Respuesta respuesta35C = new Respuesta("Onika Maraj", 0);
	Respuesta respuesta35D = new Respuesta("Beth Moore", 0);
	pregunta35.agregarRespuesta(respuesta35A); 
	pregunta35.agregarRespuesta(respuesta35B);
	pregunta35.agregarRespuesta(respuesta35C);
	pregunta35.agregarRespuesta(respuesta35D);
	
	Pregunta pregunta36 = new Pregunta("¿Qué grupo interpretaba la canción 'Smells like teen spirit'?");
	Respuesta respuesta36A = new Respuesta("Nirvana", 1);
	Respuesta respuesta36B = new Respuesta("Los Beatles", 0);
	Respuesta respuesta36C = new Respuesta("Led Zeppelin", 0);
	Respuesta respuesta36D = new Respuesta("Los Rolling Stones", 0);
	pregunta36.agregarRespuesta(respuesta36A); 
	pregunta36.agregarRespuesta(respuesta36B);
	pregunta36.agregarRespuesta(respuesta36C);
	pregunta36.agregarRespuesta(respuesta36D);
	
	Pregunta pregunta37 = new Pregunta("¿Cuántos capítulos tiene la serie de televisión 'Friends'?");
	Respuesta respuesta37A = new Respuesta("183", 0);
	Respuesta respuesta37B = new Respuesta("236", 1);
	Respuesta respuesta37C = new Respuesta("310", 0);
	Respuesta respuesta37D = new Respuesta("94", 0);
	pregunta37.agregarRespuesta(respuesta37A); 
	pregunta37.agregarRespuesta(respuesta37B);
	pregunta37.agregarRespuesta(respuesta37C);
	pregunta37.agregarRespuesta(respuesta37D);


	Pregunta pregunta38 = new Pregunta("¿Cómo se llamaba el primer gato de Los Simpsons?");
	Respuesta respuesta38A = new Respuesta("Bola de nieve", 1);
	Respuesta respuesta38B = new Respuesta("Gato", 0);
	Respuesta respuesta38C = new Respuesta("Bart Junior", 0);
	Respuesta respuesta38D = new Respuesta("Nieve", 0);
	pregunta38.agregarRespuesta(respuesta38A); 
	pregunta38.agregarRespuesta(respuesta38B);
	pregunta38.agregarRespuesta(respuesta38C);
	pregunta38.agregarRespuesta(respuesta38D);


	Pregunta pregunta39 = new Pregunta("¿Cuáles son los nombres de 'Los Tres Chiflados'?");
	Respuesta respuesta39A = new Respuesta("Mio, Luck, Patrick", 0);
	Respuesta respuesta39B = new Respuesta("Moe, Larry y Curly", 1);
	Respuesta respuesta39C = new Respuesta("Moe, Larri y Carly", 0);
	Respuesta respuesta39D = new Respuesta("Bart, Luck y Loles", 0);
	pregunta39.agregarRespuesta(respuesta39A); 
	pregunta39.agregarRespuesta(respuesta39B);
	pregunta39.agregarRespuesta(respuesta39C);
	pregunta39.agregarRespuesta(respuesta39D);
	
	Pregunta pregunta40 = new Pregunta("¿Cuál de estas películas no fue protagonizada por Brad Pitt?");
	Respuesta respuesta40A = new Respuesta("El club de la pelea", 0);
	Respuesta respuesta40B = new Respuesta("Guerra Mundial Z", 0);
	Respuesta respuesta40C = new Respuesta("El especialista", 1);
	Respuesta respuesta40D = new Respuesta("¿Conoces a Joe Black?", 0);
	pregunta40.agregarRespuesta(respuesta40A); 
	pregunta40.agregarRespuesta(respuesta40B);
	pregunta40.agregarRespuesta(respuesta40C);
	pregunta40.agregarRespuesta(respuesta40D);
	
	//****************************GEOGRAFIA**************************
	
	Pregunta pregunta41 = new Pregunta("¿A qué país pertenece la isla de Tasmania?");
	Respuesta respuesta41A = new Respuesta("Estados Unidos", 0);
	Respuesta respuesta41B = new Respuesta("Australia", 1);
	Respuesta respuesta41C = new Respuesta("Portugal", 0);
	Respuesta respuesta41D = new Respuesta("Ninguna es correcta", 0);
	pregunta41.agregarRespuesta(respuesta41A); 
	pregunta41.agregarRespuesta(respuesta41B);
	pregunta41.agregarRespuesta(respuesta41C);
	pregunta41.agregarRespuesta(respuesta41D);


	Pregunta pregunta42 = new Pregunta("En cuál de los siguientes países no hay ningún desierto?");
	Respuesta respuesta42A = new Respuesta("Chile", 0);
	Respuesta respuesta42B = new Respuesta("España", 0);
	Respuesta respuesta42C = new Respuesta("Mongolia", 0);
	Respuesta respuesta42D = new Respuesta("Alemania", 1);
	pregunta42.agregarRespuesta(respuesta42A); 
	pregunta42.agregarRespuesta(respuesta42B);
	pregunta42.agregarRespuesta(respuesta42C);
	pregunta42.agregarRespuesta(respuesta42D);
	
	
	Pregunta pregunta43 = new Pregunta("¿Cuál es el lugar más frío de la tierra?");
	Respuesta respuesta43A = new Respuesta("La Antartida", 1);
	Respuesta respuesta43B = new Respuesta("Canadá", 0);
	Respuesta respuesta43C = new Respuesta("Rusia", 0);
	Respuesta respuesta43D = new Respuesta("Finlandia", 0);
	pregunta43.agregarRespuesta(respuesta43A); 
	pregunta43.agregarRespuesta(respuesta43B);
	pregunta43.agregarRespuesta(respuesta43C);
	pregunta43.agregarRespuesta(respuesta43D);


	Pregunta pregunta44 = new Pregunta("¿Cuál es el océano más grande?");
	Respuesta respuesta44A = new Respuesta("Océano Indico", 0);
	Respuesta respuesta44B = new Respuesta("Océano Atlántico", 0);
	Respuesta respuesta44C = new Respuesta("Océano Pacífico", 3);
	Respuesta respuesta44D = new Respuesta("Océano Glaciar Antártico", 0);
	pregunta44.agregarRespuesta(respuesta44A); 
	pregunta44.agregarRespuesta(respuesta44B);
	pregunta44.agregarRespuesta(respuesta44C);
	pregunta44.agregarRespuesta(respuesta44D);


	Pregunta pregunta45 = new Pregunta("¿Cual es país más poblado de la Tierra?");
	Respuesta respuesta45A = new Respuesta("Estados Unidos", 0);
	Respuesta respuesta45B = new Respuesta("India", 0);
	Respuesta respuesta45C = new Respuesta("China", 1);
	Respuesta respuesta45D = new Respuesta("Brasil", 0);
	pregunta45.agregarRespuesta(respuesta45A); 
	pregunta45.agregarRespuesta(respuesta45B);
	pregunta45.agregarRespuesta(respuesta45C);
	pregunta45.agregarRespuesta(respuesta45D);
	
	
	Pregunta pregunta46 = new Pregunta("¿Cuál es la capital de Croacia?");
	Respuesta respuesta46A = new Respuesta("Dubrovnik", 0);
	Respuesta respuesta46B = new Respuesta("Split", 0);
	Respuesta respuesta46C = new Respuesta("Zadar", 0);
	Respuesta respuesta46D = new Respuesta("Zagreb", 1);
	pregunta46.agregarRespuesta(respuesta46A); 
	pregunta46.agregarRespuesta(respuesta46B);
	pregunta46.agregarRespuesta(respuesta46C);
	pregunta46.agregarRespuesta(respuesta46D);



	Pregunta pregunta47 = new Pregunta("¿En qué país está la Laguna Verde?");
	Respuesta respuesta47A = new Respuesta("Chile", 0);
	Respuesta respuesta47B = new Respuesta("Bolivia", 1);
	Respuesta respuesta47C = new Respuesta("Argentina", 0);
	Respuesta respuesta47D = new Respuesta("Brasil", 0);
	pregunta47.agregarRespuesta(respuesta47A); 
	pregunta47.agregarRespuesta(respuesta47B);
	pregunta47.agregarRespuesta(respuesta47C);
	pregunta47.agregarRespuesta(respuesta47D);


	Pregunta pregunta48 = new Pregunta("¿Qué accidente geográfico se define como una pendiente o vertical abrupta?");
	Respuesta respuesta48A = new Respuesta("Un barranco", 0);
	Respuesta respuesta48B = new Respuesta("Acantilado", 1);
	Respuesta respuesta48C = new Respuesta("Una montaña", 0);
	Respuesta respuesta48D = new Respuesta("Un puente", 0);
	pregunta48.agregarRespuesta(respuesta48A); 
	pregunta48.agregarRespuesta(respuesta48B);
	pregunta48.agregarRespuesta(respuesta48C);
	pregunta48.agregarRespuesta(respuesta48D);

	
	Pregunta pregunta49 = new Pregunta("¿Cuál es la capital de Dinamarca?");
	Respuesta respuesta49A = new Respuesta("Viena", 0);
	Respuesta respuesta49B = new Respuesta("Bakú", 0);
	Respuesta respuesta49C = new Respuesta("Copenhague", 1);
	Respuesta respuesta49D = new Respuesta("Bruselas", 0);
	pregunta49.agregarRespuesta(respuesta49A); 
	pregunta49.agregarRespuesta(respuesta49B);
	pregunta49.agregarRespuesta(respuesta49C);
	pregunta49.agregarRespuesta(respuesta49D);

	
	Pregunta pregunta50 = new Pregunta("¿En que provincia se encuentra la laguna de Epecuén");
	Respuesta respuesta50A = new Respuesta("Córdoba", 0);
	Respuesta respuesta50B = new Respuesta("San Luis", 0);
	Respuesta respuesta50C = new Respuesta("Mendoza", 0);
	Respuesta respuesta50D = new Respuesta("Buenos Aires", 1);
	pregunta50.agregarRespuesta(respuesta50A); 
	pregunta50.agregarRespuesta(respuesta50B);
	pregunta50.agregarRespuesta(respuesta50C);
	pregunta50.agregarRespuesta(respuesta50D);


	Pregunta pregunta51 = new Pregunta("¿Cómo se llama la capital del antiguo imperio azteca?");
	Respuesta respuesta51A = new Respuesta("Tenochtitlan", 1);
	Respuesta respuesta51B = new Respuesta("Quetzalcoatl", 0);
	Respuesta respuesta51C = new Respuesta("Texcoco", 0);
	Respuesta respuesta51D = new Respuesta("Culhuacan", 0);
	pregunta51.agregarRespuesta(respuesta51A); 
	pregunta51.agregarRespuesta(respuesta51B);
	pregunta51.agregarRespuesta(respuesta51C);
	pregunta51.agregarRespuesta(respuesta51D);
	
	
	Pregunta pregunta52 = new Pregunta("¿Qué se celebra el 8 de Marzo?");
	Respuesta respuesta52A = new Respuesta("El día del niño", 0);
	Respuesta respuesta52B = new Respuesta("El día del medio ambiente", 0);
	Respuesta respuesta52C = new Respuesta("El día del trabajo", 0);
	Respuesta respuesta52D = new Respuesta("El día de la mujer", 1);
	pregunta52.agregarRespuesta(respuesta52A); 
	pregunta52.agregarRespuesta(respuesta52B);
	pregunta52.agregarRespuesta(respuesta52C);
	pregunta52.agregarRespuesta(respuesta52D);


	Pregunta pregunta53 = new Pregunta("¿Quién gobernó Francia desde 1799 a 1815?");
	Respuesta respuesta53A = new Respuesta("François Quesnay", 0);
	Respuesta respuesta53B = new Respuesta("Napoleón Bonaparte", 0);
	Respuesta respuesta53C = new Respuesta("Adam Smith", 1);
	Respuesta respuesta53D = new Respuesta("Louis Bonaldgug", 0);
	pregunta53.agregarRespuesta(respuesta53A); 
	pregunta53.agregarRespuesta(respuesta53B);
	pregunta53.agregarRespuesta(respuesta53C);
	pregunta53.agregarRespuesta(respuesta53D);
	
	
	Pregunta pregunta54 = new Pregunta("¿Qué imperio llegó a conquistar casí toda Europa?");
	Respuesta respuesta54A = new Respuesta("Vikingo", 0);
	Respuesta respuesta54B = new Respuesta("Espartano", 0);
	Respuesta respuesta54C = new Respuesta("Cartago", 0);
	Respuesta respuesta54D = new Respuesta("Romano", 1);
	pregunta54.agregarRespuesta(respuesta54A); 
	pregunta54.agregarRespuesta(respuesta54B);
	pregunta54.agregarRespuesta(respuesta54C);
	pregunta54.agregarRespuesta(respuesta54D);


	Pregunta pregunta55 = new Pregunta("¿En qué año viajó el primer hombre a la luna?");
	Respuesta respuesta55A = new Respuesta("1979", 0);
	Respuesta respuesta55B = new Respuesta("1957", 0);
	Respuesta respuesta55C = new Respuesta("1968", 0);
	Respuesta respuesta55D = new Respuesta("1969", 1);
	pregunta55.agregarRespuesta(respuesta55A); 
	pregunta55.agregarRespuesta(respuesta55B);
	pregunta55.agregarRespuesta(respuesta55C);
	pregunta55.agregarRespuesta(respuesta55D);


	Pregunta pregunta56 = new Pregunta("¿En qué año llegó Cristobal Colón a América?");
	Respuesta respuesta56A = new Respuesta("1640", 0);
	Respuesta respuesta56B = new Respuesta("1482", 0);
	Respuesta respuesta56C = new Respuesta("1492", 1);
	Respuesta respuesta56D = new Respuesta("1460", 0);
	pregunta56.agregarRespuesta(respuesta56A); 
	pregunta56.agregarRespuesta(respuesta56B);
	pregunta56.agregarRespuesta(respuesta56C);
	pregunta56.agregarRespuesta(respuesta56D);
	
	
	Pregunta pregunta57 = new Pregunta("¿Qué país cifraba sus mensajes con la máquina Enigma?");
	Respuesta respuesta57A = new Respuesta("Alemania", 1);
	Respuesta respuesta57B = new Respuesta("Gran Bretaña", 0);
	Respuesta respuesta57C = new Respuesta("Estados Unidos", 0);
	Respuesta respuesta57D = new Respuesta("Rusia", 0);
	pregunta57.agregarRespuesta(respuesta57A); 
	pregunta57.agregarRespuesta(respuesta57B);
	pregunta57.agregarRespuesta(respuesta57C);
	pregunta57.agregarRespuesta(respuesta57D);


	Pregunta pregunta58 = new Pregunta("¿En qué año comenzó la II Guerra Mundial?");
	Respuesta respuesta58A = new Respuesta("1940", 0);
	Respuesta respuesta58B = new Respuesta("1939", 1);
	Respuesta respuesta58C = new Respuesta("1930", 0);
	Respuesta respuesta58D = new Respuesta("1960", 0);
	pregunta58.agregarRespuesta(respuesta58A); 
	pregunta58.agregarRespuesta(respuesta58B);
	pregunta58.agregarRespuesta(respuesta58C);
	pregunta58.agregarRespuesta(respuesta58D);


	Pregunta pregunta59 = new Pregunta("¿En qué año se fabricó el famoso Ford T?");
	Respuesta respuesta59A = new Respuesta("1904", 0);
	Respuesta respuesta59B = new Respuesta("1901", 0);
	Respuesta respuesta59C = new Respuesta("1908", 1);
	Respuesta respuesta59D = new Respuesta("1911", 0);
	pregunta59.agregarRespuesta(respuesta59A); 
	pregunta59.agregarRespuesta(respuesta59B);
	pregunta59.agregarRespuesta(respuesta59C);
	pregunta59.agregarRespuesta(respuesta59D);


	Pregunta pregunta60 = new Pregunta("¿Quién era el general de los nazis en la Segunda Guerra Mundial?");
	Respuesta respuesta60A = new Respuesta("Adolf Hitler", 1);
	Respuesta respuesta60B = new Respuesta("Iósif Stalin", 0);
	Respuesta respuesta60C = new Respuesta("Vladimir Lenin", 0);
	Respuesta respuesta60D = new Respuesta("León Trotski", 0);
	pregunta60.agregarRespuesta(respuesta60A); 
	pregunta60.agregarRespuesta(respuesta60B);
	pregunta60.agregarRespuesta(respuesta60C);
	pregunta60.agregarRespuesta(respuesta60D);

	
	//*************************CATEGORIAS************************
	Categoria cat_ArteLiteratura = new Categoria ("Arte y Literatura", 1);
	Categoria cat_CienciaTecnologia = new Categoria ("Ciencia y Tecnologia", 2);
	Categoria cat_Deportes = new Categoria ("Deportes", 3);
	Categoria cat_Entretenimiento = new Categoria ("Entretenimiento", 4);
	Categoria cat_Geografia = new Categoria ("Geografia", 5);
	Categoria cat_Historia = new Categoria ("Historia", 6);
	
	cat_ArteLiteratura.agregarPregunta(pregunta1);
	cat_ArteLiteratura.agregarPregunta(pregunta2);
	cat_ArteLiteratura.agregarPregunta(pregunta3);
	cat_ArteLiteratura.agregarPregunta(pregunta4);
	cat_ArteLiteratura.agregarPregunta(pregunta5);
	cat_ArteLiteratura.agregarPregunta(pregunta6);
	cat_ArteLiteratura.agregarPregunta(pregunta7);
	cat_ArteLiteratura.agregarPregunta(pregunta8);
	cat_ArteLiteratura.agregarPregunta(pregunta9);
	cat_ArteLiteratura.agregarPregunta(pregunta10);
	
	cat_CienciaTecnologia.agregarPregunta(pregunta11);
	cat_CienciaTecnologia.agregarPregunta(pregunta12);
	cat_CienciaTecnologia.agregarPregunta(pregunta13);
	cat_CienciaTecnologia.agregarPregunta(pregunta14);
	cat_CienciaTecnologia.agregarPregunta(pregunta15);
	cat_CienciaTecnologia.agregarPregunta(pregunta16);
	cat_CienciaTecnologia.agregarPregunta(pregunta17);
	cat_CienciaTecnologia.agregarPregunta(pregunta18);
	cat_CienciaTecnologia.agregarPregunta(pregunta19);
	cat_CienciaTecnologia.agregarPregunta(pregunta20);
	
	cat_Deportes.agregarPregunta(pregunta21);
	cat_Deportes.agregarPregunta(pregunta22);
	cat_Deportes.agregarPregunta(pregunta23);
	cat_Deportes.agregarPregunta(pregunta24);
	cat_Deportes.agregarPregunta(pregunta25);
	cat_Deportes.agregarPregunta(pregunta26);
	cat_Deportes.agregarPregunta(pregunta27);
	cat_Deportes.agregarPregunta(pregunta28);
	cat_Deportes.agregarPregunta(pregunta29);
	cat_Deportes.agregarPregunta(pregunta30);
	
	cat_Entretenimiento.agregarPregunta(pregunta31);
	cat_Entretenimiento.agregarPregunta(pregunta32);
	cat_Entretenimiento.agregarPregunta(pregunta33);
	cat_Entretenimiento.agregarPregunta(pregunta34);
	cat_Entretenimiento.agregarPregunta(pregunta35);
	cat_Entretenimiento.agregarPregunta(pregunta36);
	cat_Entretenimiento.agregarPregunta(pregunta37);
	cat_Entretenimiento.agregarPregunta(pregunta38);
	cat_Entretenimiento.agregarPregunta(pregunta39);
	cat_Entretenimiento.agregarPregunta(pregunta40);
	
	cat_Geografia.agregarPregunta(pregunta41);
	cat_Geografia.agregarPregunta(pregunta42);
	cat_Geografia.agregarPregunta(pregunta43);
	cat_Geografia.agregarPregunta(pregunta44);
	cat_Geografia.agregarPregunta(pregunta45);
	cat_Geografia.agregarPregunta(pregunta46);
	cat_Geografia.agregarPregunta(pregunta47);
	cat_Geografia.agregarPregunta(pregunta48);
	cat_Geografia.agregarPregunta(pregunta49);
	cat_Geografia.agregarPregunta(pregunta50);
	
	cat_Historia.agregarPregunta(pregunta51);
	cat_Historia.agregarPregunta(pregunta52);
	cat_Historia.agregarPregunta(pregunta53);
	cat_Historia.agregarPregunta(pregunta54);
	cat_Historia.agregarPregunta(pregunta55);
	cat_Historia.agregarPregunta(pregunta56);
	cat_Historia.agregarPregunta(pregunta57);
	cat_Historia.agregarPregunta(pregunta58);
	cat_Historia.agregarPregunta(pregunta59);
	cat_Historia.agregarPregunta(pregunta60);
	
}	
	
}
