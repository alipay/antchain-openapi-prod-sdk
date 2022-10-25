// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PushRefinanceInvalidorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产包id
    @NameInMap("package_id")
    @Validation(required = true, maxLength = 64)
    public String packageId;

    // 无效资产订单id列表，单次不限笔数，如果没有无效资产，传空列表即可
    @NameInMap("order_id_list")
    public java.util.List<String> orderIdList;

    public static PushRefinanceInvalidorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRefinanceInvalidorderRequest self = new PushRefinanceInvalidorderRequest();
        return TeaModel.build(map, self);
    }

    public PushRefinanceInvalidorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRefinanceInvalidorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRefinanceInvalidorderRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public PushRefinanceInvalidorderRequest setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

}
