// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryOptestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // string
    @NameInMap("str")
    @Validation(required = true)
    public String str;

    // long
    @NameInMap("lon")
    @Validation(required = true)
    public Long lon;

    // arr_str
    @NameInMap("arr_str")
    public java.util.List<String> arrStr;

    // stru
    @NameInMap("stru")
    public Zone stru;

    // arr_stru
    @NameInMap("arr_stru")
    public java.util.List<VPC> arrStru;

    public static QueryOptestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOptestRequest self = new QueryOptestRequest();
        return TeaModel.build(map, self);
    }

    public QueryOptestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOptestRequest setStr(String str) {
        this.str = str;
        return this;
    }
    public String getStr() {
        return this.str;
    }

    public QueryOptestRequest setLon(Long lon) {
        this.lon = lon;
        return this;
    }
    public Long getLon() {
        return this.lon;
    }

    public QueryOptestRequest setArrStr(java.util.List<String> arrStr) {
        this.arrStr = arrStr;
        return this;
    }
    public java.util.List<String> getArrStr() {
        return this.arrStr;
    }

    public QueryOptestRequest setStru(Zone stru) {
        this.stru = stru;
        return this;
    }
    public Zone getStru() {
        return this.stru;
    }

    public QueryOptestRequest setArrStru(java.util.List<VPC> arrStru) {
        this.arrStru = arrStru;
        return this;
    }
    public java.util.List<VPC> getArrStru() {
        return this.arrStru;
    }

}
