<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwClusterVO extends Model
{
    // app name
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $appName;

    // hosts
    /**
     * @example
     *
     * @var SofaGwHostVO[]
     */
    public $hosts;

    // id
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 实例标识
    /**
     * @example abcdEFGH1234
     *
     * @var string
     */
    public $instanceId;

    // 集群名
    /**
     * @example dsrconsole_cluster
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'appName'    => 'app_name',
        'hosts'      => 'hosts',
        'id'         => 'id',
        'instanceId' => 'instance_id',
        'name'       => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->hosts) {
            $res['hosts'] = [];
            if (null !== $this->hosts && \is_array($this->hosts)) {
                $n = 0;
                foreach ($this->hosts as $item) {
                    $res['hosts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwClusterVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['hosts'])) {
            if (!empty($map['hosts'])) {
                $model->hosts = [];
                $n            = 0;
                foreach ($map['hosts'] as $item) {
                    $model->hosts[$n++] = null !== $item ? SofaGwHostVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
