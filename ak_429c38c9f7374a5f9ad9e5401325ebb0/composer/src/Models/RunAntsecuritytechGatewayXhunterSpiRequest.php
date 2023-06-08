<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_429c38c9f7374a5f9ad9e5401325ebb0\Models;

use AlibabaCloud\Tea\Model;

class RunAntsecuritytechGatewayXhunterSpiRequest extends Model
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

    // json
    /**
     * @var string
     */
    public $request;

    // XHUNTER_ISV_STANDARD
    /**
     * @var string
     */
    public $serviceName;

    // json
    /**
     * @var string
     */
    public $extInfo;

    // raas_products
    /**
     * @var string
     */
    public $raasProducts;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'request'           => 'request',
        'serviceName'       => 'service_name',
        'extInfo'           => 'ext_info',
        'raasProducts'      => 'raas_products',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
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
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->raasProducts) {
            $res['raas_products'] = $this->raasProducts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunAntsecuritytechGatewayXhunterSpiRequest
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
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['raas_products'])) {
            $model->raasProducts = $map['raas_products'];
        }

        return $model;
    }
}
