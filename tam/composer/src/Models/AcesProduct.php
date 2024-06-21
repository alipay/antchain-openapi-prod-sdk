<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class AcesProduct extends Model
{
    /**
     * @example 测试产品
     *
     * @var string
     */
    public $cnName;

    /**
     * @example testName
     *
     * @var string
     */
    public $enName;

    /**
     * @example BJXY
     *
     * @var string
     */
    public $code;

    // 产品owner
    /**
     * @example
     *
     * @var string
     */
    public $owner;

    // 产品创建时间
    /**
     * @example
     *
     * @var string
     */
    public $createTime;

    // 产品修改时间
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;

    /**
     * @example
     *
     * @var string
     */
    public $description;

    /**
     * @example
     *
     * @var string
     */
    public $l1;

    /**
     * @example
     *
     * @var string
     */
    public $l2;
    protected $_name = [
        'cnName'      => 'cn_name',
        'enName'      => 'en_name',
        'code'        => 'code',
        'owner'       => 'owner',
        'createTime'  => 'create_time',
        'updateTime'  => 'update_time',
        'description' => 'description',
        'l1'          => 'l1',
        'l2'          => 'l2',
    ];

    public function validate()
    {
        Model::validateRequired('cnName', $this->cnName, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cnName) {
            $res['cn_name'] = $this->cnName;
        }
        if (null !== $this->enName) {
            $res['en_name'] = $this->enName;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->l1) {
            $res['l1'] = $this->l1;
        }
        if (null !== $this->l2) {
            $res['l2'] = $this->l2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AcesProduct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cn_name'])) {
            $model->cnName = $map['cn_name'];
        }
        if (isset($map['en_name'])) {
            $model->enName = $map['en_name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['l1'])) {
            $model->l1 = $map['l1'];
        }
        if (isset($map['l2'])) {
            $model->l2 = $map['l2'];
        }

        return $model;
    }
}
