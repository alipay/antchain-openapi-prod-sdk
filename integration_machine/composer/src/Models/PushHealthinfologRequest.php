<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class PushHealthinfologRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 通行记录ID
    /**
     * @var string
     */
    public $passId;

    // 设备SN
    /**
     * @var string
     */
    public $serialNo;

    // 设备厂商
    //
    /**
     * @var string
     */
    public $corpName;

    // 通行时长(ms)
    /**
     * @var int
     */
    public $costTime;

    // 通行结果
    /**
     * @var string
     */
    public $passResult;

    // 被查询人姓名
    //
    /**
     * @var string
     */
    public $name;

    // 被查询人身份证号
    /**
     * @var string
     */
    public $certNo;

    // 异常类型
    /**
     * @var string
     */
    public $errorType;

    // 错误码
    /**
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @var string
     */
    public $errorMsg;

    // 体温
    /**
     * @var string
     */
    public $temperature;

    // 健康信息
    /**
     * @var HealthInfo
     */
    public $healthInfo;

    // 核酸信息
    /**
     * @var NucleicAcidInfo
     */
    public $nucleicAcidInfo;

    // 行程信息
    //
    /**
     * @var TravelInfo
     */
    public $travelInfo;

    // 疫苗接种信息
    /**
     * @var VaccinationInfo
     */
    public $vaccinationInfo;

    // 抗原信息
    /**
     * @var AntigenInfo
     */
    public $antigenInfo;

    // 场所信息
    //
    /**
     * @var SceneInfo
     */
    public $sceneInfo;

    // 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
    /**
     * @var string
     */
    public $passMode;

    // 经度
    /**
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @var string
     */
    public $latitude;

    // 数据源通行状态 0:禁止通行,1:允许通行
    /**
     * @var string
     */
    public $channelPassState;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'passId'            => 'pass_id',
        'serialNo'          => 'serial_no',
        'corpName'          => 'corp_name',
        'costTime'          => 'cost_time',
        'passResult'        => 'pass_result',
        'name'              => 'name',
        'certNo'            => 'cert_no',
        'errorType'         => 'error_type',
        'errorCode'         => 'error_code',
        'errorMsg'          => 'error_msg',
        'temperature'       => 'temperature',
        'healthInfo'        => 'health_info',
        'nucleicAcidInfo'   => 'nucleic_acid_info',
        'travelInfo'        => 'travel_info',
        'vaccinationInfo'   => 'vaccination_info',
        'antigenInfo'       => 'antigen_info',
        'sceneInfo'         => 'scene_info',
        'passMode'          => 'pass_mode',
        'longitude'         => 'longitude',
        'latitude'          => 'latitude',
        'channelPassState'  => 'channel_pass_state',
    ];

    public function validate()
    {
        Model::validateRequired('passId', $this->passId, true);
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('costTime', $this->costTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->passId) {
            $res['pass_id'] = $this->passId;
        }
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->costTime) {
            $res['cost_time'] = $this->costTime;
        }
        if (null !== $this->passResult) {
            $res['pass_result'] = $this->passResult;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->errorType) {
            $res['error_type'] = $this->errorType;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->temperature) {
            $res['temperature'] = $this->temperature;
        }
        if (null !== $this->healthInfo) {
            $res['health_info'] = null !== $this->healthInfo ? $this->healthInfo->toMap() : null;
        }
        if (null !== $this->nucleicAcidInfo) {
            $res['nucleic_acid_info'] = null !== $this->nucleicAcidInfo ? $this->nucleicAcidInfo->toMap() : null;
        }
        if (null !== $this->travelInfo) {
            $res['travel_info'] = null !== $this->travelInfo ? $this->travelInfo->toMap() : null;
        }
        if (null !== $this->vaccinationInfo) {
            $res['vaccination_info'] = null !== $this->vaccinationInfo ? $this->vaccinationInfo->toMap() : null;
        }
        if (null !== $this->antigenInfo) {
            $res['antigen_info'] = null !== $this->antigenInfo ? $this->antigenInfo->toMap() : null;
        }
        if (null !== $this->sceneInfo) {
            $res['scene_info'] = null !== $this->sceneInfo ? $this->sceneInfo->toMap() : null;
        }
        if (null !== $this->passMode) {
            $res['pass_mode'] = $this->passMode;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->channelPassState) {
            $res['channel_pass_state'] = $this->channelPassState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushHealthinfologRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['pass_id'])) {
            $model->passId = $map['pass_id'];
        }
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['cost_time'])) {
            $model->costTime = $map['cost_time'];
        }
        if (isset($map['pass_result'])) {
            $model->passResult = $map['pass_result'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['error_type'])) {
            $model->errorType = $map['error_type'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['temperature'])) {
            $model->temperature = $map['temperature'];
        }
        if (isset($map['health_info'])) {
            $model->healthInfo = HealthInfo::fromMap($map['health_info']);
        }
        if (isset($map['nucleic_acid_info'])) {
            $model->nucleicAcidInfo = NucleicAcidInfo::fromMap($map['nucleic_acid_info']);
        }
        if (isset($map['travel_info'])) {
            $model->travelInfo = TravelInfo::fromMap($map['travel_info']);
        }
        if (isset($map['vaccination_info'])) {
            $model->vaccinationInfo = VaccinationInfo::fromMap($map['vaccination_info']);
        }
        if (isset($map['antigen_info'])) {
            $model->antigenInfo = AntigenInfo::fromMap($map['antigen_info']);
        }
        if (isset($map['scene_info'])) {
            $model->sceneInfo = SceneInfo::fromMap($map['scene_info']);
        }
        if (isset($map['pass_mode'])) {
            $model->passMode = $map['pass_mode'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['channel_pass_state'])) {
            $model->channelPassState = $map['channel_pass_state'];
        }

        return $model;
    }
}
