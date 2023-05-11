// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_68b3ee3230284cddaa19740dcaf251d8.models;

import com.aliyun.tea.*;

public class AbilityApiRelation extends TeaModel {
    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 能力列表
    @NameInMap("ability_info_list")
    @Validation(required = true)
    public java.util.List<AbilityInfo> abilityInfoList;

    public static AbilityApiRelation build(java.util.Map<String, ?> map) throws Exception {
        AbilityApiRelation self = new AbilityApiRelation();
        return TeaModel.build(map, self);
    }

    public AbilityApiRelation setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public AbilityApiRelation setAbilityInfoList(java.util.List<AbilityInfo> abilityInfoList) {
        this.abilityInfoList = abilityInfoList;
        return this;
    }
    public java.util.List<AbilityInfo> getAbilityInfoList() {
        return this.abilityInfoList;
    }

}
