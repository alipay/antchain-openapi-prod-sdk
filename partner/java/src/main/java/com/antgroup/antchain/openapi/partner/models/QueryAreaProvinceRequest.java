// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryAreaProvinceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 省份, 空:全部省份, 不为空筛选关键字省份
    @NameInMap("province")
    public String province;

    public static QueryAreaProvinceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaProvinceRequest self = new QueryAreaProvinceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAreaProvinceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAreaProvinceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
