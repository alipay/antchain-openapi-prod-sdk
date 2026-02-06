<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryUsedcarRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 二手车信息
    /**
     * @var UsedCarInfo
     */
    public $usedCarInfo;

    // 用户基本信息
    /**
     * @var CarOwnerUserInfo
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'usedCarInfo'       => 'used_car_info',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('usedCarInfo', $this->usedCarInfo, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
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
        if (null !== $this->usedCarInfo) {
            $res['used_car_info'] = null !== $this->usedCarInfo ? $this->usedCarInfo->toMap() : null;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUsedcarRequest
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
        if (isset($map['used_car_info'])) {
            $model->usedCarInfo = UsedCarInfo::fromMap($map['used_car_info']);
        }
        if (isset($map['user_info'])) {
            $model->userInfo = CarOwnerUserInfo::fromMap($map['user_info']);
        }

        return $model;
    }
}
