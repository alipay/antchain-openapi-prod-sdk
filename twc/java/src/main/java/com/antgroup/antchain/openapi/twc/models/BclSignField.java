// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclSignField extends TeaModel {
    // 页码信息：当签署区sign_type为RIDE_SEAM时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字； 
    @NameInMap("pos_page")
    @Validation(required = true, maxLength = 8)
    public String posPage;

    // 页面签署位置x坐标
    // 非负数，小数位最多两位x坐标
    // sign_type：SINGLE_PAGE 必填
    // sign_type：RIDE_SEAM  无需填写
    @NameInMap("pos_x")
    @Validation(maxLength = 8)
    public String posX;

    // 页面签署位置y坐标
    // 非负数，小数位最多两位，y坐标
    @NameInMap("pos_y")
    @Validation(required = true, maxLength = 8)
    public String posY;

    // 签署类型
    // 1.单页签署: SINGLE_PAGE
    // 2.骑缝签署: RIDE_SEAM
    // 默认：SINGLE_PAGE
    @NameInMap("sign_field_type")
    @Validation(required = true, maxLength = 16)
    public String signFieldType;

    // 是否添加签署时间
    // 1.不添加: false 
    // 2.添加: true 
    // 默认：false
    @NameInMap("add_sign_date")
    public Boolean addSignDate;

    // 签章日期字体大小
    // 默认12，范围10-20
    // 商家签署区不支持；
    // 当add_sign_date为true时,该字段必填；为false是该字段不能传值，必须为空；
    @NameInMap("sign_date_font_size")
    @Validation(maximum = 20, minimum = 10)
    public Long signDateFontSize;

    // 签章日期格式
    // yyyy年MM月dd日（默认值） yyyy-MM-dd 
    // yyyy/MM/dd 
    // yyyy-MM-dd HH:mm:ss 
    // 商家签署区不支持；
    //  当add_sign_date为true时,该字段必填；为false是该字段不能传值，必须为空；
    @NameInMap("sign_date_format")
    @Validation(maxLength = 32)
    public String signDateFormat;

    // 页码信息
    // 当add_sign_date为true时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可
    // 商家签署区不支持；
    //  当add_sign_date为true时,该字段必填；为false是该字段不能传值，必须为空；
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // 页面签章日期x坐标
    // 非负数，小数位最多两位，默认0 
    // 商家签署区不支持；
    //  当add_sign_date为true时,该字段必填；为false是该字段不能传值，必须为空；
    @NameInMap("sign_date_pos_x")
    @Validation(maxLength = 8)
    public String signDatePosX;

    // 页面签章日期y坐标
    // 非负数，小数位最多两位，默认0 
    // 商家签署区不支持；
    //  当add_sign_date为true时,该字段必填；为false是该字段不能传值，必须为空；
    @NameInMap("sign_date_pos_y")
    @Validation(maxLength = 8)
    public String signDatePosY;

    public static BclSignField build(java.util.Map<String, ?> map) throws Exception {
        BclSignField self = new BclSignField();
        return TeaModel.build(map, self);
    }

    public BclSignField setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public BclSignField setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public BclSignField setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public BclSignField setSignFieldType(String signFieldType) {
        this.signFieldType = signFieldType;
        return this;
    }
    public String getSignFieldType() {
        return this.signFieldType;
    }

    public BclSignField setAddSignDate(Boolean addSignDate) {
        this.addSignDate = addSignDate;
        return this;
    }
    public Boolean getAddSignDate() {
        return this.addSignDate;
    }

    public BclSignField setSignDateFontSize(Long signDateFontSize) {
        this.signDateFontSize = signDateFontSize;
        return this;
    }
    public Long getSignDateFontSize() {
        return this.signDateFontSize;
    }

    public BclSignField setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
        return this;
    }
    public String getSignDateFormat() {
        return this.signDateFormat;
    }

    public BclSignField setSignDatePosPage(Long signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public Long getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public BclSignField setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public BclSignField setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

}
