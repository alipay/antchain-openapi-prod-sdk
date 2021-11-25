// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractHandSignFieldApplication extends TeaModel {
    // account_id
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

    // pos_page
    @NameInMap("pos_page")
    public String posPage;

    // posX
    @NameInMap("pos_x")
    public String posX;

    // posY
    @NameInMap("pos_y")
    public String posY;

    // sealId
    @NameInMap("seal_id")
    public String sealId;

    // signDateBeanType
    @NameInMap("sign_date_bean_type")
    @Validation(required = true)
    public Long signDateBeanType;

    // signDateFontSize
    @NameInMap("sign_date_font_size")
    @Validation(required = true)
    public Long signDateFontSize;

    // sign_date_format
    @NameInMap("sign_date_format")
    public String signDateFormat;

    // signDatePosPage
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // signDatePosX
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    // sign_date_pos_y
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    // sign_type
    @NameInMap("sign_type")
    public Long signType;

    // third_order_no
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // width
    @NameInMap("width")
    public String width;

    // seal_ids
    @NameInMap("seal_ids")
    public java.util.List<String> sealIds;

    // 签名字段type
    @NameInMap("sign_field_type")
    public Long signFieldType;

    public static ContractHandSignFieldApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractHandSignFieldApplication self = new ContractHandSignFieldApplication();
        return TeaModel.build(map, self);
    }

    public ContractHandSignFieldApplication setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ContractHandSignFieldApplication setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractHandSignFieldApplication setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractHandSignFieldApplication setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractHandSignFieldApplication setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractHandSignFieldApplication setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractHandSignFieldApplication setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractHandSignFieldApplication setSignDateBeanType(Long signDateBeanType) {
        this.signDateBeanType = signDateBeanType;
        return this;
    }
    public Long getSignDateBeanType() {
        return this.signDateBeanType;
    }

    public ContractHandSignFieldApplication setSignDateFontSize(Long signDateFontSize) {
        this.signDateFontSize = signDateFontSize;
        return this;
    }
    public Long getSignDateFontSize() {
        return this.signDateFontSize;
    }

    public ContractHandSignFieldApplication setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
        return this;
    }
    public String getSignDateFormat() {
        return this.signDateFormat;
    }

    public ContractHandSignFieldApplication setSignDatePosPage(Long signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public Long getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public ContractHandSignFieldApplication setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public ContractHandSignFieldApplication setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

    public ContractHandSignFieldApplication setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

    public ContractHandSignFieldApplication setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractHandSignFieldApplication setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractHandSignFieldApplication setSealIds(java.util.List<String> sealIds) {
        this.sealIds = sealIds;
        return this;
    }
    public java.util.List<String> getSealIds() {
        return this.sealIds;
    }

    public ContractHandSignFieldApplication setSignFieldType(Long signFieldType) {
        this.signFieldType = signFieldType;
        return this;
    }
    public Long getSignFieldType() {
        return this.signFieldType;
    }

}
