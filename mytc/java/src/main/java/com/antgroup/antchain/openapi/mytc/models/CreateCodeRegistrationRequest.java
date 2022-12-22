// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CreateCodeRegistrationRequest extends TeaModel {
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

    // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
    @NameInMap("status")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String status;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    @NameInMap("biz_labels")
    public java.util.List<String> bizLabels;

    // 注册内容
    @NameInMap("content")
    public String content;

    // 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。
    // 可以通过接口查询关联溯源码绑定的信息。
    @NameInMap("relation_codes")
    public java.util.List<String> relationCodes;

    // 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
    // NO_CHECK:  不做递归检查;
    // TREE_CHECK: 树结构检查;
    // DAG_CHECK: 有向无环图检查;
    @NameInMap("recursion_type")
    @Validation(maxLength = 32, minLength = 1)
    public String recursionType;

    // 是否上链，默认true。
    // 为false时，仅做DB数据保存不上链。
    // 若content数据大小超过要求限制，仅会保存content的hash值上链
    @NameInMap("up_chain_flag")
    public Boolean upChainFlag;

    public static CreateCodeRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeRegistrationRequest self = new CreateCodeRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCodeRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCodeRegistrationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCodeRegistrationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCodeRegistrationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCodeRegistrationRequest setBizLabels(java.util.List<String> bizLabels) {
        this.bizLabels = bizLabels;
        return this;
    }
    public java.util.List<String> getBizLabels() {
        return this.bizLabels;
    }

    public CreateCodeRegistrationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateCodeRegistrationRequest setRelationCodes(java.util.List<String> relationCodes) {
        this.relationCodes = relationCodes;
        return this;
    }
    public java.util.List<String> getRelationCodes() {
        return this.relationCodes;
    }

    public CreateCodeRegistrationRequest setRecursionType(String recursionType) {
        this.recursionType = recursionType;
        return this;
    }
    public String getRecursionType() {
        return this.recursionType;
    }

    public CreateCodeRegistrationRequest setUpChainFlag(Boolean upChainFlag) {
        this.upChainFlag = upChainFlag;
        return this;
    }
    public Boolean getUpChainFlag() {
        return this.upChainFlag;
    }

}
