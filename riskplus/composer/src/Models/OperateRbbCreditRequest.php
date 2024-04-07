<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class OperateRbbCreditRequest extends Model
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

    // 服务code
    /**
     * @var string
     */
    public $serviceCode;

    // 服务参数
    /**
     * @var string
     */
    public $serviceParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceCode'       => 'service_code',
        'serviceParams'     => 'service_params',
    ];

    public function validate()
    {
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('serviceParams', $this->serviceParams, true);
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
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->serviceParams) {
            $res['service_params'] = $this->serviceParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateRbbCreditRequest
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
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['service_params'])) {
            $model->serviceParams = $map['service_params'];
        }

        return $model;
    }
}
