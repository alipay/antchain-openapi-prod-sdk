// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarOffsettranslateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 减碳数据转移记录业务方的业务单号
    @NameInMap("translation_item_no")
    @Validation(required = true)
    public String translationItemNo;

    public static DetailEcarOffsettranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarOffsettranslateRequest self = new DetailEcarOffsettranslateRequest();
        return TeaModel.build(map, self);
    }

    public DetailEcarOffsettranslateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailEcarOffsettranslateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailEcarOffsettranslateRequest setTranslationItemNo(String translationItemNo) {
        this.translationItemNo = translationItemNo;
        return this;
    }
    public String getTranslationItemNo() {
        return this.translationItemNo;
    }

}
