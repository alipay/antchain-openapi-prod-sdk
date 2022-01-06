<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Subscriber extends Model
{
    // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
    //
    /**
     * @example true, false
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

    // 校验值
    //
    /**
     * @example afewgewhg24325
     *
     * @var string
     */
    public $checkSum;

    // 服务id
    //
    /**
     * @example com.antfin.demo.endpoint.facade.SampleRestFacade
     *
     * @var string
     */
    public $dataId;

    // 创建日期
    /**
     * @example 2019-12
     *
     * @var string
     */
    public $gmtCreate;

    // 最后更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 发布这个服务的主机的 ip，不同于 service_ip
    /**
     * @example 10.15.237.34
     *
     * @var string
     */
    public $hostIp;

    // 消费者id
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 租户实例id
    //
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 进程ID
    //
    /**
     * @example 10.15.237.34:53264
     *
     * @var string
     */
    public $processId;

    // 订阅者的订阅维度
    /**
     * @example dataCenter
     *
     * @var string
     */
    public $scope;

    // 订阅端订阅时使用的 zone
    /**
     * @example DEFAULT_ZONE
     *
     * @var string
     */
    public $zone;
    protected $_name = [
        'alive'       => 'alive',
        'appName'     => 'app_name',
        'checkSum'    => 'check_sum',
        'dataId'      => 'data_id',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'hostIp'      => 'host_ip',
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'processId'   => 'process_id',
        'scope'       => 'scope',
        'zone'        => 'zone',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->checkSum) {
            $res['check_sum'] = $this->checkSum;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
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
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Subscriber
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
        if (isset($map['check_sum'])) {
            $model->checkSum = $map['check_sum'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
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
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }

        return $model;
    }
}
