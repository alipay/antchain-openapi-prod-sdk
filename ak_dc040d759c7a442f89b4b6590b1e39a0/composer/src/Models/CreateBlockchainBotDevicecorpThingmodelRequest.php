<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBotDevicecorpThingmodelRequest extends Model
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

    // 新增的功能定义详情
    /**
     * @var string
     */
    public $thingModelJson;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'thingModelJson'    => 'thing_model_json',
        'categoryCode'      => 'category_code',
    ];

    public function validate()
    {
        Model::validateRequired('thingModelJson', $this->thingModelJson, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
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
        if (null !== $this->thingModelJson) {
            $res['thing_model_json'] = $this->thingModelJson;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBlockchainBotDevicecorpThingmodelRequest
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
        if (isset($map['thing_model_json'])) {
            $model->thingModelJson = $map['thing_model_json'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }

        return $model;
    }
}
