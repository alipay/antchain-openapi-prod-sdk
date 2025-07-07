// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthorizationRule extends TeaModel {
    // 规则来源
    /**
     * <strong>example:</strong>
     * <p>DID</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 规则索引
    /**
     * <strong>example:</strong>
     * <p>serviceType</p>
     */
    @NameInMap("index")
    @Validation(required = true)
    public String index;

    // 规则类型
    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 规则表达式
    /**
     * <strong>example:</strong>
     * <p>EQUALS</p>
     */
    @NameInMap("expression")
    @Validation(required = true)
    public String expression;

    // 规则内容
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static AuthorizationRule build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationRule self = new AuthorizationRule();
        return TeaModel.build(map, self);
    }

    public AuthorizationRule setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AuthorizationRule setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public AuthorizationRule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthorizationRule setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public AuthorizationRule setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
