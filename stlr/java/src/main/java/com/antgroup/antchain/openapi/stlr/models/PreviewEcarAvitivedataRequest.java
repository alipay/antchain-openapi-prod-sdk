// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PreviewEcarAvitivedataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求统计的年份，默认为当前年份
    @NameInMap("year")
    public Long year;

    // 统计比较运算是的基准：
    // LastYear(去年同期比较),
    // CriteriaYear(同基准年比较)。
    // 默认与去年同期比较。
    @NameInMap("comparison_standard")
    public String comparisonStandard;

    public static PreviewEcarAvitivedataRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewEcarAvitivedataRequest self = new PreviewEcarAvitivedataRequest();
        return TeaModel.build(map, self);
    }

    public PreviewEcarAvitivedataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewEcarAvitivedataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewEcarAvitivedataRequest setYear(Long year) {
        this.year = year;
        return this;
    }
    public Long getYear() {
        return this.year;
    }

    public PreviewEcarAvitivedataRequest setComparisonStandard(String comparisonStandard) {
        this.comparisonStandard = comparisonStandard;
        return this;
    }
    public String getComparisonStandard() {
        return this.comparisonStandard;
    }

}
