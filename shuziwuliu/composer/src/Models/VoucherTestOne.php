<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class VoucherTestOne extends Model
{
    // 测试Long
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestOneLong;

    // 测试String
    /**
     * @example test
     *
     * @var string
     */
    public $voucherTestOneString;

    // 测试Int
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestOneInt;

    // 测试Date
    /**
     * @example test
     *
     * @var string
     */
    public $voucherTestOneDate;

    // 测试Integer
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestOneInteger;

    // 测试Boolean
    /**
     * @example test
     *
     * @var bool
     */
    public $voucherTestOneBoolean;
    protected $_name = [
        'voucherTestOneLong'    => 'voucher_test_one_long',
        'voucherTestOneString'  => 'voucher_test_one_string',
        'voucherTestOneInt'     => 'voucher_test_one_int',
        'voucherTestOneDate'    => 'voucher_test_one_date',
        'voucherTestOneInteger' => 'voucher_test_one_integer',
        'voucherTestOneBoolean' => 'voucher_test_one_boolean',
    ];

    public function validate()
    {
        Model::validateRequired('voucherTestOneLong', $this->voucherTestOneLong, true);
        Model::validateRequired('voucherTestOneString', $this->voucherTestOneString, true);
        Model::validateRequired('voucherTestOneInt', $this->voucherTestOneInt, true);
        Model::validateRequired('voucherTestOneDate', $this->voucherTestOneDate, true);
        Model::validateRequired('voucherTestOneInteger', $this->voucherTestOneInteger, true);
        Model::validateRequired('voucherTestOneBoolean', $this->voucherTestOneBoolean, true);
        Model::validateMaximum('voucherTestOneLong', $this->voucherTestOneLong, 10);
        Model::validateMaximum('voucherTestOneInteger', $this->voucherTestOneInteger, 10);
        Model::validateMinimum('voucherTestOneLong', $this->voucherTestOneLong, 0);
        Model::validateMinimum('voucherTestOneInteger', $this->voucherTestOneInteger, 0);
        Model::validateMaxLength('voucherTestOneString', $this->voucherTestOneString, 10);
        Model::validateMinLength('voucherTestOneString', $this->voucherTestOneString, 0);
        Model::validatePattern('voucherTestOneDate', $this->voucherTestOneDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherTestOneLong) {
            $res['voucher_test_one_long'] = $this->voucherTestOneLong;
        }
        if (null !== $this->voucherTestOneString) {
            $res['voucher_test_one_string'] = $this->voucherTestOneString;
        }
        if (null !== $this->voucherTestOneInt) {
            $res['voucher_test_one_int'] = $this->voucherTestOneInt;
        }
        if (null !== $this->voucherTestOneDate) {
            $res['voucher_test_one_date'] = $this->voucherTestOneDate;
        }
        if (null !== $this->voucherTestOneInteger) {
            $res['voucher_test_one_integer'] = $this->voucherTestOneInteger;
        }
        if (null !== $this->voucherTestOneBoolean) {
            $res['voucher_test_one_boolean'] = $this->voucherTestOneBoolean;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherTestOne
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_test_one_long'])) {
            $model->voucherTestOneLong = $map['voucher_test_one_long'];
        }
        if (isset($map['voucher_test_one_string'])) {
            $model->voucherTestOneString = $map['voucher_test_one_string'];
        }
        if (isset($map['voucher_test_one_int'])) {
            $model->voucherTestOneInt = $map['voucher_test_one_int'];
        }
        if (isset($map['voucher_test_one_date'])) {
            $model->voucherTestOneDate = $map['voucher_test_one_date'];
        }
        if (isset($map['voucher_test_one_integer'])) {
            $model->voucherTestOneInteger = $map['voucher_test_one_integer'];
        }
        if (isset($map['voucher_test_one_boolean'])) {
            $model->voucherTestOneBoolean = $map['voucher_test_one_boolean'];
        }

        return $model;
    }
}
