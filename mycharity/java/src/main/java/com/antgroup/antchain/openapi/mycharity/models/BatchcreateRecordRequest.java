// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchcreateRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次id
    @NameInMap("batch_id")
    @Validation(required = true, maxLength = 50)
    public String batchId;

    // 执行记录数组
    @NameInMap("received_record_list")
    @Validation(required = true)
    public java.util.List<ReceivedRecord> receivedRecordList;

    public static BatchcreateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateRecordRequest self = new BatchcreateRecordRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateRecordRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchcreateRecordRequest setReceivedRecordList(java.util.List<ReceivedRecord> receivedRecordList) {
        this.receivedRecordList = receivedRecordList;
        return this;
    }
    public java.util.List<ReceivedRecord> getReceivedRecordList() {
        return this.receivedRecordList;
    }

}
