<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfWithdrawResponse extends Model
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

    // 银行端客户号
    //
    /**
     * @var string
     */
    public $customerNo;

    // 证件类型;050 统一社会信用证代码
    //
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 客户完成账单融资申请放款至账户中待提款的金额，保留两位小数（单位：元）
    /**
     * @var string
     */
    public $withdrawalAmount;

    // 数据更新时间
    /**
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'customerNo'       => 'customer_no',
        'certType'         => 'cert_type',
        'certNo'           => 'cert_no',
        'withdrawalAmount' => 'withdrawal_amount',
        'updateTime'       => 'update_time',
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
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->withdrawalAmount) {
            $res['withdrawal_amount'] = $this->withdrawalAmount;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfWithdrawResponse
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
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['withdrawal_amount'])) {
            $model->withdrawalAmount = $map['withdrawal_amount'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
