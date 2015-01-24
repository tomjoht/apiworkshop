package javadoc_tags;

/**
 * Provides ways to explode dynamite to blow up roadrunners.
 * <p>
 * 
 * Try using the {@link ACMESmartphone#zapRoadRunner} before
 * resorting to {@link #blowDynamiteLoudBang}. However, if you do have a lot of
 * roadrunners, the {@code zapRoadRunner} method may not be
 * efficient enough. You'll probably just want to resort to
 * <code>blowDynamiteLoudBang()</code> to annihilate them all at once.
 */
public class Dynamite {
	
	/**
	 * Blows dynamite with a decibel level approximating that of a fog horn. 
	 * @param fuseLength  the length of the fuse on the stick of dynamite 
	 * @see #blowDynamiteSilentBang
	 * @see ACMESmartphone#zapRoadRunner
	 */
	public void blowDynamiteLoudBang(int fuseLength) {
		System.out.println("lighting fuse with length of " + fuseLength + "inches.");
		System.out.println("kabang!!! big explosion!!!");
	}

	
	/**
	 * Blows dynamite with almost no sound at all (equivalent to a silencer on a gun). 
	 * @param fuseLength  the length of the fuse, which determines safety (silent bangs are just as deadly as loud bangs)
	 * @see #blowDynamiteLoudBang
	 * @see ACMESmartphone#zapRoadRunner
	 */
	public void blowDynamiteSilentBang(int fuseLength) {
		System.out.println("lighting fuse with length of " + fuseLength + "inches.");
		System.out.println("<silent boom>. no one hears it.");
	}
}
