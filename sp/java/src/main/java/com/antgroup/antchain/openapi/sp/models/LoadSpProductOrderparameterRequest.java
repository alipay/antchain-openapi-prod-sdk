// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class LoadSpProductOrderparameterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
    @NameInMap("business_action")
    @Validation(required = true)
    public String businessAction;

    // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
    @NameInMap("business_context")
    @Validation(required = true)
    public String businessContext;

    // 业务流水号。
    @NameInMap("order_no")
    public String orderNo;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 地域。支持不同地域显示不同内容。
    @NameInMap("region")
    public String region;

    // 租户id
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static LoadSpProductOrderparameterRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadSpProductOrderparameterRequest self = new LoadSpProductOrderparameterRequest();
        return TeaModel.build(map, self);
    }

    public LoadSpProductOrderparameterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadSpProductOrderparameterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoadSpProductOrderparameterRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public LoadSpProductOrderparameterRequest setBusinessAction(String businessAction) {
        this.businessAction = businessAction;
        return this;
    }
    public String getBusinessAction() {
        return this.businessAction;
    }

    public LoadSpProductOrderparameterRequest setBusinessContext(String businessContext) {
        this.businessContext = businessContext;
        return this;
    }
    public String getBusinessContext() {
        return this.businessContext;
    }

    public LoadSpProductOrderparameterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public LoadSpProductOrderparameterRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public LoadSpProductOrderparameterRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public LoadSpProductOrderparameterRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
