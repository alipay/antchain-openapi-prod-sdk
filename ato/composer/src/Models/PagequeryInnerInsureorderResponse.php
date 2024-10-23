<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerInsureorderResponse extends Model
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

    // 保单信息
    /**
     * @var InsureOrderInfo[]
     */
    public $inusreOrderInfos;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'totalSize'        => 'total_size',
        'inusreOrderInfos' => 'inusre_order_infos',
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
        if (null !== $this->inusreOrderInfos) {
            $res['inusre_order_infos'] = [];
            if (null !== $this->inusreOrderInfos && \is_array($this->inusreOrderInfos)) {
                $n = 0;
                foreach ($this->inusreOrderInfos as $item) {
                    $res['inusre_order_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerInsureorderResponse
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
        if (isset($map['inusre_order_infos'])) {
            if (!empty($map['inusre_order_infos'])) {
                $model->inusreOrderInfos = [];
                $n                       = 0;
                foreach ($map['inusre_order_infos'] as $item) {
                    $model->inusreOrderInfos[$n++] = null !== $item ? InsureOrderInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
