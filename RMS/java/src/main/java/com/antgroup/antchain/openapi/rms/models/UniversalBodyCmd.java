// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UniversalBodyCmd extends TeaModel {
    // body
    @NameInMap("body")
    public String body;

    // id
    @NameInMap("id")
    public Long id;

    // model_name
    @NameInMap("model_name")
    public String modelName;

    // op
    @NameInMap("op")
    public String op;

    // parse_long_text
    @NameInMap("parse_long_text")
    public Boolean parseLongText;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // page_index
    @NameInMap("page_index")
    public Long pageIndex;

    // cur_index
    @NameInMap("cur_index")
    public Long curIndex;

    public static UniversalBodyCmd build(java.util.Map<String, ?> map) throws Exception {
        UniversalBodyCmd self = new UniversalBodyCmd();
        return TeaModel.build(map, self);
    }

    public UniversalBodyCmd setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UniversalBodyCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UniversalBodyCmd setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UniversalBodyCmd setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public UniversalBodyCmd setParseLongText(Boolean parseLongText) {
        this.parseLongText = parseLongText;
        return this;
    }
    public Boolean getParseLongText() {
        return this.parseLongText;
    }

    public UniversalBodyCmd setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public UniversalBodyCmd setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public UniversalBodyCmd setCurIndex(Long curIndex) {
        this.curIndex = curIndex;
        return this;
    }
    public Long getCurIndex() {
        return this.curIndex;
    }

}
