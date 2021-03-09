<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceComputerResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 0表示正常，非0表示异常
    /**
     * @var int
     */
    public $retCode;

    // 错误描述信息
    /**
     * @var string
     */
    public $message;

    // 异步执行任务id
    /**
     * @var string
     */
    public $jobId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'retCode'    => 'ret_code',
        'message'    => 'message',
        'jobId'      => 'job_id',
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
        if (null !== $this->retCode) {
            $res['ret_code'] = $this->retCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceComputerResponse
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
        if (isset($map['ret_code'])) {
            $model->retCode = $map['ret_code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['job_id'])) {
            $model->jobId = $map['job_id'];
        }

        return $model;
    }
}
