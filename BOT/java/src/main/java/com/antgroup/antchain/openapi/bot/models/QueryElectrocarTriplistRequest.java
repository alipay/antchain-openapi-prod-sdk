// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTriplistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tuid
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // MONTH（月）
    // WEEK（周）
    // DAY（日）
    @NameInMap("time_dimension")
    @Validation(required = true)
    public String timeDimension;

    // Long	时间戳（每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    @NameInMap("time_value")
    @Validation(required = true)
    public Long timeValue;

    // 分页
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryElectrocarTriplistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTriplistRequest self = new QueryElectrocarTriplistRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTriplistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTriplistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTriplistRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarTriplistRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public QueryElectrocarTriplistRequest setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public Long getTimeValue() {
        return this.timeValue;
    }

    public QueryElectrocarTriplistRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarTriplistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
