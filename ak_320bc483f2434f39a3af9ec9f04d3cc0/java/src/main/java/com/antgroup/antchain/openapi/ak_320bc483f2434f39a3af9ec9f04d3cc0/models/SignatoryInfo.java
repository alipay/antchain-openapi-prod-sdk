// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignatoryInfo extends TeaModel {
    // 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    //  x坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    //  y坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // 签署区宽 (默认为100)
    @NameInMap("width")
    public String width;

    public static SignatoryInfo build(java.util.Map<String, ?> map) throws Exception {
        SignatoryInfo self = new SignatoryInfo();
        return TeaModel.build(map, self);
    }

    public SignatoryInfo setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public SignatoryInfo setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public SignatoryInfo setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public SignatoryInfo setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
