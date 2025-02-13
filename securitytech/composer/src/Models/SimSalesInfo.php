<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimSalesInfo extends Model
{
    // 销售对外业务id
    /**
     * @example
     *
     * @var string
     */
    public $salesId;
    protected $_name = [
        'salesId' => 'sales_id',
    ];

    public function validate()
    {
        Model::validateRequired('salesId', $this->salesId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->salesId) {
            $res['sales_id'] = $this->salesId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimSalesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sales_id'])) {
            $model->salesId = $map['sales_id'];
        }

        return $model;
    }
}
