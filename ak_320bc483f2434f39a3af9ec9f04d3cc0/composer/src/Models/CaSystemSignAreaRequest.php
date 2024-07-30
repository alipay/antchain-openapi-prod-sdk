<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSystemSignAreaRequest extends Model
{
    // 印章id,联系签署中心获取
    /**
     * @example 23443434
     *
     * @var string
     */
    public $sealId;

    // 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
    /**
     * @example CENTER
     *
     * @var string
     */
    public $locationType;

    // 签署位置类型，1-正文，2-骑缝
    /**
     * @example 1
     *
     * @var string
     */
    public $positionType;

    // 骑缝章信息，需要盖骑缝章的时候 请传递此参数
    /**
     * @example
     *
     * @var CaSystemCrossPageRequest
     */
    public $systemCrossPageRequest;

    // 正文章信息，正文章模式必填
    /**
     * @example
     *
     * @var CaSystemMainBodyRequest
     */
    public $systemMainBodyRequest;
    protected $_name = [
        'sealId'                 => 'seal_id',
        'locationType'           => 'location_type',
        'positionType'           => 'position_type',
        'systemCrossPageRequest' => 'system_cross_page_request',
        'systemMainBodyRequest'  => 'system_main_body_request',
    ];

    public function validate()
    {
        Model::validateRequired('locationType', $this->locationType, true);
        Model::validateRequired('positionType', $this->positionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->locationType) {
            $res['location_type'] = $this->locationType;
        }
        if (null !== $this->positionType) {
            $res['position_type'] = $this->positionType;
        }
        if (null !== $this->systemCrossPageRequest) {
            $res['system_cross_page_request'] = null !== $this->systemCrossPageRequest ? $this->systemCrossPageRequest->toMap() : null;
        }
        if (null !== $this->systemMainBodyRequest) {
            $res['system_main_body_request'] = null !== $this->systemMainBodyRequest ? $this->systemMainBodyRequest->toMap() : null;
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
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['location_type'])) {
            $model->locationType = $map['location_type'];
        }
        if (isset($map['position_type'])) {
            $model->positionType = $map['position_type'];
        }
        if (isset($map['system_cross_page_request'])) {
            $model->systemCrossPageRequest = CaSystemCrossPageRequest::fromMap($map['system_cross_page_request']);
        }
        if (isset($map['system_main_body_request'])) {
            $model->systemMainBodyRequest = CaSystemMainBodyRequest::fromMap($map['system_main_body_request']);
        }

        return $model;
    }
}
