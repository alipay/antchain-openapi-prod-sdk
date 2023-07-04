<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAapProductinstanceRequest extends Model
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

    // site_code
    /**
     * @var string
     */
    public $siteCode;

    // name space
    /**
     * @var string
     */
    public $namespace;

    // 产品code
    /**
     * @var string
     */
    public $prodCode;

    // 产品实例name
    /**
     * @var string
     */
    public $productInstanceName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'siteCode'            => 'site_code',
        'namespace'           => 'namespace',
        'prodCode'            => 'prod_code',
        'productInstanceName' => 'product_instance_name',
    ];

    public function validate()
    {
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('productInstanceName', $this->productInstanceName, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAapProductinstanceRequest
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

        return $model;
    }
}
