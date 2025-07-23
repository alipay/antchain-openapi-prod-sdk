<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ERAPROD\Models;

use AlibabaCloud\Tea\Model;

class OperateAgentProxyRequest extends Model
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

    // json 序列化后的请求入参
    /**
     * @var string
     */
    public $requestJson;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestJson'       => 'request_json',
    ];

    public function validate()
    {
        Model::validateRequired('requestJson', $this->requestJson, true);
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
        if (null !== $this->requestJson) {
            $res['request_json'] = $this->requestJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateAgentProxyRequest
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
        if (isset($map['request_json'])) {
            $model->requestJson = $map['request_json'];
        }

        return $model;
    }
}
