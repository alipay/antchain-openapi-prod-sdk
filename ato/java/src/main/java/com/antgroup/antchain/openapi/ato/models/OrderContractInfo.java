// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderContractInfo extends TeaModel {
    // 电子合同签署单号
    /**
     * <strong>example:</strong>
     * <p>20240505151148001384</p>
     */
    @NameInMap("sign_no")
    public String signNo;

    // 签署时间
    /**
     * <strong>example:</strong>
     * <p>2023-11-12 00:00:00</p>
     */
    @NameInMap("sign_time")
    public String signTime;

    // 合同签署类型
    /**
     * <strong>example:</strong>
     * <p>lease</p>
     */
    @NameInMap("contract_type")
    public String contractType;

    // 文件合同类型
    /**
     * <strong>example:</strong>
     * <p>lease</p>
     */
    @NameInMap("agreement_type")
    public String agreementType;

    // 模板ID
    /**
     * <strong>example:</strong>
     * <p>T20240505151148001384</p>
     */
    @NameInMap("template_id")
    public String templateId;

    // 模板文件名称
    /**
     * <strong>example:</strong>
     * <p>租赁合同</p>
     */
    @NameInMap("file_name")
    public String fileName;

    // 合同文件下载地址
    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    public static OrderContractInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderContractInfo self = new OrderContractInfo();
        return TeaModel.build(map, self);
    }

    public OrderContractInfo setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public OrderContractInfo setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public OrderContractInfo setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public OrderContractInfo setAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }
    public String getAgreementType() {
        return this.agreementType;
    }

    public OrderContractInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OrderContractInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public OrderContractInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

}
