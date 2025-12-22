// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractPlatformSignFieldApplication extends TeaModel {
    // 文件file id
    /**
     * <strong>example:</strong>
     * <p>fe7df2f477d649c18ebcfdfffeba253d</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 签署顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order")
    public Long order;

    // 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
    /**
     * <strong>example:</strong>
     * <p>bcd7ffd9-5caf-4342-bd1c-02257229ccd5</p>
     */
    @NameInMap("seal_id")
    public String sealId;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // x坐标，默认空
    /**
     * <strong>example:</strong>
     * <p>158.72531</p>
     */
    @NameInMap("pos_x")
    public String posX;

    // y坐标
    /**
     * <strong>example:</strong>
     * <p>431.05658</p>
     */
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // 签署区宽，默认印章宽度
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("width")
    public String width;

    // 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("add_sign_time")
    public Boolean addSignTime;

    // 签署类型， 1-单页签署，2-骑缝签署，默认1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_type")
    public Long signType;

    public static ContractPlatformSignFieldApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractPlatformSignFieldApplication self = new ContractPlatformSignFieldApplication();
        return TeaModel.build(map, self);
    }

    public ContractPlatformSignFieldApplication setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractPlatformSignFieldApplication setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractPlatformSignFieldApplication setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractPlatformSignFieldApplication setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractPlatformSignFieldApplication setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractPlatformSignFieldApplication setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractPlatformSignFieldApplication setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractPlatformSignFieldApplication setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractPlatformSignFieldApplication setAddSignTime(Boolean addSignTime) {
        this.addSignTime = addSignTime;
        return this;
    }
    public Boolean getAddSignTime() {
        return this.addSignTime;
    }

    public ContractPlatformSignFieldApplication setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

}
