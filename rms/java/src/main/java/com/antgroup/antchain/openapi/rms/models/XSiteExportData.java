// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XSiteExportData extends TeaModel {
    //  
    @NameInMap("dashboards")
    public java.util.List<XDashboardCRULResponseCURequest> dashboards;

    //  
    @NameInMap("datasources")
    public java.util.List<XDatasourceCRULResponseCURequest> datasources;

    //  
    @NameInMap("alerts")
    public java.util.List<UnifiedAlarmRuleVO> alerts;

    //  
    @NameInMap("stats")
    public XSiteExportStats stats;

    // 自定义告警的BASE64编码
    @NameInMap("alarm_rules_v2_custom")
    public String alarmRulesV2Custom;

    public static XSiteExportData build(java.util.Map<String, ?> map) throws Exception {
        XSiteExportData self = new XSiteExportData();
        return TeaModel.build(map, self);
    }

    public XSiteExportData setDashboards(java.util.List<XDashboardCRULResponseCURequest> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<XDashboardCRULResponseCURequest> getDashboards() {
        return this.dashboards;
    }

    public XSiteExportData setDatasources(java.util.List<XDatasourceCRULResponseCURequest> datasources) {
        this.datasources = datasources;
        return this;
    }
    public java.util.List<XDatasourceCRULResponseCURequest> getDatasources() {
        return this.datasources;
    }

    public XSiteExportData setAlerts(java.util.List<UnifiedAlarmRuleVO> alerts) {
        this.alerts = alerts;
        return this;
    }
    public java.util.List<UnifiedAlarmRuleVO> getAlerts() {
        return this.alerts;
    }

    public XSiteExportData setStats(XSiteExportStats stats) {
        this.stats = stats;
        return this;
    }
    public XSiteExportStats getStats() {
        return this.stats;
    }

    public XSiteExportData setAlarmRulesV2Custom(String alarmRulesV2Custom) {
        this.alarmRulesV2Custom = alarmRulesV2Custom;
        return this;
    }
    public String getAlarmRulesV2Custom() {
        return this.alarmRulesV2Custom;
    }

}
