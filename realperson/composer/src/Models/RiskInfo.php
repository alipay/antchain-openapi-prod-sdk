<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class RiskInfo extends Model
{
    // 是否为复印件（仅身份证、银行卡含该字段）。0：否，1：是
    /**
     * @example 0
     *
     * @var string
     */
    public $copy;

    // 是否翻拍（仅身份证含该字段）。0：否，1：是
    /**
     * @example 0
     *
     * @var string
     */
    public $reshoot;

    // normal-识别正常
    // non_idcard-上传的图片中不包含身份证
    // blurred-身份证模糊
    // other_type_card-其他类型证照
    // over_exposure-身份证关键字段反光或过曝
    // over_dark-身份证欠曝（亮度过低）
    // unknown-未知状态
    /**
     * @example []
     *
     * @var string[]
     */
    public $imageStatus;

    // 输入参数 risk_info_type=true 时，则返回该字段，判断身份证是否存在风险，返回值：
    // normal-正常身份证；
    // copy-复印件；
    // temporary-临时身份证；
    // screen-翻拍；
    // PS-被PS修改；
    // unknown-其他未知情况
    /**
     * @example []
     *
     * @var string[]
     */
    public $riskType;

    // 图片质量
    /**
     * @example {}
     *
     * @var CardQuality
     */
    public $cardQuality;

    // 证件一致性
    /**
     * @example 1
     *
     * @var string
     */
    public $idcardNumberType;
    protected $_name = [
        'copy'             => 'copy',
        'reshoot'          => 'reshoot',
        'imageStatus'      => 'image_status',
        'riskType'         => 'risk_type',
        'cardQuality'      => 'card_quality',
        'idcardNumberType' => 'idcard_number_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->copy) {
            $res['copy'] = $this->copy;
        }
        if (null !== $this->reshoot) {
            $res['reshoot'] = $this->reshoot;
        }
        if (null !== $this->imageStatus) {
            $res['image_status'] = $this->imageStatus;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->cardQuality) {
            $res['card_quality'] = null !== $this->cardQuality ? $this->cardQuality->toMap() : null;
        }
        if (null !== $this->idcardNumberType) {
            $res['idcard_number_type'] = $this->idcardNumberType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['copy'])) {
            $model->copy = $map['copy'];
        }
        if (isset($map['reshoot'])) {
            $model->reshoot = $map['reshoot'];
        }
        if (isset($map['image_status'])) {
            if (!empty($map['image_status'])) {
                $model->imageStatus = $map['image_status'];
            }
        }
        if (isset($map['risk_type'])) {
            if (!empty($map['risk_type'])) {
                $model->riskType = $map['risk_type'];
            }
        }
        if (isset($map['card_quality'])) {
            $model->cardQuality = CardQuality::fromMap($map['card_quality']);
        }
        if (isset($map['idcard_number_type'])) {
            $model->idcardNumberType = $map['idcard_number_type'];
        }

        return $model;
    }
}
