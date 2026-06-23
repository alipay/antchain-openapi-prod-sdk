// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotagentClientRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备标识列表
    @NameInMap("uid_list")
    @Validation(required = true)
    public java.util.List<String> uidList;

    // 设备pk
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    public static ImportIotagentClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotagentClientRequest self = new ImportIotagentClientRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotagentClientRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotagentClientRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotagentClientRequest setUidList(java.util.List<String> uidList) {
        this.uidList = uidList;
        return this;
    }
    public java.util.List<String> getUidList() {
        return this.uidList;
    }

    public ImportIotagentClientRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
