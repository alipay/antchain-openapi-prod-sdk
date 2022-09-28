<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeAccountStatusResponse extends Model
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

    // 授信申请状态
    /**
     * @var CustomStatus
     */
    public $data;

    // 支付账户签约结果
    /**
     * @var PayMethodLockResult
     */
    public $payMethodLockResult;

    // 支付账户锁定结果
    /**
     * @var FundChainLockResult[]
     */
    public $fundChainLockResult;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'data'                => 'data',
        'payMethodLockResult' => 'pay_method_lock_result',
        'fundChainLockResult' => 'fund_chain_lock_result',
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
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        if (null !== $this->payMethodLockResult) {
            $res['pay_method_lock_result'] = null !== $this->payMethodLockResult ? $this->payMethodLockResult->toMap() : null;
        }
        if (null !== $this->fundChainLockResult) {
            $res['fund_chain_lock_result'] = [];
            if (null !== $this->fundChainLockResult && \is_array($this->fundChainLockResult)) {
                $n = 0;
                foreach ($this->fundChainLockResult as $item) {
                    $res['fund_chain_lock_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeAccountStatusResponse
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
        if (isset($map['data'])) {
            $model->data = CustomStatus::fromMap($map['data']);
        }
        if (isset($map['pay_method_lock_result'])) {
            $model->payMethodLockResult = PayMethodLockResult::fromMap($map['pay_method_lock_result']);
        }
        if (isset($map['fund_chain_lock_result'])) {
            if (!empty($map['fund_chain_lock_result'])) {
                $model->fundChainLockResult = [];
                $n                          = 0;
                foreach ($map['fund_chain_lock_result'] as $item) {
                    $model->fundChainLockResult[$n++] = null !== $item ? FundChainLockResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
