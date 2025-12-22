// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractPlatformSignField extends TeaModel {
    // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("add_sign_time")
    public Boolean addSignTime;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order")
    public Long order;

    // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // x坐标转为字符串的值，默认空
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

    public static ContractPlatformSignField build(java.util.Map<String, ?> map) throws Exception {
        ContractPlatformSignField self = new ContractPlatformSignField();
        return TeaModel.build(map, self);
    }

    public ContractPlatformSignField setAddSignTime(Boolean addSignTime) {
        this.addSignTime = addSignTime;
        return this;
    }
    public Boolean getAddSignTime() {
        return this.addSignTime;
    }

    public ContractPlatformSignField setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractPlatformSignField setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractPlatformSignField setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractPlatformSignField setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractPlatformSignField setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractPlatformSignField setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractPlatformSignField setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
