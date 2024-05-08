<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class CheckNftAssetbyskuRequest extends Model
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

    // 鲸探用户ID标识，OpenApi场景使用的加密格式
    /**
     * @var string
     */
    public $openUserId;

    // 数字藏品类标识ID
    /**
     * @var int
     */
    public $skuId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openUserId'        => 'open_user_id',
        'skuId'             => 'sku_id',
    ];

    public function validate()
    {
        Model::validateRequired('openUserId', $this->openUserId, true);
        Model::validateRequired('skuId', $this->skuId, true);
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
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckNftAssetbyskuRequest
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
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }

        return $model;
    }
}
