// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AuthInfo extends TeaModel {
    // 授权权利项
    @NameInMap("right_code")
    @Validation(required = true)
    public String rightCode;

    // 许可地域，默认中国境内，不包括香港等
    @NameInMap("region_code")
    public String regionCode;

    // 许可方式
    @NameInMap("usage_code")
    @Validation(required = true)
    public String usageCode;

    // 许可终端
    @NameInMap("terminal_code")
    @Validation(required = true)
    public String terminalCode;

    // 传播媒介，默认互联网
    @NameInMap("media_code")
    public String mediaCode;

    // 是否独占,默认 普通专有 GENERAL
    @NameInMap("right_item_character")
    public String rightItemCharacter;

    // 是否可转让,默认不可转让
    @NameInMap("transfer_status")
    public String transferStatus;

    public static AuthInfo build(java.util.Map<String, ?> map) throws Exception {
        AuthInfo self = new AuthInfo();
        return TeaModel.build(map, self);
    }

    public AuthInfo setRightCode(String rightCode) {
        this.rightCode = rightCode;
        return this;
    }
    public String getRightCode() {
        return this.rightCode;
    }

    public AuthInfo setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public AuthInfo setUsageCode(String usageCode) {
        this.usageCode = usageCode;
        return this;
    }
    public String getUsageCode() {
        return this.usageCode;
    }

    public AuthInfo setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
        return this;
    }
    public String getTerminalCode() {
        return this.terminalCode;
    }

    public AuthInfo setMediaCode(String mediaCode) {
        this.mediaCode = mediaCode;
        return this;
    }
    public String getMediaCode() {
        return this.mediaCode;
    }

    public AuthInfo setRightItemCharacter(String rightItemCharacter) {
        this.rightItemCharacter = rightItemCharacter;
        return this;
    }
    public String getRightItemCharacter() {
        return this.rightItemCharacter;
    }

    public AuthInfo setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }
    public String getTransferStatus() {
        return this.transferStatus;
    }

}
