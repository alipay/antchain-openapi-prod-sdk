<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ListDigitalkeyRentaltripResponse extends Model
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

    // 总条数
    /**
     * @var int
     */
    public $total;

    // 行程列表信息
    /**
     * @var TripInfo[]
     */
    public $tripList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'total'      => 'total',
        'tripList'   => 'trip_list',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->tripList) {
            $res['trip_list'] = [];
            if (null !== $this->tripList && \is_array($this->tripList)) {
                $n = 0;
                foreach ($this->tripList as $item) {
                    $res['trip_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDigitalkeyRentaltripResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['trip_list'])) {
            if (!empty($map['trip_list'])) {
                $model->tripList = [];
                $n               = 0;
                foreach ($map['trip_list'] as $item) {
                    $model->tripList[$n++] = null !== $item ? TripInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
