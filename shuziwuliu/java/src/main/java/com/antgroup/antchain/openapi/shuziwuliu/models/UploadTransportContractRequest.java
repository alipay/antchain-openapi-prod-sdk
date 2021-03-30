// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadTransportContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货主did，一般为合同甲方的链上数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 运输合同生效日期，格式要求yyyy-MM-dd
    @NameInMap("contract_effective_date")
    @Validation(required = true)
    public String contractEffectiveDate;

    // 运输合同到期日期，要求格式yyyy-MM-dd
    @NameInMap("contract_expires_date")
    @Validation(required = true)
    public String contractExpiresDate;

    // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
    @NameInMap("file_infos")
    @Validation(required = true)
    public java.util.List<UploadFileInfo> fileInfos;

    // 3plDid，一般为合同乙方的链上数字身份
    @NameInMap("third_party_logistics_did")
    @Validation(required = true)
    public String thirdPartyLogisticsDid;

    // 运输合同编号
    @NameInMap("transport_contract_code")
    @Validation(required = true)
    public String transportContractCode;

    public static UploadTransportContractRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTransportContractRequest self = new UploadTransportContractRequest();
        return TeaModel.build(map, self);
    }

    public UploadTransportContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadTransportContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadTransportContractRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadTransportContractRequest setContractEffectiveDate(String contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
        return this;
    }
    public String getContractEffectiveDate() {
        return this.contractEffectiveDate;
    }

    public UploadTransportContractRequest setContractExpiresDate(String contractExpiresDate) {
        this.contractExpiresDate = contractExpiresDate;
        return this;
    }
    public String getContractExpiresDate() {
        return this.contractExpiresDate;
    }

    public UploadTransportContractRequest setFileInfos(java.util.List<UploadFileInfo> fileInfos) {
        this.fileInfos = fileInfos;
        return this;
    }
    public java.util.List<UploadFileInfo> getFileInfos() {
        return this.fileInfos;
    }

    public UploadTransportContractRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

    public UploadTransportContractRequest setTransportContractCode(String transportContractCode) {
        this.transportContractCode = transportContractCode;
        return this;
    }
    public String getTransportContractCode() {
        return this.transportContractCode;
    }

}
