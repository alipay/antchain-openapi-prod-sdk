// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class UpdateCodeRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签，做code数据隔离使用
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 溯源码，代表该账户的唯一资源标识。该字段不更新，仅做过滤使用。
    @NameInMap("code")
    @Validation(maxLength = 160, minLength = 1)
    public String code;

    // 注册记录唯一标识
    @NameInMap("unique_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String uniqueId;

    // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
    @NameInMap("status")
    @Validation(maxLength = 32, minLength = 1)
    public String status;

    // 注册内容。若已上链，则不可更新该信息。
    // 
    @NameInMap("content")
    public String content;

    // 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。若已上链，则不可更新该信息。
    @NameInMap("relation_codes")
    public java.util.List<String> relationCodes;

    // 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下， 
    // NO_CHECK: 不做递归检查; 
    // TREE_CHECK: 树结构检查;
    // DAG_CHECK: 有向无环图检查;
    @NameInMap("recursion_type")
    @Validation(maxLength = 32, minLength = 1)
    public String recursionType;

    // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
    @NameInMap("up_chain_flag")
    public Boolean upChainFlag;

    public static UpdateCodeRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeRegistrationRequest self = new UpdateCodeRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCodeRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCodeRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateCodeRegistrationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateCodeRegistrationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCodeRegistrationRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public UpdateCodeRegistrationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCodeRegistrationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateCodeRegistrationRequest setRelationCodes(java.util.List<String> relationCodes) {
        this.relationCodes = relationCodes;
        return this;
    }
    public java.util.List<String> getRelationCodes() {
        return this.relationCodes;
    }

    public UpdateCodeRegistrationRequest setRecursionType(String recursionType) {
        this.recursionType = recursionType;
        return this;
    }
    public String getRecursionType() {
        return this.recursionType;
    }

    public UpdateCodeRegistrationRequest setUpChainFlag(Boolean upChainFlag) {
        this.upChainFlag = upChainFlag;
        return this;
    }
    public Boolean getUpChainFlag() {
        return this.upChainFlag;
    }

}
