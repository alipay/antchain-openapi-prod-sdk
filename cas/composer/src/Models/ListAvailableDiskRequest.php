<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListAvailableDiskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region name
    /**
     * @var string
     */
    public $region;

    // 磁盘类型：
    // SystemDisk;
    // DataDisk
    /**
     * @var string
     */
    public $diskType;

    // 实例规格
    /**
     * @var string
     */
    public $instanceType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'region'       => 'region',
        'diskType'     => 'disk_type',
        'instanceType' => 'instance_type',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('diskType', $this->diskType, true);
        Model::validateRequired('instanceType', $this->instanceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->diskType) {
            $res['disk_type'] = $this->diskType;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAvailableDiskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['disk_type'])) {
            $model->diskType = $map['disk_type'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }

        return $model;
    }
}
