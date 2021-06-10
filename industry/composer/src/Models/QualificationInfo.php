<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QualificationInfo extends Model
{
    // 商户行业资质类型,  参考https://mif-pub.alipayobjects.com/QualificationType.xlsx
    /**
     * @example 301
     *
     * @var string
     */
    public $industryQualificationType;

    // 商户行业资质图片
    /**
     * @example 7d589a3d-62c4-460a-bca6-06842cf15691.png
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
     * @return QualificationInfo
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
