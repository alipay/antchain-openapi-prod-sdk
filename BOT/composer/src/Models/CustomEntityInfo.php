<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CustomEntityInfo extends Model
{
    // 客户自定义实体类型，默认为JSSDK_ACCOUNT
    /**
     * @example JSSDK_ACCOUNT
     *
     * @var string
     */
    public $customerEntityType;

    // 客户自定义实体内容
    /**
     * @example {...}
     *
     * @var string
     */
    public $customerEntityContent;
    protected $_name = [
        'customerEntityType'    => 'customer_entity_type',
        'customerEntityContent' => 'customer_entity_content',
    ];

    public function validate()
    {
        Model::validateRequired('customerEntityType', $this->customerEntityType, true);
        Model::validateRequired('customerEntityContent', $this->customerEntityContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerEntityType) {
            $res['customer_entity_type'] = $this->customerEntityType;
        }
        if (null !== $this->customerEntityContent) {
            $res['customer_entity_content'] = $this->customerEntityContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomEntityInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_entity_type'])) {
            $model->customerEntityType = $map['customer_entity_type'];
        }
        if (isset($map['customer_entity_content'])) {
            $model->customerEntityContent = $map['customer_entity_content'];
        }

        return $model;
    }
}
