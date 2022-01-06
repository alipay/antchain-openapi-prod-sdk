<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Publisher extends Model
{
    // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
    /**
     * @example 1
     *
     * @var bool
     */
    public $alive;

    // 应用名
    /**
     * @example consumer-demo
     *
     * @var string
     */
    public $appName;

    // appVersion
    /**
     * @example 1.0
     *
     * @var string
     */
    public $appVersion;

    // 校验值
    /**
     * @example 12wfewgfterw
     *
     * @var string
     */
    public $checkSum;

    // 注册的内容
    /**
     * @example 注册的内容
     *
     * @var string
     */
    public $content;

    // 服务id
    /**
     * @example com.antfin.demo.endpoint.facade.SampleRestFacade
     *
     * @var string
     */
    public $dataId;

    // IP
    /**
     * @example 10.12.32.144
     *
     * @var string
     */
    public $hostIp;

    // 服务id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // mosn
    /**
     * @example true, false
     *
     * @var bool
     */
    public $mosn;

    // 进程ID
    //
    /**
     * @example 14321
     *
     * @var string
     */
    public $processId;

    // 协议
    /**
     * @example bolt
     *
     * @var string
     */
    public $protocol;

    // 服务ip
    /**
     * @example 11.23
     *
     * @var string
     */
    public $serviceIp;

    // 服务端口
    /**
     * @example 8000
     *
     * @var int
     */
    public $servicePort;

    // 状态
    /**
     * @example true
     *
     * @var bool
     */
    public $status;

    // 超时时间
    /**
     * @example 10000
     *
     * @var int
     */
    public $timeout;

    // 是否是虚拟机模式
    /**
     * @example true
     *
     * @var bool
     */
    public $vmMode;

    // 权重
    /**
     * @example 45
     *
     * @var int
     */
    public $weight;

    // 逻辑机房
    //
    /**
     * @example zone1
     *
     * @var string
     */
    public $zone;

    // 修改过的权重
    /**
     * @example 100
     *
     * @var string
     */
    public $configWeight;
    protected $_name = [
        'alive'        => 'alive',
        'appName'      => 'app_name',
        'appVersion'   => 'app_version',
        'checkSum'     => 'check_sum',
        'content'      => 'content',
        'dataId'       => 'data_id',
        'hostIp'       => 'host_ip',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'mosn'         => 'mosn',
        'processId'    => 'process_id',
        'protocol'     => 'protocol',
        'serviceIp'    => 'service_ip',
        'servicePort'  => 'service_port',
        'status'       => 'status',
        'timeout'      => 'timeout',
        'vmMode'       => 'vm_mode',
        'weight'       => 'weight',
        'zone'         => 'zone',
        'configWeight' => 'config_weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alive) {
            $res['alive'] = $this->alive;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->checkSum) {
            $res['check_sum'] = $this->checkSum;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->mosn) {
            $res['mosn'] = $this->mosn;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->serviceIp) {
            $res['service_ip'] = $this->serviceIp;
        }
        if (null !== $this->servicePort) {
            $res['service_port'] = $this->servicePort;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->vmMode) {
            $res['vm_mode'] = $this->vmMode;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->configWeight) {
            $res['config_weight'] = $this->configWeight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Publisher
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alive'])) {
            $model->alive = $map['alive'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['check_sum'])) {
            $model->checkSum = $map['check_sum'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['mosn'])) {
            $model->mosn = $map['mosn'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['service_ip'])) {
            $model->serviceIp = $map['service_ip'];
        }
        if (isset($map['service_port'])) {
            $model->servicePort = $map['service_port'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['vm_mode'])) {
            $model->vmMode = $map['vm_mode'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['config_weight'])) {
            $model->configWeight = $map['config_weight'];
        }

        return $model;
    }
}
