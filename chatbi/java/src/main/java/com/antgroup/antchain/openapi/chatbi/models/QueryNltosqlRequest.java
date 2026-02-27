// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.chatbi.models;

import com.aliyun.tea.*;

public class QueryNltosqlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户自然语言输入的问题
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // 主题ID
    @NameInMap("topicid")
    @Validation(required = true)
    public String topicid;

    // 对话ID
    @NameInMap("dialogid")
    @Validation(required = true)
    public String dialogid;

    // 来源系统
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 是否需要返回SQL执行结果
    @NameInMap("needsqlexecuteresult")
    public Boolean needsqlexecuteresult;

    // 是否限制返回条数
    @NameInMap("limit")
    public Boolean limit;

    public static QueryNltosqlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNltosqlRequest self = new QueryNltosqlRequest();
        return TeaModel.build(map, self);
    }

    public QueryNltosqlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNltosqlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNltosqlRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryNltosqlRequest setTopicid(String topicid) {
        this.topicid = topicid;
        return this;
    }
    public String getTopicid() {
        return this.topicid;
    }

    public QueryNltosqlRequest setDialogid(String dialogid) {
        this.dialogid = dialogid;
        return this;
    }
    public String getDialogid() {
        return this.dialogid;
    }

    public QueryNltosqlRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryNltosqlRequest setNeedsqlexecuteresult(Boolean needsqlexecuteresult) {
        this.needsqlexecuteresult = needsqlexecuteresult;
        return this;
    }
    public Boolean getNeedsqlexecuteresult() {
        return this.needsqlexecuteresult;
    }

    public QueryNltosqlRequest setLimit(Boolean limit) {
        this.limit = limit;
        return this;
    }
    public Boolean getLimit() {
        return this.limit;
    }

}
