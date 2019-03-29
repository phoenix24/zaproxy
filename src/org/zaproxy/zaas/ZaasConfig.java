package org.zaproxy.zaas;

import org.parosproxy.paros.Constant;
import org.parosproxy.paros.extension.Extension;

import java.util.List;

public class ZaasConfig {

    private final Constant constant;
    private final List<Extension> extensions;

    public ZaasConfig(List<Extension> extensions, Constant constant) {
        this.constant = constant;
        this.extensions = extensions;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public Constant getConstant() {
        return constant;
    }
}
