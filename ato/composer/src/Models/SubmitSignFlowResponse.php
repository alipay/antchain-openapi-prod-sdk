<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitSignFlowResponse extends Model
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

    // 签署合同单号
    /**
     * @var string
     */
    public $signNo;

    // 电子签署流程ID
    /**
     * @var string
     */
    public $flowId;

    // 签署用户ID
    /**
     * @var string
     */
    public $accountId;

    // 签署附加信息，用于获取签署链接等。JSON格式的字符串。
    /**
     * @var string
     */
    public $signInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'signNo'     => 'sign_no',
        'flowId'     => 'flow_id',
        'accountId'  => 'account_id',
        'signInfo'   => 'sign_info',
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
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->signInfo) {
            $res['sign_info'] = $this->signInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitSignFlowResponse
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
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['sign_info'])) {
            $model->signInfo = $map['sign_info'];
        }

        return $model;
    }
}
