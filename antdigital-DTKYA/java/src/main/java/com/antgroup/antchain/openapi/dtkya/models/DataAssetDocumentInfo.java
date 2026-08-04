// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataAssetDocumentInfo extends TeaModel {
    // 文档名称
    /**
     * <strong>example:</strong>
     * <p>医疗数据集.csv</p>
     */
    @NameInMap("document_name")
    @Validation(required = true)
    public String documentName;

    // 文档类型
    /**
     * <strong>example:</strong>
     * <p>csv</p>
     */
    @NameInMap("document_type")
    @Validation(required = true)
    public String documentType;

    // 文档备注
    /**
     * <strong>example:</strong>
     * <p>客户方提供的医疗测试数据集</p>
     */
    @NameInMap("remark")
    public String remark;

    // 文档key 调用方需先调用oss上传接口获取
    /**
     * <strong>example:</strong>
     * <p>12323123-123123143124-123</p>
     */
    @NameInMap("document_key")
    @Validation(required = true)
    public String documentKey;

    public static DataAssetDocumentInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetDocumentInfo self = new DataAssetDocumentInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetDocumentInfo setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public DataAssetDocumentInfo setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public DataAssetDocumentInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DataAssetDocumentInfo setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
        return this;
    }
    public String getDocumentKey() {
        return this.documentKey;
    }

}
