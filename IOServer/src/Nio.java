import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nio {
	public static void main(String[] args) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel fc = null;
		FileChannel fd = null;
		try {
			fi = new FileInputStream("D:/Java/meworkspace/sett/JavaNio/src/AA.txt");
			fo = new FileOutputStream("D:/Java/meworkspace/sett/JavaNio/src/BB.txt", true);
			fc = fi.getChannel();
			fd = fo.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(3);
			while (true) {
				int x = fc.read(bb);
				if (x == -1) {
					break;
				}
				System.out.println(bb.get());
				bb.flip();
				fd.write(bb);
				bb.compact();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fc.close();
				fd.close();
				fi.close();
				fo.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
