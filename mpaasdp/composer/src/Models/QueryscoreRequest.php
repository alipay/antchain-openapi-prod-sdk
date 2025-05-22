<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDP\Models;

use AlibabaCloud\Tea\Model;

class QueryscoreRequest extends Model
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

    // 模型 id
    /**
     * @var string
     */
    public $modelId;

    // 手机号 md5
    /**
     * @var string
     */
    public $mobileMd5;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'modelId'           => 'model_id',
        'mobileMd5'         => 'mobile_md5',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('mobileMd5', $this->mobileMd5, true);
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
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryscoreRequest
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
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }

        return $model;
    }
}
