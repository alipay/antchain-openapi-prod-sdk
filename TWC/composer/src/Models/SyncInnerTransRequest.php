<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerTransRequest extends Model
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

    // 事务id
    /**
     * @var int
     */
    public $id;

    // 存证事务id
    /**
     * @var string
     */
    public $transactionId;

    // 存证的用户id
    /**
     * @var string
     */
    public $accountId;

    // 业务id
    /**
     * @var int
     */
    public $bizId;

    // 子业务id
    /**
     * @var string
     */
    public $subBizId;

    // 存证主体的json字符串
    /**
     * @var string
     */
    public $customer;

    // 存证初始化时间
    /**
     * @var int
     */
    public $registerTime;

    // 到期时间
    /**
     * @var int
     */
    public $expireTime;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 是否有效
    /**
     * @var bool
     */
    public $active;

    // 交易hash
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'transactionId'     => 'transaction_id',
        'accountId'         => 'account_id',
        'bizId'             => 'biz_id',
        'subBizId'          => 'sub_biz_id',
        'customer'          => 'customer',
        'registerTime'      => 'register_time',
        'expireTime'        => 'expire_time',
        'properties'        => 'properties',
        'active'            => 'active',
        'txHash'            => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('registerTime', $this->registerTime, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->subBizId) {
            $res['sub_biz_id'] = $this->subBizId;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->active) {
            $res['active'] = $this->active;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerTransRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['sub_biz_id'])) {
            $model->subBizId = $map['sub_biz_id'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['active'])) {
            $model->active = $map['active'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
