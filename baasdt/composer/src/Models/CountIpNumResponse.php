<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CountIpNumResponse extends Model
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

    // 各个渠道的统计
    /**
     * @var ChannelCounter[]
     */
    public $counterDetail;

    // 总计值
    /**
     * @var int
     */
    public $allCount;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'counterDetail' => 'counter_detail',
        'allCount'      => 'all_count',
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
        if (null !== $this->counterDetail) {
            $res['counter_detail'] = [];
            if (null !== $this->counterDetail && \is_array($this->counterDetail)) {
                $n = 0;
                foreach ($this->counterDetail as $item) {
                    $res['counter_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->allCount) {
            $res['all_count'] = $this->allCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountIpNumResponse
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
        if (isset($map['counter_detail'])) {
            if (!empty($map['counter_detail'])) {
                $model->counterDetail = [];
                $n                    = 0;
                foreach ($map['counter_detail'] as $item) {
                    $model->counterDetail[$n++] = null !== $item ? ChannelCounter::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['all_count'])) {
            $model->allCount = $map['all_count'];
        }

        return $model;
    }
}
