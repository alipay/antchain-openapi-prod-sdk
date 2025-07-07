<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuthNewcarRequest extends Model
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

    // 用户信息
    /**
     * @var CarUserInfo
     */
    public $userInfo;

    // 车系
    /**
     * @var string
     */
    public $carSeries;

    // 金融方案
    /**
     * @var string
     */
    public $finaicalPlan;

    // 预计购买时间
    /**
     * @var string
     */
    public $purcharseTime;

    // xxxx
    /**
     * @var string
     */
    public $carSeriesId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'userInfo'          => 'user_info',
        'carSeries'         => 'car_series',
        'finaicalPlan'      => 'finaical_plan',
        'purcharseTime'     => 'purcharse_time',
        'carSeriesId'       => 'car_series_id',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('carSeries', $this->carSeries, true);
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
        if (null !== $this->carSeries) {
            $res['car_series'] = $this->carSeries;
        }
        if (null !== $this->finaicalPlan) {
            $res['finaical_plan'] = $this->finaicalPlan;
        }
        if (null !== $this->purcharseTime) {
            $res['purcharse_time'] = $this->purcharseTime;
        }
        if (null !== $this->carSeriesId) {
            $res['car_series_id'] = $this->carSeriesId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuthNewcarRequest
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
        if (isset($map['car_series'])) {
            $model->carSeries = $map['car_series'];
        }
        if (isset($map['finaical_plan'])) {
            $model->finaicalPlan = $map['finaical_plan'];
        }
        if (isset($map['purcharse_time'])) {
            $model->purcharseTime = $map['purcharse_time'];
        }
        if (isset($map['car_series_id'])) {
            $model->carSeriesId = $map['car_series_id'];
        }

        return $model;
    }
}
