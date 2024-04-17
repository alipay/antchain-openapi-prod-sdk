// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpCardsmsSupportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cpassAccessKey
    @NameInMap("cpass_ak")
    public String cpassAk;

    // 行业标签
    @NameInMap("industry_tag")
    @Validation(required = true)
    public String industryTag;

    // 卡片短信模板
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 手机号
    @NameInMap("mobiles")
    @Validation(required = true)
    public String mobiles;

    public static QueryQmpCardsmsSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpCardsmsSupportRequest self = new QueryQmpCardsmsSupportRequest();
        return TeaModel.build(map, self);
    }

    public QueryQmpCardsmsSupportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQmpCardsmsSupportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQmpCardsmsSupportRequest setCpassAk(String cpassAk) {
        this.cpassAk = cpassAk;
        return this;
    }
    public String getCpassAk() {
        return this.cpassAk;
    }

    public QueryQmpCardsmsSupportRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

    public QueryQmpCardsmsSupportRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QueryQmpCardsmsSupportRequest setMobiles(String mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public String getMobiles() {
        return this.mobiles;
    }

}
