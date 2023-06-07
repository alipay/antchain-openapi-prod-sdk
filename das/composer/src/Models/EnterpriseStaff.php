<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseStaff extends Model
{
    // 主要人员名称
    /**
     * @example 李*东
     *
     * @var string
     */
    public $name;

    // 法人类型，1-人;2-公司
    /**
     * @example 2
     *
     * @var string
     */
    public $type;

    // 经理
    /**
     * @example 职位
     *
     * @var string[]
     */
    public $typeJoin;
    protected $_name = [
        'name'     => 'name',
        'type'     => 'type',
        'typeJoin' => 'type_join',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->typeJoin) {
            $res['type_join'] = $this->typeJoin;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseStaff
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['type_join'])) {
            if (!empty($map['type_join'])) {
                $model->typeJoin = $map['type_join'];
            }
        }

        return $model;
    }
}
