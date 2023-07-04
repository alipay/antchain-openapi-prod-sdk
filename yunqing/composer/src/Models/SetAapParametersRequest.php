<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SetAapParametersRequest extends Model
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

    // site code
    /**
     * @var string
     */
    public $siteCode;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // prod code
    /**
     * @var string
     */
    public $prodCode;

    // product_instance_name
    /**
     * @var string
     */
    public $productInstanceName;

    // 应用code
    /**
     * @var string
     */
    public $appCode;

    // 更新的应用参数
    /**
     * @var AppEnv[]
     */
    public $appEnvs;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'siteCode'            => 'site_code',
        'namespace'           => 'namespace',
        'prodCode'            => 'prod_code',
        'productInstanceName' => 'product_instance_name',
        'appCode'             => 'app_code',
        'appEnvs'             => 'app_envs',
    ];

    public function validate()
    {
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('productInstanceName', $this->productInstanceName, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('appEnvs', $this->appEnvs, true);
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
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->productInstanceName) {
            $res['product_instance_name'] = $this->productInstanceName;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->appEnvs) {
            $res['app_envs'] = [];
            if (null !== $this->appEnvs && \is_array($this->appEnvs)) {
                $n = 0;
                foreach ($this->appEnvs as $item) {
                    $res['app_envs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetAapParametersRequest
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
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['product_instance_name'])) {
            $model->productInstanceName = $map['product_instance_name'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['app_envs'])) {
            if (!empty($map['app_envs'])) {
                $model->appEnvs = [];
                $n              = 0;
                foreach ($map['app_envs'] as $item) {
                    $model->appEnvs[$n++] = null !== $item ? AppEnv::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
