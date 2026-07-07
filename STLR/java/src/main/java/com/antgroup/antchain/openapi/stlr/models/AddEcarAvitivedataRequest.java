// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarAvitivedataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活动数据业务单号
    @NameInMap("enterprise_biz_no")
    @Validation(required = true, maxLength = 64)
    public String enterpriseBizNo;

    // 盘查排放项编码
    @NameInMap("inventory_item_no")
    @Validation(required = true)
    public String inventoryItemNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
    @NameInMap("occurrence_start_time")
    @Validation(required = true)
    public String occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
    @NameInMap("occurrence_end_time")
    @Validation(required = true)
    public String occurrenceEndTime;

    // 排放源用量值列表
    @NameInMap("emission_source_dosage_list")
    @Validation(required = true)
    public java.util.List<AnyAmountItem> emissionSourceDosageList;

    // 活动数据附加要素值列表
    @NameInMap("emission_source_element_list")
    public java.util.List<AnyKeywordItem> emissionSourceElementList;

    // 活动数据扩展信息值列表
    @NameInMap("extension_value_list")
    public java.util.List<AnyKeywordItem> extensionValueList;

    // 凭证文件列表，每个文件通过接口/open/api/file/upload上传
    @NameInMap("voucher_file_list")
    public java.util.List<EnterpriseDocumentFile> voucherFileList;

    // 备注
    @NameInMap("remark")
    @Validation(maxLength = 512)
    public String remark;

    public static AddEcarAvitivedataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEcarAvitivedataRequest self = new AddEcarAvitivedataRequest();
        return TeaModel.build(map, self);
    }

    public AddEcarAvitivedataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddEcarAvitivedataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddEcarAvitivedataRequest setEnterpriseBizNo(String enterpriseBizNo) {
        this.enterpriseBizNo = enterpriseBizNo;
        return this;
    }
    public String getEnterpriseBizNo() {
        return this.enterpriseBizNo;
    }

    public AddEcarAvitivedataRequest setInventoryItemNo(String inventoryItemNo) {
        this.inventoryItemNo = inventoryItemNo;
        return this;
    }
    public String getInventoryItemNo() {
        return this.inventoryItemNo;
    }

    public AddEcarAvitivedataRequest setOccurrenceStartTime(String occurrenceStartTime) {
        this.occurrenceStartTime = occurrenceStartTime;
        return this;
    }
    public String getOccurrenceStartTime() {
        return this.occurrenceStartTime;
    }

    public AddEcarAvitivedataRequest setOccurrenceEndTime(String occurrenceEndTime) {
        this.occurrenceEndTime = occurrenceEndTime;
        return this;
    }
    public String getOccurrenceEndTime() {
        return this.occurrenceEndTime;
    }

    public AddEcarAvitivedataRequest setEmissionSourceDosageList(java.util.List<AnyAmountItem> emissionSourceDosageList) {
        this.emissionSourceDosageList = emissionSourceDosageList;
        return this;
    }
    public java.util.List<AnyAmountItem> getEmissionSourceDosageList() {
        return this.emissionSourceDosageList;
    }

    public AddEcarAvitivedataRequest setEmissionSourceElementList(java.util.List<AnyKeywordItem> emissionSourceElementList) {
        this.emissionSourceElementList = emissionSourceElementList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getEmissionSourceElementList() {
        return this.emissionSourceElementList;
    }

    public AddEcarAvitivedataRequest setExtensionValueList(java.util.List<AnyKeywordItem> extensionValueList) {
        this.extensionValueList = extensionValueList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getExtensionValueList() {
        return this.extensionValueList;
    }

    public AddEcarAvitivedataRequest setVoucherFileList(java.util.List<EnterpriseDocumentFile> voucherFileList) {
        this.voucherFileList = voucherFileList;
        return this;
    }
    public java.util.List<EnterpriseDocumentFile> getVoucherFileList() {
        return this.voucherFileList;
    }

    public AddEcarAvitivedataRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
