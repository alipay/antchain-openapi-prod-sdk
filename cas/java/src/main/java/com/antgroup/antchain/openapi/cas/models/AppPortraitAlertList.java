// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAlertList extends TeaModel {
    // 告警节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点名
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    // 告警指标
    @NameInMap("metric")
    @Validation(required = true)
    public String metric;

    // 告警级别
    @NameInMap("severity")
    @Validation(required = true)
    public String severity;

    // 告警内容
    @NameInMap("alert_content")
    @Validation(required = true)
    public String alertContent;

    // 告警时间
    @NameInMap("gmt_occur_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtOccurTimestamp;

    public static AppPortraitAlertList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAlertList self = new AppPortraitAlertList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAlertList setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AppPortraitAlertList setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public AppPortraitAlertList setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public AppPortraitAlertList setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public AppPortraitAlertList setAlertContent(String alertContent) {
        this.alertContent = alertContent;
        return this;
    }
    public String getAlertContent() {
        return this.alertContent;
    }

    public AppPortraitAlertList setGmtOccurTimestamp(String gmtOccurTimestamp) {
        this.gmtOccurTimestamp = gmtOccurTimestamp;
        return this;
    }
    public String getGmtOccurTimestamp() {
        return this.gmtOccurTimestamp;
    }

}
