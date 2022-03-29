// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SwitchSofamqAdminapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api接口名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 开关是否打开
    @NameInMap("switch_open")
    @Validation(required = true)
    public Boolean switchOpen;

    public static SwitchSofamqAdminapiRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSofamqAdminapiRequest self = new SwitchSofamqAdminapiRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSofamqAdminapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchSofamqAdminapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SwitchSofamqAdminapiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SwitchSofamqAdminapiRequest setSwitchOpen(Boolean switchOpen) {
        this.switchOpen = switchOpen;
        return this;
    }
    public Boolean getSwitchOpen() {
        return this.switchOpen;
    }

}
