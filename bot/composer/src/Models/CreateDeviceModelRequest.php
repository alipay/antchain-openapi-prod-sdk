<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDeviceModelRequest extends Model
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

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    /**
     * @var string
     */
    public $categoryType;

    // 品类编码
    /**
     * @var string
     */
    public $categoryCode;

    // 属性列表，与固定属性列表不能同时为空
    /**
     * @var IotbasicDeviceModelAttributeInfo[]
     */
    public $attributeInfoList;

    // 固定属性列表，与属性列表不能同时为空
    /**
     * @var IotbasicDeviceModelFixedAttributeInfo[]
     */
    public $fixedAttributeInfoList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'categoryType'           => 'category_type',
        'categoryCode'           => 'category_code',
        'attributeInfoList'      => 'attribute_info_list',
        'fixedAttributeInfoList' => 'fixed_attribute_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('categoryType', $this->categoryType, true);
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
        if (null !== $this->categoryType) {
            $res['category_type'] = $this->categoryType;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->attributeInfoList) {
            $res['attribute_info_list'] = [];
            if (null !== $this->attributeInfoList && \is_array($this->attributeInfoList)) {
                $n = 0;
                foreach ($this->attributeInfoList as $item) {
                    $res['attribute_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fixedAttributeInfoList) {
            $res['fixed_attribute_info_list'] = [];
            if (null !== $this->fixedAttributeInfoList && \is_array($this->fixedAttributeInfoList)) {
                $n = 0;
                foreach ($this->fixedAttributeInfoList as $item) {
                    $res['fixed_attribute_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDeviceModelRequest
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
        if (isset($map['category_type'])) {
            $model->categoryType = $map['category_type'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['attribute_info_list'])) {
            if (!empty($map['attribute_info_list'])) {
                $model->attributeInfoList = [];
                $n                        = 0;
                foreach ($map['attribute_info_list'] as $item) {
                    $model->attributeInfoList[$n++] = null !== $item ? IotbasicDeviceModelAttributeInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fixed_attribute_info_list'])) {
            if (!empty($map['fixed_attribute_info_list'])) {
                $model->fixedAttributeInfoList = [];
                $n                             = 0;
                foreach ($map['fixed_attribute_info_list'] as $item) {
                    $model->fixedAttributeInfoList[$n++] = null !== $item ? IotbasicDeviceModelFixedAttributeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
