package se.r2m.spring.ovning2.bean;

import org.springframework.stereotype.Component;

@Component("crc32")
public interface SpringChecksum {

	public abstract long calculateHash(String input);

}