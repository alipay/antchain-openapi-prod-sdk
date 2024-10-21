// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class RenewSpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    @NameInMap("order_no")
    @Validation(required = true, maxLength = 64, minLength = 32)
    public String orderNo;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 20, minLength = 3)
    public String productCode;

    // 产品实例ID
    @NameInMap("instance_id")
    @Validation(required = true, maxLength = 50, minLength = 20)
    public String instanceId;

    // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    @NameInMap("access_code")
    @Validation(required = true, maxLength = 24, minLength = 3)
    public String accessCode;

    // 续签后，新的实例开始时间。时间使用UTC时间
    @NameInMap("renew_start_time")
    public String renewStartTime;

    // 续签后，新的实例结束时间。时间使用UTC时间
    @NameInMap("renew_end_time")
    @Validation(required = true)
    public String renewEndTime;

    public static RenewSpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewSpProductRequest self = new RenewSpProductRequest();
        return TeaModel.build(map, self);
    }

    public RenewSpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RenewSpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RenewSpProductRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public RenewSpProductRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public RenewSpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RenewSpProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewSpProductRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

    public RenewSpProductRequest setRenewStartTime(String renewStartTime) {
        this.renewStartTime = renewStartTime;
        return this;
    }
    public String getRenewStartTime() {
        return this.renewStartTime;
    }

    public RenewSpProductRequest setRenewEndTime(String renewEndTime) {
        this.renewEndTime = renewEndTime;
        return this;
    }
    public String getRenewEndTime() {
        return this.renewEndTime;
    }

}
