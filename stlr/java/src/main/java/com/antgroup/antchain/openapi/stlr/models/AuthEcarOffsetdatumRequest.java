// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AuthEcarOffsetdatumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 会员在蚂蚁DIS服务的账户DID
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    // 碳普惠平台编码，如蚂蚁森林编码为Antforest
    @NameInMap("carbon_offset_platform_no")
    @Validation(required = true)
    public String carbonOffsetPlatformNo;

    // 平台方会员账户ID
    @NameInMap("platform_account_id")
    @Validation(required = true)
    public String platformAccountId;

    // 授权关键数据列表，KV结构列表
    @NameInMap("auth_keyword_list")
    @Validation(required = true)
    public java.util.List<AnyKeywordItem> authKeywordList;

    public static AuthEcarOffsetdatumRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthEcarOffsetdatumRequest self = new AuthEcarOffsetdatumRequest();
        return TeaModel.build(map, self);
    }

    public AuthEcarOffsetdatumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthEcarOffsetdatumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthEcarOffsetdatumRequest setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public AuthEcarOffsetdatumRequest setCarbonOffsetPlatformNo(String carbonOffsetPlatformNo) {
        this.carbonOffsetPlatformNo = carbonOffsetPlatformNo;
        return this;
    }
    public String getCarbonOffsetPlatformNo() {
        return this.carbonOffsetPlatformNo;
    }

    public AuthEcarOffsetdatumRequest setPlatformAccountId(String platformAccountId) {
        this.platformAccountId = platformAccountId;
        return this;
    }
    public String getPlatformAccountId() {
        return this.platformAccountId;
    }

    public AuthEcarOffsetdatumRequest setAuthKeywordList(java.util.List<AnyKeywordItem> authKeywordList) {
        this.authKeywordList = authKeywordList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getAuthKeywordList() {
        return this.authKeywordList;
    }

}
