<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApplyApimodelMgsRequest extends Model
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

    // modelDataSource指mgs平台  get模型返回的json字符串
    /**
     * @var string[]
     */
    public $modelList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'modelList'         => 'model_list',
    ];

    public function validate()
    {
        Model::validateRequired('modelList', $this->modelList, true);
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
        if (null !== $this->modelList) {
            $res['model_list'] = $this->modelList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyApimodelMgsRequest
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
        if (isset($map['model_list'])) {
            if (!empty($map['model_list'])) {
                $model->modelList = $map['model_list'];
            }
        }

        return $model;
    }
}
