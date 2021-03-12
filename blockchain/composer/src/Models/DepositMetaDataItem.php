<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DepositMetaDataItem extends Model
{
    // 结构化存证时该item的描述
    /**
     * @example 货物个数
     *
     * @var string
     */
    public $desc;

    // 结构化存证该数据字段的唯一索引
    /**
     * @example item_id
     *
     * @var string
     */
    public $key;

    // 结构化存证时该item的类型
    // 0 text
    // 1 encrypt text
    // 2 txHash
    // 3 image url
    // 4 vedio url
    // 5 map url
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // 结构化数据存证时，该item的值
    /**
     * @example 10个
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'desc'  => 'desc',
        'key'   => 'key',
        'type'  => 'type',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DepositMetaDataItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
