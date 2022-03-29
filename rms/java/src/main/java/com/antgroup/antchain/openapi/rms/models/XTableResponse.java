// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTableResponse extends TeaModel {
    //  
    @NameInMap("result_type")
    @Validation(required = true)
    public String resultType;

    //  
    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<XTableData> result;

    public static XTableResponse build(java.util.Map<String, ?> map) throws Exception {
        XTableResponse self = new XTableResponse();
        return TeaModel.build(map, self);
    }

    public XTableResponse setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public XTableResponse setResult(java.util.List<XTableData> result) {
        this.result = result;
        return this;
    }
    public java.util.List<XTableData> getResult() {
        return this.result;
    }

}
