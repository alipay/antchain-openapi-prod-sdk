// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataAssetCommercialInfo extends TeaModel {
    // 合同名称
    /**
     * <strong>example:</strong>
     * <p>合同名称</p>
     */
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // PENDING待生效
    // ACTIVE生效中
    // SUSPENDED已暂停
    // EXPIRED已到期
    // TERMINATED已终止
    /**
     * <strong>example:</strong>
     * <p>合同状态</p>
     */
    @NameInMap("contract_status")
    public String contractStatus;

    // 合同id
    /**
     * <strong>example:</strong>
     * <p>合同id</p>
     */
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 合同开始时间
    /**
     * <strong>example:</strong>
     * <p>2020-12-12 12:12:12</p>
     */
    @NameInMap("contract_start_time")
    public String contractStartTime;

    // 合同结束时间
    /**
     * <strong>example:</strong>
     * <p>2020-12-12 12:12:12</p>
     */
    @NameInMap("contract_end_time")
    public String contractEndTime;

    // 计费模式
    // 
    //     FREE,
    //    
    //     PAY_PER_USE,
    //    
    //     SUBSCRIPTION,
    //    
    //     OTHER
    /**
     * <strong>example:</strong>
     * <p>计费模式</p>
     */
    @NameInMap("billing_model")
    public String billingModel;

    // 价格，单位：元
    /**
     * <strong>example:</strong>
     * <p>12.234</p>
     */
    @NameInMap("price")
    public String price;

    // 计费单位
    // 
    //     PER_DAY
    //     PER_MONTH
    //     PER_YEAR
    //     PER_QUERY
    //     PER_RESULT
    //     PER_MB
    /**
     * <strong>example:</strong>
     * <p>PER_DAY</p>
     */
    @NameInMap("unit")
    public String unit;

    // 关联文档列表 合同文件等
    /**
     * <strong>example:</strong>
     * <p>关联文档列表 合同文件等</p>
     */
    @NameInMap("related_document_list")
    public java.util.List<DataAssetDocumentInfo> relatedDocumentList;

    // 补充说明
    /**
     * <strong>example:</strong>
     * <p>补充说明</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    public static DataAssetCommercialInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetCommercialInfo self = new DataAssetCommercialInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetCommercialInfo setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public DataAssetCommercialInfo setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
        return this;
    }
    public String getContractStatus() {
        return this.contractStatus;
    }

    public DataAssetCommercialInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public DataAssetCommercialInfo setContractStartTime(String contractStartTime) {
        this.contractStartTime = contractStartTime;
        return this;
    }
    public String getContractStartTime() {
        return this.contractStartTime;
    }

    public DataAssetCommercialInfo setContractEndTime(String contractEndTime) {
        this.contractEndTime = contractEndTime;
        return this;
    }
    public String getContractEndTime() {
        return this.contractEndTime;
    }

    public DataAssetCommercialInfo setBillingModel(String billingModel) {
        this.billingModel = billingModel;
        return this;
    }
    public String getBillingModel() {
        return this.billingModel;
    }

    public DataAssetCommercialInfo setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public DataAssetCommercialInfo setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DataAssetCommercialInfo setRelatedDocumentList(java.util.List<DataAssetDocumentInfo> relatedDocumentList) {
        this.relatedDocumentList = relatedDocumentList;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getRelatedDocumentList() {
        return this.relatedDocumentList;
    }

    public DataAssetCommercialInfo setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
