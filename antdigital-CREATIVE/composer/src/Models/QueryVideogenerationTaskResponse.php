<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class QueryVideogenerationTaskResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'status' => 'status',
        'model' => 'model',
        'errorCode' => 'error_code',
        'errorMessage' => 'error_message',
        'id' => 'id',
        'originalSnapshot' => 'original_snapshot',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->originalSnapshot) {
            $res['original_snapshot'] = $this->originalSnapshot;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryVideogenerationTaskResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['original_snapshot'])){
            $model->originalSnapshot = $map['original_snapshot'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 任务id
    /**
     * @var string
     */
    public $taskId;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 模型
    /**
     * @var string
     */
    public $model;

    // 错误原因编码
    /**
     * @var string
     */
    public $errorCode;

    // 错误原因详情
    /**
     * @var string
     */
    public $errorMessage;

    // 供应商任务id
    /**
     * @var string
     */
    public $id;

    // 供应商原始快照
    /**
     * @var string
     */
    public $originalSnapshot;

}
