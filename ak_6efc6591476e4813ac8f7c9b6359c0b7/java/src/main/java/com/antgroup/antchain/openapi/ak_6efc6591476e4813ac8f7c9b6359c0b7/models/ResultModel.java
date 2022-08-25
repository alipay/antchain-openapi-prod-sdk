// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class ResultModel extends TeaModel {
    // 返回结果
    @NameInMap("code")
    public Long code;

    // 返回错误信息
    @NameInMap("err_msg")
    public String errMsg;

    // 返回具体结果
    @NameInMap("model")
    public String model;

    public static ResultModel build(java.util.Map<String, ?> map) throws Exception {
        ResultModel self = new ResultModel();
        return TeaModel.build(map, self);
    }

    public ResultModel setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ResultModel setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ResultModel setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
