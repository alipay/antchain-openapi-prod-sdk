<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class GetHealthinfoResponse extends Model
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

    // 健康信息
    //
    /**
     * @var HealthInfo
     */
    public $healthInfo;

    // 核酸信息
    //
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
    //
    /**
     * @var VaccinationInfo
     */
    public $vaccinationInfo;

    // 抗原信息
    //
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

    // 被查询人姓名
    /**
     * @var string
     */
    public $name;

    // 被查询人身份证号
    //
    /**
     * @var string
     */
    public $certNo;

    // 通行记录ID
    /**
     * @var string
     */
    public $passId;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'healthInfo'      => 'health_info',
        'nucleicAcidInfo' => 'nucleic_acid_info',
        'travelInfo'      => 'travel_info',
        'vaccinationInfo' => 'vaccination_info',
        'antigenInfo'     => 'antigen_info',
        'sceneInfo'       => 'scene_info',
        'name'            => 'name',
        'certNo'          => 'cert_no',
        'passId'          => 'pass_id',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->passId) {
            $res['pass_id'] = $this->passId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetHealthinfoResponse
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['pass_id'])) {
            $model->passId = $map['pass_id'];
        }

        return $model;
    }
}
