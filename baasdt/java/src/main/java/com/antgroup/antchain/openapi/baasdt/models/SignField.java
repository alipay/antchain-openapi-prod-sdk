// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SignField extends TeaModel {
    // 签署操作人个人账号标识，即操作本次签署的个人
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 签署所在页码，必须是整数数字
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // x坐标，必须是数字
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // y坐标，必须是数字
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    public static SignField build(java.util.Map<String, ?> map) throws Exception {
        SignField self = new SignField();
        return TeaModel.build(map, self);
    }

    public SignField setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SignField setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public SignField setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public SignField setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

}
