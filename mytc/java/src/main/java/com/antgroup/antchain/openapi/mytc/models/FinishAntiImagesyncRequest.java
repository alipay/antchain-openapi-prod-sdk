// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class FinishAntiImagesyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 防伪码类型
    @NameInMap("code_type")
    @Validation(required = true)
    public String codeType;

    public static FinishAntiImagesyncRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishAntiImagesyncRequest self = new FinishAntiImagesyncRequest();
        return TeaModel.build(map, self);
    }

    public FinishAntiImagesyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishAntiImagesyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishAntiImagesyncRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public FinishAntiImagesyncRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

}
