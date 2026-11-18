<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportCustomerRealtimeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'taskId' => 'task_id',
        'custInfo' => 'cust_info',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('custInfo', $this->custInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->custInfo) {
            $res['cust_info'] = $this->custInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportCustomerRealtimeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['cust_info'])){
            if(!empty($map['cust_info'])){
                $model->custInfo = $map['cust_info'];
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

    // 批次幂等键（≤64 字符)
    /**
     * @var string
     */
    public $requestId;

    // 挂靠的任务 ID
    /**
     * @var string
     */
    public $taskId;

    // 名单行 JSON 数组，每个元素为一名单行 JSON 字符串
    /**
     * @var string[]
     */
    public $custInfo;

}
