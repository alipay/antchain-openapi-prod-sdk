<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateCouponListRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 电子券创建参数列表
    /**
     * @var CouponCreate[]
     */
    public $coupons;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'coupons'           => 'coupons',
        'outTxId'           => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('coupons', $this->coupons, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->coupons) {
            $res['coupons'] = [];
            if (null !== $this->coupons && \is_array($this->coupons)) {
                $n = 0;
                foreach ($this->coupons as $item) {
                    $res['coupons'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCouponListRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['coupons'])) {
            if (!empty($map['coupons'])) {
                $model->coupons = [];
                $n              = 0;
                foreach ($map['coupons'] as $item) {
                    $model->coupons[$n++] = null !== $item ? CouponCreate::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
