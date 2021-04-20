<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryUserTokenredeemdetailResponse extends Model
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

    // 兑现流水
    /**
     * @var TokenOperationDetail[]
     */
    public $redeemDetail;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'redeemDetail' => 'redeem_detail',
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
        if (null !== $this->redeemDetail) {
            $res['redeem_detail'] = [];
            if (null !== $this->redeemDetail && \is_array($this->redeemDetail)) {
                $n = 0;
                foreach ($this->redeemDetail as $item) {
                    $res['redeem_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserTokenredeemdetailResponse
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
        if (isset($map['redeem_detail'])) {
            if (!empty($map['redeem_detail'])) {
                $model->redeemDetail = [];
                $n                   = 0;
                foreach ($map['redeem_detail'] as $item) {
                    $model->redeemDetail[$n++] = null !== $item ? TokenOperationDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
