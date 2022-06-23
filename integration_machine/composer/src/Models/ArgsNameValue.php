<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class ArgsNameValue extends Model
{
    // 设备参数名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $argsName;

    // 设备参数key
    /**
     * @example key
     *
     * @var string
     */
    public $argsKey;

    // 设备参数value
    /**
     * @example value
     *
     * @var string
     */
    public $argsValue;

    // 设备参数标识(ip,mac,bizid)
    /**
     * @example ip
     *
     * @var string
     */
    public $argsMark;
    protected $_name = [
        'argsName'  => 'args_name',
        'argsKey'   => 'args_key',
        'argsValue' => 'args_value',
        'argsMark'  => 'args_mark',
    ];

    public function validate()
    {
        Model::validateRequired('argsKey', $this->argsKey, true);
        Model::validateRequired('argsValue', $this->argsValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->argsName) {
            $res['args_name'] = $this->argsName;
        }
        if (null !== $this->argsKey) {
            $res['args_key'] = $this->argsKey;
        }
        if (null !== $this->argsValue) {
            $res['args_value'] = $this->argsValue;
        }
        if (null !== $this->argsMark) {
            $res['args_mark'] = $this->argsMark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArgsNameValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['args_name'])) {
            $model->argsName = $map['args_name'];
        }
        if (isset($map['args_key'])) {
            $model->argsKey = $map['args_key'];
        }
        if (isset($map['args_value'])) {
            $model->argsValue = $map['args_value'];
        }
        if (isset($map['args_mark'])) {
            $model->argsMark = $map['args_mark'];
        }

        return $model;
    }
}
