// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class ResultListDemo extends TeaModel {
    // 返回结果码
    @NameInMap("code")
    @Validation(required = true)
    public AbcDemoStruct code;

    // 返回结果
    @NameInMap("data")
    @Validation(required = true)
    public AbcDemoStruct data;

    // 返回信息
    @NameInMap("message")
    @Validation(required = true)
    public AbcDemoStruct message;

    public static ResultListDemo build(java.util.Map<String, ?> map) throws Exception {
        ResultListDemo self = new ResultListDemo();
        return TeaModel.build(map, self);
    }

    public ResultListDemo setCode(AbcDemoStruct code) {
        this.code = code;
        return this;
    }
    public AbcDemoStruct getCode() {
        return this.code;
    }

    public ResultListDemo setData(AbcDemoStruct data) {
        this.data = data;
        return this;
    }
    public AbcDemoStruct getData() {
        return this.data;
    }

    public ResultListDemo setMessage(AbcDemoStruct message) {
        this.message = message;
        return this;
    }
    public AbcDemoStruct getMessage() {
        return this.message;
    }

}
