<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BindIpShopRequest extends Model
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

    // 淘宝卖家官方昵称
    /**
     * @var string
     */
    public $sellerNick;

    // 授权渠道名称(1: 淘宝网)
    /**
     * @var int
     */
    public $channelType;

    // 数据授权方式(1: 淘宝开放平台)
    /**
     * @var int
     */
    public $authType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'sellerNick'        => 'seller_nick',
        'channelType'       => 'channel_type',
        'authType'          => 'auth_type',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('sellerNick', $this->sellerNick, true);
        Model::validateRequired('channelType', $this->channelType, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->sellerNick) {
            $res['seller_nick'] = $this->sellerNick;
        }
        if (null !== $this->channelType) {
            $res['channel_type'] = $this->channelType;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindIpShopRequest
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
        if (isset($map['seller_nick'])) {
            $model->sellerNick = $map['seller_nick'];
        }
        if (isset($map['channel_type'])) {
            $model->channelType = $map['channel_type'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }

        return $model;
    }
}
