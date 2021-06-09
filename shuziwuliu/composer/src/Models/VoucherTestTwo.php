<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class VoucherTestTwo extends Model
{
    // 测试Boolean
    /**
     * @example test
     *
     * @var bool
     */
    public $voucherTestTwoBoolean;

    // 凭证列表_apiTestList
    /**
     * @example test
     *
     * @var VoucherTestOne[]
     */
    public $voucherTestTwoApiTestList;

    // 测试Int
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestTwoInt;

    // 测试Integer
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestTwoInteger;

    // 凭证列表_dateList
    /**
     * @example test
     *
     * @var string[]
     */
    public $voucherTestTwoDateList;

    // 测试String
    /**
     * @example test
     *
     * @var string
     */
    public $voucherTestTwoString;

    // 测试Date
    /**
     * @example test
     *
     * @var string
     */
    public $voucherTestTwoDate;

    // 凭证列表_integerList
    /**
     * @example test
     *
     * @var int[]
     */
    public $voucherTestTwoIntegerList;

    // 测试Long
    /**
     * @example test
     *
     * @var int
     */
    public $voucherTestTwoLong;

    // 凭证列表_longList
    /**
     * @example test
     *
     * @var int[]
     */
    public $voucherTestTwoLongList;

    // 凭证列表_stringList
    /**
     * @example test
     *
     * @var string[]
     */
    public $voucherTestTwoStringList;

    // 测试apiTestInfo
    /**
     * @example test
     *
     * @var VoucherTestOne
     */
    public $voucherTestTwoApiTestInfo;

    // 凭证列表_booleanList
    /**
     * @example test
     *
     * @var bool[]
     */
    public $voucherTestTwoBooleanList;
    protected $_name = [
        'voucherTestTwoBoolean'     => 'voucher_test_two_boolean',
        'voucherTestTwoApiTestList' => 'voucher_test_two_api_test_list',
        'voucherTestTwoInt'         => 'voucher_test_two_int',
        'voucherTestTwoInteger'     => 'voucher_test_two_integer',
        'voucherTestTwoDateList'    => 'voucher_test_two_date_list',
        'voucherTestTwoString'      => 'voucher_test_two_string',
        'voucherTestTwoDate'        => 'voucher_test_two_date',
        'voucherTestTwoIntegerList' => 'voucher_test_two_integer_list',
        'voucherTestTwoLong'        => 'voucher_test_two_long',
        'voucherTestTwoLongList'    => 'voucher_test_two_long_list',
        'voucherTestTwoStringList'  => 'voucher_test_two_string_list',
        'voucherTestTwoApiTestInfo' => 'voucher_test_two_api_test_info',
        'voucherTestTwoBooleanList' => 'voucher_test_two_boolean_list',
    ];

    public function validate()
    {
        Model::validateRequired('voucherTestTwoBoolean', $this->voucherTestTwoBoolean, true);
        Model::validateRequired('voucherTestTwoApiTestList', $this->voucherTestTwoApiTestList, true);
        Model::validateRequired('voucherTestTwoInt', $this->voucherTestTwoInt, true);
        Model::validateRequired('voucherTestTwoInteger', $this->voucherTestTwoInteger, true);
        Model::validateRequired('voucherTestTwoDateList', $this->voucherTestTwoDateList, true);
        Model::validateRequired('voucherTestTwoString', $this->voucherTestTwoString, true);
        Model::validateRequired('voucherTestTwoDate', $this->voucherTestTwoDate, true);
        Model::validateRequired('voucherTestTwoIntegerList', $this->voucherTestTwoIntegerList, true);
        Model::validateRequired('voucherTestTwoLong', $this->voucherTestTwoLong, true);
        Model::validateRequired('voucherTestTwoLongList', $this->voucherTestTwoLongList, true);
        Model::validateRequired('voucherTestTwoStringList', $this->voucherTestTwoStringList, true);
        Model::validateRequired('voucherTestTwoApiTestInfo', $this->voucherTestTwoApiTestInfo, true);
        Model::validateRequired('voucherTestTwoBooleanList', $this->voucherTestTwoBooleanList, true);
        Model::validateMaximum('voucherTestTwoInteger', $this->voucherTestTwoInteger, 10);
        Model::validateMaximum('voucherTestTwoLong', $this->voucherTestTwoLong, 10);
        Model::validateMinimum('voucherTestTwoInteger', $this->voucherTestTwoInteger, 0);
        Model::validateMinimum('voucherTestTwoLong', $this->voucherTestTwoLong, 0);
        Model::validateMaxLength('voucherTestTwoString', $this->voucherTestTwoString, 10);
        Model::validateMinLength('voucherTestTwoString', $this->voucherTestTwoString, 0);
        Model::validatePattern('voucherTestTwoDate', $this->voucherTestTwoDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherTestTwoBoolean) {
            $res['voucher_test_two_boolean'] = $this->voucherTestTwoBoolean;
        }
        if (null !== $this->voucherTestTwoApiTestList) {
            $res['voucher_test_two_api_test_list'] = [];
            if (null !== $this->voucherTestTwoApiTestList && \is_array($this->voucherTestTwoApiTestList)) {
                $n = 0;
                foreach ($this->voucherTestTwoApiTestList as $item) {
                    $res['voucher_test_two_api_test_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->voucherTestTwoInt) {
            $res['voucher_test_two_int'] = $this->voucherTestTwoInt;
        }
        if (null !== $this->voucherTestTwoInteger) {
            $res['voucher_test_two_integer'] = $this->voucherTestTwoInteger;
        }
        if (null !== $this->voucherTestTwoDateList) {
            $res['voucher_test_two_date_list'] = $this->voucherTestTwoDateList;
        }
        if (null !== $this->voucherTestTwoString) {
            $res['voucher_test_two_string'] = $this->voucherTestTwoString;
        }
        if (null !== $this->voucherTestTwoDate) {
            $res['voucher_test_two_date'] = $this->voucherTestTwoDate;
        }
        if (null !== $this->voucherTestTwoIntegerList) {
            $res['voucher_test_two_integer_list'] = $this->voucherTestTwoIntegerList;
        }
        if (null !== $this->voucherTestTwoLong) {
            $res['voucher_test_two_long'] = $this->voucherTestTwoLong;
        }
        if (null !== $this->voucherTestTwoLongList) {
            $res['voucher_test_two_long_list'] = $this->voucherTestTwoLongList;
        }
        if (null !== $this->voucherTestTwoStringList) {
            $res['voucher_test_two_string_list'] = $this->voucherTestTwoStringList;
        }
        if (null !== $this->voucherTestTwoApiTestInfo) {
            $res['voucher_test_two_api_test_info'] = null !== $this->voucherTestTwoApiTestInfo ? $this->voucherTestTwoApiTestInfo->toMap() : null;
        }
        if (null !== $this->voucherTestTwoBooleanList) {
            $res['voucher_test_two_boolean_list'] = $this->voucherTestTwoBooleanList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherTestTwo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_test_two_boolean'])) {
            $model->voucherTestTwoBoolean = $map['voucher_test_two_boolean'];
        }
        if (isset($map['voucher_test_two_api_test_list'])) {
            if (!empty($map['voucher_test_two_api_test_list'])) {
                $model->voucherTestTwoApiTestList = [];
                $n                                = 0;
                foreach ($map['voucher_test_two_api_test_list'] as $item) {
                    $model->voucherTestTwoApiTestList[$n++] = null !== $item ? VoucherTestOne::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['voucher_test_two_int'])) {
            $model->voucherTestTwoInt = $map['voucher_test_two_int'];
        }
        if (isset($map['voucher_test_two_integer'])) {
            $model->voucherTestTwoInteger = $map['voucher_test_two_integer'];
        }
        if (isset($map['voucher_test_two_date_list'])) {
            if (!empty($map['voucher_test_two_date_list'])) {
                $model->voucherTestTwoDateList = $map['voucher_test_two_date_list'];
            }
        }
        if (isset($map['voucher_test_two_string'])) {
            $model->voucherTestTwoString = $map['voucher_test_two_string'];
        }
        if (isset($map['voucher_test_two_date'])) {
            $model->voucherTestTwoDate = $map['voucher_test_two_date'];
        }
        if (isset($map['voucher_test_two_integer_list'])) {
            if (!empty($map['voucher_test_two_integer_list'])) {
                $model->voucherTestTwoIntegerList = $map['voucher_test_two_integer_list'];
            }
        }
        if (isset($map['voucher_test_two_long'])) {
            $model->voucherTestTwoLong = $map['voucher_test_two_long'];
        }
        if (isset($map['voucher_test_two_long_list'])) {
            if (!empty($map['voucher_test_two_long_list'])) {
                $model->voucherTestTwoLongList = $map['voucher_test_two_long_list'];
            }
        }
        if (isset($map['voucher_test_two_string_list'])) {
            if (!empty($map['voucher_test_two_string_list'])) {
                $model->voucherTestTwoStringList = $map['voucher_test_two_string_list'];
            }
        }
        if (isset($map['voucher_test_two_api_test_info'])) {
            $model->voucherTestTwoApiTestInfo = VoucherTestOne::fromMap($map['voucher_test_two_api_test_info']);
        }
        if (isset($map['voucher_test_two_boolean_list'])) {
            if (!empty($map['voucher_test_two_boolean_list'])) {
                $model->voucherTestTwoBooleanList = $map['voucher_test_two_boolean_list'];
            }
        }

        return $model;
    }
}
