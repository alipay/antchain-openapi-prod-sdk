<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class OpenConsumecardGoodstocustomRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 商品ID
    /**
     * @var string
     */
    public $goodsId;

    // 开放权限的账户id
    /**
     * @var string
     */
    public $openAccountId;

    // true授权，false解除授权
    /**
     * @var bool
     */
    public $open;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'goodsId'           => 'goods_id',
        'openAccountId'     => 'open_account_id',
        'open'              => 'open',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('openAccountId', $this->openAccountId, true);
        Model::validateRequired('open', $this->open, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->openAccountId) {
            $res['open_account_id'] = $this->openAccountId;
        }
        if (null !== $this->open) {
            $res['open'] = $this->open;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenConsumecardGoodstocustomRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['open_account_id'])) {
            $model->openAccountId = $map['open_account_id'];
        }
        if (isset($map['open'])) {
            $model->open = $map['open'];
        }

        return $model;
    }
}
