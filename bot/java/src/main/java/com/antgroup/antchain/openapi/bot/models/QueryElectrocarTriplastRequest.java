// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTriplastRequest extends TeaModel {
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

    // 时间戳
    @NameInMap("time_value")
    @Validation(required = true)
    public Long timeValue;

    public static QueryElectrocarTriplastRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTriplastRequest self = new QueryElectrocarTriplastRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTriplastRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarTriplastRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarTriplastRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarTriplastRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public QueryElectrocarTriplastRequest setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public Long getTimeValue() {
        return this.timeValue;
    }

}
