<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntchainAtoTradeUserpromiseRequest extends Model
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

    // 商家社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 修改的用户履约期数
    /**
     * @var int
     */
    public $termIdx;

    // 更新后的租金，单位为分
    // 1234=12.34元
    /**
     * @var int
     */
    public $updatedRentalMoney;

    // 调整原因，枚举
    // ● A01 : 违章罚金
    // ● A02 : 水电煤费用
    /**
     * @var string
     */
    public $reason;

    // 调整说明，本说明同步到支付宝账户备注中，需准确填写
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderId'            => 'order_id',
        'merchantId'         => 'merchant_id',
        'termIdx'            => 'term_idx',
        'updatedRentalMoney' => 'updated_rental_money',
        'reason'             => 'reason',
        'desc'               => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('termIdx', $this->termIdx, true);
        Model::validateRequired('updatedRentalMoney', $this->updatedRentalMoney, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('merchantId', $this->merchantId, 199);
        Model::validateMaxLength('reason', $this->reason, 10);
        Model::validateMaxLength('desc', $this->desc, 64);
        Model::validateMinLength('orderId', $this->orderId, 6);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('reason', $this->reason, 1);
        Model::validateMinLength('desc', $this->desc, 1);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->termIdx) {
            $res['term_idx'] = $this->termIdx;
        }
        if (null !== $this->updatedRentalMoney) {
            $res['updated_rental_money'] = $this->updatedRentalMoney;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAntchainAtoTradeUserpromiseRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['term_idx'])) {
            $model->termIdx = $map['term_idx'];
        }
        if (isset($map['updated_rental_money'])) {
            $model->updatedRentalMoney = $map['updated_rental_money'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
