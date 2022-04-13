<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ClusterInfo extends Model
{
    // created time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // env
    /**
     * @example dev
     *
     * @var string
     */
    public $env;

    // cluster is healthy or not
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isHealthy;

    // cluster name
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // cluster overview info
    /**
     * @example
     *
     * @var ClusterOverviewInfo
     */
    public $overviewInfo;

    // region name
    /**
     * @example shfin
     *
     * @var string
     */
    public $regionName;

    // 独占 or 共享
    /**
     * @example 独占
     *
     * @var string
     */
    public $type;

    // version
    /**
     * @example 2.0
     *
     * @var string
     */
    public $version;

    // zone name
    /**
     * @example sh-a
     *
     * @var string
     */
    public $zoneName;

    // workspace名称[如果存在]。
    /**
     * @example dev
     *
     * @var string
     */
    public $workspace;
    protected $_name = [
        'createdTime'  => 'created_time',
        'env'          => 'env',
        'isHealthy'    => 'is_healthy',
        'name'         => 'name',
        'overviewInfo' => 'overview_info',
        'regionName'   => 'region_name',
        'type'         => 'type',
        'version'      => 'version',
        'zoneName'     => 'zone_name',
        'workspace'    => 'workspace',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('isHealthy', $this->isHealthy, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('overviewInfo', $this->overviewInfo, true);
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
        if (null !== $this->overviewInfo) {
            $res['overview_info'] = null !== $this->overviewInfo ? $this->overviewInfo->toMap() : null;
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
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterInfo
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
        if (isset($map['overview_info'])) {
            $model->overviewInfo = ClusterOverviewInfo::fromMap($map['overview_info']);
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
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
