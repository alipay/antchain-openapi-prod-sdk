// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class SignInfo extends TeaModel {
    // 签署人
    @NameInMap("signer")
    @Validation(required = true)
    public EntityBasicInfo signer;

    // 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
    @NameInMap("sign_type")
    @Validation(required = true)
    public String signType;

    // 签署页码
    @NameInMap("sign_page")
    @Validation(required = true)
    public Long signPage;

    // 签署x坐标
    @NameInMap("sign_position_x")
    @Validation(required = true)
    public String signPositionX;

    // 签署y坐标
    @NameInMap("sign_position_y")
    @Validation(required = true)
    public String signPositionY;

    public static SignInfo build(java.util.Map<String, ?> map) throws Exception {
        SignInfo self = new SignInfo();
        return TeaModel.build(map, self);
    }

    public SignInfo setSigner(EntityBasicInfo signer) {
        this.signer = signer;
        return this;
    }
    public EntityBasicInfo getSigner() {
        return this.signer;
    }

    public SignInfo setSignType(String signType) {
        this.signType = signType;
        return this;
    }
    public String getSignType() {
        return this.signType;
    }

    public SignInfo setSignPage(Long signPage) {
        this.signPage = signPage;
        return this;
    }
    public Long getSignPage() {
        return this.signPage;
    }

    public SignInfo setSignPositionX(String signPositionX) {
        this.signPositionX = signPositionX;
        return this;
    }
    public String getSignPositionX() {
        return this.signPositionX;
    }

    public SignInfo setSignPositionY(String signPositionY) {
        this.signPositionY = signPositionY;
        return this;
    }
    public String getSignPositionY() {
        return this.signPositionY;
    }

}
