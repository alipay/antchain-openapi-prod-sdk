<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryCctPictureRequest extends Model
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

    // InfoSecAnalyzeSyncContent json
    /**
     * @var string
     */
    public $request;

    // RaaS产品码
    /**
     * @var string
     */
    public $raasProducts;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'request'           => 'request',
        'raasProducts'      => 'raas_products',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
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
        if (null !== $this->request) {
            $res['request'] = $this->request;
        }
        if (null !== $this->raasProducts) {
            $res['raas_products'] = $this->raasProducts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCctPictureRequest
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
        if (isset($map['request'])) {
            $model->request = $map['request'];
        }
        if (isset($map['raas_products'])) {
            $model->raasProducts = $map['raas_products'];
        }

        return $model;
    }
}
