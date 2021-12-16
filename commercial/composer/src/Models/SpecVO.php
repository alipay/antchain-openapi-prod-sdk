<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class SpecVO extends Model
{
    // 规格code
    /**
     * @example software_bpaas_xxxx_xxx_pre
     *
     * @var string
     */
    public $specCode;

    // 规格名称
    /**
     * @example specName_xxx
     *
     * @var string
     */
    public $specName;

    // 主要付款方式
    /**
     * @example PRE
     *
     * @var string
     */
    public $mainPayMethod;

    // 售卖模式
    /**
     * @example LICENSE
     *
     * @var string
     */
    public $salesMode;

    // 规格状态
    /**
     * @example EDITING
     *
     * @var string
     */
    public $specStatus;

    // 规格描述
    /**
     * @example 规格描述xxx
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'specCode'      => 'spec_code',
        'specName'      => 'spec_name',
        'mainPayMethod' => 'main_pay_method',
        'salesMode'     => 'sales_mode',
        'specStatus'    => 'spec_status',
        'desc'          => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specName', $this->specName, true);
        Model::validateRequired('mainPayMethod', $this->mainPayMethod, true);
        Model::validateRequired('salesMode', $this->salesMode, true);
        Model::validateRequired('specStatus', $this->specStatus, true);
        Model::validateRequired('desc', $this->desc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }
        if (null !== $this->mainPayMethod) {
            $res['main_pay_method'] = $this->mainPayMethod;
        }
        if (null !== $this->salesMode) {
            $res['sales_mode'] = $this->salesMode;
        }
        if (null !== $this->specStatus) {
            $res['spec_status'] = $this->specStatus;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpecVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }
        if (isset($map['main_pay_method'])) {
            $model->mainPayMethod = $map['main_pay_method'];
        }
        if (isset($map['sales_mode'])) {
            $model->salesMode = $map['sales_mode'];
        }
        if (isset($map['spec_status'])) {
            $model->specStatus = $map['spec_status'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
