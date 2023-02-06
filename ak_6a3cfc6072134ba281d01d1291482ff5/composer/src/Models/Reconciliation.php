<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6a3cfc6072134ba281d01d1291482ff5\Models;

use AlibabaCloud\Tea\Model;

class Reconciliation extends Model
{
    // 供应商
    /**
     * @example A
     *
     * @var string
     */
    public $supCode;

    // 供应商名称
    /**
     * @example 供应商A
     *
     * @var string
     */
    public $supName;

    // 结算金额(单位分)
    /**
     * @example 结算金额(单位分)
     *
     * @var int
     */
    public $settlementAmount;

    // 长城确认时间
    /**
     * @example 2021-03-17
     *
     * @var string
     */
    public $confirmDateGw;

    // 长城方确认人
    /**
     * @example 长城方确认人
     *
     * @var string
     */
    public $confirmerGw;

    // 长城确认状态
    /**
     * @example 确认状态
     *
     * @var string
     */
    public $confirmStateGw;

    // 服务方确认时间
    /**
     * @example 2021-03-17
     *
     * @var string
     */
    public $confirmDateSup;

    // 服务方确认人
    /**
     * @example 服务方确认人
     *
     * @var string
     */
    public $confirmerSup;

    // 服务方确认状态
    /**
     * @example 服务方确认状态
     *
     * @var string
     */
    public $confirmStateSup;

    // 计算时间
    /**
     * @example 计算时间
     *
     * @var string
     */
    public $socreDate;
    protected $_name = [
        'supCode'          => 'sup_code',
        'supName'          => 'sup_name',
        'settlementAmount' => 'settlement_amount',
        'confirmDateGw'    => 'confirm_date_gw',
        'confirmerGw'      => 'confirmer_gw',
        'confirmStateGw'   => 'confirm_state_gw',
        'confirmDateSup'   => 'confirm_date_sup',
        'confirmerSup'     => 'confirmer_sup',
        'confirmStateSup'  => 'confirm_state_sup',
        'socreDate'        => 'socre_date',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('supName', $this->supName, true);
        Model::validateRequired('settlementAmount', $this->settlementAmount, true);
        Model::validateRequired('confirmDateGw', $this->confirmDateGw, true);
        Model::validateRequired('confirmerGw', $this->confirmerGw, true);
        Model::validateRequired('confirmStateGw', $this->confirmStateGw, true);
        Model::validateRequired('confirmDateSup', $this->confirmDateSup, true);
        Model::validateRequired('confirmerSup', $this->confirmerSup, true);
        Model::validateRequired('confirmStateSup', $this->confirmStateSup, true);
        Model::validateRequired('socreDate', $this->socreDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }
        if (null !== $this->supName) {
            $res['sup_name'] = $this->supName;
        }
        if (null !== $this->settlementAmount) {
            $res['settlement_amount'] = $this->settlementAmount;
        }
        if (null !== $this->confirmDateGw) {
            $res['confirm_date_gw'] = $this->confirmDateGw;
        }
        if (null !== $this->confirmerGw) {
            $res['confirmer_gw'] = $this->confirmerGw;
        }
        if (null !== $this->confirmStateGw) {
            $res['confirm_state_gw'] = $this->confirmStateGw;
        }
        if (null !== $this->confirmDateSup) {
            $res['confirm_date_sup'] = $this->confirmDateSup;
        }
        if (null !== $this->confirmerSup) {
            $res['confirmer_sup'] = $this->confirmerSup;
        }
        if (null !== $this->confirmStateSup) {
            $res['confirm_state_sup'] = $this->confirmStateSup;
        }
        if (null !== $this->socreDate) {
            $res['socre_date'] = $this->socreDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Reconciliation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }
        if (isset($map['sup_name'])) {
            $model->supName = $map['sup_name'];
        }
        if (isset($map['settlement_amount'])) {
            $model->settlementAmount = $map['settlement_amount'];
        }
        if (isset($map['confirm_date_gw'])) {
            $model->confirmDateGw = $map['confirm_date_gw'];
        }
        if (isset($map['confirmer_gw'])) {
            $model->confirmerGw = $map['confirmer_gw'];
        }
        if (isset($map['confirm_state_gw'])) {
            $model->confirmStateGw = $map['confirm_state_gw'];
        }
        if (isset($map['confirm_date_sup'])) {
            $model->confirmDateSup = $map['confirm_date_sup'];
        }
        if (isset($map['confirmer_sup'])) {
            $model->confirmerSup = $map['confirmer_sup'];
        }
        if (isset($map['confirm_state_sup'])) {
            $model->confirmStateSup = $map['confirm_state_sup'];
        }
        if (isset($map['socre_date'])) {
            $model->socreDate = $map['socre_date'];
        }

        return $model;
    }
}
