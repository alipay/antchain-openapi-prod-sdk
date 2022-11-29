<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PreviewEcarAvitivedataResponse extends Model
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

    // 总排放量，最多保留6位小数
    /**
     * @var string
     */
    public $totalEmissions;

    // 核减减排量，最多保留6位小数
    /**
     * @var string
     */
    public $subtractReductions;

    // 净排放量，核减后的碳排放量
    /**
     * @var string
     */
    public $netReductions;

    // 年同比
    /**
     * @var string
     */
    public $yearCompareLastPer;

    // 碳排放量单位
    /**
     * @var string
     */
    public $unit;

    // 碳排放量单位显示标签
    /**
     * @var string
     */
    public $unitLabel;

    // 各月份排放数据列表
    /**
     * @var AnnualMonthEmissionDatum[]
     */
    public $list;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'totalEmissions'     => 'total_emissions',
        'subtractReductions' => 'subtract_reductions',
        'netReductions'      => 'net_reductions',
        'yearCompareLastPer' => 'year_compare_last_per',
        'unit'               => 'unit',
        'unitLabel'          => 'unit_label',
        'list'               => 'list',
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
        if (null !== $this->totalEmissions) {
            $res['total_emissions'] = $this->totalEmissions;
        }
        if (null !== $this->subtractReductions) {
            $res['subtract_reductions'] = $this->subtractReductions;
        }
        if (null !== $this->netReductions) {
            $res['net_reductions'] = $this->netReductions;
        }
        if (null !== $this->yearCompareLastPer) {
            $res['year_compare_last_per'] = $this->yearCompareLastPer;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->unitLabel) {
            $res['unit_label'] = $this->unitLabel;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewEcarAvitivedataResponse
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
        if (isset($map['total_emissions'])) {
            $model->totalEmissions = $map['total_emissions'];
        }
        if (isset($map['subtract_reductions'])) {
            $model->subtractReductions = $map['subtract_reductions'];
        }
        if (isset($map['net_reductions'])) {
            $model->netReductions = $map['net_reductions'];
        }
        if (isset($map['year_compare_last_per'])) {
            $model->yearCompareLastPer = $map['year_compare_last_per'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['unit_label'])) {
            $model->unitLabel = $map['unit_label'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? AnnualMonthEmissionDatum::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
