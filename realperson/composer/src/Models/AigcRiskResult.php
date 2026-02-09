<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class AigcRiskResult extends Model
{
    // AIGC风险检测评分
    /**
     * @example safe
     *
     * @var string
     */
    public $aigcRiskLevel;

    // 图像伪造分数
    /**
     * @example 0.2
     *
     * @var string
     */
    public $deepfakeScore;

    // 图像伪造结论
    /**
     * @example T
     *
     * @var string
     */
    public $deepfakeResult;

    // 视频伪造分数
    /**
     * @example 0.2
     *
     * @var string
     */
    public $videoForgeryScore;

    // 视频伪造结论
    /**
     * @example T
     *
     * @var string
     */
    public $videoForgeryResult;
    protected $_name = [
        'aigcRiskLevel'      => 'aigc_risk_level',
        'deepfakeScore'      => 'deepfake_score',
        'deepfakeResult'     => 'deepfake_result',
        'videoForgeryScore'  => 'video_forgery_score',
        'videoForgeryResult' => 'video_forgery_result',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->aigcRiskLevel) {
            $res['aigc_risk_level'] = $this->aigcRiskLevel;
        }
        if (null !== $this->deepfakeScore) {
            $res['deepfake_score'] = $this->deepfakeScore;
        }
        if (null !== $this->deepfakeResult) {
            $res['deepfake_result'] = $this->deepfakeResult;
        }
        if (null !== $this->videoForgeryScore) {
            $res['video_forgery_score'] = $this->videoForgeryScore;
        }
        if (null !== $this->videoForgeryResult) {
            $res['video_forgery_result'] = $this->videoForgeryResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AigcRiskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['aigc_risk_level'])) {
            $model->aigcRiskLevel = $map['aigc_risk_level'];
        }
        if (isset($map['deepfake_score'])) {
            $model->deepfakeScore = $map['deepfake_score'];
        }
        if (isset($map['deepfake_result'])) {
            $model->deepfakeResult = $map['deepfake_result'];
        }
        if (isset($map['video_forgery_score'])) {
            $model->videoForgeryScore = $map['video_forgery_score'];
        }
        if (isset($map['video_forgery_result'])) {
            $model->videoForgeryResult = $map['video_forgery_result'];
        }

        return $model;
    }
}
