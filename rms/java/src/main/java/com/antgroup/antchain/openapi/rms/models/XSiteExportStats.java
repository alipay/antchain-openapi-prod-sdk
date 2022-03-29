// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XSiteExportStats extends TeaModel {
    //  
    @NameInMap("alert")
    public Long alert;

    //  
    @NameInMap("alert_datasource")
    public Long alertDatasource;

    //  
    @NameInMap("dashboard")
    public Long dashboard;

    //  
    @NameInMap("dashboard_datasource")
    public Long dashboardDatasource;

    //  
    @NameInMap("datasource")
    public Long datasource;

    // 通知对象的数量
    @NameInMap("alarm_subscriber_count")
    public Long alarmSubscriberCount;

    public static XSiteExportStats build(java.util.Map<String, ?> map) throws Exception {
        XSiteExportStats self = new XSiteExportStats();
        return TeaModel.build(map, self);
    }

    public XSiteExportStats setAlert(Long alert) {
        this.alert = alert;
        return this;
    }
    public Long getAlert() {
        return this.alert;
    }

    public XSiteExportStats setAlertDatasource(Long alertDatasource) {
        this.alertDatasource = alertDatasource;
        return this;
    }
    public Long getAlertDatasource() {
        return this.alertDatasource;
    }

    public XSiteExportStats setDashboard(Long dashboard) {
        this.dashboard = dashboard;
        return this;
    }
    public Long getDashboard() {
        return this.dashboard;
    }

    public XSiteExportStats setDashboardDatasource(Long dashboardDatasource) {
        this.dashboardDatasource = dashboardDatasource;
        return this;
    }
    public Long getDashboardDatasource() {
        return this.dashboardDatasource;
    }

    public XSiteExportStats setDatasource(Long datasource) {
        this.datasource = datasource;
        return this;
    }
    public Long getDatasource() {
        return this.datasource;
    }

    public XSiteExportStats setAlarmSubscriberCount(Long alarmSubscriberCount) {
        this.alarmSubscriberCount = alarmSubscriberCount;
        return this;
    }
    public Long getAlarmSubscriberCount() {
        return this.alarmSubscriberCount;
    }

}
