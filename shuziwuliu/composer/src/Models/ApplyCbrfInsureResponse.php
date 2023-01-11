<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyCbrfInsureResponse extends Model
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

    // 投保响应编码
    //
    /**
     * @var string
     */
    public $insuredReceiptNo;

    // 投保时的标的订单号
    /**
     * @var string
     */
    public $relatedOrderNo;

    // 保司出具的保单编号
    //
    /**
     * @var string
     */
    public $policyNo;

    // 返回时间
    //
    /**
     * @var string
     */
    public $responseTime;

    // 幂等标识；true:幂等结果；false: 非幂等结果
    //
    /**
     * @var bool
     */
    public $idemFlag;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'insuredReceiptNo' => 'insured_receipt_no',
        'relatedOrderNo'   => 'related_order_no',
        'policyNo'         => 'policy_no',
        'responseTime'     => 'response_time',
        'idemFlag'         => 'idem_flag',
    ];

    public function validate()
    {
        Model::validatePattern('responseTime', $this->responseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->insuredReceiptNo) {
            $res['insured_receipt_no'] = $this->insuredReceiptNo;
        }
        if (null !== $this->relatedOrderNo) {
            $res['related_order_no'] = $this->relatedOrderNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->responseTime) {
            $res['response_time'] = $this->responseTime;
        }
        if (null !== $this->idemFlag) {
            $res['idem_flag'] = $this->idemFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCbrfInsureResponse
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
        if (isset($map['insured_receipt_no'])) {
            $model->insuredReceiptNo = $map['insured_receipt_no'];
        }
        if (isset($map['related_order_no'])) {
            $model->relatedOrderNo = $map['related_order_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['response_time'])) {
            $model->responseTime = $map['response_time'];
        }
        if (isset($map['idem_flag'])) {
            $model->idemFlag = $map['idem_flag'];
        }

        return $model;
    }
}
