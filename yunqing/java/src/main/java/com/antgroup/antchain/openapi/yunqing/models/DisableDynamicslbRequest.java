// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DisableDynamicslbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // envid
    @NameInMap("envid")
    @Validation(required = true)
    public String envid;

    // 部署单元id
    @NameInMap("unitinstanceid")
    @Validation(required = true)
    public String unitinstanceid;

    // prodcode
    @NameInMap("prodcode")
    @Validation(required = true)
    public String prodcode;

    // appname
    @NameInMap("appname")
    @Validation(required = true)
    public String appname;

    public static DisableDynamicslbRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDynamicslbRequest self = new DisableDynamicslbRequest();
        return TeaModel.build(map, self);
    }

    public DisableDynamicslbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableDynamicslbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DisableDynamicslbRequest setEnvid(String envid) {
        this.envid = envid;
        return this;
    }
    public String getEnvid() {
        return this.envid;
    }

    public DisableDynamicslbRequest setUnitinstanceid(String unitinstanceid) {
        this.unitinstanceid = unitinstanceid;
        return this;
    }
    public String getUnitinstanceid() {
        return this.unitinstanceid;
    }

    public DisableDynamicslbRequest setProdcode(String prodcode) {
        this.prodcode = prodcode;
        return this;
    }
    public String getProdcode() {
        return this.prodcode;
    }

    public DisableDynamicslbRequest setAppname(String appname) {
        this.appname = appname;
        return this;
    }
    public String getAppname() {
        return this.appname;
    }

}
