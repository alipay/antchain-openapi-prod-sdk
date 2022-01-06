<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgRouterruledispatchlogsResponse extends Model
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

    // List<ConfigDispatchLogDO>
    /**
     * @var ConfigDispatchLogDO[]
     */
    public $configDispatchLogs;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'configDispatchLogs' => 'config_dispatch_logs',
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
        if (null !== $this->configDispatchLogs) {
            $res['config_dispatch_logs'] = [];
            if (null !== $this->configDispatchLogs && \is_array($this->configDispatchLogs)) {
                $n = 0;
                foreach ($this->configDispatchLogs as $item) {
                    $res['config_dispatch_logs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgRouterruledispatchlogsResponse
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
        if (isset($map['config_dispatch_logs'])) {
            if (!empty($map['config_dispatch_logs'])) {
                $model->configDispatchLogs = [];
                $n                         = 0;
                foreach ($map['config_dispatch_logs'] as $item) {
                    $model->configDispatchLogs[$n++] = null !== $item ? ConfigDispatchLogDO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
