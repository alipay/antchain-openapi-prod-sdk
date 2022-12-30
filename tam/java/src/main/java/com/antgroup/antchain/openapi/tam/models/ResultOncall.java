// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ResultOncall extends TeaModel {
    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public String success;

    // 提示信息
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 保存的工单主键id（成功才有）
    @NameInMap("id")
    public String id;

    public static ResultOncall build(java.util.Map<String, ?> map) throws Exception {
        ResultOncall self = new ResultOncall();
        return TeaModel.build(map, self);
    }

    public ResultOncall setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ResultOncall setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResultOncall setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
