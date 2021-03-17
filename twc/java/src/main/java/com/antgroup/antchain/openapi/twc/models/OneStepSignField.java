// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OneStepSignField extends TeaModel {
    // 签署操作人个人账号标识，即操作本次签署的个人
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 电子合同文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    @NameInMap("order")
    public Long order;

    // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // x坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // y坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // 印章id
    @NameInMap("seal_id")
    public String sealId;

    // 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
    @NameInMap("sign_date_bean_type")
    public Long signDateBeanType;

    // 签章日期字体大小,默认12
    @NameInMap("sign_date_font_size")
    public Long signDateFontSize;

    // 签章日期格式，yyyy年MM月dd日
    @NameInMap("sign_date_format")
    public String signDateFormat;

    // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // 签章日期x坐标，默认0
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    // 签章日期y坐标，默认0
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
    @NameInMap("sign_type")
    public Long signType;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // 签署区宽，默认印章宽度
    @NameInMap("width")
    public String width;

    // 是否自动执行签署，默认false，false-手动签署，true-自动签署
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
