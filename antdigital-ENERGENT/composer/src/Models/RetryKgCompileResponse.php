<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class RetryKgCompileResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'kbId' => 'kb_id',
        'documentId' => 'document_id',
        'status' => 'status',
        'retryCount' => 'retry_count',
        'progress' => 'progress',
        'failedReason' => 'failed_reason',
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
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->retryCount) {
            $res['retry_count'] = $this->retryCount;
        }
        if (null !== $this->progress) {
            $res['progress'] = $this->progress;
        }
        if (null !== $this->failedReason) {
            $res['failed_reason'] = $this->failedReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetryKgCompileResponse
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
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['document_id'])){
            $model->documentId = $map['document_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['retry_count'])){
            $model->retryCount = $map['retry_count'];
        }
        if(isset($map['progress'])){
            $model->progress = $map['progress'];
        }
        if(isset($map['failed_reason'])){
            $model->failedReason = $map['failed_reason'];
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

    // 编译任务ID
    /**
     * @var string
     */
    public $taskId;

    // 知识库ID
    /**
     * @var string
     */
    public $kbId;

    // 关联文档ID
    /**
     * @var string
     */
    public $documentId;

    // 任务状态
    /**
     * @var string
     */
    public $status;

    // 已重试次数
    /**
     * @var int
     */
    public $retryCount;

    // 任务进度
    /**
     * @var int
     */
    public $progress;

    // 失败原因
    /**
     * @var string
     */
    public $failedReason;

}
