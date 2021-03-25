<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCouponSignRequest extends Model
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

    // 电子券批次ID
    /**
     * @var string
     */
    public $collectionId;

    // 电子券ID
    /**
     * @var string
     */
    public $couponId;

    // 脱敏用户ID
    /**
     * @var string
     */
    public $desensitizedUid;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;

    // 用户公钥
    /**
     * @var string
     */
    public $uidPublicKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'collectionId'      => 'collection_id',
        'couponId'          => 'coupon_id',
        'desensitizedUid'   => 'desensitized_uid',
        'outTxId'           => 'out_tx_id',
        'uidPublicKey'      => 'uid_public_key',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('couponId', $this->couponId, true);
        Model::validateRequired('desensitizedUid', $this->desensitizedUid, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('uidPublicKey', $this->uidPublicKey, true);
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
        if (null !== $this->desensitizedUid) {
            $res['desensitized_uid'] = $this->desensitizedUid;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->uidPublicKey) {
            $res['uid_public_key'] = $this->uidPublicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecCouponSignRequest
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
        if (isset($map['desensitized_uid'])) {
            $model->desensitizedUid = $map['desensitized_uid'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['uid_public_key'])) {
            $model->uidPublicKey = $map['uid_public_key'];
        }

        return $model;
    }
}
