// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CreateGatewayFileapiTestRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // OK
    @NameInMap("input_string")
    @Validation(required = true)
    public String inputString;

    // 订单信息
    @NameInMap("order_id")
    public String orderId;

    // 业务字段
    @NameInMap("biz_content")
    public String bizContent;

    // 文件id
    // 待上传文件
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    public static CreateGatewayFileapiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFileapiTestRequest self = new CreateGatewayFileapiTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFileapiTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGatewayFileapiTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateGatewayFileapiTestRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
    }

    public CreateGatewayFileapiTestRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateGatewayFileapiTestRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public CreateGatewayFileapiTestRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateGatewayFileapiTestRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
