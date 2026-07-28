// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class SaveOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 工作空间ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 小游戏ID
    @NameInMap("mini_program_id")
    @Validation(required = true)
    public String miniProgramId;

    // 平台ID
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 客户订单号
    @NameInMap("custom_id")
    @Validation(required = true)
    public String customId;

    // 平台业务订单号
    @NameInMap("biz_order_id")
    @Validation(required = true)
    public String bizOrderId;

    // 金额，单位分
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 业务订单状态：
    // 1 - 订单已创建
    // 2 - 支付成功
    // 3 - 支付失败
    @NameInMap("biz_order_status")
    @Validation(required = true)
    public Long bizOrderStatus;

    // 开放用户ID
    @NameInMap("open_uid")
    @Validation(required = true)
    public String openUid;

    // 商品id
    @NameInMap("item_id")
    public String itemId;

    // 商品名称
    @NameInMap("item_title")
    public String itemTitle;

    // 客户端类型：IOS、ANDROID
    @NameInMap("client_type")
    public String clientType;

    // 小游戏客户端透传参数
    @NameInMap("cp_extra")
    public String cpExtra;

    public static SaveOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderRequest self = new SaveOrderRequest();
        return TeaModel.build(map, self);
    }

    public SaveOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveOrderRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveOrderRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SaveOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveOrderRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public SaveOrderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SaveOrderRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public SaveOrderRequest setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
        return this;
    }
    public String getBizOrderId() {
        return this.bizOrderId;
    }

    public SaveOrderRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public SaveOrderRequest setBizOrderStatus(Long bizOrderStatus) {
        this.bizOrderStatus = bizOrderStatus;
        return this;
    }
    public Long getBizOrderStatus() {
        return this.bizOrderStatus;
    }

    public SaveOrderRequest setOpenUid(String openUid) {
        this.openUid = openUid;
        return this;
    }
    public String getOpenUid() {
        return this.openUid;
    }

    public SaveOrderRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public SaveOrderRequest setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }
    public String getItemTitle() {
        return this.itemTitle;
    }

    public SaveOrderRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public SaveOrderRequest setCpExtra(String cpExtra) {
        this.cpExtra = cpExtra;
        return this;
    }
    public String getCpExtra() {
        return this.cpExtra;
    }

}
