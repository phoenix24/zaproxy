package org.zaproxy.zaas;

import org.parosproxy.paros.core.proxy.ProxyServer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZaasMain {
    public static void main(String[] args) throws InterruptedException {
        ZaasConfig config = ZaasConfigReader.read();
        ZaasBoot zaas = new ZaasBoot(config);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(zaas);
        Thread.sleep(3 * 1000);

        ProxyServer server = new ProxyServer();
        server.setEnableApi(true);
        System.out.println("server created, for listening on: 8080");

        int success = server.startServer("127.0.0.1", 8080, false);
        System.out.println("server started, listening on: 8080, status:" + success);
        //executor.execute(server);

        while (true) { Thread.sleep(10000); }
    }
}
