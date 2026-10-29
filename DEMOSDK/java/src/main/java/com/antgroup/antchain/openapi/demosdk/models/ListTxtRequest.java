// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ListTxtRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 124
    @NameInMap("idcard")
    public String idcard;

    public static ListTxtRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTxtRequest self = new ListTxtRequest();
        return TeaModel.build(map, self);
    }

    public ListTxtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTxtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListTxtRequest setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }
    public String getIdcard() {
        return this.idcard;
    }

}
