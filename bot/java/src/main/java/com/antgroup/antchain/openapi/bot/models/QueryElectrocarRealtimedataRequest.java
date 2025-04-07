// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarRealtimedataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // iffaa 硬件唯一ID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 车辆信息集合，
    // 支持的属性 参见物模型定义
    @NameInMap("properties")
    @Validation(required = true)
    public java.util.List<String> properties;

    public static QueryElectrocarRealtimedataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarRealtimedataRequest self = new QueryElectrocarRealtimedataRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarRealtimedataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarRealtimedataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarRealtimedataRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarRealtimedataRequest setProperties(java.util.List<String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<String> getProperties() {
        return this.properties;
    }

}
