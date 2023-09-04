// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcEpcertificationUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
    // (如果接口创建接口发生未知异常，可使用out_biz_no替代，查询状态）
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryAntsaasStaffingcEpcertificationUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcEpcertificationUrlRequest self = new QueryAntsaasStaffingcEpcertificationUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcEpcertificationUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsaasStaffingcEpcertificationUrlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsaasStaffingcEpcertificationUrlRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
