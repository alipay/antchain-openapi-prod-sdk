<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeLoanLxResponse extends Model
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

    // 放款结果，
    // 0:放款成功
    // 1:放款失败
    // 2.查无此单
    // 99:处理中
    /**
     * @var int
     */
    public $loanResult;

    // 放款结果描述，失败时，需给出的错误描述
    /**
     * @var string
     */
    public $msg;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'loanResult' => 'loan_result',
        'msg'        => 'msg',
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
        if (null !== $this->loanResult) {
            $res['loan_result'] = $this->loanResult;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeLoanLxResponse
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
        if (isset($map['loan_result'])) {
            $model->loanResult = $map['loan_result'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
