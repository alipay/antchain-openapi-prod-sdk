// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncSgServicepublishersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 服务发布数据
    @NameInMap("data")
    public String data;

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

    // 发布者IP
    @NameInMap("ip")
    public String ip;

    // 进程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 数据产生时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    // 逻辑机房
    @NameInMap("zone")
    public String zone;

    public static SyncSgServicepublishersRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSgServicepublishersRequest self = new SyncSgServicepublishersRequest();
        return TeaModel.build(map, self);
    }

    public SyncSgServicepublishersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncSgServicepublishersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncSgServicepublishersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncSgServicepublishersRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SyncSgServicepublishersRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SyncSgServicepublishersRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public SyncSgServicepublishersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncSgServicepublishersRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SyncSgServicepublishersRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public SyncSgServicepublishersRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public SyncSgServicepublishersRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
