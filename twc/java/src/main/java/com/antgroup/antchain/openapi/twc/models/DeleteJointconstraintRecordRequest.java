// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeleteJointconstraintRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同编号
    // 
    // 
    @NameInMap("contract_code")
    @Validation(required = true)
    public String contractCode;

    // 合同履行记录标签
    // 
    // 
    @NameInMap("contract_fulfillment_code")
    @Validation(required = true)
    public String contractFulfillmentCode;

    // 应付方证件号码
    // 
    // 
    @NameInMap("payer_cert_number")
    @Validation(required = true)
    public String payerCertNumber;

    // 应付方证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    @NameInMap("payer_cert_type")
    @Validation(required = true)
    public Long payerCertType;

    // 应付方类型
    // 
    // 0：企业
    // 
    // 1：个人
    @NameInMap("payer_type")
    @Validation(required = true)
    public Long payerType;

    public static DeleteJointconstraintRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJointconstraintRecordRequest self = new DeleteJointconstraintRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJointconstraintRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteJointconstraintRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteJointconstraintRecordRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public DeleteJointconstraintRecordRequest setContractFulfillmentCode(String contractFulfillmentCode) {
        this.contractFulfillmentCode = contractFulfillmentCode;
        return this;
    }
    public String getContractFulfillmentCode() {
        return this.contractFulfillmentCode;
    }

    public DeleteJointconstraintRecordRequest setPayerCertNumber(String payerCertNumber) {
        this.payerCertNumber = payerCertNumber;
        return this;
    }
    public String getPayerCertNumber() {
        return this.payerCertNumber;
    }

    public DeleteJointconstraintRecordRequest setPayerCertType(Long payerCertType) {
        this.payerCertType = payerCertType;
        return this;
    }
    public Long getPayerCertType() {
        return this.payerCertType;
    }

    public DeleteJointconstraintRecordRequest setPayerType(Long payerType) {
        this.payerType = payerType;
        return this;
    }
    public Long getPayerType() {
        return this.payerType;
    }

}
