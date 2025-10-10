// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OperateTwevPowerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能中控id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 品牌信息
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // 操作类型
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // json，扩展预留
    @NameInMap("extern_info")
    public String externInfo;

    public static OperateTwevPowerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateTwevPowerRequest self = new OperateTwevPowerRequest();
        return TeaModel.build(map, self);
    }

    public OperateTwevPowerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateTwevPowerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateTwevPowerRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public OperateTwevPowerRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public OperateTwevPowerRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateTwevPowerRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
