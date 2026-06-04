// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class ResultModel extends TeaModel {
    // 返回结果
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("code")
    public Long code;

    // 返回错误信息
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("err_msg")
    public String errMsg;

    // 返回具体结果
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("model")
    public SecurityRiskContentAnalyzeResponse model;

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

    public ResultModel setModel(SecurityRiskContentAnalyzeResponse model) {
        this.model = model;
        return this;
    }
    public SecurityRiskContentAnalyzeResponse getModel() {
        return this.model;
    }

}
