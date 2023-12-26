<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContracPageReq extends Model
{
    // 合约服务类别
    /**
     * @example 存证合约
     *
     * @var string
     */
    public $type;

    // 页码
    /**
     * @example 1
     *
     * @var int
     */
    public $num;

    // 页大小
    /**
     * @example 200
     *
     * @var int
     */
    public $size;
    protected $_name = [
        'type' => 'type',
        'num'  => 'num',
        'size' => 'size',
    ];

    public function validate()
    {
        Model::validateRequired('num', $this->num, true);
        Model::validateRequired('size', $this->size, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContracPageReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }

        return $model;
    }
}
