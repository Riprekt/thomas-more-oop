public class Test
{
	public static void main(String[] args)
	{
		Musicorganizer mo = new Musicorganizer();
		System.out.println(mo.getNumberOfTracks());
		mo.listByArtist("Woody");
		mo.playTrack(6);
	}
}
