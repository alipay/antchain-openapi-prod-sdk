// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpSaleseverylistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 授权订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 逐条销售数据信息列表
    @NameInMap("sales_every_list")
    @Validation(required = true)
    public java.util.List<IPSalesEvery> salesEveryList;

    public static UploadIpSaleseverylistRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpSaleseverylistRequest self = new UploadIpSaleseverylistRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpSaleseverylistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpSaleseverylistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpSaleseverylistRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpSaleseverylistRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public UploadIpSaleseverylistRequest setSalesEveryList(java.util.List<IPSalesEvery> salesEveryList) {
        this.salesEveryList = salesEveryList;
        return this;
    }
    public java.util.List<IPSalesEvery> getSalesEveryList() {
        return this.salesEveryList;
    }

}
