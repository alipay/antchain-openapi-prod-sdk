<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServiceSubscriber extends Model
{
    // 实例标识
    /**
     * @example abcdEFGH1234
     *
     * @var string
     */
    public $instanceId;

    // 服务标识
    /**
     * @example com.alipay.sofa.demo.Facade:1.0@DEFAULT
     *
     * @var string
     */
    public $dataId;

    // 应用名称
    /**
     * @example demoApp
     *
     * @var string
     */
    public $appName;

    // 服务提供方客户端IP
    /**
     * @example 10.10.10.10
     *
     * @var string
     */
    public $hostIp;

    // 逻辑机房
    /**
     * @example CELL1
     *
     * @var string
     */
    public $zone;
    protected $_name = [
        'instanceId' => 'instance_id',
        'dataId'     => 'data_id',
        'appName'    => 'app_name',
        'hostIp'     => 'host_ip',
        'zone'       => 'zone',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceSubscriber
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
