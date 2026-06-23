// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class ContentQueryResultModel extends TeaModel {
    // 返回结果码
    @NameInMap("code")
    public Long code;

    // 返回错误码
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("err_msg")
    public String errMsg;

    // 返回结果
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("model")
    public SecurityRiskContentResultGetResponse model;

    public static ContentQueryResultModel build(java.util.Map<String, ?> map) throws Exception {
        ContentQueryResultModel self = new ContentQueryResultModel();
        return TeaModel.build(map, self);
    }

    public ContentQueryResultModel setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ContentQueryResultModel setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ContentQueryResultModel setModel(SecurityRiskContentResultGetResponse model) {
        this.model = model;
        return this;
    }
    public SecurityRiskContentResultGetResponse getModel() {
        return this.model;
    }

}
