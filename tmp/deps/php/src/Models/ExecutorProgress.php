<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ExecutorProgress extends Model {
    protected $_name = [
        'requestId' => 'request_id',
        'requestIds' => 'request_ids',
        'status' => 'status',
        'resultMsg' => 'result_msg',
    ];
    public function validate() {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->requestIds) {
            $res['request_ids'] = $this->requestIds;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecutorProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['request_ids'])){
            if(!empty($map['request_ids'])){
                $model->requestIds = $map['request_ids'];
            }
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        return $model;
    }
    // 请求 ID
    /**
     * @example 123
     * @var string
     */
    public $requestId;

    // 请求 ID 列表
    /**
     * @example 
     * @var string[]
     */
    public $requestIds;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $status;

    // 错误信息
    /**
     * @example rpc error
     * @var string
     */
    public $resultMsg;

}
