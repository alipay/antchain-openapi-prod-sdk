<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class RefundInfo extends Model {
    protected $_name = [
        'outRequestNo' => 'out_request_no',
        'refundAmount' => 'refund_amount',
        'refundStatus' => 'refund_status',
    ];
    public function validate() {
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('refundStatus', $this->refundStatus, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RefundInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['out_request_no'])){
            $model->outRequestNo = $map['out_request_no'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
        }
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
        }
        return $model;
    }
    // 退款业务号
    /**
     * @example XXX
     * @var string
     */
    public $outRequestNo;

    // 本次退款金额
    /**
     * @example 11.09
     * @var string
     */
    public $refundAmount;

    // 退款状态
    /**
     * @example XXX
     * @var string
     */
    public $refundStatus;

}
