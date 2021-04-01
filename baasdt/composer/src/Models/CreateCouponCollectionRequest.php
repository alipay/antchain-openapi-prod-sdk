<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateCouponCollectionRequest extends Model
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

    // 批次ID
    /**
     * @var string
     */
    public $collectionId;

    // 电子券前缀
    /**
     * @var string
     */
    public $couponNumberPrefix;

    // 批次创建者
    /**
     * @var string
     */
    public $issuer;

    // 批次名称
    /**
     * @var string
     */
    public $name;

    // 是否创建时就记名
    /**
     * @var bool
     */
    public $needPreRegistered;

    // 是否记名电子券
    /**
     * @var bool
     */
    public $needRegistered;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'chainId'            => 'chain_id',
        'collectionId'       => 'collection_id',
        'couponNumberPrefix' => 'coupon_number_prefix',
        'issuer'             => 'issuer',
        'name'               => 'name',
        'needPreRegistered'  => 'need_pre_registered',
        'needRegistered'     => 'need_registered',
        'outTxId'            => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('couponNumberPrefix', $this->couponNumberPrefix, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('needPreRegistered', $this->needPreRegistered, true);
        Model::validateRequired('needRegistered', $this->needRegistered, true);
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
        if (null !== $this->couponNumberPrefix) {
            $res['coupon_number_prefix'] = $this->couponNumberPrefix;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->needPreRegistered) {
            $res['need_pre_registered'] = $this->needPreRegistered;
        }
        if (null !== $this->needRegistered) {
            $res['need_registered'] = $this->needRegistered;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCouponCollectionRequest
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
        if (isset($map['coupon_number_prefix'])) {
            $model->couponNumberPrefix = $map['coupon_number_prefix'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['need_pre_registered'])) {
            $model->needPreRegistered = $map['need_pre_registered'];
        }
        if (isset($map['need_registered'])) {
            $model->needRegistered = $map['need_registered'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
