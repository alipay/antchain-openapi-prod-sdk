// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataSetMetaInfo extends TeaModel {
    // 数据集id
    /**
     * <strong>example:</strong>
     * <p>数据集id</p>
     */
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 数据集类型
    // 
    // 
    // HTTP_API
    // 
    // SDK
    // 
    // FILE
    // 
    // DATABASE
    // 
    //  ODPS
    /**
     * <strong>example:</strong>
     * <p>HTTP_API</p>
     */
    @NameInMap("data_set_type")
    @Validation(required = true)
    public String dataSetType;

    // 数据集名称
    /**
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("data_set_name")
    @Validation(required = true)
    public String dataSetName;

    // 数据集描述
    /**
     * <strong>example:</strong>
     * <p>数据集描述</p>
     */
    @NameInMap("data_set_desc")
    public String dataSetDesc;

    // 数据集创建时间 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2020-12-12 12:12:12</p>
     */
    @NameInMap("create_time")
    public String createTime;

    // 当前数据集的数据列数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("column_count")
    public Long columnCount;

    // 当前数据集的数据行数
    /**
     * <strong>example:</strong>
     * <p>12313</p>
     */
    @NameInMap("row_count")
    public String rowCount;

    // 当前数据集的数据存储大小byte
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("data_storage_size")
    public Long dataStorageSize;

    // 当前数据集最新一次结构变动的时间
    /**
     * <strong>example:</strong>
     * <p>2020-12-12 12:12:12</p>
     */
    @NameInMap("structure_modify_time")
    public String structureModifyTime;

    // 当前数据集是否包含敏感数据（表级别）
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("sens_status")
    public Boolean sensStatus;

    // 当前数据集在整个数据集级别的分类分级标签（表级别）
    /**
     * <strong>example:</strong>
     * <p>当前数据集在整个数据集级别的分类分级标签（表级别）</p>
     */
    @NameInMap("classification_label")
    public String classificationLabel;

    // 当前数据集敏感字段的数量
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("senesitive_col_num")
    public Long senesitiveColNum;

    // 当前数据集的数据量
    // 计算方式是数据行数 * 数据列数
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("data_size")
    public Long dataSize;

    // 当前数据集的敏感数据量计算方式是敏感字段数 * 数据行数
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("sensitive_data_size")
    public String sensitiveDataSize;

    // 数据集相关文档列表 接口文档等
    /**
     * <strong>example:</strong>
     * <p>数据集相关文档列表 接口文档等</p>
     */
    @NameInMap("related_document_list")
    public java.util.List<DataAssetDocumentInfo> relatedDocumentList;

    // 补充说明
    /**
     * <strong>example:</strong>
     * <p>补充说明</p>
     */
    @NameInMap("remark")
    public String remark;

    // 扩展信息
    /**
     * <strong>example:</strong>
     * <p>扩展信息</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    // 元信息类型，目前支持TABLE和HTTP两种
    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 其他元信息额外数据
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("meta_extra_info")
    public String metaExtraInfo;

    public static DataSetMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        DataSetMetaInfo self = new DataSetMetaInfo();
        return TeaModel.build(map, self);
    }

    public DataSetMetaInfo setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public DataSetMetaInfo setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
        return this;
    }
    public String getDataSetType() {
        return this.dataSetType;
    }

    public DataSetMetaInfo setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public DataSetMetaInfo setDataSetDesc(String dataSetDesc) {
        this.dataSetDesc = dataSetDesc;
        return this;
    }
    public String getDataSetDesc() {
        return this.dataSetDesc;
    }

    public DataSetMetaInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DataSetMetaInfo setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Long getColumnCount() {
        return this.columnCount;
    }

    public DataSetMetaInfo setRowCount(String rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public String getRowCount() {
        return this.rowCount;
    }

    public DataSetMetaInfo setDataStorageSize(Long dataStorageSize) {
        this.dataStorageSize = dataStorageSize;
        return this;
    }
    public Long getDataStorageSize() {
        return this.dataStorageSize;
    }

    public DataSetMetaInfo setStructureModifyTime(String structureModifyTime) {
        this.structureModifyTime = structureModifyTime;
        return this;
    }
    public String getStructureModifyTime() {
        return this.structureModifyTime;
    }

    public DataSetMetaInfo setSensStatus(Boolean sensStatus) {
        this.sensStatus = sensStatus;
        return this;
    }
    public Boolean getSensStatus() {
        return this.sensStatus;
    }

    public DataSetMetaInfo setClassificationLabel(String classificationLabel) {
        this.classificationLabel = classificationLabel;
        return this;
    }
    public String getClassificationLabel() {
        return this.classificationLabel;
    }

    public DataSetMetaInfo setSenesitiveColNum(Long senesitiveColNum) {
        this.senesitiveColNum = senesitiveColNum;
        return this;
    }
    public Long getSenesitiveColNum() {
        return this.senesitiveColNum;
    }

    public DataSetMetaInfo setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public DataSetMetaInfo setSensitiveDataSize(String sensitiveDataSize) {
        this.sensitiveDataSize = sensitiveDataSize;
        return this;
    }
    public String getSensitiveDataSize() {
        return this.sensitiveDataSize;
    }

    public DataSetMetaInfo setRelatedDocumentList(java.util.List<DataAssetDocumentInfo> relatedDocumentList) {
        this.relatedDocumentList = relatedDocumentList;
        return this;
    }
    public java.util.List<DataAssetDocumentInfo> getRelatedDocumentList() {
        return this.relatedDocumentList;
    }

    public DataSetMetaInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DataSetMetaInfo setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public DataSetMetaInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataSetMetaInfo setMetaExtraInfo(String metaExtraInfo) {
        this.metaExtraInfo = metaExtraInfo;
        return this;
    }
    public String getMetaExtraInfo() {
        return this.metaExtraInfo;
    }

}
