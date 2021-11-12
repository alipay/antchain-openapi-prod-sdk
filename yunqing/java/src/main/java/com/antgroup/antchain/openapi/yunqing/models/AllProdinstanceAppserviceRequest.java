// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AllProdinstanceAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    public static AllProdinstanceAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllProdinstanceAppserviceRequest self = new AllProdinstanceAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public AllProdinstanceAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllProdinstanceAppserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllProdinstanceAppserviceRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public AllProdinstanceAppserviceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
