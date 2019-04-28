package com.hgc.common.util;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

public class KeyUtil {
    public static String generateUUID() {
        TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
        return timeBasedGenerator.generate().toString();
    }
}
