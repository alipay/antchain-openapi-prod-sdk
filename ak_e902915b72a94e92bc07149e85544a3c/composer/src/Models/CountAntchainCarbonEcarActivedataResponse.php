<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class CountAntchainCarbonEcarActivedataResponse extends Model
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

    // 指定时间区间内的活动数据笔数
    /**
     * @var int
     */
    public $dataEntryCount;

    // 总碳排放量
    /**
     * @var string
     */
    public $totalEmissions;

    // 各活动数据用量累计
    /**
     * @var AnyStatisticalItem[]
     */
    public $activeDataAmountList;

    // 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
    /**
     * @var string
     */
    public $emissionsIntensity;

    // 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
    /**
     * @var string
     */
    public $eachMonthEmissions;

    // 额外统计数据统计结果
    /**
     * @var AnyAmountItem[]
     */
    public $extraStatisticDatumList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'dataEntryCount'          => 'data_entry_count',
        'totalEmissions'          => 'total_emissions',
        'activeDataAmountList'    => 'active_data_amount_list',
        'emissionsIntensity'      => 'emissions_intensity',
        'eachMonthEmissions'      => 'each_month_emissions',
        'extraStatisticDatumList' => 'extra_statistic_datum_list',
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
        if (null !== $this->dataEntryCount) {
            $res['data_entry_count'] = $this->dataEntryCount;
        }
        if (null !== $this->totalEmissions) {
            $res['total_emissions'] = $this->totalEmissions;
        }
        if (null !== $this->activeDataAmountList) {
            $res['active_data_amount_list'] = [];
            if (null !== $this->activeDataAmountList && \is_array($this->activeDataAmountList)) {
                $n = 0;
                foreach ($this->activeDataAmountList as $item) {
                    $res['active_data_amount_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->emissionsIntensity) {
            $res['emissions_intensity'] = $this->emissionsIntensity;
        }
        if (null !== $this->eachMonthEmissions) {
            $res['each_month_emissions'] = $this->eachMonthEmissions;
        }
        if (null !== $this->extraStatisticDatumList) {
            $res['extra_statistic_datum_list'] = [];
            if (null !== $this->extraStatisticDatumList && \is_array($this->extraStatisticDatumList)) {
                $n = 0;
                foreach ($this->extraStatisticDatumList as $item) {
                    $res['extra_statistic_datum_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountAntchainCarbonEcarActivedataResponse
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
        if (isset($map['data_entry_count'])) {
            $model->dataEntryCount = $map['data_entry_count'];
        }
        if (isset($map['total_emissions'])) {
            $model->totalEmissions = $map['total_emissions'];
        }
        if (isset($map['active_data_amount_list'])) {
            if (!empty($map['active_data_amount_list'])) {
                $model->activeDataAmountList = [];
                $n                           = 0;
                foreach ($map['active_data_amount_list'] as $item) {
                    $model->activeDataAmountList[$n++] = null !== $item ? AnyStatisticalItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['emissions_intensity'])) {
            $model->emissionsIntensity = $map['emissions_intensity'];
        }
        if (isset($map['each_month_emissions'])) {
            $model->eachMonthEmissions = $map['each_month_emissions'];
        }
        if (isset($map['extra_statistic_datum_list'])) {
            if (!empty($map['extra_statistic_datum_list'])) {
                $model->extraStatisticDatumList = [];
                $n                              = 0;
                foreach ($map['extra_statistic_datum_list'] as $item) {
                    $model->extraStatisticDatumList[$n++] = null !== $item ? AnyAmountItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
