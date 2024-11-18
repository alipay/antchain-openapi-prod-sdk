// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class AddModelTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 回执单号
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 模型名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 模型文件的路径
    @NameInMap("model_file_oss_path")
    @Validation(required = true)
    public String modelFileOssPath;

    // 验证文件的oss路径	
    @NameInMap("validate_file_oss_path")
    @Validation(required = true)
    public String validateFileOssPath;

    // 模型输出参数名称
    @NameInMap("model_output_lable_name")
    @Validation(required = true)
    public String modelOutputLableName;

    // 验证文件的输出列名
    @NameInMap("csv_output_lable_name")
    @Validation(required = true)
    public String csvOutputLableName;

    // 验签字段
    @NameInMap("sign_info")
    @Validation(required = true)
    public String signInfo;

    public static AddModelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddModelTaskRequest self = new AddModelTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddModelTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddModelTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddModelTaskRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public AddModelTaskRequest setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public AddModelTaskRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddModelTaskRequest setModelFileOssPath(String modelFileOssPath) {
        this.modelFileOssPath = modelFileOssPath;
        return this;
    }
    public String getModelFileOssPath() {
        return this.modelFileOssPath;
    }

    public AddModelTaskRequest setValidateFileOssPath(String validateFileOssPath) {
        this.validateFileOssPath = validateFileOssPath;
        return this;
    }
    public String getValidateFileOssPath() {
        return this.validateFileOssPath;
    }

    public AddModelTaskRequest setModelOutputLableName(String modelOutputLableName) {
        this.modelOutputLableName = modelOutputLableName;
        return this;
    }
    public String getModelOutputLableName() {
        return this.modelOutputLableName;
    }

    public AddModelTaskRequest setCsvOutputLableName(String csvOutputLableName) {
        this.csvOutputLableName = csvOutputLableName;
        return this;
    }
    public String getCsvOutputLableName() {
        return this.csvOutputLableName;
    }

    public AddModelTaskRequest setSignInfo(String signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public String getSignInfo() {
        return this.signInfo;
    }

}
