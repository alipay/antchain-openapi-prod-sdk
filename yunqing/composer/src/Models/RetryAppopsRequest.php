<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class RetryAppopsRequest extends Model
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

    // 运维单id。
    /**
     * @var string
     */
    public $opsPlanId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'opsPlanId'         => 'ops_plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('opsPlanId', $this->opsPlanId, true);
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
        if (null !== $this->opsPlanId) {
            $res['ops_plan_id'] = $this->opsPlanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetryAppopsRequest
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
        if (isset($map['ops_plan_id'])) {
            $model->opsPlanId = $map['ops_plan_id'];
        }

        return $model;
    }
}
