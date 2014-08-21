package se.r2m.spring.ovning2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.r2m.spring.ovning2.bean.SpringChecksum;

import com.google.common.base.Joiner;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml")) {
			System.out.println("ApplicationContext: " + ctx);
			if (args.length < 1) {
				System.out.println("Användning: crc32checksum <sträng>");
				return;
			}
			String input = Joiner.on(" ").join(args);
			SpringChecksum checksum = ctx.getBean(SpringChecksum.class);
			System.out.print(input + " har CRC32 ");
			System.out.println(checksum.calculateHash(input));
			System.out.println("Program finished");
		}
	}

}
