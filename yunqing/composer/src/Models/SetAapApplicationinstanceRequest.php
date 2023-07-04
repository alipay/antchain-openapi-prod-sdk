<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SetAapApplicationinstanceRequest extends Model
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

    // 规格修改
    /**
     * @var ResourceSpec
     */
    public $resourceSpec;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 产品实例名称
    /**
     * @var string
     */
    public $productInstanceName;

    // 产品code
    /**
     * @var string
     */
    public $prodCode;

    // 应用名称
    /**
     * @var string
     */
    public $appCode;

    // 站点code
    /**
     * @var string
     */
    public $siteCode;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'resourceSpec'        => 'resource_spec',
        'namespace'           => 'namespace',
        'productInstanceName' => 'product_instance_name',
        'prodCode'            => 'prod_code',
        'appCode'             => 'app_code',
        'siteCode'            => 'site_code',
    ];

    public function validate()
    {
        Model::validateRequired('resourceSpec', $this->resourceSpec, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('productInstanceName', $this->productInstanceName, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('siteCode', $this->siteCode, true);
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
        if (null !== $this->resourceSpec) {
            $res['resource_spec'] = null !== $this->resourceSpec ? $this->resourceSpec->toMap() : null;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->productInstanceName) {
            $res['product_instance_name'] = $this->productInstanceName;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetAapApplicationinstanceRequest
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
        if (isset($map['resource_spec'])) {
            $model->resourceSpec = ResourceSpec::fromMap($map['resource_spec']);
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['product_instance_name'])) {
            $model->productInstanceName = $map['product_instance_name'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }

        return $model;
    }
}
