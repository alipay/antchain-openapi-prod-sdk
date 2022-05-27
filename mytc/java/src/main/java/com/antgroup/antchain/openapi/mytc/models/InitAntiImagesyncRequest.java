// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class InitAntiImagesyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 防伪码类型标识,由蚂蚁侧分配
    @NameInMap("code_type")
    @Validation(required = true)
    public String codeType;

    // 防伪码批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 批次下要上传的防伪码总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static InitAntiImagesyncRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntiImagesyncRequest self = new InitAntiImagesyncRequest();
        return TeaModel.build(map, self);
    }

    public InitAntiImagesyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntiImagesyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntiImagesyncRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public InitAntiImagesyncRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public InitAntiImagesyncRequest setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
