<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApiTestInfo extends Model
{
    // 测试String
    /**
     * @example test
     *
     * @var string
     */
    public $testString;

    // 测试Int
    /**
     * @example test
     *
     * @var int
     */
    public $testInt;

    // 测试Integer
    /**
     * @example test
     *
     * @var int
     */
    public $testInteger;

    // 测试Long
    /**
     * @example test
     *
     * @var int
     */
    public $testLong;

    // 测试Boolean
    /**
     * @example test
     *
     * @var bool
     */
    public $testBoolean;

    // 测试Date
    /**
     * @example test
     *
     * @var string
     */
    public $testDate;
    protected $_name = [
        'testString'  => 'test_string',
        'testInt'     => 'test_int',
        'testInteger' => 'test_integer',
        'testLong'    => 'test_long',
        'testBoolean' => 'test_boolean',
        'testDate'    => 'test_date',
    ];

    public function validate()
    {
        Model::validateRequired('testString', $this->testString, true);
        Model::validateRequired('testInt', $this->testInt, true);
        Model::validateRequired('testInteger', $this->testInteger, true);
        Model::validateRequired('testLong', $this->testLong, true);
        Model::validateRequired('testBoolean', $this->testBoolean, true);
        Model::validateRequired('testDate', $this->testDate, true);
        Model::validateMaxLength('testString', $this->testString, 100);
        Model::validateMinLength('testString', $this->testString, 0);
        Model::validateMaximum('testInt', $this->testInt, 100);
        Model::validateMaximum('testInteger', $this->testInteger, 100);
        Model::validateMaximum('testLong', $this->testLong, 100);
        Model::validateMinimum('testInt', $this->testInt, 0);
        Model::validateMinimum('testInteger', $this->testInteger, 0);
        Model::validateMinimum('testLong', $this->testLong, 0);
        Model::validatePattern('testDate', $this->testDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->testString) {
            $res['test_string'] = $this->testString;
        }
        if (null !== $this->testInt) {
            $res['test_int'] = $this->testInt;
        }
        if (null !== $this->testInteger) {
            $res['test_integer'] = $this->testInteger;
        }
        if (null !== $this->testLong) {
            $res['test_long'] = $this->testLong;
        }
        if (null !== $this->testBoolean) {
            $res['test_boolean'] = $this->testBoolean;
        }
        if (null !== $this->testDate) {
            $res['test_date'] = $this->testDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTestInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['test_string'])) {
            $model->testString = $map['test_string'];
        }
        if (isset($map['test_int'])) {
            $model->testInt = $map['test_int'];
        }
        if (isset($map['test_integer'])) {
            $model->testInteger = $map['test_integer'];
        }
        if (isset($map['test_long'])) {
            $model->testLong = $map['test_long'];
        }
        if (isset($map['test_boolean'])) {
            $model->testBoolean = $map['test_boolean'];
        }
        if (isset($map['test_date'])) {
            $model->testDate = $map['test_date'];
        }

        return $model;
    }
}
