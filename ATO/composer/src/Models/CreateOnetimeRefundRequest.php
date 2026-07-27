<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateOnetimeRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'refundRequestNo' => 'refund_request_no',
        'refundMoney' => 'refund_money',
        'refundReason' => 'refund_reason',
        'refundDivideTransOutInfoList' => 'refund_divide_trans_out_info_list',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('refundRequestNo', $this->refundRequestNo, true);
        Model::validateRequired('refundMoney', $this->refundMoney, true);
    }
    public function toMap() {
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
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }
        if (null !== $this->refundMoney) {
            $res['refund_money'] = $this->refundMoney;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        if (null !== $this->refundDivideTransOutInfoList) {
            $res['refund_divide_trans_out_info_list'] = $this->refundDivideTransOutInfoList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOnetimeRefundRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['refund_request_no'])){
            $model->refundRequestNo = $map['refund_request_no'];
        }
        if(isset($map['refund_money'])){
            $model->refundMoney = $map['refund_money'];
        }
        if(isset($map['refund_reason'])){
            $model->refundReason = $map['refund_reason'];
        }
        if(isset($map['refund_divide_trans_out_info_list'])){
            $model->refundDivideTransOutInfoList = $map['refund_divide_trans_out_info_list'];
        }
        return $model;
    }
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

    // 外部系统传入的退款请求号
    /**
     * @var string
     */
    public $refundRequestNo;

    // 本次请求的退款金额，单位为分
    // 1234=12.34元
    /**
     * @var int
     */
    public $refundMoney;

    // 退款原因
    /**
     * @var string
     */
    public $refundReason;

    // 退分账信息列表（最多支持10家分账方退分账信息），金额单位分
    /**
     * @var string
     */
    public $refundDivideTransOutInfoList;

}
