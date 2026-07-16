// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecIcmSyncgatheringRequest extends TeaModel {
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

    public static ExecIcmSyncgatheringRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecIcmSyncgatheringRequest self = new ExecIcmSyncgatheringRequest();
        return TeaModel.build(map, self);
    }

    public ExecIcmSyncgatheringRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecIcmSyncgatheringRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecIcmSyncgatheringRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public ExecIcmSyncgatheringRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public ExecIcmSyncgatheringRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ExecIcmSyncgatheringRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ExecIcmSyncgatheringRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecIcmSyncgatheringRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecIcmSyncgatheringRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ExecIcmSyncgatheringRequest setSubTenant(String subTenant) {
        this.subTenant = subTenant;
        return this;
    }
    public String getSubTenant() {
        return this.subTenant;
    }

    public ExecIcmSyncgatheringRequest setUsePriority(String usePriority) {
        this.usePriority = usePriority;
        return this;
    }
    public String getUsePriority() {
        return this.usePriority;
    }

}
