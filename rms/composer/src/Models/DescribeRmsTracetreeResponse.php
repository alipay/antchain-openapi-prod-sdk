<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DescribeRmsTracetreeResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 树状图结构体
    // 找不到数据时 trace_tree_items 为空数组, 并不会报错
    /**
     * @var TraceTreeItem[]
     */
    public $traceTreeItems;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'traceTreeItems' => 'trace_tree_items',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->traceTreeItems) {
            $res['trace_tree_items'] = [];
            if (null !== $this->traceTreeItems && \is_array($this->traceTreeItems)) {
                $n = 0;
                foreach ($this->traceTreeItems as $item) {
                    $res['trace_tree_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeRmsTracetreeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['trace_tree_items'])) {
            if (!empty($map['trace_tree_items'])) {
                $model->traceTreeItems = [];
                $n                     = 0;
                foreach ($map['trace_tree_items'] as $item) {
                    $model->traceTreeItems[$n++] = null !== $item ? TraceTreeItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
