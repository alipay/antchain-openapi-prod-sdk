// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadShippingEblbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代理人did
    @NameInMap("agent_did")
    public String agentDid;

    // 是否为代理操作
    @NameInMap("agent_flag")
    @Validation(required = true)
    public Boolean agentFlag;

    // 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 船公司名称
    @NameInMap("carrier_name")
    @Validation(required = true)
    public String carrierName;

    // 收货人did
    @NameInMap("consignee_did")
    @Validation(required = true)
    public String consigneeDid;

    // 电子提单类型
    @NameInMap("ebl_category")
    @Validation(required = true)
    public String eblCategory;

    // 批次下的提单明细
    // 
    // 
    @NameInMap("ebl_details")
    @Validation(required = true)
    public java.util.List<EblDetail> eblDetails;

    // 议付行did
    @NameInMap("negotiating_bank_did")
    @Validation(required = true)
    public String negotiatingBankDid;

    // 托运人did
    @NameInMap("shipper_did")
    @Validation(required = true)
    public String shipperDid;

    public static UploadShippingEblbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadShippingEblbatchRequest self = new UploadShippingEblbatchRequest();
        return TeaModel.build(map, self);
    }

    public UploadShippingEblbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadShippingEblbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadShippingEblbatchRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public UploadShippingEblbatchRequest setAgentFlag(Boolean agentFlag) {
        this.agentFlag = agentFlag;
        return this;
    }
    public Boolean getAgentFlag() {
        return this.agentFlag;
    }

    public UploadShippingEblbatchRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public UploadShippingEblbatchRequest setCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }
    public String getCarrierName() {
        return this.carrierName;
    }

    public UploadShippingEblbatchRequest setConsigneeDid(String consigneeDid) {
        this.consigneeDid = consigneeDid;
        return this;
    }
    public String getConsigneeDid() {
        return this.consigneeDid;
    }

    public UploadShippingEblbatchRequest setEblCategory(String eblCategory) {
        this.eblCategory = eblCategory;
        return this;
    }
    public String getEblCategory() {
        return this.eblCategory;
    }

    public UploadShippingEblbatchRequest setEblDetails(java.util.List<EblDetail> eblDetails) {
        this.eblDetails = eblDetails;
        return this;
    }
    public java.util.List<EblDetail> getEblDetails() {
        return this.eblDetails;
    }

    public UploadShippingEblbatchRequest setNegotiatingBankDid(String negotiatingBankDid) {
        this.negotiatingBankDid = negotiatingBankDid;
        return this;
    }
    public String getNegotiatingBankDid() {
        return this.negotiatingBankDid;
    }

    public UploadShippingEblbatchRequest setShipperDid(String shipperDid) {
        this.shipperDid = shipperDid;
        return this;
    }
    public String getShipperDid() {
        return this.shipperDid;
    }

}
