<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEmissionTotalResponse extends Model
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

    // 累计排放量
    /**
     * @var int
     */
    public $totalEmission;

    // 今日新增碳排放量
    /**
     * @var int
     */
    public $totalEmissionToday;

    // 累计减碳量
    /**
     * @var int
     */
    public $totalReduction;

    // 今日减碳量
    /**
     * @var int
     */
    public $totalReductionToday;

    // 累计抵消量
    /**
     * @var int
     */
    public $totalCounteraction;

    // 今日抵消量
    /**
     * @var int
     */
    public $totalCounteractionToday;

    // 排放数据单位
    /**
     * @var string
     */
    public $dataUnit;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'totalEmission'           => 'total_emission',
        'totalEmissionToday'      => 'total_emission_today',
        'totalReduction'          => 'total_reduction',
        'totalReductionToday'     => 'total_reduction_today',
        'totalCounteraction'      => 'total_counteraction',
        'totalCounteractionToday' => 'total_counteraction_today',
        'dataUnit'                => 'data_unit',
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
        if (null !== $this->totalEmission) {
            $res['total_emission'] = $this->totalEmission;
        }
        if (null !== $this->totalEmissionToday) {
            $res['total_emission_today'] = $this->totalEmissionToday;
        }
        if (null !== $this->totalReduction) {
            $res['total_reduction'] = $this->totalReduction;
        }
        if (null !== $this->totalReductionToday) {
            $res['total_reduction_today'] = $this->totalReductionToday;
        }
        if (null !== $this->totalCounteraction) {
            $res['total_counteraction'] = $this->totalCounteraction;
        }
        if (null !== $this->totalCounteractionToday) {
            $res['total_counteraction_today'] = $this->totalCounteractionToday;
        }
        if (null !== $this->dataUnit) {
            $res['data_unit'] = $this->dataUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEmissionTotalResponse
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
        if (isset($map['total_emission'])) {
            $model->totalEmission = $map['total_emission'];
        }
        if (isset($map['total_emission_today'])) {
            $model->totalEmissionToday = $map['total_emission_today'];
        }
        if (isset($map['total_reduction'])) {
            $model->totalReduction = $map['total_reduction'];
        }
        if (isset($map['total_reduction_today'])) {
            $model->totalReductionToday = $map['total_reduction_today'];
        }
        if (isset($map['total_counteraction'])) {
            $model->totalCounteraction = $map['total_counteraction'];
        }
        if (isset($map['total_counteraction_today'])) {
            $model->totalCounteractionToday = $map['total_counteraction_today'];
        }
        if (isset($map['data_unit'])) {
            $model->dataUnit = $map['data_unit'];
        }

        return $model;
    }
}
