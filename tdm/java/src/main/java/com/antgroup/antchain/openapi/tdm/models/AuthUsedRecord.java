// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class AuthUsedRecord extends TeaModel {
    // 被授权租户名称：
    // 
    // 身份证号/统一社会组织机构信用码
    // 
    // 
    @NameInMap("authorized_name")
    @Validation(required = true)
    public String authorizedName;

    // 授权码
    // 
    // 
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 链的信息
    @NameInMap("chain_info")
    @Validation(required = true)
    public ChainInfo chainInfo;

    // 扩展字段
    @NameInMap("extend_params")
    @Validation(required = true)
    public String extendParams;

    // 标的物,产品码名称
    // 
    // 
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 授权可信内容
    @NameInMap("tee_data")
    public String teeData;

    // 数据使用时间
    // 
    // 
    @NameInMap("use_date")
    @Validation(required = true)
    public String useDate;

    public static AuthUsedRecord build(java.util.Map<String, ?> map) throws Exception {
        AuthUsedRecord self = new AuthUsedRecord();
        return TeaModel.build(map, self);
    }

    public AuthUsedRecord setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }
    public String getAuthorizedName() {
        return this.authorizedName;
    }

    public AuthUsedRecord setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AuthUsedRecord setChainInfo(ChainInfo chainInfo) {
        this.chainInfo = chainInfo;
        return this;
    }
    public ChainInfo getChainInfo() {
        return this.chainInfo;
    }

    public AuthUsedRecord setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public AuthUsedRecord setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public AuthUsedRecord setTeeData(String teeData) {
        this.teeData = teeData;
        return this;
    }
    public String getTeeData() {
        return this.teeData;
    }

    public AuthUsedRecord setUseDate(String useDate) {
        this.useDate = useDate;
        return this;
    }
    public String getUseDate() {
        return this.useDate;
    }

}
