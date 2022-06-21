<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeSearchContractResponse extends Model
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

    // 关联编号（授信/用信）
    /**
     * @var string
     */
    public $relationNo;

    // 合同编号
    /**
     * @var string
     */
    public $contractNo;

    // 合同名称
    /**
     * @var string
     */
    public $contractName;

    // 合同类型：0:电子合同签署授权协议 1:借款合同 2:抵押合同 3:担保合同 4:用信合同 5:通用合同 6:征信授权书
    /**
     * @var string
     */
    public $contractType;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 下载地址
    /**
     * @var string
     */
    public $savePath;

    // 合同金额
    /**
     * @var int
     */
    public $contractAmount;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'relationNo'     => 'relation_no',
        'contractNo'     => 'contract_no',
        'contractName'   => 'contract_name',
        'contractType'   => 'contract_type',
        'customNo'       => 'custom_no',
        'savePath'       => 'save_path',
        'contractAmount' => 'contract_amount',
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
        if (null !== $this->relationNo) {
            $res['relation_no'] = $this->relationNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->savePath) {
            $res['save_path'] = $this->savePath;
        }
        if (null !== $this->contractAmount) {
            $res['contract_amount'] = $this->contractAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeSearchContractResponse
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
        if (isset($map['relation_no'])) {
            $model->relationNo = $map['relation_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['save_path'])) {
            $model->savePath = $map['save_path'];
        }
        if (isset($map['contract_amount'])) {
            $model->contractAmount = $map['contract_amount'];
        }

        return $model;
    }
}
