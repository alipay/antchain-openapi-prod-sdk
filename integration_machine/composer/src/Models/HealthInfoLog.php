<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class HealthInfoLog extends Model
{
    // 身份证号
    /**
     * @example 61012*********3421
     *
     * @var string
     */
    public $certNo;

    // 姓名
    /**
     * @example 王*
     *
     * @var string
     */
    public $certName;

    // 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
    /**
     * @example 1
     *
     * @var string
     */
    public $healthCode;

    // 行程信息
    //
    /**
     * @example
     *
     * @var TravelInfo
     */
    public $travelInfo;

    // 核酸信息
    //
    /**
     * @example
     *
     * @var NucleicAcidInfo
     */
    public $nucleicAcidInfo;

    // 疫苗信息
    //
    /**
     * @example
     *
     * @var VaccinationInfo
     */
    public $vaccinationInfo;

    // 抗原信息
    //
    /**
     * @example
     *
     * @var AntigenInfo
     */
    public $antigenInfo;

    // 场所信息
    //
    /**
     * @example
     *
     * @var SceneInfo
     */
    public $sceneInfo;

    // 数据源通行状态 0:禁止通行,1:允许通行
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $channelPassState;

    // 经度
    //
    /**
     * @example 39.916527
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 39.916527
     *
     * @var string
     */
    public $latitude;

    // 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸）
    //
    /**
     * @example 反扫
     *
     * @var string
     */
    public $passMode;

    // 通行时长(单位:毫秒)
    //
    /**
     * @example 2000
     *
     * @var string
     */
    public $passDuration;

    // 通行时间
    //
    /**
     * @example 2022-07-07 12:12:12
     *
     * @var string
     */
    public $passTime;

    // 通行结果(0:禁止通行,1:允许通行)
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $passResult;
    protected $_name = [
        'certNo'           => 'cert_no',
        'certName'         => 'cert_name',
        'healthCode'       => 'health_code',
        'travelInfo'       => 'travel_info',
        'nucleicAcidInfo'  => 'nucleic_acid_info',
        'vaccinationInfo'  => 'vaccination_info',
        'antigenInfo'      => 'antigen_info',
        'sceneInfo'        => 'scene_info',
        'channelPassState' => 'channel_pass_state',
        'longitude'        => 'longitude',
        'latitude'         => 'latitude',
        'passMode'         => 'pass_mode',
        'passDuration'     => 'pass_duration',
        'passTime'         => 'pass_time',
        'passResult'       => 'pass_result',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('healthCode', $this->healthCode, true);
        Model::validateRequired('travelInfo', $this->travelInfo, true);
        Model::validateRequired('nucleicAcidInfo', $this->nucleicAcidInfo, true);
        Model::validateRequired('vaccinationInfo', $this->vaccinationInfo, true);
        Model::validateRequired('antigenInfo', $this->antigenInfo, true);
        Model::validateRequired('sceneInfo', $this->sceneInfo, true);
        Model::validateRequired('channelPassState', $this->channelPassState, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('latitude', $this->latitude, true);
        Model::validateRequired('passMode', $this->passMode, true);
        Model::validateRequired('passDuration', $this->passDuration, true);
        Model::validateRequired('passTime', $this->passTime, true);
        Model::validateRequired('passResult', $this->passResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->healthCode) {
            $res['health_code'] = $this->healthCode;
        }
        if (null !== $this->travelInfo) {
            $res['travel_info'] = null !== $this->travelInfo ? $this->travelInfo->toMap() : null;
        }
        if (null !== $this->nucleicAcidInfo) {
            $res['nucleic_acid_info'] = null !== $this->nucleicAcidInfo ? $this->nucleicAcidInfo->toMap() : null;
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
        if (null !== $this->channelPassState) {
            $res['channel_pass_state'] = $this->channelPassState;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->passMode) {
            $res['pass_mode'] = $this->passMode;
        }
        if (null !== $this->passDuration) {
            $res['pass_duration'] = $this->passDuration;
        }
        if (null !== $this->passTime) {
            $res['pass_time'] = $this->passTime;
        }
        if (null !== $this->passResult) {
            $res['pass_result'] = $this->passResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HealthInfoLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['health_code'])) {
            $model->healthCode = $map['health_code'];
        }
        if (isset($map['travel_info'])) {
            $model->travelInfo = TravelInfo::fromMap($map['travel_info']);
        }
        if (isset($map['nucleic_acid_info'])) {
            $model->nucleicAcidInfo = NucleicAcidInfo::fromMap($map['nucleic_acid_info']);
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
        if (isset($map['channel_pass_state'])) {
            $model->channelPassState = $map['channel_pass_state'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['pass_mode'])) {
            $model->passMode = $map['pass_mode'];
        }
        if (isset($map['pass_duration'])) {
            $model->passDuration = $map['pass_duration'];
        }
        if (isset($map['pass_time'])) {
            $model->passTime = $map['pass_time'];
        }
        if (isset($map['pass_result'])) {
            $model->passResult = $map['pass_result'];
        }

        return $model;
    }
}
