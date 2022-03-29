<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryStackMonitoritemResponse extends Model
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

    // 监控项列表
    /**
     * @var StackMonitorItem[]
     */
    public $monitorItems;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'monitorItems' => 'monitor_items',
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
        if (null !== $this->monitorItems) {
            $res['monitor_items'] = [];
            if (null !== $this->monitorItems && \is_array($this->monitorItems)) {
                $n = 0;
                foreach ($this->monitorItems as $item) {
                    $res['monitor_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStackMonitoritemResponse
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
        if (isset($map['monitor_items'])) {
            if (!empty($map['monitor_items'])) {
                $model->monitorItems = [];
                $n                   = 0;
                foreach ($map['monitor_items'] as $item) {
                    $model->monitorItems[$n++] = null !== $item ? StackMonitorItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
