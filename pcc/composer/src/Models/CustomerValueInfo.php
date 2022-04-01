<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class CustomerValueInfo extends Model
{
    // 客户价价值法信息
    /**
     * @example test
     *
     * @var CustomerValueDetail[]
     */
    public $customerValueDetails;
    protected $_name = [
        'customerValueDetails' => 'customer_value_details',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerValueDetails) {
            $res['customer_value_details'] = [];
            if (null !== $this->customerValueDetails && \is_array($this->customerValueDetails)) {
                $n = 0;
                foreach ($this->customerValueDetails as $item) {
                    $res['customer_value_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerValueInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_value_details'])) {
            if (!empty($map['customer_value_details'])) {
                $model->customerValueDetails = [];
                $n                           = 0;
                foreach ($map['customer_value_details'] as $item) {
                    $model->customerValueDetails[$n++] = null !== $item ? CustomerValueDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
