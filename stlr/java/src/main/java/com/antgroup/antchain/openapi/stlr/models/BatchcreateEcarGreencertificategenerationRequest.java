// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class BatchcreateEcarGreencertificategenerationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据发生时间
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 设备发电量列表
    @NameInMap("generation")
    @Validation(required = true)
    public java.util.List<DeviceGeneration> generation;

    public static BatchcreateEcarGreencertificategenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateEcarGreencertificategenerationRequest self = new BatchcreateEcarGreencertificategenerationRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateEcarGreencertificategenerationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateEcarGreencertificategenerationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateEcarGreencertificategenerationRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public BatchcreateEcarGreencertificategenerationRequest setGeneration(java.util.List<DeviceGeneration> generation) {
        this.generation = generation;
        return this;
    }
    public java.util.List<DeviceGeneration> getGeneration() {
        return this.generation;
    }

}
