<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class SyncEcpCloudRequest extends Model
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

    // api_code
    /**
     * @var string
     */
    public $apiCode;

    // param_map_json
    /**
     * @var string
     */
    public $paramMapJson;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiCode'           => 'api_code',
        'paramMapJson'      => 'param_map_json',
    ];

    public function validate()
    {
        Model::validateRequired('apiCode', $this->apiCode, true);
        Model::validateRequired('paramMapJson', $this->paramMapJson, true);
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
        if (null !== $this->apiCode) {
            $res['api_code'] = $this->apiCode;
        }
        if (null !== $this->paramMapJson) {
            $res['param_map_json'] = $this->paramMapJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncEcpCloudRequest
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
        if (isset($map['api_code'])) {
            $model->apiCode = $map['api_code'];
        }
        if (isset($map['param_map_json'])) {
            $model->paramMapJson = $map['param_map_json'];
        }

        return $model;
    }
}
