<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMdipYunfengdieParamsRequest extends Model
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

    // 回调参数
    /**
     * @var string
     */
    public $paramsMap;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'paramsMap'         => 'params_map',
    ];

    public function validate()
    {
        Model::validateRequired('paramsMap', $this->paramsMap, true);
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
        if (null !== $this->paramsMap) {
            $res['params_map'] = $this->paramsMap;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackMdipYunfengdieParamsRequest
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
        if (isset($map['params_map'])) {
            $model->paramsMap = $map['params_map'];
        }

        return $model;
    }
}
