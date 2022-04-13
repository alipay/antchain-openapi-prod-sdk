<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Cluster extends Model
{
    // 集群创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // env
    /**
     * @example env
     *
     * @var string
     */
    public $env;

    // 集群是否健康
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isHealthy;

    // 集群名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // region name
    //
    /**
     * @example shfin
     *
     * @var string
     */
    public $regionName;

    // 独占
    /**
     * @example dedicated
     *
     * @var string
     */
    public $type;

    // 集群版本
    /**
     * @example 1.12
     *
     * @var string
     */
    public $version;

    // 环境名称
    /**
     * @example dev环境名称
     *
     * @var string
     */
    public $workspace;

    // 机房名称
    /**
     * @example sh-a
     *
     * @var string
     */
    public $zoneName;
    protected $_name = [
        'createdTime' => 'created_time',
        'env'         => 'env',
        'isHealthy'   => 'is_healthy',
        'name'        => 'name',
        'regionName'  => 'region_name',
        'type'        => 'type',
        'version'     => 'version',
        'workspace'   => 'workspace',
        'zoneName'    => 'zone_name',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('isHealthy', $this->isHealthy, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('regionName', $this->regionName, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('zoneName', $this->zoneName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->isHealthy) {
            $res['is_healthy'] = $this->isHealthy;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['is_healthy'])) {
            $model->isHealthy = $map['is_healthy'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }

        return $model;
    }
}
