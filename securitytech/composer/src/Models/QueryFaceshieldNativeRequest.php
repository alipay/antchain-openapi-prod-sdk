<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

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
    /**
     * @var string
     */
    public $clientId;

    // 设备token
    /**
     * @var string
     */
    public $apdidToken;

    // 切面数据（JSON，详见下方）
    // {
    // "sessionId": "zimId"	//人脸的bizID
    // "rId": "rId"	//在获取活体方法人脸下发的bisToken
    // "keyInfoHash": "keyInfoHash"	//关键信息hash
    // "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
    // "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
    // }
    /**
     * @var string
     */
    public $aopData;

    // 否（和切面二选一即可）
    /**
     * @var string
     */
    public $signature;

    // 签名因子（和切面二选一即可）
    /**
     * @var string
     */
    public $signFactor;

    // RaaS租户
    /**
     * @var string
     */
    public $raasProducts;

    // raas二级租户
    /**
     * @var string
     */
    public $raasSecondTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientId'          => 'client_id',
        'apdidToken'        => 'apdid_token',
        'aopData'           => 'aop_data',
        'signature'         => 'signature',
        'signFactor'        => 'sign_factor',
        'raasProducts'      => 'raas_products',
        'raasSecondTenant'  => 'raas_second_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('raasProducts', $this->raasProducts, true);
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
        if (null !== $this->raasProducts) {
            $res['raas_products'] = $this->raasProducts;
        }
        if (null !== $this->raasSecondTenant) {
            $res['raas_second_tenant'] = $this->raasSecondTenant;
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
        if (isset($map['raas_products'])) {
            $model->raasProducts = $map['raas_products'];
        }
        if (isset($map['raas_second_tenant'])) {
            $model->raasSecondTenant = $map['raas_second_tenant'];
        }

        return $model;
    }
}
