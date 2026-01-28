<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailLcaprojectTraceprojectResponse extends Model
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

    // 原材料运输排放量
    /**
     * @var string
     */
    public $transportEmissionAmount;

    // 碳足迹总排放量
    /**
     * @var string
     */
    public $emissionAmount;

    // 废弃物运输排放量
    /**
     * @var string
     */
    public $wasteTransportEmissionAmount;

    // 碳足迹排放单位
    /**
     * @var string
     */
    public $emissionUnit;

    // 废弃物处置排放量
    /**
     * @var string
     */
    public $wasteDisposalEmissionAmount;

    // 原材料制造排放量
    /**
     * @var string
     */
    public $manufactureEmissionAmount;

    // 能耗使用排放量
    /**
     * @var string
     */
    public $energyEmissionAmount;

    // 环境排放排放量
    /**
     * @var string
     */
    public $environmentEmissionAmount;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'transportEmissionAmount'      => 'transport_emission_amount',
        'emissionAmount'               => 'emission_amount',
        'wasteTransportEmissionAmount' => 'waste_transport_emission_amount',
        'emissionUnit'                 => 'emission_unit',
        'wasteDisposalEmissionAmount'  => 'waste_disposal_emission_amount',
        'manufactureEmissionAmount'    => 'manufacture_emission_amount',
        'energyEmissionAmount'         => 'energy_emission_amount',
        'environmentEmissionAmount'    => 'environment_emission_amount',
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
        if (null !== $this->transportEmissionAmount) {
            $res['transport_emission_amount'] = $this->transportEmissionAmount;
        }
        if (null !== $this->emissionAmount) {
            $res['emission_amount'] = $this->emissionAmount;
        }
        if (null !== $this->wasteTransportEmissionAmount) {
            $res['waste_transport_emission_amount'] = $this->wasteTransportEmissionAmount;
        }
        if (null !== $this->emissionUnit) {
            $res['emission_unit'] = $this->emissionUnit;
        }
        if (null !== $this->wasteDisposalEmissionAmount) {
            $res['waste_disposal_emission_amount'] = $this->wasteDisposalEmissionAmount;
        }
        if (null !== $this->manufactureEmissionAmount) {
            $res['manufacture_emission_amount'] = $this->manufactureEmissionAmount;
        }
        if (null !== $this->energyEmissionAmount) {
            $res['energy_emission_amount'] = $this->energyEmissionAmount;
        }
        if (null !== $this->environmentEmissionAmount) {
            $res['environment_emission_amount'] = $this->environmentEmissionAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailLcaprojectTraceprojectResponse
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
        if (isset($map['transport_emission_amount'])) {
            $model->transportEmissionAmount = $map['transport_emission_amount'];
        }
        if (isset($map['emission_amount'])) {
            $model->emissionAmount = $map['emission_amount'];
        }
        if (isset($map['waste_transport_emission_amount'])) {
            $model->wasteTransportEmissionAmount = $map['waste_transport_emission_amount'];
        }
        if (isset($map['emission_unit'])) {
            $model->emissionUnit = $map['emission_unit'];
        }
        if (isset($map['waste_disposal_emission_amount'])) {
            $model->wasteDisposalEmissionAmount = $map['waste_disposal_emission_amount'];
        }
        if (isset($map['manufacture_emission_amount'])) {
            $model->manufactureEmissionAmount = $map['manufacture_emission_amount'];
        }
        if (isset($map['energy_emission_amount'])) {
            $model->energyEmissionAmount = $map['energy_emission_amount'];
        }
        if (isset($map['environment_emission_amount'])) {
            $model->environmentEmissionAmount = $map['environment_emission_amount'];
        }

        return $model;
    }
}
