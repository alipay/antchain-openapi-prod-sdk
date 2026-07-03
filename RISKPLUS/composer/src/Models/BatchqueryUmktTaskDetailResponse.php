<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryUmktTaskDetailResponse extends Model
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

    // 客户请求时的透传字段
    /**
     * @var string
     */
    public $outInfo;

    // 外呼记录列表
    /**
     * @var CommonRobotCallDetail[]
     */
    public $callInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'outInfo'    => 'out_info',
        'callInfo'   => 'call_info',
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
        if (null !== $this->outInfo) {
            $res['out_info'] = $this->outInfo;
        }
        if (null !== $this->callInfo) {
            $res['call_info'] = [];
            if (null !== $this->callInfo && \is_array($this->callInfo)) {
                $n = 0;
                foreach ($this->callInfo as $item) {
                    $res['call_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryUmktTaskDetailResponse
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
        if (isset($map['out_info'])) {
            $model->outInfo = $map['out_info'];
        }
        if (isset($map['call_info'])) {
            if (!empty($map['call_info'])) {
                $model->callInfo = [];
                $n               = 0;
                foreach ($map['call_info'] as $item) {
                    $model->callInfo[$n++] = null !== $item ? CommonRobotCallDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
