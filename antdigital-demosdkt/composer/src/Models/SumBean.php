<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDKT\Models;

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

    // test
    /**
     * @example undefined
     *
     * @var ResultTests
     */
    public $info;
    protected $_name = [
        'eName' => 'e_name',
        'num'   => 'num',
        'info'  => 'info',
    ];

    public function validate()
    {
        Model::validateRequired('info', $this->info, true);
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
        if (null !== $this->info) {
            $res['info'] = null !== $this->info ? $this->info->toMap() : null;
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
        if (isset($map['info'])) {
            $model->info = ResultTests::fromMap($map['info']);
        }

        return $model;
    }
}
