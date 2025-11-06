<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PushAuthCarloanRequest extends Model
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

    // 车信息
    /**
     * @var BasicCarInfo
     */
    public $basicCarInfo;

    // 用户信息
    /**
     * @var CarUserInfo
     */
    public $userInfo;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'basicCarInfo'      => 'basic_car_info',
        'userInfo'          => 'user_info',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('basicCarInfo', $this->basicCarInfo, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->basicCarInfo) {
            $res['basic_car_info'] = null !== $this->basicCarInfo ? $this->basicCarInfo->toMap() : null;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAuthCarloanRequest
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
        if (isset($map['basic_car_info'])) {
            $model->basicCarInfo = BasicCarInfo::fromMap($map['basic_car_info']);
        }
        if (isset($map['user_info'])) {
            $model->userInfo = CarUserInfo::fromMap($map['user_info']);
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
