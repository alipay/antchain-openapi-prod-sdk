<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyInterestSupplierorderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求流水号，每次唯一
    /**
     * @var string
     */
    public $requestNo;

    // 贵方订单号
    /**
     * @var string
     */
    public $orderNo;

    // 我方权益编号
    /**
     * @var string
     */
    public $interestNo;

    // 用户授权状态
    /**
     * @var string
     */
    public $userPermitStatus;

    // 权益订单状态
    /**
     * @var string
     */
    public $orderStatus;

    // 退款金额，单位元
    /**
     * @var string
     */
    public $refundAmount;

    // 退款时间
    /**
     * @var string
     */
    public $refundTime;

    // 公证状态
    /**
     * @var string
     */
    public $notaryStatus;
    protected $_name = [
        'authToken'        => 'auth_token',
        'requestNo'        => 'request_no',
        'orderNo'          => 'order_no',
        'interestNo'       => 'interest_no',
        'userPermitStatus' => 'user_permit_status',
        'orderStatus'      => 'order_status',
        'refundAmount'     => 'refund_amount',
        'refundTime'       => 'refund_time',
        'notaryStatus'     => 'notary_status',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
        Model::validateRequired('userPermitStatus', $this->userPermitStatus, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->interestNo) {
            $res['interest_no'] = $this->interestNo;
        }
        if (null !== $this->userPermitStatus) {
            $res['user_permit_status'] = $this->userPermitStatus;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundTime) {
            $res['refund_time'] = $this->refundTime;
        }
        if (null !== $this->notaryStatus) {
            $res['notary_status'] = $this->notaryStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyInterestSupplierorderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['interest_no'])) {
            $model->interestNo = $map['interest_no'];
        }
        if (isset($map['user_permit_status'])) {
            $model->userPermitStatus = $map['user_permit_status'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['refund_time'])) {
            $model->refundTime = $map['refund_time'];
        }
        if (isset($map['notary_status'])) {
            $model->notaryStatus = $map['notary_status'];
        }

        return $model;
    }
}
