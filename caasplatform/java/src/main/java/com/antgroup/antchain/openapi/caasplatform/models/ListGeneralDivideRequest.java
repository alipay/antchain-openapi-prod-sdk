// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class ListGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 分账方ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 分账列表起始序号
    @NameInMap("str_start_index")
    @Validation(required = true)
    public String strStartIndex;

    // 分账明细查询截止序号
    @NameInMap("str_end_index")
    @Validation(required = true)
    public String strEndIndex;

    public static ListGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralDivideRequest self = new ListGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public ListGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListGeneralDivideRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListGeneralDivideRequest setStrStartIndex(String strStartIndex) {
        this.strStartIndex = strStartIndex;
        return this;
    }
    public String getStrStartIndex() {
        return this.strStartIndex;
    }

    public ListGeneralDivideRequest setStrEndIndex(String strEndIndex) {
        this.strEndIndex = strEndIndex;
        return this;
    }
    public String getStrEndIndex() {
        return this.strEndIndex;
    }

}
