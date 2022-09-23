<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelLeaseInsuranceResponse extends Model
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

    // 退保状态：CALCE_FAIL退保失败、CACEL_SUCCESS退保成功、CANCELING退保中
    /**
     * @var string
     */
    public $status;

    // 退保保单号
    /**
     * @var string
     */
    public $policyNo;

    // 是否为实收保单退保：ture实收退保，涉及实体账户退费；false未实收退保，不涉及账户退费；
    /**
     * @var string
     */
    public $repayFlag;

    // 退还保费，单位：分
    /**
     * @var string
     */
    public $srdPremium;

    // 结果码
    /**
     * @var string
     */
    public $code;

    // 结果描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'status'     => 'status',
        'policyNo'   => 'policy_no',
        'repayFlag'  => 'repay_flag',
        'srdPremium' => 'srd_premium',
        'code'       => 'code',
        'message'    => 'message',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->repayFlag) {
            $res['repay_flag'] = $this->repayFlag;
        }
        if (null !== $this->srdPremium) {
            $res['srd_premium'] = $this->srdPremium;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelLeaseInsuranceResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['repay_flag'])) {
            $model->repayFlag = $map['repay_flag'];
        }
        if (isset($map['srd_premium'])) {
            $model->srdPremium = $map['srd_premium'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
