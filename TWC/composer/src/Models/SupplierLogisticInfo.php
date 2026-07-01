<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SupplierLogisticInfo extends Model
{
    // 采购平台的物流单号
    /**
     * @example SF1234567890
     *
     * @var string
     */
    public $logisticOrderId;
    protected $_name = [
        'logisticOrderId' => 'logistic_order_id',
    ];

    public function validate()
    {
        Model::validateRequired('logisticOrderId', $this->logisticOrderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->logisticOrderId) {
            $res['logistic_order_id'] = $this->logisticOrderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupplierLogisticInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['logistic_order_id'])) {
            $model->logisticOrderId = $map['logistic_order_id'];
        }

        return $model;
    }
}
