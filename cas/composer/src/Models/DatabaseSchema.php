<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseSchema extends Model
{
    // 字符集
    /**
     * @example MYSQLUTF8
     *
     * @var string
     */
    public $charSet;

    // 数量
    /**
     * @example
     *
     * @var int
     */
    public $count;

    // 是否自动生成名称。默认为 true
    /**
     * @example false
     *
     * @var bool
     */
    public $isAutoName;

    // 名称
    /**
     * @example ddd
     *
     * @var string
     */
    public $name;

    // 序列号是否连续。默认为 false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSerial;
    protected $_name = [
        'charSet'    => 'char_set',
        'count'      => 'count',
        'isAutoName' => 'is_auto_name',
        'name'       => 'name',
        'isSerial'   => 'is_serial',
    ];

    public function validate()
    {
        Model::validateRequired('charSet', $this->charSet, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->charSet) {
            $res['char_set'] = $this->charSet;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->isAutoName) {
            $res['is_auto_name'] = $this->isAutoName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->isSerial) {
            $res['is_serial'] = $this->isSerial;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['char_set'])) {
            $model->charSet = $map['char_set'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['is_auto_name'])) {
            $model->isAutoName = $map['is_auto_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['is_serial'])) {
            $model->isSerial = $map['is_serial'];
        }

        return $model;
    }
}
