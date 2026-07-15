// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class GetComboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐编码
    @NameInMap("combo_code")
    @Validation(required = true)
    public String comboCode;

    public static GetComboRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComboRequest self = new GetComboRequest();
        return TeaModel.build(map, self);
    }

    public GetComboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetComboRequest setComboCode(String comboCode) {
        this.comboCode = comboCode;
        return this;
    }
    public String getComboCode() {
        return this.comboCode;
    }

}
