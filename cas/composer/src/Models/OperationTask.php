<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class OperationTask extends Model
{
    // id
    /**
     * @example 00001
     *
     * @var string
     */
    public $id;

    // computer id
    /**
     * @example 00001
     *
     * @var string
     */
    public $computerId;

    // computer ip
    /**
     * @example 11.167.13.98
     *
     * @var string
     */
    public $computerIp;

    // command
    /**
     * @example ls
     *
     * @var string
     */
    public $command;

    // 状态取值：INIT，PROCESSING，SUCCEEDED，FAILED，TIMEOUT，NOT_FOUND
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // errorCode
    /**
     * @example errorCode
     *
     * @var string
     */
    public $errorCode;

    // resultMsg
    /**
     * @example resultMsg
     *
     * @var string
     */
    public $resultMsg;
    protected $_name = [
        'id'         => 'id',
        'computerId' => 'computer_id',
        'computerIp' => 'computer_ip',
        'command'    => 'command',
        'status'     => 'status',
        'errorCode'  => 'error_code',
        'resultMsg'  => 'result_msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->computerId) {
            $res['computer_id'] = $this->computerId;
        }
        if (null !== $this->computerIp) {
            $res['computer_ip'] = $this->computerIp;
        }
        if (null !== $this->command) {
            $res['command'] = $this->command;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['computer_id'])) {
            $model->computerId = $map['computer_id'];
        }
        if (isset($map['computer_ip'])) {
            $model->computerIp = $map['computer_ip'];
        }
        if (isset($map['command'])) {
            $model->command = $map['command'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }

        return $model;
    }
}
