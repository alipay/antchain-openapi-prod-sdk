<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServicePublisher extends Model
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

    // 服务提供方客户端发布的IP
    /**
     * @example 10.10.10.10
     *
     * @var string
     */
    public $serviceIp;

    // 服务提供方客户端发布的端口
    /**
     * @example 12200
     *
     * @var int
     */
    public $servicePort;

    // 请求权重，范围：0-100
    /**
     * @example 100
     *
     * @var int
     */
    public $weight;

    // 逻辑机房
    /**
     * @example Cell1
     *
     * @var string
     */
    public $zone;
    protected $_name = [
        'instanceId'  => 'instance_id',
        'dataId'      => 'data_id',
        'appName'     => 'app_name',
        'hostIp'      => 'host_ip',
        'serviceIp'   => 'service_ip',
        'servicePort' => 'service_port',
        'weight'      => 'weight',
        'zone'        => 'zone',
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
        if (null !== $this->serviceIp) {
            $res['service_ip'] = $this->serviceIp;
        }
        if (null !== $this->servicePort) {
            $res['service_port'] = $this->servicePort;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServicePublisher
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
        if (isset($map['service_ip'])) {
            $model->serviceIp = $map['service_ip'];
        }
        if (isset($map['service_port'])) {
            $model->servicePort = $map['service_port'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
