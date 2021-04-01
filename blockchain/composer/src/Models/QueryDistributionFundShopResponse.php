<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionFundShopResponse extends Model
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

    // 审批中额度
    /**
     * @var string
     */
    public $approveQuota;

    // 可提现额度
    /**
     * @var string
     */
    public $balance;

    // 已到账额度
    /**
     * @var string
     */
    public $finishQuota;

    // 商户id
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'approveQuota' => 'approve_quota',
        'balance'      => 'balance',
        'finishQuota'  => 'finish_quota',
        'shopId'       => 'shop_id',
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
        if (null !== $this->approveQuota) {
            $res['approve_quota'] = $this->approveQuota;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->finishQuota) {
            $res['finish_quota'] = $this->finishQuota;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionFundShopResponse
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
        if (isset($map['approve_quota'])) {
            $model->approveQuota = $map['approve_quota'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['finish_quota'])) {
            $model->finishQuota = $map['finish_quota'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
