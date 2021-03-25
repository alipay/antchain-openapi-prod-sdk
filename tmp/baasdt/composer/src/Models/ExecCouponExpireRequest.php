<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCouponExpireRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 批次ID
    /**
     * @var string
     */
    public $collectionId;

    // 电子券ID
    /**
     * @var string
     */
    public $couponId;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'collectionId'      => 'collection_id',
        'couponId'          => 'coupon_id',
        'outTxId'           => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('couponId', $this->couponId, true);
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
        if (null !== $this->collectionId) {
            $res['collection_id'] = $this->collectionId;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecCouponExpireRequest
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
        if (isset($map['collection_id'])) {
            $model->collectionId = $map['collection_id'];
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
