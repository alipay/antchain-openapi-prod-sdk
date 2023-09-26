<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightChainStatus extends Model
{
    // 节点信息
    /**
     * @example
     *
     * @var ChainInsightNodeInfo[]
     */
    public $nodeInfos;

    // 链状态
    /**
     * @example
     *
     * @var ChainStatus[]
     */
    public $chainStatuses;
    protected $_name = [
        'nodeInfos'     => 'node_infos',
        'chainStatuses' => 'chain_statuses',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeInfos) {
            $res['node_infos'] = [];
            if (null !== $this->nodeInfos && \is_array($this->nodeInfos)) {
                $n = 0;
                foreach ($this->nodeInfos as $item) {
                    $res['node_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->chainStatuses) {
            $res['chain_statuses'] = [];
            if (null !== $this->chainStatuses && \is_array($this->chainStatuses)) {
                $n = 0;
                foreach ($this->chainStatuses as $item) {
                    $res['chain_statuses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightChainStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_infos'])) {
            if (!empty($map['node_infos'])) {
                $model->nodeInfos = [];
                $n                = 0;
                foreach ($map['node_infos'] as $item) {
                    $model->nodeInfos[$n++] = null !== $item ? ChainInsightNodeInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['chain_statuses'])) {
            if (!empty($map['chain_statuses'])) {
                $model->chainStatuses = [];
                $n                    = 0;
                foreach ($map['chain_statuses'] as $item) {
                    $model->chainStatuses[$n++] = null !== $item ? ChainStatus::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
