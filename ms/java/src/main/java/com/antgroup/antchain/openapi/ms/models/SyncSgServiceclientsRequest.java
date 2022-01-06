// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncSgServiceclientsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 进程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 数据产生时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    public static SyncSgServiceclientsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSgServiceclientsRequest self = new SyncSgServiceclientsRequest();
        return TeaModel.build(map, self);
    }

    public SyncSgServiceclientsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncSgServiceclientsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncSgServiceclientsRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public SyncSgServiceclientsRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
