// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateConsignorDisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业信用号码
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 企业法人姓名
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 企业法人身份证号码
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 所属承运平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
    @NameInMap("check_all")
    @Validation(required = true)
    public Boolean checkAll;

    public static CreateConsignorDisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsignorDisRequest self = new CreateConsignorDisRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsignorDisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsignorDisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsignorDisRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CreateConsignorDisRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CreateConsignorDisRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateConsignorDisRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CreateConsignorDisRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CreateConsignorDisRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateConsignorDisRequest setCheckAll(Boolean checkAll) {
        this.checkAll = checkAll;
        return this;
    }
    public Boolean getCheckAll() {
        return this.checkAll;
    }

}
