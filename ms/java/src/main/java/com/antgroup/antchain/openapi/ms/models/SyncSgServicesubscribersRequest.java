// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncSgServicesubscribersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 进程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 服务唯一ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 分组
    @NameInMap("group")
    public String group;

    // 金融云实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 逻辑机房
    @NameInMap("zone")
    public String zone;

    // 订阅者IP
    @NameInMap("ip")
    public String ip;

    // 订阅维度
    @NameInMap("scope")
    public String scope;

    // 数据产生时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    public static SyncSgServicesubscribersRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSgServicesubscribersRequest self = new SyncSgServicesubscribersRequest();
        return TeaModel.build(map, self);
    }

    public SyncSgServicesubscribersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncSgServicesubscribersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncSgServicesubscribersRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public SyncSgServicesubscribersRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SyncSgServicesubscribersRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public SyncSgServicesubscribersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncSgServicesubscribersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncSgServicesubscribersRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public SyncSgServicesubscribersRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SyncSgServicesubscribersRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SyncSgServicesubscribersRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
