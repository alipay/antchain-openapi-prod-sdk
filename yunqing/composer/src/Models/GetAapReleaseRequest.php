<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetAapReleaseRequest extends Model
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

    // 发布单id
    /**
     * @var string
     */
    public $releasePlanId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'releasePlanId'     => 'release_plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('releasePlanId', $this->releasePlanId, true);
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
        if (null !== $this->releasePlanId) {
            $res['release_plan_id'] = $this->releasePlanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAapReleaseRequest
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
        if (isset($map['release_plan_id'])) {
            $model->releasePlanId = $map['release_plan_id'];
        }

        return $model;
    }
}
