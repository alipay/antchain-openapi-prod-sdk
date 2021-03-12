<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CancelBusinessDepositGrantcorpRequest extends Model
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

    // 数据存证所在链的业务id
    /**
     * @var string
     */
    public $bizId;

    // 存证数据的发起者did数字身份
    /**
     * @var string
     */
    public $did;

    // 取消授权的组织名称
    /**
     * @var string
     */
    public $grantedCorp;

    // 取消授权的子列名称
    /**
     * @var string[]
     */
    public $itemKeyId;

    // 存证数据的逻辑主keyId
    /**
     * @var string
     */
    public $keyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'did'               => 'did',
        'grantedCorp'       => 'granted_corp',
        'itemKeyId'         => 'item_key_id',
        'keyId'             => 'key_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('grantedCorp', $this->grantedCorp, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->grantedCorp) {
            $res['granted_corp'] = $this->grantedCorp;
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
     * @return CancelBusinessDepositGrantcorpRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['granted_corp'])) {
            $model->grantedCorp = $map['granted_corp'];
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
