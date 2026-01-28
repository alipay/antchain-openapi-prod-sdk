// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ProduceFeatureResultObj extends TeaModel {
    // projectId
    /**
     * <strong>example:</strong>
     * <p>projectId</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // taskId
    /**
     * <strong>example:</strong>
     * <p>taskId</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // status
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // publishId
    /**
     * <strong>example:</strong>
     * <p>publishId</p>
     */
    @NameInMap("publish_id")
    public String publishId;

    // supplementId
    /**
     * <strong>example:</strong>
     * <p>supplementId</p>
     */
    @NameInMap("supplement_id")
    public String supplementId;

    // fileKey
    /**
     * <strong>example:</strong>
     * <p>fileKey</p>
     */
    @NameInMap("file_key")
    public String fileKey;

    // guid
    /**
     * <strong>example:</strong>
     * <p>guid</p>
     */
    @NameInMap("guid")
    public String guid;

    // partition
    /**
     * <strong>example:</strong>
     * <p>partition</p>
     */
    @NameInMap("partition")
    public String partition;

    public static ProduceFeatureResultObj build(java.util.Map<String, ?> map) throws Exception {
        ProduceFeatureResultObj self = new ProduceFeatureResultObj();
        return TeaModel.build(map, self);
    }

    public ProduceFeatureResultObj setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProduceFeatureResultObj setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ProduceFeatureResultObj setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ProduceFeatureResultObj setPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }
    public String getPublishId() {
        return this.publishId;
    }

    public ProduceFeatureResultObj setSupplementId(String supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public String getSupplementId() {
        return this.supplementId;
    }

    public ProduceFeatureResultObj setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ProduceFeatureResultObj setGuid(String guid) {
        this.guid = guid;
        return this;
    }
    public String getGuid() {
        return this.guid;
    }

    public ProduceFeatureResultObj setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
