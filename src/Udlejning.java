import java.time.LocalDateTime;

public class Udlejning
{
	private LocalDateTime startDato;
	private LocalDateTime slutDato;
	private LocalDateTime udlDato;
	private Bil bil;

	public Udlejning(LocalDateTime startDato, LocalDateTime slutDato, LocalDateTime udlDato, Bil bil)
	{
		this.startDato = startDato;
		this.slutDato = slutDato;
		this.udlDato = udlDato;
		this.bil = bil;
	}




	
}
