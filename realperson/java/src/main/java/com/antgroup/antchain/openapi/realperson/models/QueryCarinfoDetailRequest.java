// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarinfoDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vin码
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。	
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    public static QueryCarinfoDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarinfoDetailRequest self = new QueryCarinfoDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarinfoDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarinfoDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarinfoDetailRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public QueryCarinfoDetailRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public QueryCarinfoDetailRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

}
