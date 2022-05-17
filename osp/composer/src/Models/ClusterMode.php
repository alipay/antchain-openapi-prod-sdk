<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class ClusterMode extends Model
{
    // 集群模式
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $clusterMode;

    // 区域
    /**
     * @example [{"name":"杭州", "region":"ch-shanghai"}]
     *
     * @var ClusterMeta[]
     */
    public $regions;
    protected $_name = [
        'clusterMode' => 'cluster_mode',
        'regions'     => 'regions',
    ];

    public function validate()
    {
        Model::validateRequired('clusterMode', $this->clusterMode, true);
        Model::validateRequired('regions', $this->regions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterMode) {
            $res['cluster_mode'] = $this->clusterMode;
        }
        if (null !== $this->regions) {
            $res['regions'] = [];
            if (null !== $this->regions && \is_array($this->regions)) {
                $n = 0;
                foreach ($this->regions as $item) {
                    $res['regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterMode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_mode'])) {
            $model->clusterMode = $map['cluster_mode'];
        }
        if (isset($map['regions'])) {
            if (!empty($map['regions'])) {
                $model->regions = [];
                $n              = 0;
                foreach ($map['regions'] as $item) {
                    $model->regions[$n++] = null !== $item ? ClusterMeta::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
