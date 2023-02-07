<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DimInstanceGroup extends Model
{
    // dim_group_id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimGroupId;

    // dim_instances
    /**
     * @example
     *
     * @var DimInstance[]
     */
    public $dimInstances;
    protected $_name = [
        'dimGroupId'   => 'dim_group_id',
        'dimInstances' => 'dim_instances',
    ];

    public function validate()
    {
        Model::validateRequired('dimGroupId', $this->dimGroupId, true);
        Model::validateRequired('dimInstances', $this->dimInstances, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimGroupId) {
            $res['dim_group_id'] = $this->dimGroupId;
        }
        if (null !== $this->dimInstances) {
            $res['dim_instances'] = [];
            if (null !== $this->dimInstances && \is_array($this->dimInstances)) {
                $n = 0;
                foreach ($this->dimInstances as $item) {
                    $res['dim_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DimInstanceGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dim_group_id'])) {
            $model->dimGroupId = $map['dim_group_id'];
        }
        if (isset($map['dim_instances'])) {
            if (!empty($map['dim_instances'])) {
                $model->dimInstances = [];
                $n                   = 0;
                foreach ($map['dim_instances'] as $item) {
                    $model->dimInstances[$n++] = null !== $item ? DimInstance::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
