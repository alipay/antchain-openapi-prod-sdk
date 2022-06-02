<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Card extends Model
{
    // 名称（该页面的名称，可能做展示用）
    /**
     * @example 名称（该页面的名称，可能做展示用）
     *
     * @var string
     */
    public $name;

    // 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
    /**
     * @example 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
     *
     * @var string
     */
    public $tabShowName;

    // 当前模版所有需要填充元素
    /**
     * @example 当前模版所有需要填充元素
     *
     * @var Pair
     */
    public $keyValues;

    // true：是，false：不是
    // 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
    /**
     * @example 是否作同一个父节点的默认展示
     *
     * @var string
     */
    public $isSelected;

    // 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/
    /**
     * @example [selectCard1,input1]
     *
     * @var string[]
     */
    public $returnValueKey;
    protected $_name = [
        'name'           => 'name',
        'tabShowName'    => 'tab_show_name',
        'keyValues'      => 'key_values',
        'isSelected'     => 'is_selected',
        'returnValueKey' => 'return_value_key',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tabShowName', $this->tabShowName, true);
        Model::validateRequired('keyValues', $this->keyValues, true);
        Model::validateRequired('isSelected', $this->isSelected, true);
        Model::validateRequired('returnValueKey', $this->returnValueKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tabShowName) {
            $res['tab_show_name'] = $this->tabShowName;
        }
        if (null !== $this->keyValues) {
            $res['key_values'] = null !== $this->keyValues ? $this->keyValues->toMap() : null;
        }
        if (null !== $this->isSelected) {
            $res['is_selected'] = $this->isSelected;
        }
        if (null !== $this->returnValueKey) {
            $res['return_value_key'] = $this->returnValueKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Card
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tab_show_name'])) {
            $model->tabShowName = $map['tab_show_name'];
        }
        if (isset($map['key_values'])) {
            $model->keyValues = Pair::fromMap($map['key_values']);
        }
        if (isset($map['is_selected'])) {
            $model->isSelected = $map['is_selected'];
        }
        if (isset($map['return_value_key'])) {
            if (!empty($map['return_value_key'])) {
                $model->returnValueKey = $map['return_value_key'];
            }
        }

        return $model;
    }
}
