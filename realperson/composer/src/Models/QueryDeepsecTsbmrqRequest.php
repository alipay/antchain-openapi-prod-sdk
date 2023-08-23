<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryDeepsecTsbmrqRequest extends Model
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

    // 应用来源
    /**
     * @var string
     */
    public $appId;

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // request id
    /**
     * @var string
     */
    public $requestId;

    // 租户
    /**
     * @var string
     */
    public $tenantId;

    // 商户id
    /**
     * @var string
     */
    public $merchantId;

    // 应用来源名称, 也被用作渠道名称
    /**
     * @var string
     */
    public $appName;

    // 是否测试流量, 测试流量会在处理过程中有特殊处理
    /**
     * @var bool
     */
    public $testFlow;

    // apdidToken
    /**
     * @var string
     */
    public $apdidToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'envId'             => 'env_id',
        'requestId'         => 'request_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'appName'           => 'app_name',
        'testFlow'          => 'test_flow',
        'apdidToken'        => 'apdid_token',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('apdidToken', $this->apdidToken, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->testFlow) {
            $res['test_flow'] = $this->testFlow;
        }
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeepsecTsbmrqRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['test_flow'])) {
            $model->testFlow = $map['test_flow'];
        }
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }

        return $model;
    }
}
