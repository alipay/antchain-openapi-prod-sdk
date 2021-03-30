<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DeleteWarehouseStoragelocationRequest extends Model
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

    // 仓位id
    /**
     * @var string
     */
    public $locationId;

    // 仓库id
    /**
     * @var string
     */
    public $warehouseId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'locationId'        => 'location_id',
        'warehouseId'       => 'warehouse_id',
    ];

    public function validate()
    {
        Model::validateRequired('locationId', $this->locationId, true);
        Model::validateRequired('warehouseId', $this->warehouseId, true);
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
        if (null !== $this->locationId) {
            $res['location_id'] = $this->locationId;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteWarehouseStoragelocationRequest
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
        if (isset($map['location_id'])) {
            $model->locationId = $map['location_id'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }

        return $model;
    }
}
