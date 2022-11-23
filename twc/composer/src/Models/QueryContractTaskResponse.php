<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractTaskResponse extends Model
{
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

    // 任务类型,FILE_DECRYPT_ESIGN_UPLOAD
    /**
     * @var string
     */
    public $taskType;

    // 任务结果
    // INIT,初始化
    // DOING，处理中
    // FAIL，失败
    // SUCCESS，成功
    /**
     * @var string
     */
    public $taskStatus;

    // 当任务为FILE_DECRYPT_ESIGN_UPLOAD时，为处理成功后的文件id
    /**
     * @var string
     */
    public $taskResult;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'taskType'   => 'task_type',
        'taskStatus' => 'task_status',
        'taskResult' => 'task_result',
        'failReason' => 'fail_reason',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->taskResult) {
            $res['task_result'] = $this->taskResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractTaskResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['task_result'])) {
            $model->taskResult = $map['task_result'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
