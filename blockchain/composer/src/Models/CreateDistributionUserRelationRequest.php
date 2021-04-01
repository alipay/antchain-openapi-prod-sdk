<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributionUserRelationRequest extends Model
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

    // 上级用户唯一标识
    /**
     * @var string
     */
    public $fromUserId;

    // 商品唯一标识
    /**
     * @var string
     */
    public $itemId;

    // 商户唯一标识
    /**
     * @var string
     */
    public $shopId;

    // 来源，微信朋友圈/微信小程序/支付宝小程序/H5/商户自有APP/其他
    /**
     * @var string
     */
    public $source;

    // 用户唯一标识
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fromUserId'        => 'from_user_id',
        'itemId'            => 'item_id',
        'shopId'            => 'shop_id',
        'source'            => 'source',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->fromUserId) {
            $res['from_user_id'] = $this->fromUserId;
        }
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributionUserRelationRequest
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
        if (isset($map['from_user_id'])) {
            $model->fromUserId = $map['from_user_id'];
        }
        if (isset($map['item_id'])) {
            $model->itemId = $map['item_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
