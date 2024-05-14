<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoWithholdRefundRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 几期
    // 针对用户履约的第几期进行退款申请
    /**
     * @var int
     */
    public $periodNum;

    // 外部系统传入的退款请求号
    /**
     * @var string
     */
    public $refundRequestNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'periodNum'         => 'period_num',
        'refundRequestNo'   => 'refund_request_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('refundRequestNo', $this->refundRequestNo, true);
        Model::validateMaxLength('orderId', $this->orderId, 128);
        Model::validateMaxLength('refundRequestNo', $this->refundRequestNo, 128);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('refundRequestNo', $this->refundRequestNo, 1);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoWithholdRefundRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['refund_request_no'])) {
            $model->refundRequestNo = $map['refund_request_no'];
        }

        return $model;
    }
}
