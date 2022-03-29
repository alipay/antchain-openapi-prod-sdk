<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ChannelApi extends Model
{
    // 渠道名称
    /**
     * @example ALIYUN_POP
     *
     * @var string
     */
    public $channelName;

    // 外部产品码
    /**
     * @example SOFA
     *
     * @var string
     */
    public $productCode;

    // 外部服务码
    /**
     * @example aks
     *
     * @var string
     */
    public $serviceCode;

    // 外部API名称
    /**
     * @example GetOneXMethod
     *
     * @var string
     */
    public $apiName;

    // 外部API版本
    /**
     * @example 2019-08-15
     *
     * @var string
     */
    public $apiVersion;

    // 鉴权模式
    /**
     * @example NONE
     *
     * @var string
     */
    public $authType;

    // 鉴权资源表达式
    /**
     * @example a/*
     *
     * @var string
     */
    public $authExpression;

    // 内部产品码
    /**
     * @example IAM
     *
     * @var string
     */
    public $innerProviderName;

    // 内部API名称
    /**
     * @example antcloud.iam.operator.get
     *
     * @var string
     */
    public $innerApiName;

    // 内部API版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $innerApiVersion;
    protected $_name = [
        'channelName'       => 'channel_name',
        'productCode'       => 'product_code',
        'serviceCode'       => 'service_code',
        'apiName'           => 'api_name',
        'apiVersion'        => 'api_version',
        'authType'          => 'auth_type',
        'authExpression'    => 'auth_expression',
        'innerProviderName' => 'inner_provider_name',
        'innerApiName'      => 'inner_api_name',
        'innerApiVersion'   => 'inner_api_version',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
        Model::validateRequired('innerProviderName', $this->innerProviderName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authExpression) {
            $res['auth_expression'] = $this->authExpression;
        }
        if (null !== $this->innerProviderName) {
            $res['inner_provider_name'] = $this->innerProviderName;
        }
        if (null !== $this->innerApiName) {
            $res['inner_api_name'] = $this->innerApiName;
        }
        if (null !== $this->innerApiVersion) {
            $res['inner_api_version'] = $this->innerApiVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChannelApi
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_expression'])) {
            $model->authExpression = $map['auth_expression'];
        }
        if (isset($map['inner_provider_name'])) {
            $model->innerProviderName = $map['inner_provider_name'];
        }
        if (isset($map['inner_api_name'])) {
            $model->innerApiName = $map['inner_api_name'];
        }
        if (isset($map['inner_api_version'])) {
            $model->innerApiVersion = $map['inner_api_version'];
        }

        return $model;
    }
}
