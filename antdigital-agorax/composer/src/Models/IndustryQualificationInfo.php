<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class IndustryQualificationInfo extends Model
{
    // 商户行业资质类型
    /**
     * @example 323
     *
     * @var string
     */
    public $industryQualificationType;

    // 商户行业资质图片
    /**
     * @example 20200219192259536bda6664ed60f815
     *
     * @var string
     */
    public $industryQualificationImage;
    protected $_name = [
        'industryQualificationType'  => 'industry_qualification_type',
        'industryQualificationImage' => 'industry_qualification_image',
    ];

    public function validate()
    {
        Model::validateRequired('industryQualificationType', $this->industryQualificationType, true);
        Model::validateRequired('industryQualificationImage', $this->industryQualificationImage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->industryQualificationType) {
            $res['industry_qualification_type'] = $this->industryQualificationType;
        }
        if (null !== $this->industryQualificationImage) {
            $res['industry_qualification_image'] = $this->industryQualificationImage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IndustryQualificationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['industry_qualification_type'])) {
            $model->industryQualificationType = $map['industry_qualification_type'];
        }
        if (isset($map['industry_qualification_image'])) {
            $model->industryQualificationImage = $map['industry_qualification_image'];
        }

        return $model;
    }
}
