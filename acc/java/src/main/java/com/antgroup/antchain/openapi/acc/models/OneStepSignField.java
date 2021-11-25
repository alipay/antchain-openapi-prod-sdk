// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class OneStepSignField extends TeaModel {
    // accountId
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // order
    @NameInMap("order")
    public Long order;

    // posPage
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // posX
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // posY
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // sealId
    @NameInMap("seal_id")
    public String sealId;

    // sign_date_bean_type
    @NameInMap("sign_date_bean_type")
    public Long signDateBeanType;

    // sign_date_font_size
    @NameInMap("sign_date_font_size")
    public Long signDateFontSize;

    // sign_date_format
    @NameInMap("sign_date_format")
    public String signDateFormat;

    // sign_date_pos_page
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // sign_date_pos_x
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    //  
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    // signType
    @NameInMap("sign_type")
    public Long signType;

    // third_order_no
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // width
    @NameInMap("width")
    public String width;

    // auto_execute
    @NameInMap("auto_execute")
    public Boolean autoExecute;

    public static OneStepSignField build(java.util.Map<String, ?> map) throws Exception {
        OneStepSignField self = new OneStepSignField();
        return TeaModel.build(map, self);
    }

    public OneStepSignField setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public OneStepSignField setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public OneStepSignField setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public OneStepSignField setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public OneStepSignField setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public OneStepSignField setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public OneStepSignField setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public OneStepSignField setSignDateBeanType(Long signDateBeanType) {
        this.signDateBeanType = signDateBeanType;
        return this;
    }
    public Long getSignDateBeanType() {
        return this.signDateBeanType;
    }

    public OneStepSignField setSignDateFontSize(Long signDateFontSize) {
        this.signDateFontSize = signDateFontSize;
        return this;
    }
    public Long getSignDateFontSize() {
        return this.signDateFontSize;
    }

    public OneStepSignField setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
        return this;
    }
    public String getSignDateFormat() {
        return this.signDateFormat;
    }

    public OneStepSignField setSignDatePosPage(Long signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public Long getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public OneStepSignField setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public OneStepSignField setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

    public OneStepSignField setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

    public OneStepSignField setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public OneStepSignField setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public OneStepSignField setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

}
