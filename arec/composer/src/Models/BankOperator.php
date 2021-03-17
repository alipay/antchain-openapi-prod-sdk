<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class BankOperator extends Model
{
    // 网办操作员工号
    /**
     * @example 0000001
     *
     * @var string
     */
    public $opNo;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 证件类型
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 证件号
    /**
     * @example 330108****1232
     *
     * @var string
     */
    public $certNo;

    // 手机号
    /**
     * @example 13512334454
     *
     * @var string
     */
    public $mobile;
    protected $_name = [
        'opNo'     => 'op_no',
        'name'     => 'name',
        'certType' => 'cert_type',
        'certNo'   => 'cert_no',
        'mobile'   => 'mobile',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->opNo) {
            $res['op_no'] = $this->opNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BankOperator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['op_no'])) {
            $model->opNo = $map['op_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
