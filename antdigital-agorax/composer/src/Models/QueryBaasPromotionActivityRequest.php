<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPromotionActivityRequest extends Model
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

    // 活动ID，由运营线下通知分配
    /**
     * @var string
     */
    public $activityId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activityId'        => 'activity_id',
    ];

    public function validate()
    {
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
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBaasPromotionActivityRequest
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
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }

        return $model;
    }
}
