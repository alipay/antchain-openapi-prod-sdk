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

    // 销售角色 法人:TWEV_STORE_MANAGER/销售:TWEV_SALES
    /**
     * @example TWEV_STORE_MANAGER
     *
     * @var string
     */
    public $salesType;
    protected $_name = [
        'salesId'   => 'sales_id',
        'salesType' => 'sales_type',
    ];

    public function validate()
    {
        Model::validateRequired('salesId', $this->salesId, true);
        Model::validateRequired('salesType', $this->salesType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->salesId) {
            $res['sales_id'] = $this->salesId;
        }
        if (null !== $this->salesType) {
            $res['sales_type'] = $this->salesType;
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
        if (isset($map['sales_type'])) {
            $model->salesType = $map['sales_type'];
        }

        return $model;
    }
}
