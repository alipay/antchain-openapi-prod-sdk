<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetUnitDetailRequest extends Model
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

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 单元实例标识
    /**
     * @var string
     */
    public $unitInstanceIdentity;

    // 单元ID
    /**
     * @var string
     */
    public $cellId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'envId'                => 'env_id',
        'productCode'          => 'product_code',
        'unitInstanceIdentity' => 'unit_instance_identity',
        'cellId'               => 'cell_id',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('unitInstanceIdentity', $this->unitInstanceIdentity, true);
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
        if (null !== $this->unitInstanceIdentity) {
            $res['unit_instance_identity'] = $this->unitInstanceIdentity;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUnitDetailRequest
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
        if (isset($map['unit_instance_identity'])) {
            $model->unitInstanceIdentity = $map['unit_instance_identity'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }

        return $model;
    }
}
