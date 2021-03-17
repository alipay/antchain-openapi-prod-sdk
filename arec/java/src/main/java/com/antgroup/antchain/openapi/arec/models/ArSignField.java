// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class ArSignField extends TeaModel {
    // 签署页
    @NameInMap("pos_page")
    public String posPage;

    // 签署区x坐标
    @NameInMap("pos_x")
    public String posX;

    // 签署区y坐标
    @NameInMap("pos_y")
    public String posY;

    // 签署日期签署页
    @NameInMap("sign_date_pos_page")
    public String signDatePosPage;

    // 签署日期的签署坐标x
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    // 签署日期签署坐标y
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    public static ArSignField build(java.util.Map<String, ?> map) throws Exception {
        ArSignField self = new ArSignField();
        return TeaModel.build(map, self);
    }

    public ArSignField setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ArSignField setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ArSignField setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ArSignField setSignDatePosPage(String signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public String getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public ArSignField setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public ArSignField setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

}
