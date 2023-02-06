// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaSeconddistributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 扩展信息，Map的json格式
    @NameInMap("extern_param")
    public String externParam;

    public static QueryThreemetaSeconddistributeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaSeconddistributeRequest self = new QueryThreemetaSeconddistributeRequest();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaSeconddistributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThreemetaSeconddistributeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThreemetaSeconddistributeRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryThreemetaSeconddistributeRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryThreemetaSeconddistributeRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryThreemetaSeconddistributeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
