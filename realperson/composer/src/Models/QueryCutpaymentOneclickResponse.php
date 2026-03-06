<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentOneclickResponse extends Model
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

    // 签约协议号
    /**
     * @var string
     */
    public $protocolNo;

    // 银行卡识别码
    /**
     * @var string
     */
    public $sgnAcc;

    // 账户信息
    /**
     * @var AccInfo
     */
    public $accInfo;

    // 银行编号
    /**
     * @var string
     */
    public $bankCode;

    // 银行名称
    /**
     * @var string
     */
    public $bankName;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'protocolNo' => 'protocol_no',
        'sgnAcc'     => 'sgn_acc',
        'accInfo'    => 'acc_info',
        'bankCode'   => 'bank_code',
        'bankName'   => 'bank_name',
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
        if (null !== $this->protocolNo) {
            $res['protocol_no'] = $this->protocolNo;
        }
        if (null !== $this->sgnAcc) {
            $res['sgn_acc'] = $this->sgnAcc;
        }
        if (null !== $this->accInfo) {
            $res['acc_info'] = null !== $this->accInfo ? $this->accInfo->toMap() : null;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentOneclickResponse
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
        if (isset($map['protocol_no'])) {
            $model->protocolNo = $map['protocol_no'];
        }
        if (isset($map['sgn_acc'])) {
            $model->sgnAcc = $map['sgn_acc'];
        }
        if (isset($map['acc_info'])) {
            $model->accInfo = AccInfo::fromMap($map['acc_info']);
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }

        return $model;
    }
}
