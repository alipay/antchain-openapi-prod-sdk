<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushRentHouseRequest extends Model
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

    // 房源信息集合 数组
    /**
     * @var HouseInfo[]
     */
    public $houseList;

    // 企业(业主)身份识别码
    /**
     * @var string
     */
    public $merchantIdCard;

    // 联系电话
    /**
     * @var string
     */
    public $phone;

    // 联系人
    /**
     * @var string
     */
    public $contract;

    // 对应会员用户id
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'houseList'         => 'house_list',
        'merchantIdCard'    => 'merchant_id_card',
        'phone'             => 'phone',
        'contract'          => 'contract',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('houseList', $this->houseList, true);
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
        if (null !== $this->houseList) {
            $res['house_list'] = [];
            if (null !== $this->houseList && \is_array($this->houseList)) {
                $n = 0;
                foreach ($this->houseList as $item) {
                    $res['house_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->merchantIdCard) {
            $res['merchant_id_card'] = $this->merchantIdCard;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRentHouseRequest
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
        if (isset($map['house_list'])) {
            if (!empty($map['house_list'])) {
                $model->houseList = [];
                $n                = 0;
                foreach ($map['house_list'] as $item) {
                    $model->houseList[$n++] = null !== $item ? HouseInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merchant_id_card'])) {
            $model->merchantIdCard = $map['merchant_id_card'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
