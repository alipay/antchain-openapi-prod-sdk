<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppNodeEcsList extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // zone_id
    /**
     * @example zone_id
     *
     * @var string
     */
    public $zoneId;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // load_balancer_spec
    /**
     * @example load_balancer_spec
     *
     * @var string
     */
    public $loadBalancerSpec;

    // cpu
    /**
     * @example cpu
     *
     * @var string
     */
    public $cpu;

    // memory
    /**
     * @example memory
     *
     * @var string
     */
    public $memory;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // status
    /**
     * @example running
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'id'               => 'id',
        'zoneId'           => 'zone_id',
        'ip'               => 'ip',
        'loadBalancerSpec' => 'load_balancer_spec',
        'cpu'              => 'cpu',
        'memory'           => 'memory',
        'version'          => 'version',
        'name'             => 'name',
        'status'           => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->loadBalancerSpec) {
            $res['load_balancer_spec'] = $this->loadBalancerSpec;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppNodeEcsList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['load_balancer_spec'])) {
            $model->loadBalancerSpec = $map['load_balancer_spec'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
