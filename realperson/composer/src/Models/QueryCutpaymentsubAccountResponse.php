<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentsubAccountResponse extends Model
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

    // 二级商户号
    /**
     * @var string
     */
    public $contractNo;

    // 二级商户客户账户名
    /**
     * @var string
     */
    public $contractName;

    // 二级商户客户名
    /**
     * @var string
     */
    public $customerName;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'contractNo'   => 'contract_no',
        'contractName' => 'contract_name',
        'customerName' => 'customer_name',
        'externInfo'   => 'extern_info',
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
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentsubAccountResponse
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
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
