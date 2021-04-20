<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryUserTokenallocationdetailResponse extends Model
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

    // 粉丝粒操作流水
    /**
     * @var TokenOperationDetail[]
     */
    public $allocationDetail;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'allocationDetail' => 'allocation_detail',
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
        if (null !== $this->allocationDetail) {
            $res['allocation_detail'] = [];
            if (null !== $this->allocationDetail && \is_array($this->allocationDetail)) {
                $n = 0;
                foreach ($this->allocationDetail as $item) {
                    $res['allocation_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserTokenallocationdetailResponse
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
        if (isset($map['allocation_detail'])) {
            if (!empty($map['allocation_detail'])) {
                $model->allocationDetail = [];
                $n                       = 0;
                foreach ($map['allocation_detail'] as $item) {
                    $model->allocationDetail[$n++] = null !== $item ? TokenOperationDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
