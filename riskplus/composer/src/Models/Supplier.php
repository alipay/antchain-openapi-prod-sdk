<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Supplier extends Model
{
    // 供应商id
    /**
     * @example 111
     *
     * @var string
     */
    public $supplierId;

    // 供应商名字
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $supplierName;
    protected $_name = [
        'supplierId'   => 'supplier_id',
        'supplierName' => 'supplier_name',
    ];

    public function validate()
    {
        Model::validateRequired('supplierId', $this->supplierId, true);
        Model::validateRequired('supplierName', $this->supplierName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Supplier
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }

        return $model;
    }
}
