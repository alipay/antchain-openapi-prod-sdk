<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class ApiTest extends Model
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

    // 凭证列表_stringList
    /**
     * @example test
     *
     * @var string[]
     */
    public $stringList;

    // 凭证列表_ints
    /**
     * @example test
     *
     * @var int[]
     */
    public $ints;

    // 凭证列表_longs
    /**
     * @example test
     *
     * @var int[]
     */
    public $longs;

    // 凭证列表_integerList
    /**
     * @example test
     *
     * @var int[]
     */
    public $integerList;

    // 凭证列表_longList
    /**
     * @example test
     *
     * @var int[]
     */
    public $longList;

    // 凭证列表_booleanList
    /**
     * @example test
     *
     * @var bool[]
     */
    public $booleanList;

    // 凭证列表_dateList
    /**
     * @example test
     *
     * @var string[]
     */
    public $dateList;

    // 凭证列表_apiTestList
    /**
     * @example test
     *
     * @var ApiTestInfo[]
     */
    public $apiTestList;

    // 测试apiTestInfo
    /**
     * @example test
     *
     * @var \AntChain\SHUZIWULIU\Models\ApiTest
     */
    public $apiTestInfo;
    protected $_name = [
        'testString'  => 'test_string',
        'testInt'     => 'test_int',
        'testInteger' => 'test_integer',
        'testLong'    => 'test_long',
        'testBoolean' => 'test_boolean',
        'testDate'    => 'test_date',
        'stringList'  => 'string_list',
        'ints'        => 'ints',
        'longs'       => 'longs',
        'integerList' => 'integer_list',
        'longList'    => 'long_list',
        'booleanList' => 'boolean_list',
        'dateList'    => 'date_list',
        'apiTestList' => 'api_test_list',
        'apiTestInfo' => 'api_test_info',
    ];

    public function validate()
    {
        Model::validateRequired('testString', $this->testString, true);
        Model::validateRequired('testInt', $this->testInt, true);
        Model::validateRequired('testInteger', $this->testInteger, true);
        Model::validateRequired('testLong', $this->testLong, true);
        Model::validateRequired('testBoolean', $this->testBoolean, true);
        Model::validateRequired('testDate', $this->testDate, true);
        Model::validateRequired('stringList', $this->stringList, true);
        Model::validateRequired('ints', $this->ints, true);
        Model::validateRequired('longs', $this->longs, true);
        Model::validateRequired('integerList', $this->integerList, true);
        Model::validateRequired('longList', $this->longList, true);
        Model::validateRequired('booleanList', $this->booleanList, true);
        Model::validateRequired('dateList', $this->dateList, true);
        Model::validateRequired('apiTestList', $this->apiTestList, true);
        Model::validateRequired('apiTestInfo', $this->apiTestInfo, true);
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
        if (null !== $this->stringList) {
            $res['string_list'] = $this->stringList;
        }
        if (null !== $this->ints) {
            $res['ints'] = $this->ints;
        }
        if (null !== $this->longs) {
            $res['longs'] = $this->longs;
        }
        if (null !== $this->integerList) {
            $res['integer_list'] = $this->integerList;
        }
        if (null !== $this->longList) {
            $res['long_list'] = $this->longList;
        }
        if (null !== $this->booleanList) {
            $res['boolean_list'] = $this->booleanList;
        }
        if (null !== $this->dateList) {
            $res['date_list'] = $this->dateList;
        }
        if (null !== $this->apiTestList) {
            $res['api_test_list'] = [];
            if (null !== $this->apiTestList && \is_array($this->apiTestList)) {
                $n = 0;
                foreach ($this->apiTestList as $item) {
                    $res['api_test_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->apiTestInfo) {
            $res['api_test_info'] = null !== $this->apiTestInfo ? $this->apiTestInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTest
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
        if (isset($map['string_list'])) {
            if (!empty($map['string_list'])) {
                $model->stringList = $map['string_list'];
            }
        }
        if (isset($map['ints'])) {
            if (!empty($map['ints'])) {
                $model->ints = $map['ints'];
            }
        }
        if (isset($map['longs'])) {
            if (!empty($map['longs'])) {
                $model->longs = $map['longs'];
            }
        }
        if (isset($map['integer_list'])) {
            if (!empty($map['integer_list'])) {
                $model->integerList = $map['integer_list'];
            }
        }
        if (isset($map['long_list'])) {
            if (!empty($map['long_list'])) {
                $model->longList = $map['long_list'];
            }
        }
        if (isset($map['boolean_list'])) {
            if (!empty($map['boolean_list'])) {
                $model->booleanList = $map['boolean_list'];
            }
        }
        if (isset($map['date_list'])) {
            if (!empty($map['date_list'])) {
                $model->dateList = $map['date_list'];
            }
        }
        if (isset($map['api_test_list'])) {
            if (!empty($map['api_test_list'])) {
                $model->apiTestList = [];
                $n                  = 0;
                foreach ($map['api_test_list'] as $item) {
                    $model->apiTestList[$n++] = null !== $item ? ApiTestInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['api_test_info'])) {
            $model->apiTestInfo = self::fromMap($map['api_test_info']);
        }

        return $model;
    }
}
