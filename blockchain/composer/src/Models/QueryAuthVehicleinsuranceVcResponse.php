<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthVehicleinsuranceVcResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 上次交强险投保年月
    /**
     * @var string
     */
    public $lastInsuranceDate;

    // 初次投保日期
    /**
     * @var string
     */
    public $firstInsuranceDate;

    // 最近交强险投保期止
    /**
     * @var string
     */
    public $latestInsuranceDate;

    // 车辆did
    /**
     * @var string
     */
    public $vehicleDid;

    // 车主did
    /**
     * @var string
     */
    public $ownerUserDid;

    // 可验证声明id
    /**
     * @var string
     */
    public $vcId;

    // 业务提供方代码
    /**
     * @var int
     */
    public $ispType;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'lastInsuranceDate'   => 'last_insurance_date',
        'firstInsuranceDate'  => 'first_insurance_date',
        'latestInsuranceDate' => 'latest_insurance_date',
        'vehicleDid'          => 'vehicle_did',
        'ownerUserDid'        => 'owner_user_did',
        'vcId'                => 'vc_id',
        'ispType'             => 'isp_type',
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
        if (null !== $this->lastInsuranceDate) {
            $res['last_insurance_date'] = $this->lastInsuranceDate;
        }
        if (null !== $this->firstInsuranceDate) {
            $res['first_insurance_date'] = $this->firstInsuranceDate;
        }
        if (null !== $this->latestInsuranceDate) {
            $res['latest_insurance_date'] = $this->latestInsuranceDate;
        }
        if (null !== $this->vehicleDid) {
            $res['vehicle_did'] = $this->vehicleDid;
        }
        if (null !== $this->ownerUserDid) {
            $res['owner_user_did'] = $this->ownerUserDid;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->ispType) {
            $res['isp_type'] = $this->ispType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthVehicleinsuranceVcResponse
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
        if (isset($map['last_insurance_date'])) {
            $model->lastInsuranceDate = $map['last_insurance_date'];
        }
        if (isset($map['first_insurance_date'])) {
            $model->firstInsuranceDate = $map['first_insurance_date'];
        }
        if (isset($map['latest_insurance_date'])) {
            $model->latestInsuranceDate = $map['latest_insurance_date'];
        }
        if (isset($map['vehicle_did'])) {
            $model->vehicleDid = $map['vehicle_did'];
        }
        if (isset($map['owner_user_did'])) {
            $model->ownerUserDid = $map['owner_user_did'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['isp_type'])) {
            $model->ispType = $map['isp_type'];
        }

        return $model;
    }
}
