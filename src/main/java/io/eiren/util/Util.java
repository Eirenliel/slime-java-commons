package io.eiren.util;

import java.io.Closeable;

public class Util {

	public static void close(Object r) {
		try {
			if(r != null) {
				if(r instanceof Closeable)
					((Closeable) r).close();
				else if(r instanceof AutoCloseable)
					((AutoCloseable) r).close();
			}
		} catch(Exception e) {}
	}
	
	public static void close(Object r1, Object r2) {
		close(r1);
		close(r2);
	}
	
	public static void close(Object... r) {
		for(int i = 0; i < r.length; ++i)
			try {
				if(r[i] != null) {
					if(r[i] instanceof Closeable)
						((Closeable) r[i]).close();
					else if(r[i] instanceof AutoCloseable)
						((AutoCloseable) r[i]).close();
				}
			} catch(Exception e) {}
	}
	
	public static void close(AutoCloseable... r) {
		for(int i = 0; i < r.length; ++i)
			try {
				if(r[i] != null)
					r[i].close();
			} catch(Exception e) {}
	}
	
	public static void close(Closeable... r) {
		for(int i = 0; i < r.length; ++i)
			try {
				if(r[i] != null)
					r[i].close();
			} catch(Exception e) {}
	}
}
