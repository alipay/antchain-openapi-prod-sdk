<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwService extends Model
{
    // app name
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $appName;

    // cluster name
    /**
     * @example dsrcluster
     *
     * @var string
     */
    public $clusterName;

    // controls
    /**
     * @example
     *
     * @var SofaGwControlVO[]
     */
    public $controls;

    // downstream
    /**
     * @example
     *
     * @var SofaGwDownstream
     */
    public $downstream;

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

    // service name
    /**
     * @example dsr service
     *
     * @var string
     */
    public $name;

    // service_version
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $serviceVersion;

    // 上线:online, 下线:offline
    /**
     * @example online
     *
     * @var string
     */
    public $status;

    // upstream
    /**
     * @example
     *
     * @var SofaGwUpstreamVO
     */
    public $upstream;
    protected $_name = [
        'appName'        => 'app_name',
        'clusterName'    => 'cluster_name',
        'controls'       => 'controls',
        'downstream'     => 'downstream',
        'id'             => 'id',
        'instanceId'     => 'instance_id',
        'name'           => 'name',
        'serviceVersion' => 'service_version',
        'status'         => 'status',
        'upstream'       => 'upstream',
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
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->controls) {
            $res['controls'] = [];
            if (null !== $this->controls && \is_array($this->controls)) {
                $n = 0;
                foreach ($this->controls as $item) {
                    $res['controls'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->downstream) {
            $res['downstream'] = null !== $this->downstream ? $this->downstream->toMap() : null;
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
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->upstream) {
            $res['upstream'] = null !== $this->upstream ? $this->upstream->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['controls'])) {
            if (!empty($map['controls'])) {
                $model->controls = [];
                $n               = 0;
                foreach ($map['controls'] as $item) {
                    $model->controls[$n++] = null !== $item ? SofaGwControlVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['downstream'])) {
            $model->downstream = SofaGwDownstream::fromMap($map['downstream']);
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
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['upstream'])) {
            $model->upstream = SofaGwUpstreamVO::fromMap($map['upstream']);
        }

        return $model;
    }
}
