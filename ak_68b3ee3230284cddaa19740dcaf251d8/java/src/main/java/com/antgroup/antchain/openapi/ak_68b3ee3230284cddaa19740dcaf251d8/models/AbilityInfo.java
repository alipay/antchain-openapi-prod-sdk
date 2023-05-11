// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class AbilityInfo extends TeaModel {
    // 能力编号
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // 能力名称
    @NameInMap("ability_name")
    @Validation(required = true)
    public String abilityName;

    // 研发负责人
    @NameInMap("dev_owner")
    @Validation(required = true)
    public String devOwner;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 研发负责人邮箱前缀
    @NameInMap("dev_owner_prefix_email")
    @Validation(required = true)
    public String devOwnerPrefixEmail;

    // 产品负责人
    @NameInMap("product_owner")
    @Validation(required = true)
    public String productOwner;

    // 能力对应商业中台L5Code
    @NameInMap("business_code")
    public String businessCode;

    // apiInfoModels列表
    @NameInMap("api_info_models")
    @Validation(required = true)
    public java.util.List<ApiInfoModel> apiInfoModels;

    public static AbilityInfo build(java.util.Map<String, ?> map) throws Exception {
        AbilityInfo self = new AbilityInfo();
        return TeaModel.build(map, self);
    }

    public AbilityInfo setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public AbilityInfo setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public AbilityInfo setDevOwner(String devOwner) {
        this.devOwner = devOwner;
        return this;
    }
    public String getDevOwner() {
        return this.devOwner;
    }

    public AbilityInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AbilityInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AbilityInfo setDevOwnerPrefixEmail(String devOwnerPrefixEmail) {
        this.devOwnerPrefixEmail = devOwnerPrefixEmail;
        return this;
    }
    public String getDevOwnerPrefixEmail() {
        return this.devOwnerPrefixEmail;
    }

    public AbilityInfo setProductOwner(String productOwner) {
        this.productOwner = productOwner;
        return this;
    }
    public String getProductOwner() {
        return this.productOwner;
    }

    public AbilityInfo setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public AbilityInfo setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

}
