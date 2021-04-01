<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SaveBusinessDepositMetadataRequest extends Model
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

    // 业务链对应的bizId
    //
    /**
     * @var string
     */
    public $bizId;

    // 具体存证的内容
    /**
     * @var DepositMetaDataItem[]
     */
    public $data;

    // 用户的did地址
    /**
     * @var string
     */
    public $did;

    // 用户自定义唯一keyId，可用该keyId到业务服务中查询存证内容
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
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return SaveBusinessDepositMetadataRequest
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
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? DepositMetaDataItem::fromMap($item) : $item;
                }
            }
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
