<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class AliYunDigitalServiceInfo extends Model
{
    // 项目总数
    /**
     * @example 5
     *
     * @var int
     */
    public $projectCount;

    // 项目上限
    /**
     * @example 100
     *
     * @var int
     */
    public $projectLimit;

    // 资源存储使用量
    /**
     * @example 1231
     *
     * @var int
     */
    public $storageUsed;

    // 资源存储容量上限
    /**
     * @example 122132
     *
     * @var int
     */
    public $storageLimit;

    // 日访问流量
    /**
     * @example 1013
     *
     * @var int
     */
    public $trafficDailyUsed;

    // 日流量上限
    /**
     * @example 342342
     *
     * @var int
     */
    public $trafficDailyLimit;
    protected $_name = [
        'projectCount'      => 'project_count',
        'projectLimit'      => 'project_limit',
        'storageUsed'       => 'storage_used',
        'storageLimit'      => 'storage_limit',
        'trafficDailyUsed'  => 'traffic_daily_used',
        'trafficDailyLimit' => 'traffic_daily_limit',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectCount) {
            $res['project_count'] = $this->projectCount;
        }
        if (null !== $this->projectLimit) {
            $res['project_limit'] = $this->projectLimit;
        }
        if (null !== $this->storageUsed) {
            $res['storage_used'] = $this->storageUsed;
        }
        if (null !== $this->storageLimit) {
            $res['storage_limit'] = $this->storageLimit;
        }
        if (null !== $this->trafficDailyUsed) {
            $res['traffic_daily_used'] = $this->trafficDailyUsed;
        }
        if (null !== $this->trafficDailyLimit) {
            $res['traffic_daily_limit'] = $this->trafficDailyLimit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AliYunDigitalServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_count'])) {
            $model->projectCount = $map['project_count'];
        }
        if (isset($map['project_limit'])) {
            $model->projectLimit = $map['project_limit'];
        }
        if (isset($map['storage_used'])) {
            $model->storageUsed = $map['storage_used'];
        }
        if (isset($map['storage_limit'])) {
            $model->storageLimit = $map['storage_limit'];
        }
        if (isset($map['traffic_daily_used'])) {
            $model->trafficDailyUsed = $map['traffic_daily_used'];
        }
        if (isset($map['traffic_daily_limit'])) {
            $model->trafficDailyLimit = $map['traffic_daily_limit'];
        }

        return $model;
    }
}
