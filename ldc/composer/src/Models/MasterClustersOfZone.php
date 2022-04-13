<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class MasterClustersOfZone extends Model
{
    // master clusters of specific zone
    /**
     * @example
     *
     * @var MasterCluster[]
     */
    public $clusters;

    // zone name
    /**
     * @example zoneA
     *
     * @var string
     */
    public $zoneName;

    // if the az has imported cluster
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasImported;
    protected $_name = [
        'clusters'    => 'clusters',
        'zoneName'    => 'zone_name',
        'hasImported' => 'has_imported',
    ];

    public function validate()
    {
        Model::validateRequired('clusters', $this->clusters, true);
        Model::validateRequired('zoneName', $this->zoneName, true);
        Model::validateRequired('hasImported', $this->hasImported, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusters) {
            $res['clusters'] = [];
            if (null !== $this->clusters && \is_array($this->clusters)) {
                $n = 0;
                foreach ($this->clusters as $item) {
                    $res['clusters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }
        if (null !== $this->hasImported) {
            $res['has_imported'] = $this->hasImported;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterClustersOfZone
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['clusters'])) {
            if (!empty($map['clusters'])) {
                $model->clusters = [];
                $n               = 0;
                foreach ($map['clusters'] as $item) {
                    $model->clusters[$n++] = null !== $item ? MasterCluster::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }
        if (isset($map['has_imported'])) {
            $model->hasImported = $map['has_imported'];
        }

        return $model;
    }
}
