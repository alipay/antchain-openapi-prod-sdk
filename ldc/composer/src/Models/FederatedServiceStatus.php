<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FederatedServiceStatus extends Model
{
    // metadata
    /**
     * @example
     *
     * @var ObjectMeta
     */
    public $metadata;

    // topologyStatus
    /**
     * @example []
     *
     * @var FederatedServiceTopologyStatus[]
     */
    public $topologyStatus;
    protected $_name = [
        'metadata'       => 'metadata',
        'topologyStatus' => 'topology_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->topologyStatus) {
            $res['topology_status'] = [];
            if (null !== $this->topologyStatus && \is_array($this->topologyStatus)) {
                $n = 0;
                foreach ($this->topologyStatus as $item) {
                    $res['topology_status'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FederatedServiceStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metadata'])) {
            $model->metadata = ObjectMeta::fromMap($map['metadata']);
        }
        if (isset($map['topology_status'])) {
            if (!empty($map['topology_status'])) {
                $model->topologyStatus = [];
                $n                     = 0;
                foreach ($map['topology_status'] as $item) {
                    $model->topologyStatus[$n++] = null !== $item ? FederatedServiceTopologyStatus::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
