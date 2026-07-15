// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignFieldApplication extends TeaModel {
    // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("add_sign_time")
    public Boolean addSignTime;

    // 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
    /**
     * <strong>example:</strong>
     * <p>2c7de24aff3340f5b944ebac49545b8e</p>
     */
    @NameInMap("authorized_account_id")
    @Validation(required = true)
    public String authorizedAccountId;

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

    // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // x坐标转为字符串的值，默认空，页面签章必填，骑缝签章不填写
    /**
     * <strong>example:</strong>
     * <p>158.72531</p>
     */
    @NameInMap("pos_x")
    public String posX;

    // y坐标转为字符串的值
    /**
     * <strong>example:</strong>
     * <p>431.05658</p>
     */
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // 印章id ，如不传，则采用账号下的默认印章
    /**
     * <strong>example:</strong>
     * <p>bcd7ffd9-5caf-4342-bd1c-02257229ccd5</p>
     */
    @NameInMap("seal_id")
    public String sealId;

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
     * <p>1</p>
     */
    @NameInMap("width")
    public String width;

    // 签署类型，1-单页签署，2-骑缝签署，默认1
    @NameInMap("sign_type")
    public Long signType;

    public static ContractSignFieldApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractSignFieldApplication self = new ContractSignFieldApplication();
        return TeaModel.build(map, self);
    }

    public ContractSignFieldApplication setAddSignTime(Boolean addSignTime) {
        this.addSignTime = addSignTime;
        return this;
    }
    public Boolean getAddSignTime() {
        return this.addSignTime;
    }

    public ContractSignFieldApplication setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }
    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    public ContractSignFieldApplication setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractSignFieldApplication setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractSignFieldApplication setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractSignFieldApplication setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractSignFieldApplication setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractSignFieldApplication setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractSignFieldApplication setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractSignFieldApplication setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractSignFieldApplication setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

}
