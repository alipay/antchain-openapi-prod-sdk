<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CancelBusinessDepositGrantdidRequest extends Model
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

    // 存证数据的发起者did身份
    /**
     * @var string
     */
    public $did;

    // 取消授权的did数字身份
    /**
     * @var string
     */
    public $grantedDid;

    // 取消授权的字段名称
    /**
     * @var string[]
     */
    public $itemKeyId;

    // 存证数据的主键
    /**
     * @var string
     */
    public $keyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'grantedDid'        => 'granted_did',
        'itemKeyId'         => 'item_key_id',
        'keyId'             => 'key_id',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('grantedDid', $this->grantedDid, true);
        Model::validateRequired('itemKeyId', $this->itemKeyId, true);
        Model::validateRequired('keyId', $this->keyId, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->grantedDid) {
            $res['granted_did'] = $this->grantedDid;
        }
        if (null !== $this->itemKeyId) {
            $res['item_key_id'] = $this->itemKeyId;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelBusinessDepositGrantdidRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['granted_did'])) {
            $model->grantedDid = $map['granted_did'];
        }
        if (isset($map['item_key_id'])) {
            if (!empty($map['item_key_id'])) {
                $model->itemKeyId = $map['item_key_id'];
            }
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }

        return $model;
    }
}
