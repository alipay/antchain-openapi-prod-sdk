<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskServerResponse extends Model
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

    // 攻击结论
    /**
     * @var string
     */
    public $faceAttack;

    // 综合风险检测结果
    /**
     * @var RiskResult
     */
    public $riskResult;

    // Aigc风险检测结论
    /**
     * @var AigcRiskResult
     */
    public $aigcRiskResult;

    // 是否面部遮挡
    /**
     * @var bool
     */
    public $faceOcclusion;

    // 人脸性别年龄预估
    /**
     * @var string
     */
    public $attributes;

    // 人脸质量分和小分
    /**
     * @var string
     */
    public $qualityResult;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'faceAttack'     => 'face_attack',
        'riskResult'     => 'risk_result',
        'aigcRiskResult' => 'aigc_risk_result',
        'faceOcclusion'  => 'face_occlusion',
        'attributes'     => 'attributes',
        'qualityResult'  => 'quality_result',
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
        if (null !== $this->faceAttack) {
            $res['face_attack'] = $this->faceAttack;
        }
        if (null !== $this->riskResult) {
            $res['risk_result'] = null !== $this->riskResult ? $this->riskResult->toMap() : null;
        }
        if (null !== $this->aigcRiskResult) {
            $res['aigc_risk_result'] = null !== $this->aigcRiskResult ? $this->aigcRiskResult->toMap() : null;
        }
        if (null !== $this->faceOcclusion) {
            $res['face_occlusion'] = $this->faceOcclusion;
        }
        if (null !== $this->attributes) {
            $res['attributes'] = $this->attributes;
        }
        if (null !== $this->qualityResult) {
            $res['quality_result'] = $this->qualityResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskServerResponse
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
        if (isset($map['face_attack'])) {
            $model->faceAttack = $map['face_attack'];
        }
        if (isset($map['risk_result'])) {
            $model->riskResult = RiskResult::fromMap($map['risk_result']);
        }
        if (isset($map['aigc_risk_result'])) {
            $model->aigcRiskResult = AigcRiskResult::fromMap($map['aigc_risk_result']);
        }
        if (isset($map['face_occlusion'])) {
            $model->faceOcclusion = $map['face_occlusion'];
        }
        if (isset($map['attributes'])) {
            $model->attributes = $map['attributes'];
        }
        if (isset($map['quality_result'])) {
            $model->qualityResult = $map['quality_result'];
        }

        return $model;
    }
}
