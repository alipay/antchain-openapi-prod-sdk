<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SaveBusinessDepositEncryptRequest extends Model
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

    // 业务链对应的bizId
    /**
     * @var string
     */
    public $bizId;

    // 要加密存储的内容
    /**
     * @var string
     */
    public $data;

    // 用户did地址
    /**
     * @var string
     */
    public $did;

    // 业务唯一id，只需要本用户的应用唯一即可，因为最终会与用户的accountId拼接起来
    /**
     * @var string
     */
    public $keyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'data'              => 'data',
        'did'               => 'did',
        'keyId'             => 'key_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBusinessDepositEncryptRequest
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }

        return $model;
    }
}
