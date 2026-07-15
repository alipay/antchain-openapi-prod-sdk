// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class SmartTemplateDyncParam extends TeaModel {
    // 可以用该字段关联短链的发送目标
    /**
     * <strong>example:</strong>
     * <p>132XXXXXXXX</p>
     */
    @NameInMap("cust_flag")
    @Validation(required = true)
    public String custFlag;

    // json字符串
    // {"param1":"123","param2":"100"}
    /**
     * <strong>example:</strong>
     * <p>{&quot;param1&quot;:&quot;123&quot;,&quot;param2&quot;:&quot;100&quot;}</p>
     */
    @NameInMap("dync_params")
    public String dyncParams;

    public static SmartTemplateDyncParam build(java.util.Map<String, ?> map) throws Exception {
        SmartTemplateDyncParam self = new SmartTemplateDyncParam();
        return TeaModel.build(map, self);
    }

    public SmartTemplateDyncParam setCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }
    public String getCustFlag() {
        return this.custFlag;
    }

    public SmartTemplateDyncParam setDyncParams(String dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }
    public String getDyncParams() {
        return this.dyncParams;
    }

}
