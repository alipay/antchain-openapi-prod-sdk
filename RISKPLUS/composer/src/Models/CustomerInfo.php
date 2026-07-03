<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerInfo extends Model
{
    // 查询的用户凭证列表
    /**
     * @example 15022321363
     *
     * @var string
     */
    public $customerKey;

    // 客户属性的额外信息
    /**
     * @example {"test_score": 22.0}
     *
     * @var string
     */
    public $properties;
    protected $_name = [
        'customerKey' => 'customer_key',
        'properties'  => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('customerKey', $this->customerKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
