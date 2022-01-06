// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncSgServiceheartbeatsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 进程唯一值集合
    @NameInMap("process_id_list")
    @Validation(required = true)
    public java.util.List<String> processIdList;

    // 本次心跳产生时间
    @NameInMap("timestamp")
    public Long timestamp;

    public static SyncSgServiceheartbeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSgServiceheartbeatsRequest self = new SyncSgServiceheartbeatsRequest();
        return TeaModel.build(map, self);
    }

    public SyncSgServiceheartbeatsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncSgServiceheartbeatsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncSgServiceheartbeatsRequest setProcessIdList(java.util.List<String> processIdList) {
        this.processIdList = processIdList;
        return this;
    }
    public java.util.List<String> getProcessIdList() {
        return this.processIdList;
    }

    public SyncSgServiceheartbeatsRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
