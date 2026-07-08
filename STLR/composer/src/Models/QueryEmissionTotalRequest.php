<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEmissionTotalRequest extends Model
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

    // 活动编码
    /**
     * @var string
     */
    public $activityNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activityNo'        => 'activity_no',
    ];

    public function validate()
    {
        Model::validateRequired('activityNo', $this->activityNo, true);
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
        if (null !== $this->activityNo) {
            $res['activity_no'] = $this->activityNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEmissionTotalRequest
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
        if (isset($map['activity_no'])) {
            $model->activityNo = $map['activity_no'];
        }

        return $model;
    }
}
