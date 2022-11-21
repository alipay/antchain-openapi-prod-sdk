<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_10abee70bc4f4d4d90334ebfb4895c12\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoTestTestobjectBbbRequest extends Model
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

    // 测试入参
    /**
     * @var string
     */
    public $requestParam1;

    // 测试入参2
    /**
     * @var string
     */
    public $requestParam2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestParam1'     => 'request_param1',
        'requestParam2'     => 'request_param2',
    ];

    public function validate()
    {
        Model::validateRequired('requestParam1', $this->requestParam1, true);
        Model::validateRequired('requestParam2', $this->requestParam2, true);
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
        if (null !== $this->requestParam1) {
            $res['request_param1'] = $this->requestParam1;
        }
        if (null !== $this->requestParam2) {
            $res['request_param2'] = $this->requestParam2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoTestTestobjectBbbRequest
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
        if (isset($map['request_param1'])) {
            $model->requestParam1 = $map['request_param1'];
        }
        if (isset($map['request_param2'])) {
            $model->requestParam2 = $map['request_param2'];
        }

        return $model;
    }
}
