<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportTaskBatchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo' => 'batch_no',
        'list' => 'list',
        'taskId' => 'task_id',
    ];
    public function validate() {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('list', $this->list, true);
        Model::validateRequired('taskId', $this->taskId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->list) {
            $res['list'] = $this->list;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportTaskBatchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['batch_no'])){
            $model->batchNo = $map['batch_no'];
        }
        if(isset($map['list'])){
            if(!empty($map['list'])){
                $model->list = $map['list'];
            }
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
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

    // 批次号
    /**
     * @var string
     */
    public $batchNo;

    // 导入名单列表
    /**
     * @var string[]
     */
    public $list;

    // 任务id
    /**
     * @var string
     */
    public $taskId;

}
