// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradeOrgRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公司名称的全称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
    @NameInMap("cert_type")
    public String certType;

    // 证件类型对应的证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
    @NameInMap("manager_cert_type")
    public String managerCertType;

    // 经办人的证件号码
    // 
    // 
    @NameInMap("manager_cert_no")
    @Validation(required = true)
    public String managerCertNo;

    // 经办人的姓名
    // 
    // 
    @NameInMap("manager_name")
    @Validation(required = true)
    public String managerName;

    public static CreateRealtytradeOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradeOrgRequest self = new CreateRealtytradeOrgRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradeOrgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRealtytradeOrgRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRealtytradeOrgRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRealtytradeOrgRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateRealtytradeOrgRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateRealtytradeOrgRequest setManagerCertType(String managerCertType) {
        this.managerCertType = managerCertType;
        return this;
    }
    public String getManagerCertType() {
        return this.managerCertType;
    }

    public CreateRealtytradeOrgRequest setManagerCertNo(String managerCertNo) {
        this.managerCertNo = managerCertNo;
        return this;
    }
    public String getManagerCertNo() {
        return this.managerCertNo;
    }

    public CreateRealtytradeOrgRequest setManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }
    public String getManagerName() {
        return this.managerName;
    }

}
