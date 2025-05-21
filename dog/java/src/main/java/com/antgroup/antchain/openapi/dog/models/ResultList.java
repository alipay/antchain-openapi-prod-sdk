// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class ResultList extends TeaModel {
    // 返回结果
    @NameInMap("result")
    @Validation(required = true)
    public DogHome result;

    public static ResultList build(java.util.Map<String, ?> map) throws Exception {
        ResultList self = new ResultList();
        return TeaModel.build(map, self);
    }

    public ResultList setResult(DogHome result) {
        this.result = result;
        return this;
    }
    public DogHome getResult() {
        return this.result;
    }

}
