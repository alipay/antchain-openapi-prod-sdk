// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractOrganizationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
    // ）返回的accountId
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 证件号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 企业法人名称
    @NameInMap("legal_person")
    public String legalPerson;

    // 企业法人证件号
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 机构名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateContractOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractOrganizationRequest self = new CreateContractOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractOrganizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractOrganizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractOrganizationRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateContractOrganizationRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public CreateContractOrganizationRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public CreateContractOrganizationRequest setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public CreateContractOrganizationRequest setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public CreateContractOrganizationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContractOrganizationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
