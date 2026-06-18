<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointSupplierInfo extends Model
{
    // 供应方名称
    /**
     * @example 爱肯拿
     *
     * @var string
     */
    public $supplierName;

    // 供应方类型
    // 门店：STORE
    // 平台：PLATFORM
    // 供应商：SUPPLIER
    /**
     * @example STORE
     *
     * @var string
     */
    public $supplierType;

    // 供应方编码
    /**
     * @example 0
     *
     * @var string
     */
    public $supplierCode;
    protected $_name = [
        'supplierName' => 'supplier_name',
        'supplierType' => 'supplier_type',
        'supplierCode' => 'supplier_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierType) {
            $res['supplier_type'] = $this->supplierType;
        }
        if (null !== $this->supplierCode) {
            $res['supplier_code'] = $this->supplierCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoiMallPointSupplierInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['supplier_type'])) {
            $model->supplierType = $map['supplier_type'];
        }
        if (isset($map['supplier_code'])) {
            $model->supplierCode = $map['supplier_code'];
        }

        return $model;
    }
}
