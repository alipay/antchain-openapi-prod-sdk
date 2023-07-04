<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GrayRelease extends Model
{
    // 需要更新到的副本数，比如：应用A有10个副本，本次更新updated_replicas=5，则会更新前5个
    /**
     * @example
     *
     * @var int
     */
    public $updatedReplicas;

    // 发布策略：TWO_GROUP("TWO_GROUP", "分两组"),
    // ALL_ONE("ALL_ONE", "共分一组"),
    // EACH_ONE("EACH_ONE", "每台一组"),
    // SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐"),
    // CUSTOMIZE("CUSTOMIZE", "自定义分组")
    /**
     * @example EACH_ONE
     *
     * @var string
     */
    public $releaseStrategy;
    protected $_name = [
        'updatedReplicas' => 'updated_replicas',
        'releaseStrategy' => 'release_strategy',
    ];

    public function validate()
    {
        Model::validateRequired('releaseStrategy', $this->releaseStrategy, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->updatedReplicas) {
            $res['updated_replicas'] = $this->updatedReplicas;
        }
        if (null !== $this->releaseStrategy) {
            $res['release_strategy'] = $this->releaseStrategy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayRelease
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['updated_replicas'])) {
            $model->updatedReplicas = $map['updated_replicas'];
        }
        if (isset($map['release_strategy'])) {
            $model->releaseStrategy = $map['release_strategy'];
        }

        return $model;
    }
}
