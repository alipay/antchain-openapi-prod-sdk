// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpCodeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 用户ID
    // phone_number、external_user_id、user_id 三个条件至少必填一个
    @NameInMap("user_id")
    public String userId;

    // 页码
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 每页数据量大小(请小于等于100)
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 0 扫描过的数字凭证，1 领取过的数字凭证
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 商家ID筛选
    @NameInMap("buyer_id")
    public String buyerId;

    // 手机号筛选
    // phone_number、external_user_id、user_id 三个条件至少必填一个
    @NameInMap("phone_number")
    public String phoneNumber;

    // 外部客户自定义客户ID
    // phone_number、external_user_id、user_id 三个条件至少必填一个
    @NameInMap("external_user_id")
    public String externalUserId;

    public static PagequeryIpCodeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpCodeinfoRequest self = new PagequeryIpCodeinfoRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIpCodeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIpCodeinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIpCodeinfoRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public PagequeryIpCodeinfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PagequeryIpCodeinfoRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpCodeinfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpCodeinfoRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public PagequeryIpCodeinfoRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public PagequeryIpCodeinfoRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PagequeryIpCodeinfoRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

}
