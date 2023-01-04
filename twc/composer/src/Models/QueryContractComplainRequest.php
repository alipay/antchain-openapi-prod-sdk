<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractComplainRequest extends Model
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

    // 投诉单号
    /**
     * @var string
     */
    public $complainEventId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'complainEventId'   => 'complain_event_id',
    ];

    public function validate()
    {
        Model::validateRequired('complainEventId', $this->complainEventId, true);
        Model::validateMaxLength('complainEventId', $this->complainEventId, 64);
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
        if (null !== $this->complainEventId) {
            $res['complain_event_id'] = $this->complainEventId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractComplainRequest
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
        if (isset($map['complain_event_id'])) {
            $model->complainEventId = $map['complain_event_id'];
        }

        return $model;
    }
}
