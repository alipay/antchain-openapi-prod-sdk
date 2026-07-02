// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeParseRespData extends TeaModel {
    // 二维码内容
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("code_value")
    @Validation(required = true)
    public java.util.List<String> codeValue;

    public static BaiQrcodeParseRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeParseRespData self = new BaiQrcodeParseRespData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeParseRespData setCodeValue(java.util.List<String> codeValue) {
        this.codeValue = codeValue;
        return this;
    }
    public java.util.List<String> getCodeValue() {
        return this.codeValue;
    }

}
