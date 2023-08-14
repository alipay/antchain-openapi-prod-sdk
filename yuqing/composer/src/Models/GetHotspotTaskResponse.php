<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class GetHotspotTaskResponse extends Model
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

    // 任务的结果
    /**
     * @var HotspotTask[]
     */
    public $hotspotTasks;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'hotspotTasks' => 'hotspot_tasks',
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
        if (null !== $this->hotspotTasks) {
            $res['hotspot_tasks'] = [];
            if (null !== $this->hotspotTasks && \is_array($this->hotspotTasks)) {
                $n = 0;
                foreach ($this->hotspotTasks as $item) {
                    $res['hotspot_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetHotspotTaskResponse
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
        if (isset($map['hotspot_tasks'])) {
            if (!empty($map['hotspot_tasks'])) {
                $model->hotspotTasks = [];
                $n                   = 0;
                foreach ($map['hotspot_tasks'] as $item) {
                    $model->hotspotTasks[$n++] = null !== $item ? HotspotTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
