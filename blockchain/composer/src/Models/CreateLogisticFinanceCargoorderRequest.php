<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLogisticFinanceCargoorderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 运费
    /**
     * @var string
     */
    public $allFreight;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货源单号
    /**
     * @var string
     */
    public $cargoOrder;

    // 货物类型
    /**
     * @var string
     */
    public $cargoType;

    // 货主did
    /**
     * @var string
     */
    public $consignorDid;

    // 卸货地
    /**
     * @var string
     */
    public $deliveryPlace;

    // 装货地
    /**
     * @var string
     */
    public $loadingPlace;

    // 平台did
    /**
     * @var string
     */
    public $platformDid;

    // 联系人电话
    /**
     * @var string
     */
    public $userPhone;

    // 重量
    /**
     * @var string
     */
    public $weight;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'allFreight'        => 'all_freight',
        'cargoName'         => 'cargo_name',
        'cargoOrder'        => 'cargo_order',
        'cargoType'         => 'cargo_type',
        'consignorDid'      => 'consignor_did',
        'deliveryPlace'     => 'delivery_place',
        'loadingPlace'      => 'loading_place',
        'platformDid'       => 'platform_did',
        'userPhone'         => 'user_phone',
        'weight'            => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('allFreight', $this->allFreight, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoOrder', $this->cargoOrder, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('consignorDid', $this->consignorDid, true);
        Model::validateRequired('deliveryPlace', $this->deliveryPlace, true);
        Model::validateRequired('loadingPlace', $this->loadingPlace, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('weight', $this->weight, true);
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
        if (null !== $this->allFreight) {
            $res['all_freight'] = $this->allFreight;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
        }
        if (null !== $this->loadingPlace) {
            $res['loading_place'] = $this->loadingPlace;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLogisticFinanceCargoorderRequest
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
        if (isset($map['all_freight'])) {
            $model->allFreight = $map['all_freight'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['delivery_place'])) {
            $model->deliveryPlace = $map['delivery_place'];
        }
        if (isset($map['loading_place'])) {
            $model->loadingPlace = $map['loading_place'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
