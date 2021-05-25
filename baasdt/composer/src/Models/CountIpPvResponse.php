<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CountIpPvResponse extends Model
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

    // 总计
    /**
     * @var int
     */
    public $allCount;

    // 渠道统计值
    /**
     * @var ChannelCounter[]
     */
    public $counterDetails;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'allCount'       => 'all_count',
        'counterDetails' => 'counter_details',
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
        if (null !== $this->allCount) {
            $res['all_count'] = $this->allCount;
        }
        if (null !== $this->counterDetails) {
            $res['counter_details'] = [];
            if (null !== $this->counterDetails && \is_array($this->counterDetails)) {
                $n = 0;
                foreach ($this->counterDetails as $item) {
                    $res['counter_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountIpPvResponse
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
        if (isset($map['all_count'])) {
            $model->allCount = $map['all_count'];
        }
        if (isset($map['counter_details'])) {
            if (!empty($map['counter_details'])) {
                $model->counterDetails = [];
                $n                     = 0;
                foreach ($map['counter_details'] as $item) {
                    $model->counterDetails[$n++] = null !== $item ? ChannelCounter::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
