<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class GetSpProductOrderResponse extends Model
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

    // 结果
    /**
     * @var OrderResult[]
     */
    public $orderResults;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'orderResults' => 'order_results',
    ];

    public function validate()
    {
        Model::validateRequired('orderResults', $this->orderResults, true);
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
        if (null !== $this->orderResults) {
            $res['order_results'] = [];
            if (null !== $this->orderResults && \is_array($this->orderResults)) {
                $n = 0;
                foreach ($this->orderResults as $item) {
                    $res['order_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSpProductOrderResponse
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
        if (isset($map['order_results'])) {
            if (!empty($map['order_results'])) {
                $model->orderResults = [];
                $n                   = 0;
                foreach ($map['order_results'] as $item) {
                    $model->orderResults[$n++] = null !== $item ? OrderResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
