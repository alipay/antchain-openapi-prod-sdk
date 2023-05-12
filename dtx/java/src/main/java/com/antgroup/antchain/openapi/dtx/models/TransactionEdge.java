// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionEdge extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // source
    @NameInMap("source")
    @Validation(required = true)
    public Long source;

    // target
    @NameInMap("target")
    @Validation(required = true)
    public Long target;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // content
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // isError
    @NameInMap("is_error")
    @Validation(required = true)
    public Boolean isError;

    // error_message
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static TransactionEdge build(java.util.Map<String, ?> map) throws Exception {
        TransactionEdge self = new TransactionEdge();
        return TeaModel.build(map, self);
    }

    public TransactionEdge setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransactionEdge setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public TransactionEdge setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public TransactionEdge setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TransactionEdge setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public TransactionEdge setIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }
    public Boolean getIsError() {
        return this.isError;
    }

    public TransactionEdge setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
