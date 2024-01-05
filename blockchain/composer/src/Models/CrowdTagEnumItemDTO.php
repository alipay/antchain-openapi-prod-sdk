<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CrowdTagEnumItemDTO extends Model
{
    // 枚举名称
    /**
     * @example 性别
     *
     * @var string
     */
    public $name;

    // 枚举值
    /**
     * @example F
     *
     * @var string
     */
    public $val;
    protected $_name = [
        'name' => 'name',
        'val'  => 'val',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('val', $this->val, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->val) {
            $res['val'] = $this->val;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrowdTagEnumItemDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['val'])) {
            $model->val = $map['val'];
        }

        return $model;
    }
}
