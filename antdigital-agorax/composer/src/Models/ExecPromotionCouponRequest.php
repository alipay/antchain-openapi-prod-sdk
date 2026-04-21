<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class ExecPromotionCouponRequest extends Model
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

    // 业务ID
    /**
     * @var string
     */
    public $bizId;

    // open_id
    /**
     * @var string
     */
    public $openId;

    // appId
    /**
     * @var string
     */
    public $appId;

    // 活动ID
    /**
     * @var string
     */
    public $activityId;

    // 奖品ID，需要指定奖品抽奖时传入
    /**
     * @var string
     */
    public $prizeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'openId'            => 'open_id',
        'appId'             => 'app_id',
        'activityId'        => 'activity_id',
        'prizeId'           => 'prize_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('activityId', $this->activityId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->prizeId) {
            $res['prize_id'] = $this->prizeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecPromotionCouponRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['prize_id'])) {
            $model->prizeId = $map['prize_id'];
        }

        return $model;
    }
}
