<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ClusterStatus extends Model
{
    // 集群名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 集群资源概览
    /**
     * @example
     *
     * @var ClusterOverviewInfo
     */
    public $overviewInfo;
    protected $_name = [
        'name'         => 'name',
        'overviewInfo' => 'overview_info',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('overviewInfo', $this->overviewInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->overviewInfo) {
            $res['overview_info'] = null !== $this->overviewInfo ? $this->overviewInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['overview_info'])) {
            $model->overviewInfo = ClusterOverviewInfo::fromMap($map['overview_info']);
        }

        return $model;
    }
}
