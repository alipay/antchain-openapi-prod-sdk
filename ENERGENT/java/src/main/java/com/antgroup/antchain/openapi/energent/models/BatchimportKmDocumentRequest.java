// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class BatchimportKmDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 挂载目标节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 任务扩展号
    @NameInMap("task_ext")
    public String taskExt;

    // 待入库文件列表(files.1.file_name点号形式)
    @NameInMap("files")
    @Validation(required = true)
    public java.util.List<KbUploadFileItem> files;

    public static BatchimportKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchimportKmDocumentRequest self = new BatchimportKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public BatchimportKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchimportKmDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchimportKmDocumentRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public BatchimportKmDocumentRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public BatchimportKmDocumentRequest setTaskExt(String taskExt) {
        this.taskExt = taskExt;
        return this;
    }
    public String getTaskExt() {
        return this.taskExt;
    }

    public BatchimportKmDocumentRequest setFiles(java.util.List<KbUploadFileItem> files) {
        this.files = files;
        return this;
    }
    public java.util.List<KbUploadFileItem> getFiles() {
        return this.files;
    }

}
