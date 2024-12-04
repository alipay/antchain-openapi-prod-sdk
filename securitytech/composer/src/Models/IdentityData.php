<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class IdentityData extends Model
{
    // 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
    /**
     * @example 1
     *
     * @var string
     */
    public $isRisk;

    // 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
    /**
     * @example PS,SCREEN_PHOTO
     *
     * @var string
     */
    public $riskType;

    // 附加字段,json格式字符串
    /**
     * @example { "ps_score": "0.0236", "screen_photo_score": "0.1839"}
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'isRisk'   => 'is_risk',
        'riskType' => 'risk_type',
        'extInfo'  => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('isRisk', $this->isRisk, true);
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isRisk) {
            $res['is_risk'] = $this->isRisk;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_risk'])) {
            $model->isRisk = $map['is_risk'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
