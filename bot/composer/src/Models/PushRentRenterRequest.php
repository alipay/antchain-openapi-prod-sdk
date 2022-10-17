<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushRentRenterRequest extends Model
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

    // 租客id
    /**
     * @var string
     */
    public $renterId;

    // 租客名称
    /**
     * @var string
     */
    public $renterName;

    // 租客联系电话
    /**
     * @var string
     */
    public $renterPhone;

    // 租客身份证号
    /**
     * @var string
     */
    public $renterIdCard;

    // 房源唯一ID
    /**
     * @var string
     */
    public $houseId;

    // 租赁合同信息
    /**
     * @var RentContractInfo
     */
    public $rentContract;

    // 企业(业主)身份识别码
    /**
     * @var string
     */
    public $merchantIdCard;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'renterId'          => 'renter_id',
        'renterName'        => 'renter_name',
        'renterPhone'       => 'renter_phone',
        'renterIdCard'      => 'renter_id_card',
        'houseId'           => 'house_id',
        'rentContract'      => 'rent_contract',
        'merchantIdCard'    => 'merchant_id_card',
    ];

    public function validate()
    {
        Model::validateRequired('renterId', $this->renterId, true);
        Model::validateRequired('renterName', $this->renterName, true);
        Model::validateRequired('renterPhone', $this->renterPhone, true);
        Model::validateRequired('houseId', $this->houseId, true);
        Model::validateRequired('rentContract', $this->rentContract, true);
        Model::validateRequired('merchantIdCard', $this->merchantIdCard, true);
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
        if (null !== $this->renterId) {
            $res['renter_id'] = $this->renterId;
        }
        if (null !== $this->renterName) {
            $res['renter_name'] = $this->renterName;
        }
        if (null !== $this->renterPhone) {
            $res['renter_phone'] = $this->renterPhone;
        }
        if (null !== $this->renterIdCard) {
            $res['renter_id_card'] = $this->renterIdCard;
        }
        if (null !== $this->houseId) {
            $res['house_id'] = $this->houseId;
        }
        if (null !== $this->rentContract) {
            $res['rent_contract'] = null !== $this->rentContract ? $this->rentContract->toMap() : null;
        }
        if (null !== $this->merchantIdCard) {
            $res['merchant_id_card'] = $this->merchantIdCard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRentRenterRequest
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
        if (isset($map['renter_id'])) {
            $model->renterId = $map['renter_id'];
        }
        if (isset($map['renter_name'])) {
            $model->renterName = $map['renter_name'];
        }
        if (isset($map['renter_phone'])) {
            $model->renterPhone = $map['renter_phone'];
        }
        if (isset($map['renter_id_card'])) {
            $model->renterIdCard = $map['renter_id_card'];
        }
        if (isset($map['house_id'])) {
            $model->houseId = $map['house_id'];
        }
        if (isset($map['rent_contract'])) {
            $model->rentContract = RentContractInfo::fromMap($map['rent_contract']);
        }
        if (isset($map['merchant_id_card'])) {
            $model->merchantIdCard = $map['merchant_id_card'];
        }

        return $model;
    }
}
