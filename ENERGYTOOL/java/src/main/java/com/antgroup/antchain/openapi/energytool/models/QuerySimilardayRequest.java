// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QuerySimilardayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运行日，格式：yyyy-mm-dd
    @NameInMap("run_date")
    @Validation(required = true)
    public String runDate;

    // 相似日范围开始日，格式：yyyy-mm-dd
    @NameInMap("similar_start_date")
    @Validation(required = true)
    public String similarStartDate;

    // 相似日范围结束日，yyyy-MM-dd
    @NameInMap("similar_end_date")
    @Validation(required = true)
    public String similarEndDate;

    // 相似特征类型枚举，枚举范围
    // BIDDING_SPACE: 竞价空间
    // PROVINCIAL_DISPATCH_LOAD: 省调负荷
    // NEW_ENERGY_OUTPUT: 新能源出力
    // INTERCONNECTION_PLAN: 联络线计划
    @NameInMap("similar_feature_type")
    @Validation(required = true)
    public String similarFeatureType;

    // 省地区编码，目前仅支持江苏省
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    public static QuerySimilardayRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySimilardayRequest self = new QuerySimilardayRequest();
        return TeaModel.build(map, self);
    }

    public QuerySimilardayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySimilardayRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public QuerySimilardayRequest setSimilarStartDate(String similarStartDate) {
        this.similarStartDate = similarStartDate;
        return this;
    }
    public String getSimilarStartDate() {
        return this.similarStartDate;
    }

    public QuerySimilardayRequest setSimilarEndDate(String similarEndDate) {
        this.similarEndDate = similarEndDate;
        return this;
    }
    public String getSimilarEndDate() {
        return this.similarEndDate;
    }

    public QuerySimilardayRequest setSimilarFeatureType(String similarFeatureType) {
        this.similarFeatureType = similarFeatureType;
        return this;
    }
    public String getSimilarFeatureType() {
        return this.similarFeatureType;
    }

    public QuerySimilardayRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
