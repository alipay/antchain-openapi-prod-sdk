// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListDigitalkeyRentaltripRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备TUID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 时间维度：DAY（日）、WEEK（周）、MONTH（月）
    @NameInMap("time_dimension")
    @Validation(required = true)
    public String timeDimension;

    // 时间值（格式根据维度）
    @NameInMap("time_value")
    @Validation(required = true)
    public String timeValue;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListDigitalkeyRentaltripRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalkeyRentaltripRequest self = new ListDigitalkeyRentaltripRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalkeyRentaltripRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDigitalkeyRentaltripRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDigitalkeyRentaltripRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public ListDigitalkeyRentaltripRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public ListDigitalkeyRentaltripRequest setTimeValue(String timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public String getTimeValue() {
        return this.timeValue;
    }

    public ListDigitalkeyRentaltripRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDigitalkeyRentaltripRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
