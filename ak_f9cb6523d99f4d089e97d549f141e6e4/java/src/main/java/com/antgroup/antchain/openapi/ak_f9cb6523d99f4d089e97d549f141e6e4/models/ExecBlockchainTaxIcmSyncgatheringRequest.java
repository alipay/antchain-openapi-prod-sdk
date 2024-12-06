// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f9cb6523d99f4d089e97d549f141e6e4.models;

import com.aliyun.tea.*;

public class ExecBlockchainTaxIcmSyncgatheringRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构号码
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 纳税人识别号(必填)
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 授权类型(必填)
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 查询类型
    // NORMAL 正常调用
    // BATCH_HAND  批刷
    @NameInMap("query_type")
    public String queryType;

    // 子机构编码，字典由系统预设白名单
    @NameInMap("sub_tenant")
    public String subTenant;

    // 优先级，越大优先级越高
    @NameInMap("use_priority")
    public String usePriority;

    public static ExecBlockchainTaxIcmSyncgatheringRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainTaxIcmSyncgatheringRequest self = new ExecBlockchainTaxIcmSyncgatheringRequest();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setSubTenant(String subTenant) {
        this.subTenant = subTenant;
        return this;
    }
    public String getSubTenant() {
        return this.subTenant;
    }

    public ExecBlockchainTaxIcmSyncgatheringRequest setUsePriority(String usePriority) {
        this.usePriority = usePriority;
        return this;
    }
    public String getUsePriority() {
        return this.usePriority;
    }

}
