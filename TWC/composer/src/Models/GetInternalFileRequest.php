<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetInternalFileRequest extends Model
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

    // 存证凭据，需要先调用内部文本存证接口twc.notary.internal.file.create创建存证
    /**
     * @var string
     */
    public $txHash;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    /**
     * @var string
     */
    public $phase;

    // 存证事务id，通过twc.notary.internal.trans.create(创建存证事务)获得
    /**
     * @var string
     */
    public $transactionId;

    // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 代理客户存证时，实际用户的租户ID
    /**
     * @var string
     */
    public $realTenant;

    // 授权码
    //
    /**
     * @var string
     */
    public $authCode;

    // 授权码对应产品码
    /**
     * @var string
     */
    public $product;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txHash'            => 'tx_hash',
        'phase'             => 'phase',
        'transactionId'     => 'transaction_id',
        'location'          => 'location',
        'properties'        => 'properties',
        'realTenant'        => 'real_tenant',
        'authCode'          => 'auth_code',
        'product'           => 'product',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->realTenant) {
            $res['real_tenant'] = $this->realTenant;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInternalFileRequest
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['real_tenant'])) {
            $model->realTenant = $map['real_tenant'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }

        return $model;
    }
}
