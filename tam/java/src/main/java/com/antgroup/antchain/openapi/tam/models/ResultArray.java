// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ResultArray extends TeaModel {
    // 数组
    @NameInMap("result_array")
    @Validation(required = true)
    public java.util.List<String> resultArray;

    public static ResultArray build(java.util.Map<String, ?> map) throws Exception {
        ResultArray self = new ResultArray();
        return TeaModel.build(map, self);
    }

    public ResultArray setResultArray(java.util.List<String> resultArray) {
        this.resultArray = resultArray;
        return this;
    }
    public java.util.List<String> getResultArray() {
        return this.resultArray;
    }

}
