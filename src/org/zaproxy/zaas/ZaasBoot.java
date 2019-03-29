package org.zaproxy.zaas;

import org.apache.log4j.Logger;
import org.parosproxy.paros.extension.Extension;

import java.util.List;

public class ZaasBoot implements Runnable {

    private final List<Extension> extensions;
    private final static Logger log = Logger.getLogger(ZaasBoot.class);

    public ZaasBoot(ZaasConfig config) {
        extensions = config.getExtensions();
    }

    @Override
    public void run() {
        for (Extension extension : extensions) {
            System.out.println("Loading  Extension: " + extension.getName());
            extension.init();

            System.out.println("Starting Extension: " + extension.getName());
            extension.start();
        }
    }
}
