<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DescribeAcarDailyemissionsResponse extends Model
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

    // 净排放量
    /**
     * @var int
     */
    public $netEmissions;

    // 累计到当前时间的总碳排放量
    /**
     * @var int
     */
    public $totalEmissions;

    // 排放量单位
    /**
     * @var string
     */
    public $unit;

    // 当前计算完成时间
    /**
     * @var string
     */
    public $finishTimestamp;

    // 活动期间每日累计的总碳排放量
    /**
     * @var DailyEmissions[]
     */
    public $dailyEmissionsList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'netEmissions'       => 'net_emissions',
        'totalEmissions'     => 'total_emissions',
        'unit'               => 'unit',
        'finishTimestamp'    => 'finish_timestamp',
        'dailyEmissionsList' => 'daily_emissions_list',
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
        if (null !== $this->netEmissions) {
            $res['net_emissions'] = $this->netEmissions;
        }
        if (null !== $this->totalEmissions) {
            $res['total_emissions'] = $this->totalEmissions;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->finishTimestamp) {
            $res['finish_timestamp'] = $this->finishTimestamp;
        }
        if (null !== $this->dailyEmissionsList) {
            $res['daily_emissions_list'] = [];
            if (null !== $this->dailyEmissionsList && \is_array($this->dailyEmissionsList)) {
                $n = 0;
                foreach ($this->dailyEmissionsList as $item) {
                    $res['daily_emissions_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeAcarDailyemissionsResponse
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
        if (isset($map['net_emissions'])) {
            $model->netEmissions = $map['net_emissions'];
        }
        if (isset($map['total_emissions'])) {
            $model->totalEmissions = $map['total_emissions'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['finish_timestamp'])) {
            $model->finishTimestamp = $map['finish_timestamp'];
        }
        if (isset($map['daily_emissions_list'])) {
            if (!empty($map['daily_emissions_list'])) {
                $model->dailyEmissionsList = [];
                $n                         = 0;
                foreach ($map['daily_emissions_list'] as $item) {
                    $model->dailyEmissionsList[$n++] = null !== $item ? DailyEmissions::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
