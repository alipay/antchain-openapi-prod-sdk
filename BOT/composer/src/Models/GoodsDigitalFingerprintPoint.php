<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintPoint extends Model
{
    // 鉴定点子项
    /**
     * @example 正面
     *
     * @var string
     */
    public $subPointName;

    // 微观图片url
    /**
     * @example http://1001
     *
     * @var string
     */
    public $microImageUrl;

    // 宏观图片url
    /**
     * @example http://xxxx1002
     *
     * @var string
     */
    public $macroImageUrl;
    protected $_name = [
        'subPointName'  => 'sub_point_name',
        'microImageUrl' => 'micro_image_url',
        'macroImageUrl' => 'macro_image_url',
    ];

    public function validate()
    {
        Model::validateRequired('subPointName', $this->subPointName, true);
        Model::validateRequired('microImageUrl', $this->microImageUrl, true);
        Model::validateRequired('macroImageUrl', $this->macroImageUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subPointName) {
            $res['sub_point_name'] = $this->subPointName;
        }
        if (null !== $this->microImageUrl) {
            $res['micro_image_url'] = $this->microImageUrl;
        }
        if (null !== $this->macroImageUrl) {
            $res['macro_image_url'] = $this->macroImageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_point_name'])) {
            $model->subPointName = $map['sub_point_name'];
        }
        if (isset($map['micro_image_url'])) {
            $model->microImageUrl = $map['micro_image_url'];
        }
        if (isset($map['macro_image_url'])) {
            $model->macroImageUrl = $map['macro_image_url'];
        }

        return $model;
    }
}
