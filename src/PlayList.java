import java.util.ArrayList;
import java.util.Random;

public class PlayList
{
	private String name;
	private Musicorganizer organizer;
	private ArrayList<Track> tracks;

	public static void main(String[] args)
	{
	}

	public PlayList(String name)
	{
		this.name = name;
		organizer = new Musicorganizer();
		tracks = new ArrayList<>();
	}

	public PlayList(String name, int number)
	{
		this.name = name;
		organizer = new Musicorganizer();

		while (tracks.size() < number)
		{
			Random r = new Random();
			Track track = organizer.getTrack(r.nextInt(organizer.getNumberOfTracks()));

			if (track != null)
			{
				tracks.add(track);
			}
		}
	}
}