// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchBrandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌编码
    @NameInMap("brand_code")
    @Validation(required = true)
    public String brandCode;

    // 时间月份yyyyMM
    @NameInMap("month")
    public String month;

    // test-测试数据。prod-正式数据
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 时间频次 m-月/d-天
    @NameInMap("time_type")
    @Validation(required = true)
    public String timeType;

    public static QueryIndexresearchBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchBrandRequest self = new QueryIndexresearchBrandRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchBrandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndexresearchBrandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndexresearchBrandRequest setBrandCode(String brandCode) {
        this.brandCode = brandCode;
        return this;
    }
    public String getBrandCode() {
        return this.brandCode;
    }

    public QueryIndexresearchBrandRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public QueryIndexresearchBrandRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryIndexresearchBrandRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

}
