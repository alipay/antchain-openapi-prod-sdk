<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class Commodity extends Model
{
    // 商品编码
    /**
     * @example KKAASP00000001
     *
     * @var string
     */
    public $code;

    // 商品名称
    /**
     * @example 测试商品
     *
     * @var string
     */
    public $name;

    // 商品状态
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'code'   => 'code',
        'name'   => 'name',
        'status' => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Commodity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
