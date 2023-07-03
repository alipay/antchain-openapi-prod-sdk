<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryFaceshieldNativeRequest extends Model
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

    // 客户id，标识客户来源
    //
    /**
     * @var string
     */
    public $clientId;

    // 设备token
    //
    /**
     * @var string
     */
    public $apdidToken;

    // 切面数据（JSON，详见下方）
    /**
     * @var string
     */
    public $aopData;

    // 签名信息	否（和切面二选一即可）
    //
    /**
     * @var string
     */
    public $signature;

    // 签名因子（和切面二选一即可）
    //
    /**
     * @var string
     */
    public $signFactor;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientId'          => 'client_id',
        'apdidToken'        => 'apdid_token',
        'aopData'           => 'aop_data',
        'signature'         => 'signature',
        'signFactor'        => 'sign_factor',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
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
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }
        if (null !== $this->aopData) {
            $res['aop_data'] = $this->aopData;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->signFactor) {
            $res['sign_factor'] = $this->signFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFaceshieldNativeRequest
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
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }
        if (isset($map['aop_data'])) {
            $model->aopData = $map['aop_data'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['sign_factor'])) {
            $model->signFactor = $map['sign_factor'];
        }

        return $model;
    }
}
