// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpPackagetradesalesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 买方的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 关联订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 销售数据列表
    @NameInMap("ip_sales_info_list")
    @Validation(required = true)
    public java.util.List<IPSalesInfo> ipSalesInfoList;

    public static UploadIpPackagetradesalesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpPackagetradesalesRequest self = new UploadIpPackagetradesalesRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpPackagetradesalesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpPackagetradesalesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpPackagetradesalesRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpPackagetradesalesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadIpPackagetradesalesRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public UploadIpPackagetradesalesRequest setIpSalesInfoList(java.util.List<IPSalesInfo> ipSalesInfoList) {
        this.ipSalesInfoList = ipSalesInfoList;
        return this;
    }
    public java.util.List<IPSalesInfo> getIpSalesInfoList() {
        return this.ipSalesInfoList;
    }

}
