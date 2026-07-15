// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class VoucherInfo extends TeaModel {
    // 券id
    /**
     * <strong>example:</strong>
     * <p>20250909000730029301000D462O</p>
     */
    @NameInMap("voucher_id")
    @Validation(required = true)
    public String voucherId;

    // 2088id
    /**
     * <strong>example:</strong>
     * <p>2088502492801939</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 产品编码
    /**
     * <strong>example:</strong>
     * <p>COUPON</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 资产编码
    /**
     * <strong>example:</strong>
     * <p>资产编码</p>
     */
    @NameInMap("assets_code")
    @Validation(required = true)
    public String assetsCode;

    // 券名称
    /**
     * <strong>example:</strong>
     * <p>北京银行还款帮扶-满100减20</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 券模板ID
    /**
     * <strong>example:</strong>
     * <p>2025091500073001149600J6D74N</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 发行人id
    /**
     * <strong>example:</strong>
     * <p>2088702238164012</p>
     */
    @NameInMap("publisher_user_id")
    @Validation(required = true)
    public String publisherUserId;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 券生效时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_active")
    @Validation(required = true)
    public String gmtActive;

    // 券失效时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_expired")
    @Validation(required = true)
    public String gmtExpired;

    // 展期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_extend")
    @Validation(required = true)
    public String gmtExtend;

    // 面额
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 门槛金额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("floor_amount")
    @Validation(required = true)
    public String floorAmount;

    // 总次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 可用次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("available_count")
    @Validation(required = true)
    public Long availableCount;

    // 已使用次数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("used_count")
    @Validation(required = true)
    public Long usedCount;

    // 券描述
    /**
     * <strong>example:</strong>
     * <p>{&quot;description&quot;:&quot;1、该帮扶金由机构权益运营发放，仅限在机构权益运营逾期还款场景使用，还款方式仅限于本人银行卡主动还款&quot;}</p>
     */
    @NameInMap("voucher_description")
    @Validation(required = true)
    public String voucherDescription;

    // 券模板扩展信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;agentId&quot;:&quot;7428691&quot;}</p>
     */
    @NameInMap("extend_template_info")
    @Validation(required = true)
    public String extendTemplateInfo;

    // 扩展信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;prizeType&quot;:&quot;VOUCHER_PRIZE&quot;}</p>
     */
    @NameInMap("extend_info")
    @Validation(required = true)
    public String extendInfo;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 业务类型
    /**
     * <strong>example:</strong>
     * <p>REPAY_BJBANK_COUPON</p>
     */
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 收银台展示分组
    /**
     * <strong>example:</strong>
     * <p>REPAY_BJBANK</p>
     */
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 收银台展示分组名称
    /**
     * <strong>example:</strong>
     * <p>北京银行还款帮扶</p>
     */
    @NameInMap("group_code_name")
    @Validation(required = true)
    public String groupCodeName;

    public static VoucherInfo build(java.util.Map<String, ?> map) throws Exception {
        VoucherInfo self = new VoucherInfo();
        return TeaModel.build(map, self);
    }

    public VoucherInfo setVoucherId(String voucherId) {
        this.voucherId = voucherId;
        return this;
    }
    public String getVoucherId() {
        return this.voucherId;
    }

    public VoucherInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VoucherInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public VoucherInfo setAssetsCode(String assetsCode) {
        this.assetsCode = assetsCode;
        return this;
    }
    public String getAssetsCode() {
        return this.assetsCode;
    }

    public VoucherInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VoucherInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public VoucherInfo setPublisherUserId(String publisherUserId) {
        this.publisherUserId = publisherUserId;
        return this;
    }
    public String getPublisherUserId() {
        return this.publisherUserId;
    }

    public VoucherInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VoucherInfo setGmtActive(String gmtActive) {
        this.gmtActive = gmtActive;
        return this;
    }
    public String getGmtActive() {
        return this.gmtActive;
    }

    public VoucherInfo setGmtExpired(String gmtExpired) {
        this.gmtExpired = gmtExpired;
        return this;
    }
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    public VoucherInfo setGmtExtend(String gmtExtend) {
        this.gmtExtend = gmtExtend;
        return this;
    }
    public String getGmtExtend() {
        return this.gmtExtend;
    }

    public VoucherInfo setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public VoucherInfo setFloorAmount(String floorAmount) {
        this.floorAmount = floorAmount;
        return this;
    }
    public String getFloorAmount() {
        return this.floorAmount;
    }

    public VoucherInfo setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public VoucherInfo setAvailableCount(Long availableCount) {
        this.availableCount = availableCount;
        return this;
    }
    public Long getAvailableCount() {
        return this.availableCount;
    }

    public VoucherInfo setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Long getUsedCount() {
        return this.usedCount;
    }

    public VoucherInfo setVoucherDescription(String voucherDescription) {
        this.voucherDescription = voucherDescription;
        return this;
    }
    public String getVoucherDescription() {
        return this.voucherDescription;
    }

    public VoucherInfo setExtendTemplateInfo(String extendTemplateInfo) {
        this.extendTemplateInfo = extendTemplateInfo;
        return this;
    }
    public String getExtendTemplateInfo() {
        return this.extendTemplateInfo;
    }

    public VoucherInfo setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public VoucherInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public VoucherInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public VoucherInfo setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public VoucherInfo setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public VoucherInfo setGroupCodeName(String groupCodeName) {
        this.groupCodeName = groupCodeName;
        return this;
    }
    public String getGroupCodeName() {
        return this.groupCodeName;
    }

}
