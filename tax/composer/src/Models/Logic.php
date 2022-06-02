<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Logic extends Model
{
    // 操作符
    // equal = _equal_, // 相等比较
    // notEqual = _notEqual_, // 不相等比较
    // AND = _AND_, // 与逻辑
    // OR = _OR_, // 或逻辑
    /**
     * @example equal
     *
     * @var string
     */
    public $op;

    // 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
    /**
     * @example sss
     *
     * @var string
     */
    public $key;

    // 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
    /**
     * @example d d d
     *
     * @var string
     */
    public $value;

    // 只有 op 是 AND 或者 OR 才需要这个字段
    // [{op: _AND_, // 与逻辑
    // children: [
    // {
    // op: _equal_, // 相等比较
    // key: _validationMethod_, // 表示：验证方式
    // value: _smsCode_  // 表示：短信验证码
    // },
    // { // 判断登录信息的值不为 null
    // op: _notEqual_, // 不相等比较
    // key: _username_,  // 表示：登录信息
    // value: null
    // }]}]
    /**
     * @example []
     *
     * @var string
     */
    public $children;
    protected $_name = [
        'op'       => 'op',
        'key'      => 'key',
        'value'    => 'value',
        'children' => 'children',
    ];

    public function validate()
    {
        Model::validateRequired('op', $this->op, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('children', $this->children, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->op) {
            $res['op'] = $this->op;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Logic
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['op'])) {
            $model->op = $map['op'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['children'])) {
            $model->children = $map['children'];
        }

        return $model;
    }
}
