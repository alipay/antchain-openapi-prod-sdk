<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetHealthcodeResponse extends Model
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

    // 1：绿色 2：黄色 3：红色
    /**
     * @var string
     */
    public $healthCode;

    // 健康码失败原因
    /**
     * @var string
     */
    public $healthFactor;

    // 行程码信息
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1查询失败;
    /**
     * @var string
     */
    public $travelCode;

    // 检测类型
    /**
     * @var string
     */
    public $reportType;

    // 检测结果
    /**
     * @var string
     */
    public $reportResult;

    // 检测机构
    /**
     * @var string
     */
    public $reportOrganization;

    // 检测时间
    /**
     * @var string
     */
    public $reportTime;

    // 疫苗接种信息：
    // 0查询失败 1未接种 2已接种一针 3完成接种
    /**
     * @var string
     */
    public $vaccinationCode;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'healthCode'         => 'health_code',
        'healthFactor'       => 'health_factor',
        'travelCode'         => 'travel_code',
        'reportType'         => 'report_type',
        'reportResult'       => 'report_result',
        'reportOrganization' => 'report_organization',
        'reportTime'         => 'report_time',
        'vaccinationCode'    => 'vaccination_code',
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
        if (null !== $this->healthCode) {
            $res['health_code'] = $this->healthCode;
        }
        if (null !== $this->healthFactor) {
            $res['health_factor'] = $this->healthFactor;
        }
        if (null !== $this->travelCode) {
            $res['travel_code'] = $this->travelCode;
        }
        if (null !== $this->reportType) {
            $res['report_type'] = $this->reportType;
        }
        if (null !== $this->reportResult) {
            $res['report_result'] = $this->reportResult;
        }
        if (null !== $this->reportOrganization) {
            $res['report_organization'] = $this->reportOrganization;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->vaccinationCode) {
            $res['vaccination_code'] = $this->vaccinationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetHealthcodeResponse
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
        if (isset($map['health_code'])) {
            $model->healthCode = $map['health_code'];
        }
        if (isset($map['health_factor'])) {
            $model->healthFactor = $map['health_factor'];
        }
        if (isset($map['travel_code'])) {
            $model->travelCode = $map['travel_code'];
        }
        if (isset($map['report_type'])) {
            $model->reportType = $map['report_type'];
        }
        if (isset($map['report_result'])) {
            $model->reportResult = $map['report_result'];
        }
        if (isset($map['report_organization'])) {
            $model->reportOrganization = $map['report_organization'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }
        if (isset($map['vaccination_code'])) {
            $model->vaccinationCode = $map['vaccination_code'];
        }

        return $model;
    }
}
