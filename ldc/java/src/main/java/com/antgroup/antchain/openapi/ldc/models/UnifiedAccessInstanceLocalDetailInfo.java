// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnifiedAccessInstanceLocalDetailInfo extends TeaModel {
    // 所属集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 所在可用区，即AZ信息
    @NameInMap("data_center")
    @Validation(required = true)
    public String dataCenter;

    // local实例详细信息显示，包含错误状态信息等
    @NameInMap("message_details")
    public String messageDetails;

    // local实例状态描述：创建中、创建成功、创建失败
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // vip信息
    @NameInMap("vip")
    @Validation(required = true)
    public String vip;

    // http entry的状态
    @NameInMap("http_entry_status")
    public HttpEntryStatus httpEntryStatus;

    // https entry的状态
    @NameInMap("https_entry_status")
    public HttpsEntryStatus httpsEntryStatus;

    public static UnifiedAccessInstanceLocalDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAccessInstanceLocalDetailInfo self = new UnifiedAccessInstanceLocalDetailInfo();
        return TeaModel.build(map, self);
    }

    public UnifiedAccessInstanceLocalDetailInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UnifiedAccessInstanceLocalDetailInfo setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public UnifiedAccessInstanceLocalDetailInfo setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
        return this;
    }
    public String getMessageDetails() {
        return this.messageDetails;
    }

    public UnifiedAccessInstanceLocalDetailInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UnifiedAccessInstanceLocalDetailInfo setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public UnifiedAccessInstanceLocalDetailInfo setHttpEntryStatus(HttpEntryStatus httpEntryStatus) {
        this.httpEntryStatus = httpEntryStatus;
        return this;
    }
    public HttpEntryStatus getHttpEntryStatus() {
        return this.httpEntryStatus;
    }

    public UnifiedAccessInstanceLocalDetailInfo setHttpsEntryStatus(HttpsEntryStatus httpsEntryStatus) {
        this.httpsEntryStatus = httpsEntryStatus;
        return this;
    }
    public HttpsEntryStatus getHttpsEntryStatus() {
        return this.httpsEntryStatus;
    }

}
