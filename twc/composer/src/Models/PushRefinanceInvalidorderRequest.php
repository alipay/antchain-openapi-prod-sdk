<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PushRefinanceInvalidorderRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $packageId;

    // 无效资产订单id列表，单次不限笔数，如果没有无效资产，传空列表即可
    /**
     * @var string[]
     */
    public $orderIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'packageId'         => 'package_id',
        'orderIdList'       => 'order_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('packageId', $this->packageId, true);
        Model::validateMaxLength('packageId', $this->packageId, 64);
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
        if (null !== $this->packageId) {
            $res['package_id'] = $this->packageId;
        }
        if (null !== $this->orderIdList) {
            $res['order_id_list'] = $this->orderIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRefinanceInvalidorderRequest
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
        if (isset($map['package_id'])) {
            $model->packageId = $map['package_id'];
        }
        if (isset($map['order_id_list'])) {
            if (!empty($map['order_id_list'])) {
                $model->orderIdList = $map['order_id_list'];
            }
        }

        return $model;
    }
}
