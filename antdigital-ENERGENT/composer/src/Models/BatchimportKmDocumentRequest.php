<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGENT\Models\KbUploadFileItem;

class BatchimportKmDocumentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'treeId' => 'tree_id',
        'nodeId' => 'node_id',
        'taskExt' => 'task_ext',
        'files' => 'files',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('files', $this->files, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->taskExt) {
            $res['task_ext'] = $this->taskExt;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if(null !== $this->files && is_array($this->files)){
                $n = 0;
                foreach($this->files as $item){
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BatchimportKmDocumentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['task_ext'])){
            $model->taskExt = $map['task_ext'];
        }
        if(isset($map['files'])){
            if(!empty($map['files'])){
                $model->files = [];
                $n = 0;
                foreach($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? KbUploadFileItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 知识库ID
    /**
     * @var string
     */
    public $treeId;

    // 挂载目标节点ID
    /**
     * @var string
     */
    public $nodeId;

    // 任务扩展号
    /**
     * @var string
     */
    public $taskExt;

    // 待入库文件列表(files.1.file_name点号形式)
    /**
     * @var KbUploadFileItem[]
     */
    public $files;

}
