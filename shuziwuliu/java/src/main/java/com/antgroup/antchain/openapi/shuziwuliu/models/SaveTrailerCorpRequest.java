// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveTrailerCorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业统一社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 渠道企业名称
    @NameInMap("channel_company_name")
    @Validation(required = true)
    public String channelCompanyName;

    // 渠道企业信用代码
    @NameInMap("channel_social_credit_code")
    @Validation(required = true)
    public String channelSocialCreditCode;

    // 企业入驻渠道日期
    @NameInMap("entry_date")
    @Validation(required = true)
    public String entryDate;

    public static SaveTrailerCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTrailerCorpRequest self = new SaveTrailerCorpRequest();
        return TeaModel.build(map, self);
    }

    public SaveTrailerCorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveTrailerCorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveTrailerCorpRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SaveTrailerCorpRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public SaveTrailerCorpRequest setChannelCompanyName(String channelCompanyName) {
        this.channelCompanyName = channelCompanyName;
        return this;
    }
    public String getChannelCompanyName() {
        return this.channelCompanyName;
    }

    public SaveTrailerCorpRequest setChannelSocialCreditCode(String channelSocialCreditCode) {
        this.channelSocialCreditCode = channelSocialCreditCode;
        return this;
    }
    public String getChannelSocialCreditCode() {
        return this.channelSocialCreditCode;
    }

    public SaveTrailerCorpRequest setEntryDate(String entryDate) {
        this.entryDate = entryDate;
        return this;
    }
    public String getEntryDate() {
        return this.entryDate;
    }

}
