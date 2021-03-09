<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class Customer extends Model
{
    // 企业创建时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $createTime;

    // 企业ID
    /**
     * @example 2088xxxxx1
     *
     * @var string
     */
    public $id;

    // 企业名称
    /**
     * @example 蚂蚁金融云有限公司
     *
     * @var string
     */
    public $name;

    // 企业最近一次修改时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'createTime' => 'create_time',
        'id'         => 'id',
        'name'       => 'name',
        'updateTime' => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Customer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
