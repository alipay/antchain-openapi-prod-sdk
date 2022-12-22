// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeCombineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签，做code数据隔离使用
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(required = true, maxLength = 160, minLength = 1)
    public String code;

    // 页码,当且仅当pageNum=1时返回溯源码最新注册信息
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true, maximum = 200)
    public Long pageSize;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    // 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
    @NameInMap("status")
    @Validation(maxLength = 256, minLength = 1)
    public String status;

    // 是否递归查询，默认false, 最多递归5层
    // 
    @NameInMap("recursion_flag")
    public Boolean recursionFlag;

    public static QueryCodeCombineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeCombineRequest self = new QueryCodeCombineRequest();
        return TeaModel.build(map, self);
    }

    public QueryCodeCombineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCodeCombineRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCodeCombineRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCodeCombineRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCodeCombineRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCodeCombineRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCodeCombineRequest setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

    public QueryCodeCombineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCodeCombineRequest setRecursionFlag(Boolean recursionFlag) {
        this.recursionFlag = recursionFlag;
        return this;
    }
    public Boolean getRecursionFlag() {
        return this.recursionFlag;
    }

}
