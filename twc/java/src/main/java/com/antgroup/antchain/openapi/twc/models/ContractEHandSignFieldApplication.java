// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractEHandSignFieldApplication extends TeaModel {
    // 签署操作人个人账号标识，即操作本次签署的个人
    /**
     * <strong>example:</strong>
     * <p>2c7de24aff3340f5b944ebac49545b8e</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 签约主体账号标识，即本次签署对应任务的归属方，默认是签署操作人个人
    /**
     * <strong>example:</strong>
     * <p>签署账号</p>
     */
    @NameInMap("authorized_account_id")
    public String authorizedAccountId;

    // 机构签约类别，当签约主体为机构时必传：2-机构盖章；
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("actor_indentity_type")
    public Long actorIndentityType;

    // 电子合同文件ID
    /**
     * <strong>example:</strong>
     * <p>fe7df2f477d649c18ebcfdfffeba253d</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order")
    public Long order;

    // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字；不指定xy坐标签署区可不填写
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    public String posPage;

    // x坐标，页面签章必填，骑缝签章不填写
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("pos_x")
    public String posX;

    // y坐标
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("pos_y")
    public String posY;

    // 印章id
    /**
     * <strong>example:</strong>
     * <p>bcd7ffd9-5caf-4342-bd1c-02257229ccd5</p>
     */
    @NameInMap("seal_id")
    public String sealId;

    // 是否需要添加签署日期，0-禁止 1-必须 ，默认0
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("sign_date_bean_type")
    public Long signDateBeanType;

    // 签章日期字体大小,默认12
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("sign_date_font_size")
    public Long signDateFontSize;

    // 签章日期格式，yyyy年MM月dd日
    /**
     * <strong>example:</strong>
     * <p>yyyy年MM月dd日</p>
     */
    @NameInMap("sign_date_format")
    public String signDateFormat;

    // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // 签章日期x坐标，默认0
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    // 签章日期y坐标，默认0
    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    // 签署类型，1-单页签署，2-骑缝签署，默认1
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("sign_type")
    public Long signType;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * <strong>example:</strong>
     * <p>someordernumber</p>
     */
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // 签署区宽，默认印章宽度
    /**
     * <strong>example:</strong>
     * <p>100.0</p>
     */
    @NameInMap("width")
    public String width;

    // 印章ids，只支持企业用户进行印章ID列表的设置；用于手动签署时，指定企业印章进行展示，实现手动选择印章进行签署。
    /**
     * <strong>example:</strong>
     * <p>[&quot;印章id1&quot;,&quot;印章id2&quot;,....]</p>
     */
    @NameInMap("seal_ids")
    public java.util.List<String> sealIds;

    // 签署区预设xy坐标类型，0：不指定X/Y坐标 1：指定X/Y坐标 默认：指定X/Y坐标 ; 签署区设置时可以不指定XY坐标，签署方在签署时拖拽确定最终签署区域，支持在页面任何区域拖拽，个人和企业签署用印都支持
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sign_field_type")
    public Long signFieldType;

    // 个人用户是否需要静默签署授权,默认false false-不需要,true-需要
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("agree_auto_sign")
    public Boolean agreeAutoSign;

    public static ContractEHandSignFieldApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractEHandSignFieldApplication self = new ContractEHandSignFieldApplication();
        return TeaModel.build(map, self);
    }

    public ContractEHandSignFieldApplication setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ContractEHandSignFieldApplication setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }
    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    public ContractEHandSignFieldApplication setActorIndentityType(Long actorIndentityType) {
        this.actorIndentityType = actorIndentityType;
        return this;
    }
    public Long getActorIndentityType() {
        return this.actorIndentityType;
    }

    public ContractEHandSignFieldApplication setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractEHandSignFieldApplication setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractEHandSignFieldApplication setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractEHandSignFieldApplication setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractEHandSignFieldApplication setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractEHandSignFieldApplication setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractEHandSignFieldApplication setSignDateBeanType(Long signDateBeanType) {
        this.signDateBeanType = signDateBeanType;
        return this;
    }
    public Long getSignDateBeanType() {
        return this.signDateBeanType;
    }

    public ContractEHandSignFieldApplication setSignDateFontSize(Long signDateFontSize) {
        this.signDateFontSize = signDateFontSize;
        return this;
    }
    public Long getSignDateFontSize() {
        return this.signDateFontSize;
    }

    public ContractEHandSignFieldApplication setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
        return this;
    }
    public String getSignDateFormat() {
        return this.signDateFormat;
    }

    public ContractEHandSignFieldApplication setSignDatePosPage(Long signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public Long getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public ContractEHandSignFieldApplication setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public ContractEHandSignFieldApplication setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

    public ContractEHandSignFieldApplication setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

    public ContractEHandSignFieldApplication setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractEHandSignFieldApplication setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractEHandSignFieldApplication setSealIds(java.util.List<String> sealIds) {
        this.sealIds = sealIds;
        return this;
    }
    public java.util.List<String> getSealIds() {
        return this.sealIds;
    }

    public ContractEHandSignFieldApplication setSignFieldType(Long signFieldType) {
        this.signFieldType = signFieldType;
        return this;
    }
    public Long getSignFieldType() {
        return this.signFieldType;
    }

    public ContractEHandSignFieldApplication setAgreeAutoSign(Boolean agreeAutoSign) {
        this.agreeAutoSign = agreeAutoSign;
        return this;
    }
    public Boolean getAgreeAutoSign() {
        return this.agreeAutoSign;
    }

}
