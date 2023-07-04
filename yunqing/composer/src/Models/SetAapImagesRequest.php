<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SetAapImagesRequest extends Model
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

    // 应用镜像，默认使用amd64
    /**
     * @var ApplicationImage
     */
    public $images;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // siteCode
    /**
     * @var string
     */
    public $siteCode;

    // 产品code
    /**
     * @var string
     */
    public $prodCode;

    // 产品实例名称
    /**
     * @var string
     */
    public $productInstanceName;

    // 应用code
    /**
     * @var string
     */
    public $appCode;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'images'              => 'images',
        'namespace'           => 'namespace',
        'siteCode'            => 'site_code',
        'prodCode'            => 'prod_code',
        'productInstanceName' => 'product_instance_name',
        'appCode'             => 'app_code',
    ];

    public function validate()
    {
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('productInstanceName', $this->productInstanceName, true);
        Model::validateRequired('appCode', $this->appCode, true);
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
        if (null !== $this->images) {
            $res['images'] = null !== $this->images ? $this->images->toMap() : null;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetAapImagesRequest
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
        if (isset($map['images'])) {
            $model->images = ApplicationImage::fromMap($map['images']);
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
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

        return $model;
    }
}
