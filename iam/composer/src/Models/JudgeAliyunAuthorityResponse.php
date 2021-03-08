<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class JudgeAliyunAuthorityResponse extends Model
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

    // 权限校验是否通过
    /**
     * @var bool
     */
    public $result;

    // 失败原因
    /**
     * @var string
     */
    public $reason;

    // 解决方案
    /**
     * @var string
     */
    public $solution;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'result'     => 'result',
        'reason'     => 'reason',
        'solution'   => 'solution',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->solution) {
            $res['solution'] = $this->solution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAliyunAuthorityResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['solution'])) {
            $model->solution = $map['solution'];
        }

        return $model;
    }
}
