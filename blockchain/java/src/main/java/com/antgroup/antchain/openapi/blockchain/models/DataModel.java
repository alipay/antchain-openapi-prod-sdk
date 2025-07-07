// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DataModel extends TeaModel {
    // 业务系统唯一标示
    /**
     * <strong>example:</strong>
     * <p>3fc223617da9a17a4d7792ef0c3f57bd176ec</p>
     */
    @NameInMap("biz_uid")
    public String bizUid;

    // 空间ID
    /**
     * <strong>example:</strong>
     * <p>space1</p>
     */
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1595574776000</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 数据模型描述
    /**
     * <strong>example:</strong>
     * <p>这是一个描述信息</p>
     */
    @NameInMap("description")
    public String description;

    // 模型字段详细信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;organization&quot;:&quot;test&quot;,&quot;company&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("field_detail")
    @Validation(required = true)
    public String fieldDetail;

    // 数据模型业务ID
    /**
     * <strong>example:</strong>
     * <p>model_company_data</p>
     */
    @NameInMap("model_biz_id")
    public String modelBizId;

    // 数据模型ID
    /**
     * <strong>example:</strong>
     * <p>DATA_MODEL_123</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 数据模型名称
    /**
     * <strong>example:</strong>
     * <p>税务信息模型</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 提交人
    @NameInMap("submitter")
    @Validation(required = true)
    public Participant submitter;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1595574776000</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static DataModel build(java.util.Map<String, ?> map) throws Exception {
        DataModel self = new DataModel();
        return TeaModel.build(map, self);
    }

    public DataModel setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public DataModel setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DataModel setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DataModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataModel setFieldDetail(String fieldDetail) {
        this.fieldDetail = fieldDetail;
        return this;
    }
    public String getFieldDetail() {
        return this.fieldDetail;
    }

    public DataModel setModelBizId(String modelBizId) {
        this.modelBizId = modelBizId;
        return this;
    }
    public String getModelBizId() {
        return this.modelBizId;
    }

    public DataModel setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DataModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataModel setSubmitter(Participant submitter) {
        this.submitter = submitter;
        return this;
    }
    public Participant getSubmitter() {
        return this.submitter;
    }

    public DataModel setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public DataModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
