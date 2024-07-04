<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerOrdermsgResponse extends Model
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

    // 数据总量
    /**
     * @var int
     */
    public $totalSize;

    // 消息内容列表
    /**
     * @var OrderMsgInfo[]
     */
    public $orderMsgInfos;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'totalSize'     => 'total_size',
        'orderMsgInfos' => 'order_msg_infos',
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
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->orderMsgInfos) {
            $res['order_msg_infos'] = [];
            if (null !== $this->orderMsgInfos && \is_array($this->orderMsgInfos)) {
                $n = 0;
                foreach ($this->orderMsgInfos as $item) {
                    $res['order_msg_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerOrdermsgResponse
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
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['order_msg_infos'])) {
            if (!empty($map['order_msg_infos'])) {
                $model->orderMsgInfos = [];
                $n                    = 0;
                foreach ($map['order_msg_infos'] as $item) {
                    $model->orderMsgInfos[$n++] = null !== $item ? OrderMsgInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
