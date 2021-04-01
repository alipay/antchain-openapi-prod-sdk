<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCouponTransferRequest extends Model
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

    // 原始持有用户公钥对应的私钥，对outBizId的签名
    /**
     * @var string
     */
    public $originUidPublicKeySign;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;

    // 要转让的目标用户脱敏ID
    /**
     * @var string
     */
    public $transferDesensitizedUid;

    // 要转让的目标用户公钥
    /**
     * @var string
     */
    public $transferUidPublicKey;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'chainId'                 => 'chain_id',
        'collectionId'            => 'collection_id',
        'couponId'                => 'coupon_id',
        'originUidPublicKeySign'  => 'origin_uid_public_key_sign',
        'outTxId'                 => 'out_tx_id',
        'transferDesensitizedUid' => 'transfer_desensitized_uid',
        'transferUidPublicKey'    => 'transfer_uid_public_key',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('collectionId', $this->collectionId, true);
        Model::validateRequired('couponId', $this->couponId, true);
        Model::validateRequired('originUidPublicKeySign', $this->originUidPublicKeySign, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('transferDesensitizedUid', $this->transferDesensitizedUid, true);
        Model::validateRequired('transferUidPublicKey', $this->transferUidPublicKey, true);
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
        if (null !== $this->originUidPublicKeySign) {
            $res['origin_uid_public_key_sign'] = $this->originUidPublicKeySign;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->transferDesensitizedUid) {
            $res['transfer_desensitized_uid'] = $this->transferDesensitizedUid;
        }
        if (null !== $this->transferUidPublicKey) {
            $res['transfer_uid_public_key'] = $this->transferUidPublicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecCouponTransferRequest
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
        if (isset($map['origin_uid_public_key_sign'])) {
            $model->originUidPublicKeySign = $map['origin_uid_public_key_sign'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['transfer_desensitized_uid'])) {
            $model->transferDesensitizedUid = $map['transfer_desensitized_uid'];
        }
        if (isset($map['transfer_uid_public_key'])) {
            $model->transferUidPublicKey = $map['transfer_uid_public_key'];
        }

        return $model;
    }
}
