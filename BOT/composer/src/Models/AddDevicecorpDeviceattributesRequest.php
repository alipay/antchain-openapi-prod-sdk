<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddDevicecorpDeviceattributesRequest extends Model
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

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 型号名称
    /**
     * @var string
     */
    public $modelName;

    // 型号值
    /**
     * @var string
     */
    public $modelValue;

    // 规格列表，列表json字符串
    // 没值默认使用标准规格
    /**
     * @var string
     */
    public $specs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'modelName'         => 'model_name',
        'modelValue'        => 'model_value',
        'specs'             => 'specs',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelValue', $this->modelValue, true);
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
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelValue) {
            $res['model_value'] = $this->modelValue;
        }
        if (null !== $this->specs) {
            $res['specs'] = $this->specs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDevicecorpDeviceattributesRequest
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
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_value'])) {
            $model->modelValue = $map['model_value'];
        }
        if (isset($map['specs'])) {
            $model->specs = $map['specs'];
        }

        return $model;
    }
}
