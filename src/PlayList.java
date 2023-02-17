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
		tracks = new ArrayList<>();

		// Checking if given number is bigger than the number of tracks in our organizer
		// When true it will change the given number to the max amount of tracks
		if (organizer.getNumberOfTracks() < number) number = organizer.getNumberOfTracks();

		while (tracks.size() < number)
		{
			// Getting random track from our organizer
			Random r = new Random();
			Track track = organizer.getTrack(r.nextInt(organizer.getNumberOfTracks()));

			// Checking if given track isn't null and is not already part of our new tracklist
			if (track != null && !tracks.contains(track))
			{
				tracks.add(track);
			}
		}
	}

	public void listAllTracks()
	{
		System.out.println("De lijst " + name + " bevat volgende songs:");

		for (Track track : tracks)
		{
			System.out.println(track.getDetails());
		}
	}
}