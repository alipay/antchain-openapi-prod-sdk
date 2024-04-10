// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryIrBrandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 品牌MD5的 32位小写
    @NameInMap("brandmd5")
    @Validation(required = true)
    public String brandmd5;

    // 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
    @NameInMap("begin_date")
    @Validation(required = true)
    public String beginDate;

    // 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static QueryIrBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIrBrandRequest self = new QueryIrBrandRequest();
        return TeaModel.build(map, self);
    }

    public QueryIrBrandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIrBrandRequest setBrandmd5(String brandmd5) {
        this.brandmd5 = brandmd5;
        return this;
    }
    public String getBrandmd5() {
        return this.brandmd5;
    }

    public QueryIrBrandRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public QueryIrBrandRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryIrBrandRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
