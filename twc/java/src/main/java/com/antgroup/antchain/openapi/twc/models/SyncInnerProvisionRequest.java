// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncInnerProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自增id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 是否正式账号
    @NameInMap("is_official")
    public Boolean isOfficial;

    // 业务分类
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    // 是否法院节点
    @NameInMap("legal_account")
    public Boolean legalAccount;

    // 服务状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 商品开通实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 订单渠道
    @NameInMap("order_channel")
    public Long orderChannel;

    public static SyncInnerProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerProvisionRequest self = new SyncInnerProvisionRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerProvisionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SyncInnerProvisionRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SyncInnerProvisionRequest setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public SyncInnerProvisionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncInnerProvisionRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public SyncInnerProvisionRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SyncInnerProvisionRequest setIsOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
        return this;
    }
    public Boolean getIsOfficial() {
        return this.isOfficial;
    }

    public SyncInnerProvisionRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public SyncInnerProvisionRequest setLegalAccount(Boolean legalAccount) {
        this.legalAccount = legalAccount;
        return this;
    }
    public Boolean getLegalAccount() {
        return this.legalAccount;
    }

    public SyncInnerProvisionRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SyncInnerProvisionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncInnerProvisionRequest setOrderChannel(Long orderChannel) {
        this.orderChannel = orderChannel;
        return this;
    }
    public Long getOrderChannel() {
        return this.orderChannel;
    }

}
