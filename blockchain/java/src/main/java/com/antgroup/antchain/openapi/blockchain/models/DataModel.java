// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DataModel extends TeaModel {
    // 业务系统唯一标示
    @NameInMap("biz_uid")
    public String bizUid;

    // 空间ID
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 数据模型描述
    @NameInMap("description")
    public String description;

    // 模型字段详细信息
    @NameInMap("field_detail")
    @Validation(required = true)
    public String fieldDetail;

    // 数据模型业务ID
    @NameInMap("model_biz_id")
    public String modelBizId;

    // 数据模型ID
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 数据模型名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 提交人
    @NameInMap("submitter")
    @Validation(required = true)
    public Participant submitter;

    // 更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    // 状态
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
