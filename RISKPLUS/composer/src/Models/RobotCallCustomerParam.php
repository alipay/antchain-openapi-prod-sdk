<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RobotCallCustomerParam extends Model
{
    // 手机号/手机号md5
    /**
     * @example 12345
     *
     * @var string
     */
    public $customerKey;

    // 用户维度透传字段
    /**
     * @example 12345
     *
     * @var string
     */
    public $customerOutInfo;

    // 外呼话术变量字段
    /**
     * @example {"key1":"v1"}
     *
     * @var string
     */
    public $properties;
    protected $_name = [
        'customerKey'     => 'customer_key',
        'customerOutInfo' => 'customer_out_info',
        'properties'      => 'properties',
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
        if (null !== $this->customerOutInfo) {
            $res['customer_out_info'] = $this->customerOutInfo;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RobotCallCustomerParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['customer_out_info'])) {
            $model->customerOutInfo = $map['customer_out_info'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
