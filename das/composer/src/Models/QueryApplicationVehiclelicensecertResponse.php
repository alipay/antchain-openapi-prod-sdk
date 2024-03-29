<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationVehiclelicensecertResponse extends Model
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

    // 行驶证信息
    /**
     * @var VehicleLicenseInfo
     */
    public $vehicleLicenseInfo;

    // 行驶证核验结果
    /**
     * @var VehicleLicenseCertResult
     */
    public $vehicleLicenseCertResult;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'vehicleLicenseInfo'       => 'vehicle_license_info',
        'vehicleLicenseCertResult' => 'vehicle_license_cert_result',
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
        if (null !== $this->vehicleLicenseInfo) {
            $res['vehicle_license_info'] = null !== $this->vehicleLicenseInfo ? $this->vehicleLicenseInfo->toMap() : null;
        }
        if (null !== $this->vehicleLicenseCertResult) {
            $res['vehicle_license_cert_result'] = null !== $this->vehicleLicenseCertResult ? $this->vehicleLicenseCertResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationVehiclelicensecertResponse
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
        if (isset($map['vehicle_license_info'])) {
            $model->vehicleLicenseInfo = VehicleLicenseInfo::fromMap($map['vehicle_license_info']);
        }
        if (isset($map['vehicle_license_cert_result'])) {
            $model->vehicleLicenseCertResult = VehicleLicenseCertResult::fromMap($map['vehicle_license_cert_result']);
        }

        return $model;
    }
}
