// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class QuerybyappidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // appid
    @NameInMap("appid")
    @Validation(required = true)
    public String appid;

    // 手机或者设备md5
    @NameInMap("userid")
    @Validation(required = true)
    public String userid;

    // mobile/device
    @NameInMap("idtype")
    @Validation(required = true)
    public String idtype;

    public static QuerybyappidRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerybyappidRequest self = new QuerybyappidRequest();
        return TeaModel.build(map, self);
    }

    public QuerybyappidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerybyappidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerybyappidRequest setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

    public QuerybyappidRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public QuerybyappidRequest setIdtype(String idtype) {
        this.idtype = idtype;
        return this;
    }
    public String getIdtype() {
        return this.idtype;
    }

}
