<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListResourceDiskRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 要查询的云盘或本地盘类型。取值范围：
    //
    // all：同时查询系统盘与数据盘
    // system：只查询系统盘
    // data：只查询数据盘
    // 默认值：all。
    /**
     * @var string
     */
    public $diskType;

    // 实例规格
    /**
     * @var string
     */
    public $instanceType;

    // region name
    /**
     * @var string
     */
    public $region;
    protected $_name = [
        'authToken'    => 'auth_token',
        'diskType'     => 'disk_type',
        'instanceType' => 'instance_type',
        'region'       => 'region',
    ];

    public function validate()
    {
        Model::validateRequired('instanceType', $this->instanceType, true);
        Model::validateRequired('region', $this->region, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->diskType) {
            $res['disk_type'] = $this->diskType;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListResourceDiskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['disk_type'])) {
            $model->diskType = $map['disk_type'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }

        return $model;
    }
}
