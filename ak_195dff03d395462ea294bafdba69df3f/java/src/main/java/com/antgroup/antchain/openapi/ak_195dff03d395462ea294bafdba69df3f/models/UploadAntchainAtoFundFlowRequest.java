// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UploadAntchainAtoFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单所属商户的统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 签署合同单号
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 返回的文件fileItemNo编号
    @NameInMap("file_item_no")
    @Validation(required = true)
    public String fileItemNo;

    // 上传的pdf文件，需要以.pdf后缀结尾
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    public String fundId;

    public static UploadAntchainAtoFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAntchainAtoFundFlowRequest self = new UploadAntchainAtoFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public UploadAntchainAtoFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAntchainAtoFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAntchainAtoFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UploadAntchainAtoFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UploadAntchainAtoFundFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public UploadAntchainAtoFundFlowRequest setFileItemNo(String fileItemNo) {
        this.fileItemNo = fileItemNo;
        return this;
    }
    public String getFileItemNo() {
        return this.fileItemNo;
    }

    public UploadAntchainAtoFundFlowRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadAntchainAtoFundFlowRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadAntchainAtoFundFlowRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadAntchainAtoFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
