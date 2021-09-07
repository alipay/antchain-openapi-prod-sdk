// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncInnerTwcopenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    // 开通渠道
    @NameInMap("order_channel")
    @Validation(required = true)
    public Long orderChannel;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    public static SyncInnerTwcopenRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerTwcopenRequest self = new SyncInnerTwcopenRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerTwcopenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerTwcopenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerTwcopenRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SyncInnerTwcopenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncInnerTwcopenRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SyncInnerTwcopenRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SyncInnerTwcopenRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public SyncInnerTwcopenRequest setOrderChannel(Long orderChannel) {
        this.orderChannel = orderChannel;
        return this;
    }
    public Long getOrderChannel() {
        return this.orderChannel;
    }

    public SyncInnerTwcopenRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SyncInnerTwcopenRequest setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
