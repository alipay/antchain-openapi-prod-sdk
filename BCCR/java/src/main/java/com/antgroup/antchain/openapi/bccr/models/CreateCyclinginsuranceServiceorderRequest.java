// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateCyclinginsuranceServiceorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 来源场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 请求唯一id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 调用方应用名
    @NameInMap("caller_app_name")
    @Validation(required = true)
    public String callerAppName;

    // 业务id，用于幂等
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 下单账号
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 商品码
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 商品属性
    // serviceStartTime:服务开始时间
    // serviceEndTime:服务结束时间
    // tenantAddress:上门地址
    // tenantPhone:租赁人电话
    // tenantName:租赁人姓名
    // insurancePolicyId:保险单号
    // batteryType:电池型号
    // 示例
    // { 
    // "serviceEndTime": "2025-05-16 10:00:00",
    //  "serviceStartTime" : "2025-05-16 11:00:00",
    //   "tenantPhone": "15888888885",
    //   "tenantName": "张三",
    //   "insurancePolicyId":"test123",
    //   "serviceLocationType":"DOOR_TO_DOOR"
    //    "batteryType": "abc480v",
    //    "tenantAddressProvince":"浙江省",
    //    "tenantAddressCity": "杭州市",
    //    "tenantAddressDistrict": "西湖区",
    //    "tenantAddressDetail": "xx街道"
    // }
    @NameInMap("item_attributes")
    @Validation(required = true)
    public String itemAttributes;

    public static CreateCyclinginsuranceServiceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCyclinginsuranceServiceorderRequest self = new CreateCyclinginsuranceServiceorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCyclinginsuranceServiceorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCyclinginsuranceServiceorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCyclinginsuranceServiceorderRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateCyclinginsuranceServiceorderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCyclinginsuranceServiceorderRequest setCallerAppName(String callerAppName) {
        this.callerAppName = callerAppName;
        return this;
    }
    public String getCallerAppName() {
        return this.callerAppName;
    }

    public CreateCyclinginsuranceServiceorderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateCyclinginsuranceServiceorderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateCyclinginsuranceServiceorderRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public CreateCyclinginsuranceServiceorderRequest setItemAttributes(String itemAttributes) {
        this.itemAttributes = itemAttributes;
        return this;
    }
    public String getItemAttributes() {
        return this.itemAttributes;
    }

}
