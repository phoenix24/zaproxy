package org.zaproxy.zaas;

import org.parosproxy.paros.Constant;
import org.parosproxy.paros.control.Control;
import org.parosproxy.paros.extension.Extension;

import java.util.ArrayList;
import java.util.List;

public class ZaasConfigReader {

    public static ZaasConfig read() {
        Control.initSingletonForZaas();
        Constant constant = Constant.getInstance();
        ZaasConfigReader reader = new ZaasConfigReader();
        List<Extension> extensions = reader.getExtensions();
        return new ZaasConfig(extensions, constant);
    }

    private List<Extension> getExtensions() {
        List<Extension> extensions = new ArrayList<>();
        extensions.add(new org.parosproxy.paros.extension.edit.ExtensionEdit());
        //extensions.add(new org.parosproxy.paros.extension.history.ExtensionHistory());
        extensions.add(new org.parosproxy.paros.extension.manualrequest.ExtensionManualRequestEditor());
        extensions.add(new org.parosproxy.paros.extension.option.ExtensionOption());
        extensions.add(new org.parosproxy.paros.extension.report.ExtensionReport());
        extensions.add(new org.parosproxy.paros.extension.state.ExtensionState());
        extensions.add(new org.zaproxy.zap.extension.alert.ExtensionAlert());
        extensions.add(new org.zaproxy.zap.extension.anticsrf.ExtensionAntiCSRF());
        extensions.add(new org.zaproxy.zap.extension.api.ExtensionAPI());
        extensions.add(new org.zaproxy.zap.extension.ascan.ExtensionActiveScan());
        extensions.add(new org.zaproxy.zap.extension.authentication.ExtensionAuthentication());
        extensions.add(new org.zaproxy.zap.extension.authorization.ExtensionAuthorization());
        extensions.add(new org.zaproxy.zap.extension.autoupdate.ExtensionAutoUpdate());
        extensions.add(new org.zaproxy.zap.extension.brk.ExtensionBreak());
        extensions.add(new org.zaproxy.zap.extension.callback.ExtensionCallback());
        extensions.add(new org.zaproxy.zap.extension.compare.ExtensionCompare());
        extensions.add(new org.zaproxy.zap.extension.dynssl.ExtensionDynSSL());
        extensions.add(new org.zaproxy.zap.extension.encoder2.ExtensionEncoder2());
        extensions.add(new org.zaproxy.zap.extension.ext.ExtensionExtension());
        extensions.add(new org.zaproxy.zap.extension.forceduser.ExtensionForcedUser());
        extensions.add(new org.zaproxy.zap.extension.globalexcludeurl.ExtensionGlobalExcludeURL());
        extensions.add(new org.zaproxy.zap.extension.help.ExtensionHelp());
        extensions.add(new org.zaproxy.zap.extension.httppanel.component.all.ExtensionHttpPanelComponentAll());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.hex.ExtensionHttpPanelHexView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.image.ExtensionHttpPanelImageView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.largerequest.ExtensionHttpPanelLargeRequestView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.largeresponse.ExtensionHttpPanelLargeResponseView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.paramtable.ExtensionHttpPanelRequestFormTableView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.paramtable.ExtensionHttpPanelRequestQueryCookieTableView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.posttable.ExtensionRequestPostTableView());
        extensions.add(new org.zaproxy.zap.extension.httppanel.view.syntaxhighlight.ExtensionHttpPanelSyntaxHighlightTextView());
        extensions.add(new org.zaproxy.zap.extension.httpsessions.ExtensionHttpSessions());
        extensions.add(new org.zaproxy.zap.extension.keyboard.ExtensionKeyboard());
        extensions.add(new org.zaproxy.zap.extension.log4j.ExtensionLog4j());
        extensions.add(new org.zaproxy.zap.extension.params.ExtensionParams());
        extensions.add(new org.zaproxy.zap.extension.proxies.ExtensionProxies());
        extensions.add(new org.zaproxy.zap.extension.pscan.ExtensionPassiveScan());
        extensions.add(new org.zaproxy.zap.extension.ruleconfig.ExtensionRuleConfig());
        extensions.add(new org.zaproxy.zap.extension.script.ExtensionScript());
        extensions.add(new org.zaproxy.zap.extension.search.ExtensionSearch());
        extensions.add(new org.zaproxy.zap.extension.sessions.ExtensionSessionManagement());
        extensions.add(new org.zaproxy.zap.extension.siterefresh.ExtensionSitesRefresh());
        extensions.add(new org.zaproxy.zap.extension.spider.ExtensionSpider());
        extensions.add(new org.zaproxy.zap.extension.stats.ExtensionStats());
        extensions.add(new org.zaproxy.zap.extension.stdmenus.ExtensionStdMenus());
        extensions.add(new org.zaproxy.zap.extension.uiutils.ExtensionUiUtils());
        extensions.add(new org.zaproxy.zap.extension.users.ExtensionUserManagement());
        return extensions;
    }
}
