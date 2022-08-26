<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class DetailAntchainCarbonEcarAvitivedataResponse extends Model
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

    // 企业排放数据录入明细编码
    /**
     * @var string
     */
    public $emissionDataEntryItemNo;

    // 企业业务单号
    /**
     * @var string
     */
    public $enterpriseBizNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $occurrenceEndTime;

    // 链上交易Hash
    /**
     * @var string
     */
    public $carbonChainTradeHash;

    // 总的碳排放用量，按字符串输出，最多保留6位小数
    /**
     * @var string
     */
    public $emissionStatisticalAmount;

    // 排放源编码
    /**
     * @var string
     */
    public $emissionSourceNo;

    // 排放源名称
    /**
     * @var string
     */
    public $emissionSourceName;

    // 排放单元编码
    /**
     * @var string
     */
    public $enterpriseLocationNo;

    // 排放单元名称
    /**
     * @var string
     */
    public $enterpriseLocationName;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'emissionDataEntryItemNo'   => 'emission_data_entry_item_no',
        'enterpriseBizNo'           => 'enterprise_biz_no',
        'occurrenceStartTime'       => 'occurrence_start_time',
        'occurrenceEndTime'         => 'occurrence_end_time',
        'carbonChainTradeHash'      => 'carbon_chain_trade_hash',
        'emissionStatisticalAmount' => 'emission_statistical_amount',
        'emissionSourceNo'          => 'emission_source_no',
        'emissionSourceName'        => 'emission_source_name',
        'enterpriseLocationNo'      => 'enterprise_location_no',
        'enterpriseLocationName'    => 'enterprise_location_name',
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
        if (null !== $this->emissionDataEntryItemNo) {
            $res['emission_data_entry_item_no'] = $this->emissionDataEntryItemNo;
        }
        if (null !== $this->enterpriseBizNo) {
            $res['enterprise_biz_no'] = $this->enterpriseBizNo;
        }
        if (null !== $this->occurrenceStartTime) {
            $res['occurrence_start_time'] = $this->occurrenceStartTime;
        }
        if (null !== $this->occurrenceEndTime) {
            $res['occurrence_end_time'] = $this->occurrenceEndTime;
        }
        if (null !== $this->carbonChainTradeHash) {
            $res['carbon_chain_trade_hash'] = $this->carbonChainTradeHash;
        }
        if (null !== $this->emissionStatisticalAmount) {
            $res['emission_statistical_amount'] = $this->emissionStatisticalAmount;
        }
        if (null !== $this->emissionSourceNo) {
            $res['emission_source_no'] = $this->emissionSourceNo;
        }
        if (null !== $this->emissionSourceName) {
            $res['emission_source_name'] = $this->emissionSourceName;
        }
        if (null !== $this->enterpriseLocationNo) {
            $res['enterprise_location_no'] = $this->enterpriseLocationNo;
        }
        if (null !== $this->enterpriseLocationName) {
            $res['enterprise_location_name'] = $this->enterpriseLocationName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAntchainCarbonEcarAvitivedataResponse
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
        if (isset($map['emission_data_entry_item_no'])) {
            $model->emissionDataEntryItemNo = $map['emission_data_entry_item_no'];
        }
        if (isset($map['enterprise_biz_no'])) {
            $model->enterpriseBizNo = $map['enterprise_biz_no'];
        }
        if (isset($map['occurrence_start_time'])) {
            $model->occurrenceStartTime = $map['occurrence_start_time'];
        }
        if (isset($map['occurrence_end_time'])) {
            $model->occurrenceEndTime = $map['occurrence_end_time'];
        }
        if (isset($map['carbon_chain_trade_hash'])) {
            $model->carbonChainTradeHash = $map['carbon_chain_trade_hash'];
        }
        if (isset($map['emission_statistical_amount'])) {
            $model->emissionStatisticalAmount = $map['emission_statistical_amount'];
        }
        if (isset($map['emission_source_no'])) {
            $model->emissionSourceNo = $map['emission_source_no'];
        }
        if (isset($map['emission_source_name'])) {
            $model->emissionSourceName = $map['emission_source_name'];
        }
        if (isset($map['enterprise_location_no'])) {
            $model->enterpriseLocationNo = $map['enterprise_location_no'];
        }
        if (isset($map['enterprise_location_name'])) {
            $model->enterpriseLocationName = $map['enterprise_location_name'];
        }

        return $model;
    }
}
