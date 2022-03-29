// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XSiteExport extends TeaModel {
    //  
    @NameInMap("dashboards")
    public java.util.List<XDashboardQuery> dashboards;

    //  
    @NameInMap("datasources")
    public java.util.List<XDatasourceQuery> datasources;

    // alert uuids
    @NameInMap("alerts")
    public java.util.List<String> alerts;

    public static XSiteExport build(java.util.Map<String, ?> map) throws Exception {
        XSiteExport self = new XSiteExport();
        return TeaModel.build(map, self);
    }

    public XSiteExport setDashboards(java.util.List<XDashboardQuery> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<XDashboardQuery> getDashboards() {
        return this.dashboards;
    }

    public XSiteExport setDatasources(java.util.List<XDatasourceQuery> datasources) {
        this.datasources = datasources;
        return this;
    }
    public java.util.List<XDatasourceQuery> getDatasources() {
        return this.datasources;
    }

    public XSiteExport setAlerts(java.util.List<String> alerts) {
        this.alerts = alerts;
        return this;
    }
    public java.util.List<String> getAlerts() {
        return this.alerts;
    }

}
