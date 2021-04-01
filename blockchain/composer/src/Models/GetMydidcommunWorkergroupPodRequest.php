<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetMydidcommunWorkergroupPodRequest extends Model
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

    // 部署ID
    /**
     * @var int
     */
    public $podId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'podId'             => 'pod_id',
    ];

    public function validate()
    {
        Model::validateRequired('podId', $this->podId, true);
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
        if (null !== $this->podId) {
            $res['pod_id'] = $this->podId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMydidcommunWorkergroupPodRequest
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
        if (isset($map['pod_id'])) {
            $model->podId = $map['pod_id'];
        }

        return $model;
    }
}
