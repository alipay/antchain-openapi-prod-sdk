// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryWaybillInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 填写无车承运平台did或者3plDid
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static QueryWaybillInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillInfoRequest self = new QueryWaybillInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryWaybillInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWaybillInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWaybillInfoRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public QueryWaybillInfoRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
