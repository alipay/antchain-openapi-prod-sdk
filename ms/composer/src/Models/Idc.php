<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Idc extends Model
{
    // 机房对应配置中心域名
    /**
     * @example undefined
     *
     * @var string
     */
    public $domainName;

    // 机房id
    /**
     * @example undefined
     *
     * @var string
     */
    public $id;

    // 机房名称
    /**
     * @example undefined
     *
     * @var string
     */
    public $name;

    // 是否为预发环境
    /**
     * @example undefined
     *
     * @var bool
     */
    public $preprod;
    protected $_name = [
        'domainName' => 'domain_name',
        'id'         => 'id',
        'name'       => 'name',
        'preprod'    => 'preprod',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domainName) {
            $res['domain_name'] = $this->domainName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->preprod) {
            $res['preprod'] = $this->preprod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Idc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain_name'])) {
            $model->domainName = $map['domain_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['preprod'])) {
            $model->preprod = $map['preprod'];
        }

        return $model;
    }
}
