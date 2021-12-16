<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateCommercialcoreSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 规格code
    /**
     * @var string
     */
    public $specCode;

    // 规格名称
    /**
     * @var string
     */
    public $specName;

    // 主要付款方式
    /**
     * @var string
     */
    public $mainPayMethod;

    // 售卖模式
    /**
     * @var string
     */
    public $salesMode;

    // 规格描述
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'authToken'     => 'auth_token',
        'specCode'      => 'spec_code',
        'specName'      => 'spec_name',
        'mainPayMethod' => 'main_pay_method',
        'salesMode'     => 'sales_mode',
        'desc'          => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specName', $this->specName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCommercialcoreSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
