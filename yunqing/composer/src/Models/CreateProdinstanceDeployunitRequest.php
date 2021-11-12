<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateProdinstanceDeployunitRequest extends Model
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

    // 环境标识
    /**
     * @var string
     */
    public $envId;

    // 云游内产品码
    /**
     * @var string
     */
    public $productCode;

    // 执行部署单元实例id
    /**
     * @var string
     */
    public $unitId;

    // 部署单元名称
    /**
     * @var string
     */
    public $unitName;

    // 单元ID
    /**
     * @var string
     */
    public $cellId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'productCode'       => 'product_code',
        'unitId'            => 'unit_id',
        'unitName'          => 'unit_name',
        'cellId'            => 'cell_id',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('unitId', $this->unitId, true);
        Model::validateRequired('unitName', $this->unitName, true);
        Model::validateRequired('cellId', $this->cellId, true);
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->unitId) {
            $res['unit_id'] = $this->unitId;
        }
        if (null !== $this->unitName) {
            $res['unit_name'] = $this->unitName;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProdinstanceDeployunitRequest
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['unit_id'])) {
            $model->unitId = $map['unit_id'];
        }
        if (isset($map['unit_name'])) {
            $model->unitName = $map['unit_name'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }

        return $model;
    }
}
