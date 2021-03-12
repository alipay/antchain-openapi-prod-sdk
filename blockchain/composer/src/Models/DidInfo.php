<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidInfo extends Model
{
    // 分布式数字身份id
    /**
     * @example 123123
     *
     * @var string
     */
    public $did;

    // 分布式数字身份对应的用户名称
    /**
     * @example 蚂蚁金服
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'did'  => 'did',
        'name' => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
