<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmMonitorlistResponse extends Model
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

    // 缺省的监控指标。
    /**
     * @var StackMonitorItem[]
     */
    public $stackMonitorList;

    // 用户定制的告警项。
    /**
     * @var CustomPluginDO[]
     */
    public $customPluginList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'stackMonitorList' => 'stack_monitor_list',
        'customPluginList' => 'custom_plugin_list',
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
        if (null !== $this->stackMonitorList) {
            $res['stack_monitor_list'] = [];
            if (null !== $this->stackMonitorList && \is_array($this->stackMonitorList)) {
                $n = 0;
                foreach ($this->stackMonitorList as $item) {
                    $res['stack_monitor_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customPluginList) {
            $res['custom_plugin_list'] = [];
            if (null !== $this->customPluginList && \is_array($this->customPluginList)) {
                $n = 0;
                foreach ($this->customPluginList as $item) {
                    $res['custom_plugin_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmMonitorlistResponse
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
        if (isset($map['stack_monitor_list'])) {
            if (!empty($map['stack_monitor_list'])) {
                $model->stackMonitorList = [];
                $n                       = 0;
                foreach ($map['stack_monitor_list'] as $item) {
                    $model->stackMonitorList[$n++] = null !== $item ? StackMonitorItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['custom_plugin_list'])) {
            if (!empty($map['custom_plugin_list'])) {
                $model->customPluginList = [];
                $n                       = 0;
                foreach ($map['custom_plugin_list'] as $item) {
                    $model->customPluginList[$n++] = null !== $item ? CustomPluginDO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
