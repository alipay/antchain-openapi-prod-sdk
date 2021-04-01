<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyPfConfirmationResponse extends Model
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

    // 融资提款确认书 hash
    //
    /**
     * @var string
     */
    public $confirmationHash;

    // 融资提款确认书 OSSkey
    //
    //
    /**
     * @var string
     */
    public $confirmationOssKey;

    // 贷款起始日期，格式：yyyyMMdd
    //
    //
    /**
     * @var string
     */
    public $loanStartTime;

    // 贷款到期日期，格式：yyyyMMdd
    //
    //
    /**
     * @var string
     */
    public $loanEndTime;

    // 还款方式
    //
    //
    /**
     * @var string
     */
    public $repayment;

    // 贷款利率
    /**
     * @var string
     */
    public $etrdLnIntRt;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'confirmationHash'   => 'confirmation_hash',
        'confirmationOssKey' => 'confirmation_oss_key',
        'loanStartTime'      => 'loan_start_time',
        'loanEndTime'        => 'loan_end_time',
        'repayment'          => 'repayment',
        'etrdLnIntRt'        => 'etrd_ln_int_rt',
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
        if (null !== $this->confirmationHash) {
            $res['confirmation_hash'] = $this->confirmationHash;
        }
        if (null !== $this->confirmationOssKey) {
            $res['confirmation_oss_key'] = $this->confirmationOssKey;
        }
        if (null !== $this->loanStartTime) {
            $res['loan_start_time'] = $this->loanStartTime;
        }
        if (null !== $this->loanEndTime) {
            $res['loan_end_time'] = $this->loanEndTime;
        }
        if (null !== $this->repayment) {
            $res['repayment'] = $this->repayment;
        }
        if (null !== $this->etrdLnIntRt) {
            $res['etrd_ln_int_rt'] = $this->etrdLnIntRt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPfConfirmationResponse
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
        if (isset($map['confirmation_hash'])) {
            $model->confirmationHash = $map['confirmation_hash'];
        }
        if (isset($map['confirmation_oss_key'])) {
            $model->confirmationOssKey = $map['confirmation_oss_key'];
        }
        if (isset($map['loan_start_time'])) {
            $model->loanStartTime = $map['loan_start_time'];
        }
        if (isset($map['loan_end_time'])) {
            $model->loanEndTime = $map['loan_end_time'];
        }
        if (isset($map['repayment'])) {
            $model->repayment = $map['repayment'];
        }
        if (isset($map['etrd_ln_int_rt'])) {
            $model->etrdLnIntRt = $map['etrd_ln_int_rt'];
        }

        return $model;
    }
}
