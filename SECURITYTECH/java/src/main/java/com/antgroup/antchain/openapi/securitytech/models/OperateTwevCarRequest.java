// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OperateTwevCarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("order_id")
    public String orderId;

    // 车辆中控号 （tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("tuid")
    public String tuid;

    // 品牌id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    @NameInMap("brand_id")
    public String brandId;

    // 操作类型  设防：SET_DEFENSE/撤防：REMOVE_DEFENSE/远程启动：REMOTE_ON/远程熄火：REMOTE_OFF/超级锁车：SUPER_LOCK/超级解锁：SUPER_UNLOCK/寻车鸣笛：SEARCH_HORN/开坐桶锁：OPEN_SITTING_BUCKET
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 预留扩展字段 json
    @NameInMap("extra_info")
    public String extraInfo;

    public static OperateTwevCarRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateTwevCarRequest self = new OperateTwevCarRequest();
        return TeaModel.build(map, self);
    }

    public OperateTwevCarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateTwevCarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateTwevCarRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OperateTwevCarRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public OperateTwevCarRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public OperateTwevCarRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateTwevCarRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
