// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadSignTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单所属商户的统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 合同类型
    @NameInMap("contract_type")
    public String contractType;

    // 模板类型
    @NameInMap("agreement_type")
    public String agreementType;

    // 签署区坐标配置
    @NameInMap("pos_conf")
    @Validation(required = true)
    public String posConf;

    // 模板参数
    @NameInMap("template_args")
    public String templateArgs;

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

    // 资方统一社会信用代码，默认为空
    @NameInMap("fund_id")
    public String fundId;

    // 是否需要资方签署，默认为否
    @NameInMap("fund_sign")
    public Boolean fundSign;

    // 资方签署区坐标，默认为空
    @NameInMap("fund_pos_conf")
    public String fundPosConf;

    public static UploadSignTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSignTemplateRequest self = new UploadSignTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UploadSignTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSignTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSignTemplateRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UploadSignTemplateRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public UploadSignTemplateRequest setAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }
    public String getAgreementType() {
        return this.agreementType;
    }

    public UploadSignTemplateRequest setPosConf(String posConf) {
        this.posConf = posConf;
        return this;
    }
    public String getPosConf() {
        return this.posConf;
    }

    public UploadSignTemplateRequest setTemplateArgs(String templateArgs) {
        this.templateArgs = templateArgs;
        return this;
    }
    public String getTemplateArgs() {
        return this.templateArgs;
    }

    public UploadSignTemplateRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadSignTemplateRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadSignTemplateRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadSignTemplateRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public UploadSignTemplateRequest setFundSign(Boolean fundSign) {
        this.fundSign = fundSign;
        return this;
    }
    public Boolean getFundSign() {
        return this.fundSign;
    }

    public UploadSignTemplateRequest setFundPosConf(String fundPosConf) {
        this.fundPosConf = fundPosConf;
        return this;
    }
    public String getFundPosConf() {
        return this.fundPosConf;
    }

}
