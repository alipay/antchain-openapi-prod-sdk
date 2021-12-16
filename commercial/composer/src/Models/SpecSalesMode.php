<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class SpecSalesMode extends Model
{
    // 规格售卖模式
    /**
     * @example PRE
     *
     * @var string
     */
    public $salesModeCode;

    // 售卖模式
    /**
     * @example 包年包月
     *
     * @var string
     */
    public $salesModeName;
    protected $_name = [
        'salesModeCode' => 'sales_mode_code',
        'salesModeName' => 'sales_mode_name',
    ];

    public function validate()
    {
        Model::validateRequired('salesModeCode', $this->salesModeCode, true);
        Model::validateRequired('salesModeName', $this->salesModeName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->salesModeCode) {
            $res['sales_mode_code'] = $this->salesModeCode;
        }
        if (null !== $this->salesModeName) {
            $res['sales_mode_name'] = $this->salesModeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpecSalesMode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sales_mode_code'])) {
            $model->salesModeCode = $map['sales_mode_code'];
        }
        if (isset($map['sales_mode_name'])) {
            $model->salesModeName = $map['sales_mode_name'];
        }

        return $model;
    }
}
