// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeStatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签
    // 
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    // 截止时间
    @NameInMap("end_time")
    public Long endTime;

    // 支持以下查询维度：
    // REGISTRATION  注册码统计
    // RELATION  关联码信息统计
    // DEPOSIT    存证信息统计
    @NameInMap("code_type")
    @Validation(maxLength = 32, minLength = 1)
    public String codeType;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    public static QueryCodeStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeStatRequest self = new QueryCodeStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryCodeStatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCodeStatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCodeStatRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCodeStatRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryCodeStatRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryCodeStatRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public QueryCodeStatRequest setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

}
