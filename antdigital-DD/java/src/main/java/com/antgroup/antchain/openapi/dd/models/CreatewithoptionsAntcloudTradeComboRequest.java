// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreatewithoptionsAntcloudTradeComboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐版本唯一版本号
    @NameInMap("combo_vid")
    @Validation(required = true)
    public String comboVid;

    // 销售主体（如 ZL6、ZL7）
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 购买租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户选择的规格配置列表
    @NameInMap("selected_configs")
    @Validation(required = true)
    public java.util.List<SelectedConfigItem> selectedConfigs;

    // 请求ID，用于幂等
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 售卖市场，由中台分配
    @NameInMap("sale_market")
    @Validation(required = true)
    public String saleMarket;

    public static CreatewithoptionsAntcloudTradeComboRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatewithoptionsAntcloudTradeComboRequest self = new CreatewithoptionsAntcloudTradeComboRequest();
        return TeaModel.build(map, self);
    }

    public CreatewithoptionsAntcloudTradeComboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setComboVid(String comboVid) {
        this.comboVid = comboVid;
        return this;
    }
    public String getComboVid() {
        return this.comboVid;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setSelectedConfigs(java.util.List<SelectedConfigItem> selectedConfigs) {
        this.selectedConfigs = selectedConfigs;
        return this;
    }
    public java.util.List<SelectedConfigItem> getSelectedConfigs() {
        return this.selectedConfigs;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatewithoptionsAntcloudTradeComboRequest setSaleMarket(String saleMarket) {
        this.saleMarket = saleMarket;
        return this;
    }
    public String getSaleMarket() {
        return this.saleMarket;
    }

}
