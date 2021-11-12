<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthRequest extends Model
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

    // 条件前缀, 一般传入环境ID
    /**
     * @var string
     */
    public $conditionPrefix;

    // 授权状态
    /**
     * @var string[]
     */
    public $statuses;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'conditionPrefix'   => 'condition_prefix',
        'statuses'          => 'statuses',
    ];

    public function validate()
    {
        Model::validateRequired('statuses', $this->statuses, true);
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
        if (null !== $this->conditionPrefix) {
            $res['condition_prefix'] = $this->conditionPrefix;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthRequest
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
        if (isset($map['condition_prefix'])) {
            $model->conditionPrefix = $map['condition_prefix'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }

        return $model;
    }
}
