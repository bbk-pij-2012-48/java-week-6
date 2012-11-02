public class BitTorrentDownloader {
	private String host;
	private int port;
	
	public BitTorrentDownloader(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public static void main(String[] args) {
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		BitTorrentDownloader downloader = new BitTorrentDownloader(host, port);
		
	}
}
