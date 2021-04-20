// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class AssetDetail extends TeaModel {
    // Token获得类型
    @NameInMap("gain_type")
    @Validation(required = true)
    public String gainType;

    // Token发放状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 购票数
    @NameInMap("ticket_number")
    @Validation(required = true)
    public Long ticketNumber;

    // Token数，单位为分个，1分个=0.01个
    @NameInMap("token")
    @Validation(required = true)
    public Long token;

    // Token展示数
    @NameInMap("token_display")
    @Validation(required = true)
    public String tokenDisplay;

    // 用户昵称
    @NameInMap("nickname")
    @Validation(required = true)
    public String nickname;

    public static AssetDetail build(java.util.Map<String, ?> map) throws Exception {
        AssetDetail self = new AssetDetail();
        return TeaModel.build(map, self);
    }

    public AssetDetail setGainType(String gainType) {
        this.gainType = gainType;
        return this;
    }
    public String getGainType() {
        return this.gainType;
    }

    public AssetDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AssetDetail setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }
    public Long getTicketNumber() {
        return this.ticketNumber;
    }

    public AssetDetail setToken(Long token) {
        this.token = token;
        return this;
    }
    public Long getToken() {
        return this.token;
    }

    public AssetDetail setTokenDisplay(String tokenDisplay) {
        this.tokenDisplay = tokenDisplay;
        return this;
    }
    public String getTokenDisplay() {
        return this.tokenDisplay;
    }

    public AssetDetail setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

}
