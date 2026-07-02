// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryProductkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页数，默认1
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码大小，默认10，最大100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 设备端productKey
    @NameInMap("product_key")
    public String productKey;

    // 场景码
    // 
    @NameInMap("scene")
    public String scene;

    // 租户ID
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // 是否为测试数据
    @NameInMap("mock")
    public Boolean mock;

    public static PagequeryProductkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryProductkeyRequest self = new PagequeryProductkeyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryProductkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryProductkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryProductkeyRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PagequeryProductkeyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryProductkeyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PagequeryProductkeyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public PagequeryProductkeyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PagequeryProductkeyRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
