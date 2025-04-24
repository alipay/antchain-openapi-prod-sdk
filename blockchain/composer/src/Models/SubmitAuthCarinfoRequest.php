<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuthCarinfoRequest extends Model
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

    // 唯一场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 用户信息
    /**
     * @var CarUserInfo
     */
    public $userInfo;

    // 车辆信息
    /**
     * @var BasicCarInfo
     */
    public $carInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'userInfo'          => 'user_info',
        'carInfo'           => 'car_info',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('carInfo', $this->carInfo, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->carInfo) {
            $res['car_info'] = null !== $this->carInfo ? $this->carInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuthCarinfoRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = CarUserInfo::fromMap($map['user_info']);
        }
        if (isset($map['car_info'])) {
            $model->carInfo = BasicCarInfo::fromMap($map['car_info']);
        }

        return $model;
    }
}
