<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FlowHistory extends Model
{
    // 操作信息
    /**
     * @example 1
     *
     * @var FlowNode[]
     */
    public $flowNodeList;
    protected $_name = [
        'flowNodeList' => 'flow_node_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->flowNodeList) {
            $res['flow_node_list'] = [];
            if (null !== $this->flowNodeList && \is_array($this->flowNodeList)) {
                $n = 0;
                foreach ($this->flowNodeList as $item) {
                    $res['flow_node_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FlowHistory
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['flow_node_list'])) {
            if (!empty($map['flow_node_list'])) {
                $model->flowNodeList = [];
                $n                   = 0;
                foreach ($map['flow_node_list'] as $item) {
                    $model->flowNodeList[$n++] = null !== $item ? FlowNode::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
