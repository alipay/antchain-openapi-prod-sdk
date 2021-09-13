<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateOrderAfterResponse extends Model
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

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 下单返回值。里面有实例id和二级订单号等关键字段。
    /**
     * @var CreateOrderResult[]
     */
    public $createOrderResponseList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'bizNo'                   => 'biz_no',
        'createOrderResponseList' => 'create_order_response_list',
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->createOrderResponseList) {
            $res['create_order_response_list'] = [];
            if (null !== $this->createOrderResponseList && \is_array($this->createOrderResponseList)) {
                $n = 0;
                foreach ($this->createOrderResponseList as $item) {
                    $res['create_order_response_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOrderAfterResponse
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['create_order_response_list'])) {
            if (!empty($map['create_order_response_list'])) {
                $model->createOrderResponseList = [];
                $n                              = 0;
                foreach ($map['create_order_response_list'] as $item) {
                    $model->createOrderResponseList[$n++] = null !== $item ? CreateOrderResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
