<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppAlarmrulesResponse extends Model
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

    // 技术栈指标
    /**
     * @var StackMonitorItem[]
     */
    public $stackMetrics;

    // 应用自定义指标
    /**
     * @var CustomPluginDO[]
     */
    public $customPlugins;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'stackMetrics'  => 'stack_metrics',
        'customPlugins' => 'custom_plugins',
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
        if (null !== $this->stackMetrics) {
            $res['stack_metrics'] = [];
            if (null !== $this->stackMetrics && \is_array($this->stackMetrics)) {
                $n = 0;
                foreach ($this->stackMetrics as $item) {
                    $res['stack_metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customPlugins) {
            $res['custom_plugins'] = [];
            if (null !== $this->customPlugins && \is_array($this->customPlugins)) {
                $n = 0;
                foreach ($this->customPlugins as $item) {
                    $res['custom_plugins'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppAlarmrulesResponse
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
        if (isset($map['stack_metrics'])) {
            if (!empty($map['stack_metrics'])) {
                $model->stackMetrics = [];
                $n                   = 0;
                foreach ($map['stack_metrics'] as $item) {
                    $model->stackMetrics[$n++] = null !== $item ? StackMonitorItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['custom_plugins'])) {
            if (!empty($map['custom_plugins'])) {
                $model->customPlugins = [];
                $n                    = 0;
                foreach ($map['custom_plugins'] as $item) {
                    $model->customPlugins[$n++] = null !== $item ? CustomPluginDO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
