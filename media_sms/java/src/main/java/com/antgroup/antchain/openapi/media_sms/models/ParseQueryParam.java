// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ParseQueryParam extends TeaModel {
    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    public static ParseQueryParam build(java.util.Map<String, ?> map) throws Exception {
        ParseQueryParam self = new ParseQueryParam();
        return TeaModel.build(map, self);
    }

    public ParseQueryParam setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
