<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderWithholdContractInfo extends Model
{
    // 支付宝外部代扣协议号
    /**
     * @example ATO_P007_0_0_11
     *
     * @var string
     */
    public $withholdingContractId;

    // 用户代扣协议状态
    /**
     * @example TERMINATION
     *
     * @var string
     */
    public $contractStatus;
    protected $_name = [
        'withholdingContractId' => 'withholding_contract_id',
        'contractStatus'        => 'contract_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->withholdingContractId) {
            $res['withholding_contract_id'] = $this->withholdingContractId;
        }
        if (null !== $this->contractStatus) {
            $res['contract_status'] = $this->contractStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderWithholdContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['withholding_contract_id'])) {
            $model->withholdingContractId = $map['withholding_contract_id'];
        }
        if (isset($map['contract_status'])) {
            $model->contractStatus = $map['contract_status'];
        }

        return $model;
    }
}
