<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryAdvisormarketAnalysisRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId' => 'task_id',
        'type' => 'type',
        'taskStatus' => 'task_status',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAdvisormarketAnalysisRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['task_status'])){
            $model->taskStatus = $map['task_status'];
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

    // 创建接口返回的任务 ID。type=result 时必填；type=status 时用于精确查询，不能与 task_status 同时传入。
    /**
     * @var string
     */
    public $taskId;

    // 查询模式。status 查询状态或任务列表；result 查询指定成功任务的结果下载地址。可选值：status、result。
    /**
     * @var string
     */
    public $type;

    // 状态列表筛选条件，仅在 type=status 且未传 task_id 时使用。可选值：QUEUED、PROCESSING、SUCCESS、FAILED；不要传 CLOSED。
    /**
     * @var string
     */
    public $taskStatus;

}
