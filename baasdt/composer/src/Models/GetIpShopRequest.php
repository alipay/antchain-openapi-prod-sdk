<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class GetIpShopRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // IP商家的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // 宝贝Id(可以是ItemId, 也可以是SkuId或其他Id)
    /**
     * @var string
     */
    public $goodId;

    // 类型(1: ItemId)
    /**
     * @var int
     */
    public $idType;

    // 淘宝卖家的官方昵称
    /**
     * @var string
     */
    public $sellerNick;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'goodId'            => 'good_id',
        'idType'            => 'id_type',
        'sellerNick'        => 'seller_nick',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('goodId', $this->goodId, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('sellerNick', $this->sellerNick, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->goodId) {
            $res['good_id'] = $this->goodId;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->sellerNick) {
            $res['seller_nick'] = $this->sellerNick;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetIpShopRequest
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
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['good_id'])) {
            $model->goodId = $map['good_id'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['seller_nick'])) {
            $model->sellerNick = $map['seller_nick'];
        }

        return $model;
    }
}
