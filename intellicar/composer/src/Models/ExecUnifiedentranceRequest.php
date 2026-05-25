<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class ExecUnifiedentranceRequest extends Model
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

    // 请求参数的json字符串
    /**
     * @var string
     */
    public $params;

    // 业务场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'params'            => 'params',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecUnifiedentranceRequest
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
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
