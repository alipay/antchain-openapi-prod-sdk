<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class LoanMonitorCust extends Model
{
    // 合同编号
    /**
     * @example CONT20230314000000143225
     *
     * @var string
     */
    public $contractNo;

    // 商户GMV 单位：元
    /**
     * @example 5000000.00
     *
     * @var string
     */
    public $grossMercVolume;

    // 实际销售结算金额 单位：元，格式：数字，小数点后两位
    /**
     * @example 5000000.00
     *
     * @var string
     */
    public $actSaleAmt;

    // 退货率 单位：%
    /**
     * @example 20
     *
     * @var string
     */
    public $returnRate;

    // 已发货未收款金额 单位：元，格式：数字，小数点后两位
    /**
     * @example 5000000.00
     *
     * @var string
     */
    public $accountsReceivable;
    protected $_name = [
        'contractNo'         => 'contract_no',
        'grossMercVolume'    => 'gross_merc_volume',
        'actSaleAmt'         => 'act_sale_amt',
        'returnRate'         => 'return_rate',
        'accountsReceivable' => 'accounts_receivable',
    ];

    public function validate()
    {
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('grossMercVolume', $this->grossMercVolume, true);
        Model::validateRequired('actSaleAmt', $this->actSaleAmt, true);
        Model::validateRequired('returnRate', $this->returnRate, true);
        Model::validateRequired('accountsReceivable', $this->accountsReceivable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->grossMercVolume) {
            $res['gross_merc_volume'] = $this->grossMercVolume;
        }
        if (null !== $this->actSaleAmt) {
            $res['act_sale_amt'] = $this->actSaleAmt;
        }
        if (null !== $this->returnRate) {
            $res['return_rate'] = $this->returnRate;
        }
        if (null !== $this->accountsReceivable) {
            $res['accounts_receivable'] = $this->accountsReceivable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoanMonitorCust
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['gross_merc_volume'])) {
            $model->grossMercVolume = $map['gross_merc_volume'];
        }
        if (isset($map['act_sale_amt'])) {
            $model->actSaleAmt = $map['act_sale_amt'];
        }
        if (isset($map['return_rate'])) {
            $model->returnRate = $map['return_rate'];
        }
        if (isset($map['accounts_receivable'])) {
            $model->accountsReceivable = $map['accounts_receivable'];
        }

        return $model;
    }
}
