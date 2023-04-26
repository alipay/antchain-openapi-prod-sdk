// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryXrXrticketpoolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 资源id
    @NameInMap("resource_id")
    public String resourceId;

    // 券池名称
    @NameInMap("xr_ticket_pool_name")
    public String xrTicketPoolName;

    // 通行证状态，
    // EXPIRED：已过期
    // VALID：有效
    // SALED：已出售
    @NameInMap("status")
    public String status;

    // 当前页
    // 
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryXrXrticketpoolRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryXrXrticketpoolRequest self = new PagequeryXrXrticketpoolRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryXrXrticketpoolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryXrXrticketpoolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryXrXrticketpoolRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public PagequeryXrXrticketpoolRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public PagequeryXrXrticketpoolRequest setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public PagequeryXrXrticketpoolRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryXrXrticketpoolRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryXrXrticketpoolRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
