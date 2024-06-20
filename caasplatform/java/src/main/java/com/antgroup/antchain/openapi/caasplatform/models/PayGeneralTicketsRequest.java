// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class PayGeneralTicketsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 持有账号的地址
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 接收账号的地址
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 数据资产ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 要转增的数据资产数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 扩展数据
    @NameInMap("data")
    public String data;

    public static PayGeneralTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        PayGeneralTicketsRequest self = new PayGeneralTicketsRequest();
        return TeaModel.build(map, self);
    }

    public PayGeneralTicketsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayGeneralTicketsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PayGeneralTicketsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public PayGeneralTicketsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public PayGeneralTicketsRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public PayGeneralTicketsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PayGeneralTicketsRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public PayGeneralTicketsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
