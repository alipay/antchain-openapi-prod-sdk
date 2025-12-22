<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaSystemSignAreaRequest extends Model
{
    // 印章印模oss-fileKey 或者oss可预览下载地址
    /**
     * @example ESIGN/ato/ca_png/ORG/111.png
     *
     * @var string
     */
    public $sealPicAddr;

    // 用印对齐类型
    /**
     * @example BOTTOM_LEFT
     *
     * @var string
     */
    public $locationType;

    // 章的旋转角度
    /**
     * @example
     *
     * @var int
     */
    public $rotateAngle;

    // 签署位置类型	1代表正文章，2代表骑缝章
    /**
     * @example 1,2
     *
     * @var int
     */
    public $positionType;

    // 指定外部印章类型
    /**
     * @example 目前支持手签(PERSONAL)或公章(OFFICIAL)
     *
     * @var string
     */
    public $externalSealType;

    // 骑缝章信息
    /**
     * @example
     *
     * @var CaSystemCrossPageRequest
     */
    public $caSystemCrossPageRequest;

    // 正文章信息
    /**
     * @example
     *
     * @var CaSystemMainBodyRequest
     */
    public $caSystemMainBodyRequest;
    protected $_name = [
        'sealPicAddr'              => 'seal_pic_addr',
        'locationType'             => 'location_type',
        'rotateAngle'              => 'rotate_angle',
        'positionType'             => 'position_type',
        'externalSealType'         => 'external_seal_type',
        'caSystemCrossPageRequest' => 'ca_system_cross_page_request',
        'caSystemMainBodyRequest'  => 'ca_system_main_body_request',
    ];

    public function validate()
    {
        Model::validateRequired('locationType', $this->locationType, true);
        Model::validateRequired('positionType', $this->positionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sealPicAddr) {
            $res['seal_pic_addr'] = $this->sealPicAddr;
        }
        if (null !== $this->locationType) {
            $res['location_type'] = $this->locationType;
        }
        if (null !== $this->rotateAngle) {
            $res['rotate_angle'] = $this->rotateAngle;
        }
        if (null !== $this->positionType) {
            $res['position_type'] = $this->positionType;
        }
        if (null !== $this->externalSealType) {
            $res['external_seal_type'] = $this->externalSealType;
        }
        if (null !== $this->caSystemCrossPageRequest) {
            $res['ca_system_cross_page_request'] = null !== $this->caSystemCrossPageRequest ? $this->caSystemCrossPageRequest->toMap() : null;
        }
        if (null !== $this->caSystemMainBodyRequest) {
            $res['ca_system_main_body_request'] = null !== $this->caSystemMainBodyRequest ? $this->caSystemMainBodyRequest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSystemSignAreaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['seal_pic_addr'])) {
            $model->sealPicAddr = $map['seal_pic_addr'];
        }
        if (isset($map['location_type'])) {
            $model->locationType = $map['location_type'];
        }
        if (isset($map['rotate_angle'])) {
            $model->rotateAngle = $map['rotate_angle'];
        }
        if (isset($map['position_type'])) {
            $model->positionType = $map['position_type'];
        }
        if (isset($map['external_seal_type'])) {
            $model->externalSealType = $map['external_seal_type'];
        }
        if (isset($map['ca_system_cross_page_request'])) {
            $model->caSystemCrossPageRequest = CaSystemCrossPageRequest::fromMap($map['ca_system_cross_page_request']);
        }
        if (isset($map['ca_system_main_body_request'])) {
            $model->caSystemMainBodyRequest = CaSystemMainBodyRequest::fromMap($map['ca_system_main_body_request']);
        }

        return $model;
    }
}
