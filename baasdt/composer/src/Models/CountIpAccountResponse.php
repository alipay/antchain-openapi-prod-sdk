<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CountIpAccountResponse extends Model
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

    // 用户数量
    /**
     * @var int
     */
    public $userCount;

    // 版权方数量
    /**
     * @var int
     */
    public $sellerCount;

    // 版权方数量
    /**
     * @var int
     */
    public $buyerCount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'userCount'   => 'user_count',
        'sellerCount' => 'seller_count',
        'buyerCount'  => 'buyer_count',
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
        if (null !== $this->userCount) {
            $res['user_count'] = $this->userCount;
        }
        if (null !== $this->sellerCount) {
            $res['seller_count'] = $this->sellerCount;
        }
        if (null !== $this->buyerCount) {
            $res['buyer_count'] = $this->buyerCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountIpAccountResponse
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
        if (isset($map['user_count'])) {
            $model->userCount = $map['user_count'];
        }
        if (isset($map['seller_count'])) {
            $model->sellerCount = $map['seller_count'];
        }
        if (isset($map['buyer_count'])) {
            $model->buyerCount = $map['buyer_count'];
        }

        return $model;
    }
}
