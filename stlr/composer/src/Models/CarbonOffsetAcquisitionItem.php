<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CarbonOffsetAcquisitionItem extends Model
{
    // 采集数据单号
    /**
     * @example 123456789abcdefghi
     *
     * @var string
     */
    public $acquisitionItemNo;

    // 碳补偿项目编号
    /**
     * @example 13222
     *
     * @var string
     */
    public $projectNo;

    // 参与账户DID
    /**
     * @example 123456789abcdefghi
     *
     * @var string
     */
    public $accountDid;

    // 发生时间
    /**
     * @example 2023-05-23 12:11:32:33
     *
     * @var string
     */
    public $occurrentTime;

    // 发生场景编码
    /**
     * @example xingzou
     *
     * @var string
     */
    public $scenarioCode;

    // 发生场景名称
    /**
     * @example 出行
     *
     * @var string
     */
    public $scenarioName;

    // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
    /**
     * @example Antforest
     *
     * @var string
     */
    public $platformNo;

    // 活动数据原始值，多个活动数据列表
    /**
     * @example
     *
     * @var AnyAmountItem[]
     */
    public $activeDatum;

    // 减碳量
    /**
     * @example 122.22
     *
     * @var string
     */
    public $offsetVolume;

    // 碳能量值
    /**
     * @example 229
     *
     * @var int
     */
    public $carbonEnergy;
    protected $_name = [
        'acquisitionItemNo' => 'acquisition_item_no',
        'projectNo'         => 'project_no',
        'accountDid'        => 'account_did',
        'occurrentTime'     => 'occurrent_time',
        'scenarioCode'      => 'scenario_code',
        'scenarioName'      => 'scenario_name',
        'platformNo'        => 'platform_no',
        'activeDatum'       => 'active_datum',
        'offsetVolume'      => 'offset_volume',
        'carbonEnergy'      => 'carbon_energy',
    ];

    public function validate()
    {
        Model::validateRequired('acquisitionItemNo', $this->acquisitionItemNo, true);
        Model::validateRequired('projectNo', $this->projectNo, true);
        Model::validateRequired('accountDid', $this->accountDid, true);
        Model::validateRequired('occurrentTime', $this->occurrentTime, true);
        Model::validateRequired('scenarioCode', $this->scenarioCode, true);
        Model::validateRequired('scenarioName', $this->scenarioName, true);
        Model::validateRequired('platformNo', $this->platformNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->acquisitionItemNo) {
            $res['acquisition_item_no'] = $this->acquisitionItemNo;
        }
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->occurrentTime) {
            $res['occurrent_time'] = $this->occurrentTime;
        }
        if (null !== $this->scenarioCode) {
            $res['scenario_code'] = $this->scenarioCode;
        }
        if (null !== $this->scenarioName) {
            $res['scenario_name'] = $this->scenarioName;
        }
        if (null !== $this->platformNo) {
            $res['platform_no'] = $this->platformNo;
        }
        if (null !== $this->activeDatum) {
            $res['active_datum'] = [];
            if (null !== $this->activeDatum && \is_array($this->activeDatum)) {
                $n = 0;
                foreach ($this->activeDatum as $item) {
                    $res['active_datum'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->offsetVolume) {
            $res['offset_volume'] = $this->offsetVolume;
        }
        if (null !== $this->carbonEnergy) {
            $res['carbon_energy'] = $this->carbonEnergy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarbonOffsetAcquisitionItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['acquisition_item_no'])) {
            $model->acquisitionItemNo = $map['acquisition_item_no'];
        }
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['occurrent_time'])) {
            $model->occurrentTime = $map['occurrent_time'];
        }
        if (isset($map['scenario_code'])) {
            $model->scenarioCode = $map['scenario_code'];
        }
        if (isset($map['scenario_name'])) {
            $model->scenarioName = $map['scenario_name'];
        }
        if (isset($map['platform_no'])) {
            $model->platformNo = $map['platform_no'];
        }
        if (isset($map['active_datum'])) {
            if (!empty($map['active_datum'])) {
                $model->activeDatum = [];
                $n                  = 0;
                foreach ($map['active_datum'] as $item) {
                    $model->activeDatum[$n++] = null !== $item ? AnyAmountItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['offset_volume'])) {
            $model->offsetVolume = $map['offset_volume'];
        }
        if (isset($map['carbon_energy'])) {
            $model->carbonEnergy = $map['carbon_energy'];
        }

        return $model;
    }
}
