// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerInformation extends TeaModel {
    // 合作方（商家、伙伴）用户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合作方（商家、伙伴）基本信息
    @NameInMap("basic_information")
    @Validation(required = true)
    public PartnerBasicInformation basicInformation;

    // 联系信息
    @NameInMap("contact_information")
    @Validation(required = true)
    public PartnerContactInformation contactInformation;

    // 除约定属性外的，其余商家主要信息
    @NameInMap("extend_info")
    public String extendInfo;

    public static PartnerInformation build(java.util.Map<String, ?> map) throws Exception {
        PartnerInformation self = new PartnerInformation();
        return TeaModel.build(map, self);
    }

    public PartnerInformation setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PartnerInformation setBasicInformation(PartnerBasicInformation basicInformation) {
        this.basicInformation = basicInformation;
        return this;
    }
    public PartnerBasicInformation getBasicInformation() {
        return this.basicInformation;
    }

    public PartnerInformation setContactInformation(PartnerContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }
    public PartnerContactInformation getContactInformation() {
        return this.contactInformation;
    }

    public PartnerInformation setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
