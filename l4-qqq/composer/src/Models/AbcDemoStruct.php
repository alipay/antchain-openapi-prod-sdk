<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class AbcDemoStruct extends Model
{
    // 字符串属性
    /**
     * @example str
     *
     * @var string
     */
    public $someString;

    // Long型属性
    /**
     * @example 100
     *
     * @var int
     */
    public $someNumber;

    // 布尔型
    /**
     * @example true, false
     *
     * @var bool
     */
    public $someBoolean;

    // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $someDate;

    // 字符串数组
    /**
     * @example somestring
     *
     * @var string[]
     */
    public $someStringList;

    // 子结构体
    /**
     * @example { "name": "value" }
     *
     * @var SubDemoStruct
     */
    public $someStruct;

    // 结构体数组
    /**
     * @example [{"name": "value"}]
     *
     * @var SubDemoStruct[]
     */
    public $someStructList;
    protected $_name = [
        'someString'     => 'some_string',
        'someNumber'     => 'some_number',
        'someBoolean'    => 'some_boolean',
        'someDate'       => 'some_date',
        'someStringList' => 'some_string_list',
        'someStruct'     => 'some_struct',
        'someStructList' => 'some_struct_list',
    ];

    public function validate()
    {
        Model::validateMaxLength('someString', $this->someString, 100);
        Model::validateMinLength('someString', $this->someString, 10);
        Model::validateRequired('someNumber', $this->someNumber, true);
        Model::validateRequired('someBoolean', $this->someBoolean, true);
        Model::validateRequired('someStruct', $this->someStruct, true);
        Model::validateRequired('someStructList', $this->someStructList, true);
        Model::validateMaximum('someNumber', $this->someNumber, 100);
        Model::validateMinimum('someNumber', $this->someNumber, 1);
        Model::validatePattern('someDate', $this->someDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->someString) {
            $res['some_string'] = $this->someString;
        }
        if (null !== $this->someNumber) {
            $res['some_number'] = $this->someNumber;
        }
        if (null !== $this->someBoolean) {
            $res['some_boolean'] = $this->someBoolean;
        }
        if (null !== $this->someDate) {
            $res['some_date'] = $this->someDate;
        }
        if (null !== $this->someStringList) {
            $res['some_string_list'] = $this->someStringList;
        }
        if (null !== $this->someStruct) {
            $res['some_struct'] = null !== $this->someStruct ? $this->someStruct->toMap() : null;
        }
        if (null !== $this->someStructList) {
            $res['some_struct_list'] = [];
            if (null !== $this->someStructList && \is_array($this->someStructList)) {
                $n = 0;
                foreach ($this->someStructList as $item) {
                    $res['some_struct_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AbcDemoStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['some_string'])) {
            $model->someString = $map['some_string'];
        }
        if (isset($map['some_number'])) {
            $model->someNumber = $map['some_number'];
        }
        if (isset($map['some_boolean'])) {
            $model->someBoolean = $map['some_boolean'];
        }
        if (isset($map['some_date'])) {
            $model->someDate = $map['some_date'];
        }
        if (isset($map['some_string_list'])) {
            if (!empty($map['some_string_list'])) {
                $model->someStringList = $map['some_string_list'];
            }
        }
        if (isset($map['some_struct'])) {
            $model->someStruct = SubDemoStruct::fromMap($map['some_struct']);
        }
        if (isset($map['some_struct_list'])) {
            if (!empty($map['some_struct_list'])) {
                $model->someStructList = [];
                $n                     = 0;
                foreach ($map['some_struct_list'] as $item) {
                    $model->someStructList[$n++] = null !== $item ? SubDemoStruct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
