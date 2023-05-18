<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class PublishMerchantDiyskuResponse extends Model
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

    // 生成的nftid结果
    /**
     * @var string
     */
    public $nftId;

    // 获得时间
    /**
     * @var string
     */
    public $receiveTime;

    // 发放状态
    // AUDIT_SUBMIT("审核中"),
    // AUDIT_SUCCESS("审核通过"),
    // AUDIT_FAIL("审核未通过"),
    // TRANSFER_UNKNOWN("发放结果未知"),
    // TRANSFER_SUCCESS("发放成功"),
    // TRANSFER_FAILED("发放失败"),
    // SHIELD("屏蔽"),
    // RECYCLE("回收"),
    /**
     * @var string
     */
    public $sendStatus;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'nftId'       => 'nft_id',
        'receiveTime' => 'receive_time',
        'sendStatus'  => 'send_status',
    ];

    public function validate()
    {
        Model::validatePattern('receiveTime', $this->receiveTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }
        if (null !== $this->receiveTime) {
            $res['receive_time'] = $this->receiveTime;
        }
        if (null !== $this->sendStatus) {
            $res['send_status'] = $this->sendStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishMerchantDiyskuResponse
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
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }
        if (isset($map['receive_time'])) {
            $model->receiveTime = $map['receive_time'];
        }
        if (isset($map['send_status'])) {
            $model->sendStatus = $map['send_status'];
        }

        return $model;
    }
}
