// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ResultData extends TeaModel {
    // data
    @NameInMap("data")
    @Validation(required = true)
    public ResultMap data;

    public static ResultData build(java.util.Map<String, ?> map) throws Exception {
        ResultData self = new ResultData();
        return TeaModel.build(map, self);
    }

    public ResultData setData(ResultMap data) {
        this.data = data;
        return this;
    }
    public ResultMap getData() {
        return this.data;
    }

}
