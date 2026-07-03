<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeInstallmentTrialResponse extends Model
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

    // 授信额度
    /**
     * @var string
     */
    public $creditAmount;

    // 可用额度
    /**
     * @var string
     */
    public $restAmount;

    // 期数费用列表
    /**
     * @var InstallmentTrial[]
     */
    public $installmentList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'creditAmount'    => 'credit_amount',
        'restAmount'      => 'rest_amount',
        'installmentList' => 'installment_list',
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
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->installmentList) {
            $res['installment_list'] = [];
            if (null !== $this->installmentList && \is_array($this->installmentList)) {
                $n = 0;
                foreach ($this->installmentList as $item) {
                    $res['installment_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeInstallmentTrialResponse
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
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['installment_list'])) {
            if (!empty($map['installment_list'])) {
                $model->installmentList = [];
                $n                      = 0;
                foreach ($map['installment_list'] as $item) {
                    $model->installmentList[$n++] = null !== $item ? InstallmentTrial::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
