<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DeployUnit extends Model
{
    // 单元ID
    /**
     * @example 1234567
     *
     * @var string
     */
    public $cellId;

    // 环境唯一标识。
    /**
     * @example 730420181107140959503700000
     *
     * @var string
     */
    public $envId;

    // 部署单元id，产品实例下唯一。
    /**
     * @example default
     *
     * @var string
     */
    public $identity;

    // 部署单元名称。
    /**
     * @example 默认单元
     *
     * @var string
     */
    public $name;

    // 产品码。
    /**
     * @example IAM
     *
     * @var string
     */
    public $productCode;

    // 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
    /**
     * @example unit id
     *
     * @var string
     */
    public $unitIg;
    protected $_name = [
        'cellId'      => 'cell_id',
        'envId'       => 'env_id',
        'identity'    => 'identity',
        'name'        => 'name',
        'productCode' => 'product_code',
        'unitIg'      => 'unit_ig',
    ];

    public function validate()
    {
        Model::validateRequired('cellId', $this->cellId, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('unitIg', $this->unitIg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->unitIg) {
            $res['unit_ig'] = $this->unitIg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeployUnit
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['unit_ig'])) {
            $model->unitIg = $map['unit_ig'];
        }

        return $model;
    }
}
