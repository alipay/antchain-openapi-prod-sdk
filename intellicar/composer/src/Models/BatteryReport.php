<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class BatteryReport extends Model
{
    // 充电单号，最大长度/规则：32
    /**
     * @example 202603031234567890
     *
     * @var string
     */
    public $startChargeSeq;

    // VIN，最大长度/规则：17位
    /**
     * @example LFV3A2***3123456
     *
     * @var string
     */
    public $vinCode;

    // 公告号，最大长度/规则36
    /**
     * @example BJ7000USD3-BEV
     *
     * @var string
     */
    public $publicationNo;

    // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
    /**
     * @example 25.30
     *
     * @var string
     */
    public $totalPower;

    // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
    /**
     * @example 50.00
     *
     * @var string
     */
    public $totalChargeSoc;

    // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
    /**
     * @example 25.00
     *
     * @var string
     */
    public $startSoc;

    // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
    /**
     * @example 75.00
     *
     * @var string
     */
    public $endSoc;

    // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
    /**
     * @example 60.00
     *
     * @var string
     */
    public $nominalEnergy;

    // 充电城市ID；最大长度/规则：30
    /**
     * @example -
     *
     * @var string
     */
    public $cityId;

    // 注册日期；最大长度/规则：yyyy-MM-dd
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $registerDate;
    protected $_name = [
        'startChargeSeq' => 'start_charge_seq',
        'vinCode'        => 'vin_code',
        'publicationNo'  => 'publication_no',
        'totalPower'     => 'total_power',
        'totalChargeSoc' => 'total_charge_soc',
        'startSoc'       => 'start_soc',
        'endSoc'         => 'end_soc',
        'nominalEnergy'  => 'nominal_energy',
        'cityId'         => 'city_id',
        'registerDate'   => 'register_date',
    ];

    public function validate()
    {
        Model::validateRequired('startChargeSeq', $this->startChargeSeq, true);
        Model::validateRequired('vinCode', $this->vinCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->startChargeSeq) {
            $res['start_charge_seq'] = $this->startChargeSeq;
        }
        if (null !== $this->vinCode) {
            $res['vin_code'] = $this->vinCode;
        }
        if (null !== $this->publicationNo) {
            $res['publication_no'] = $this->publicationNo;
        }
        if (null !== $this->totalPower) {
            $res['total_power'] = $this->totalPower;
        }
        if (null !== $this->totalChargeSoc) {
            $res['total_charge_soc'] = $this->totalChargeSoc;
        }
        if (null !== $this->startSoc) {
            $res['start_soc'] = $this->startSoc;
        }
        if (null !== $this->endSoc) {
            $res['end_soc'] = $this->endSoc;
        }
        if (null !== $this->nominalEnergy) {
            $res['nominal_energy'] = $this->nominalEnergy;
        }
        if (null !== $this->cityId) {
            $res['city_id'] = $this->cityId;
        }
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatteryReport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start_charge_seq'])) {
            $model->startChargeSeq = $map['start_charge_seq'];
        }
        if (isset($map['vin_code'])) {
            $model->vinCode = $map['vin_code'];
        }
        if (isset($map['publication_no'])) {
            $model->publicationNo = $map['publication_no'];
        }
        if (isset($map['total_power'])) {
            $model->totalPower = $map['total_power'];
        }
        if (isset($map['total_charge_soc'])) {
            $model->totalChargeSoc = $map['total_charge_soc'];
        }
        if (isset($map['start_soc'])) {
            $model->startSoc = $map['start_soc'];
        }
        if (isset($map['end_soc'])) {
            $model->endSoc = $map['end_soc'];
        }
        if (isset($map['nominal_energy'])) {
            $model->nominalEnergy = $map['nominal_energy'];
        }
        if (isset($map['city_id'])) {
            $model->cityId = $map['city_id'];
        }
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }

        return $model;
    }
}
