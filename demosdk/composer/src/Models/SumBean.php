<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class SumBean extends Model
{
    // 元素名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $eName;

    // 数量
    /**
     * @example 23
     *
     * @var int
     */
    public $num;
    protected $_name = [
        'eName' => 'e_name',
        'num'   => 'num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eName) {
            $res['e_name'] = $this->eName;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SumBean
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['e_name'])) {
            $model->eName = $map['e_name'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }

        return $model;
    }
}
