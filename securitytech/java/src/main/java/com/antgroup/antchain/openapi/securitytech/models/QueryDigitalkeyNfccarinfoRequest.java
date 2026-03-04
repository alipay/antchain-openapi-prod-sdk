// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyNfccarinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌ID
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 请求的页数
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 单页项数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 开始时间
    @NameInMap("start_time")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    public String endTime;

    public static QueryDigitalkeyNfccarinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyNfccarinfoRequest self = new QueryDigitalkeyNfccarinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyNfccarinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyNfccarinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyNfccarinfoRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public QueryDigitalkeyNfccarinfoRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryDigitalkeyNfccarinfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDigitalkeyNfccarinfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryDigitalkeyNfccarinfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
