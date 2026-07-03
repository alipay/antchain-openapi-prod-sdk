<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyDubbridgeInterestResultRequest extends Model
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

    // 请求流水号
    /**
     * @var string
     */
    public $requestId;

    // 权益流水号
    /**
     * @var string
     */
    public $interestNo;

    // 权益订单状态：NOT_CREATE 订单未创建
    // PAYED： 支付成功
    // APPLY： 已投保
    // REFUND：已注销（退款)
    // CANCEL: 已取消
    // REFUND_FAIL： 退款失败
    /**
     * @var string
     */
    public $orderStatus;

    // 用户授权状态：AGREE 同意
    // DISAGREE 不同意
    /**
     * @var string
     */
    public $userPermitStatus;

    // 公证状态：当需要公正时才返回公证结果
    // FINISH 已完成
    // UN_FINISH 未完成
    // PROCESSING 进行中
    /**
     * @var string
     */
    public $notaryStatus;

    // 权益价格，单位：元
    /**
     * @var string
     */
    public $interestPrice;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'interestNo'        => 'interest_no',
        'orderStatus'       => 'order_status',
        'userPermitStatus'  => 'user_permit_status',
        'notaryStatus'      => 'notary_status',
        'interestPrice'     => 'interest_price',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('userPermitStatus', $this->userPermitStatus, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->interestNo) {
            $res['interest_no'] = $this->interestNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->userPermitStatus) {
            $res['user_permit_status'] = $this->userPermitStatus;
        }
        if (null !== $this->notaryStatus) {
            $res['notary_status'] = $this->notaryStatus;
        }
        if (null !== $this->interestPrice) {
            $res['interest_price'] = $this->interestPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDubbridgeInterestResultRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['interest_no'])) {
            $model->interestNo = $map['interest_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['user_permit_status'])) {
            $model->userPermitStatus = $map['user_permit_status'];
        }
        if (isset($map['notary_status'])) {
            $model->notaryStatus = $map['notary_status'];
        }
        if (isset($map['interest_price'])) {
            $model->interestPrice = $map['interest_price'];
        }

        return $model;
    }
}
