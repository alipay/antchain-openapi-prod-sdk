// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractSignFieldInfo extends TeaModel {
    // 签署流程id
    /**
     * <strong>example:</strong>
     * <p>8dfg0h80sg8sd0fa45b9cvb79</p>
     */
    @NameInMap("flow_id")
    public String flowId;

    // 文件id
    /**
     * <strong>example:</strong>
     * <p>9dfgsh7da89g7adfgh</p>
     */
    @NameInMap("contract_file_id")
    public String contractFileId;

    // 签署人id
    /**
     * <strong>example:</strong>
     * <p>b9sc0bn9sffs</p>
     */
    @NameInMap("contract_user_id")
    public String contractUserId;

    // 签署页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    public String posPage;

    // x坐标
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("pos_x")
    public String posX;

    // y坐标
    /**
     * <strong>example:</strong>
     * <p>22.22</p>
     */
    @NameInMap("pos_y")
    public String posY;

    // 签署类型，AUTO-自动，HAND-手动
    /**
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("sign_type")
    public String signType;

    // 签署区类型， 
    // 单页签署: SINGLE_PAGE， 
    // 骑缝签署: RIDE_SEAM， 
    // 默认 SINGLE_PAGE
    /**
     * <strong>example:</strong>
     * <p>SINGLE_PAGE</p>
     */
    @NameInMap("sign_field_type")
    public String signFieldType;

    // 是否添加签署时间
    // 不添加: false 添加: true ， 默认false, 商家不支持指定日期坐标
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("add_sign_date")
    public Boolean addSignDate;

    // 签章日期字体大小,默认12 商家签署区不支持
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("sign_date_font_size")
    public Long signDateFontSize;

    // 签章日期格式，yyyy年MM月dd日 商家签署区不支持
    /**
     * <strong>example:</strong>
     * <p>yyyy年MM月dd日</p>
     */
    @NameInMap("sign_date_format")
    public String signDateFormat;

    // 签章日期页码信息
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_date_pos_page")
    public Long signDatePosPage;

    // 签章日期x坐标
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("sign_date_pos_x")
    public String signDatePosX;

    // 签章日期y坐标
    /**
     * <strong>example:</strong>
     * <p>22.22</p>
     */
    @NameInMap("sign_date_pos_y")
    public String signDatePosY;

    public static BclContractSignFieldInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractSignFieldInfo self = new BclContractSignFieldInfo();
        return TeaModel.build(map, self);
    }

    public BclContractSignFieldInfo setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public BclContractSignFieldInfo setContractFileId(String contractFileId) {
        this.contractFileId = contractFileId;
        return this;
    }
    public String getContractFileId() {
        return this.contractFileId;
    }

    public BclContractSignFieldInfo setContractUserId(String contractUserId) {
        this.contractUserId = contractUserId;
        return this;
    }
    public String getContractUserId() {
        return this.contractUserId;
    }

    public BclContractSignFieldInfo setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public BclContractSignFieldInfo setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public BclContractSignFieldInfo setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public BclContractSignFieldInfo setSignType(String signType) {
        this.signType = signType;
        return this;
    }
    public String getSignType() {
        return this.signType;
    }

    public BclContractSignFieldInfo setSignFieldType(String signFieldType) {
        this.signFieldType = signFieldType;
        return this;
    }
    public String getSignFieldType() {
        return this.signFieldType;
    }

    public BclContractSignFieldInfo setAddSignDate(Boolean addSignDate) {
        this.addSignDate = addSignDate;
        return this;
    }
    public Boolean getAddSignDate() {
        return this.addSignDate;
    }

    public BclContractSignFieldInfo setSignDateFontSize(Long signDateFontSize) {
        this.signDateFontSize = signDateFontSize;
        return this;
    }
    public Long getSignDateFontSize() {
        return this.signDateFontSize;
    }

    public BclContractSignFieldInfo setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
        return this;
    }
    public String getSignDateFormat() {
        return this.signDateFormat;
    }

    public BclContractSignFieldInfo setSignDatePosPage(Long signDatePosPage) {
        this.signDatePosPage = signDatePosPage;
        return this;
    }
    public Long getSignDatePosPage() {
        return this.signDatePosPage;
    }

    public BclContractSignFieldInfo setSignDatePosX(String signDatePosX) {
        this.signDatePosX = signDatePosX;
        return this;
    }
    public String getSignDatePosX() {
        return this.signDatePosX;
    }

    public BclContractSignFieldInfo setSignDatePosY(String signDatePosY) {
        this.signDatePosY = signDatePosY;
        return this;
    }
    public String getSignDatePosY() {
        return this.signDatePosY;
    }

}
