<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class StarAgentInfo extends Model
{
    // computer serial number
    /**
     * @example 12345678
     *
     * @var string
     */
    public $sn;

    // hostname
    /**
     * @example hostname
     *
     * @var string
     */
    public $hostname;

    // ip
    /**
     * @example 10.167.32.9
     *
     * @var string
     */
    public $ip;

    // ip list
    /**
     * @example iplist
     *
     * @var string
     */
    public $ipList;

    // 状态取值：RUNNING，ERROR，REGISTER，NOFIND
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'sn'       => 'sn',
        'hostname' => 'hostname',
        'ip'       => 'ip',
        'ipList'   => 'ip_list',
        'status'   => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->ipList) {
            $res['ip_list'] = $this->ipList;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StarAgentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['ip_list'])) {
            $model->ipList = $map['ip_list'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
