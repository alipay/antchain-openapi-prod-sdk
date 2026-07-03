<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Contract extends Model
{
    // 关联编号
    /**
     * @example 123123
     *
     * @var string
     */
    public $relationNo;

    // 合同编号
    /**
     * @example 123123
     *
     * @var string
     */
    public $contractNo;

    // 合同名称
    /**
     * @example 用信合同
     *
     * @var string
     */
    public $contractName;

    // 合同类型
    /**
     * @example 0
     *
     * @var string
     */
    public $contractType;

    // 客户编号
    /**
     * @example PCM123xxxx
     *
     * @var string
     */
    public $customNo;

    // 合同存放目录
    /**
     * @example https://11111
     *
     * @var string
     */
    public $savePath;

    // 合同金额
    /**
     * @example
     *
     * @var int
     */
    public $contractAmount;

    // 用信合同编号
    /**
     * @example 123123
     *
     * @var string
     */
    public $disburseContractNo;

    // 授信合同编号
    /**
     * @example 123123
     *
     * @var string
     */
    public $creditContractNo;
    protected $_name = [
        'relationNo'         => 'relation_no',
        'contractNo'         => 'contract_no',
        'contractName'       => 'contract_name',
        'contractType'       => 'contract_type',
        'customNo'           => 'custom_no',
        'savePath'           => 'save_path',
        'contractAmount'     => 'contract_amount',
        'disburseContractNo' => 'disburse_contract_no',
        'creditContractNo'   => 'credit_contract_no',
    ];

    public function validate()
    {
        Model::validateRequired('relationNo', $this->relationNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('customNo', $this->customNo, true);
        Model::validateRequired('savePath', $this->savePath, true);
        Model::validateRequired('contractAmount', $this->contractAmount, true);
        Model::validateRequired('disburseContractNo', $this->disburseContractNo, true);
        Model::validateRequired('creditContractNo', $this->creditContractNo, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->disburseContractNo) {
            $res['disburse_contract_no'] = $this->disburseContractNo;
        }
        if (null !== $this->creditContractNo) {
            $res['credit_contract_no'] = $this->creditContractNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Contract
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['disburse_contract_no'])) {
            $model->disburseContractNo = $map['disburse_contract_no'];
        }
        if (isset($map['credit_contract_no'])) {
            $model->creditContractNo = $map['credit_contract_no'];
        }

        return $model;
    }
}
