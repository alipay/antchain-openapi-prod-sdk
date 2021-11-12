<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class UninstallProdinstanceDeployunitRequest extends Model
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

    // 单元ID
    /**
     * @var string
     */
    public $cellId;

    // 环境唯一标识
    /**
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 单元实例ID
    /**
     * @var string
     */
    public $unitInstanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cellId'            => 'cell_id',
        'envId'             => 'env_id',
        'productCode'       => 'product_code',
        'unitInstanceId'    => 'unit_instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('cellId', $this->cellId, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('unitInstanceId', $this->unitInstanceId, true);
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
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->unitInstanceId) {
            $res['unit_instance_id'] = $this->unitInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UninstallProdinstanceDeployunitRequest
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
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['unit_instance_id'])) {
            $model->unitInstanceId = $map['unit_instance_id'];
        }

        return $model;
    }
}
