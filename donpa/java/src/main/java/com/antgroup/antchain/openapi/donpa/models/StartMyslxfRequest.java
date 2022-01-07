// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class StartMyslxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待修复人列表
    @NameInMap("repair_people_list")
    @Validation(required = true)
    public java.util.List<PersonData> repairPeopleList;

    public static StartMyslxfRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMyslxfRequest self = new StartMyslxfRequest();
        return TeaModel.build(map, self);
    }

    public StartMyslxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMyslxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMyslxfRequest setRepairPeopleList(java.util.List<PersonData> repairPeopleList) {
        this.repairPeopleList = repairPeopleList;
        return this;
    }
    public java.util.List<PersonData> getRepairPeopleList() {
        return this.repairPeopleList;
    }

}
