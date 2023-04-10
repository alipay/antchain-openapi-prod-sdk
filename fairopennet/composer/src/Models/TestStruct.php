<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class TestStruct extends Model
{
    // 测试名称
    /**
     * @example "t1"
     *
     * @var string
     */
    public $name;

    // 消息体
    /**
     * @example "hello_world"
     *
     * @var string
     */
    public $msg;
    protected $_name = [
        'name' => 'name',
        'msg'  => 'msg',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('msg', $this->msg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
