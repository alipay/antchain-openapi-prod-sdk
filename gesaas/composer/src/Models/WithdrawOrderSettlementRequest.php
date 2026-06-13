<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawOrderSettlementRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 退分账金额，单位：分
    /**
     * @var int
     */
    public $refundAmount;

    // 分账单号
    /**
     * @var string
     */
    public $settleNo;

    // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
    /**
     * @var string
     */
    public $refundReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundAmount'      => 'refund_amount',
        'settleNo'          => 'settle_no',
        'refundReason'      => 'refund_reason',
    ];

    public function validate()
    {
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('settleNo', $this->settleNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->settleNo) {
            $res['settle_no'] = $this->settleNo;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawOrderSettlementRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['settle_no'])) {
            $model->settleNo = $map['settle_no'];
        }
        if (isset($map['refund_reason'])) {
            $model->refundReason = $map['refund_reason'];
        }

        return $model;
    }
}
