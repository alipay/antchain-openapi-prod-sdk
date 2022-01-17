// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadTransportContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同甲方did，一般为合同甲方的链上数字身份
    @NameInMap("party_a_did")
    @Validation(required = true)
    public String partyADid;

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

    // 合同乙方Did，一般为合同乙方的链上数字身份
    @NameInMap("party_b_did")
    @Validation(required = true)
    public String partyBDid;

    // 运输合同编号
    @NameInMap("transport_contract_code")
    @Validation(required = true)
    public String transportContractCode;

    // 所属平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

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

    public UploadTransportContractRequest setPartyADid(String partyADid) {
        this.partyADid = partyADid;
        return this;
    }
    public String getPartyADid() {
        return this.partyADid;
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

    public UploadTransportContractRequest setPartyBDid(String partyBDid) {
        this.partyBDid = partyBDid;
        return this;
    }
    public String getPartyBDid() {
        return this.partyBDid;
    }

    public UploadTransportContractRequest setTransportContractCode(String transportContractCode) {
        this.transportContractCode = transportContractCode;
        return this;
    }
    public String getTransportContractCode() {
        return this.transportContractCode;
    }

    public UploadTransportContractRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
