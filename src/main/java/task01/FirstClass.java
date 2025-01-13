package task01;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

import java.util.UUID;

public class FirstClass {
    TimeBasedGenerator gen = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
    UUID uuid = gen.generate();
    UUID anotherUuid = gen.generate();

}
