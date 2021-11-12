// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPShopInfo extends TeaModel {
    // 授权申请的内部编码
    @NameInMap("item_code")
    @Validation(required = true)
    public String itemCode;

    // 淘宝卖家的官方昵称
    @NameInMap("seller_nick")
    @Validation(required = true)
    public String sellerNick;

    // 授权渠道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 数据授权方式
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权启始时间戳(unix毫秒)
    @NameInMap("auth_start")
    @Validation(required = true)
    public Long authStart;

    // 授权终止时间戳(unix毫秒)
    @NameInMap("auth_end")
    @Validation(required = true)
    public Long authEnd;

    // 授权状态(1: Init, 2: Success, 3: Expired)
    @NameInMap("auth_status")
    @Validation(required = true)
    public Long authStatus;

    // 授权链接
    @NameInMap("auth_url")
    @Validation(required = true)
    public String authUrl;

    public static IPShopInfo build(java.util.Map<String, ?> map) throws Exception {
        IPShopInfo self = new IPShopInfo();
        return TeaModel.build(map, self);
    }

    public IPShopInfo setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public IPShopInfo setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public IPShopInfo setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public IPShopInfo setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public IPShopInfo setAuthStart(Long authStart) {
        this.authStart = authStart;
        return this;
    }
    public Long getAuthStart() {
        return this.authStart;
    }

    public IPShopInfo setAuthEnd(Long authEnd) {
        this.authEnd = authEnd;
        return this;
    }
    public Long getAuthEnd() {
        return this.authEnd;
    }

    public IPShopInfo setAuthStatus(Long authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Long getAuthStatus() {
        return this.authStatus;
    }

    public IPShopInfo setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

}
