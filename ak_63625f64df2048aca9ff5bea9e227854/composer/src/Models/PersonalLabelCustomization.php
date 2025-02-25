<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class PersonalLabelCustomization extends Model
{
    // 标签需求类型。0,1-只需要这些标签，2-不需要这些标签，默认0
    /**
     * @example 1
     *
     * @var int
     */
    public $filterType;

    // 需要个性化处理的一级标签
    /**
     * @example
     *
     * @var string[]
     */
    public $customLabelV1;

    // 需要个性化处理的二级标签
    /**
     * @example
     *
     * @var string[]
     */
    public $customLabelV2;
    protected $_name = [
        'filterType'    => 'filter_type',
        'customLabelV1' => 'custom_label_v1',
        'customLabelV2' => 'custom_label_v2',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filterType) {
            $res['filter_type'] = $this->filterType;
        }
        if (null !== $this->customLabelV1) {
            $res['custom_label_v1'] = $this->customLabelV1;
        }
        if (null !== $this->customLabelV2) {
            $res['custom_label_v2'] = $this->customLabelV2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonalLabelCustomization
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['filter_type'])) {
            $model->filterType = $map['filter_type'];
        }
        if (isset($map['custom_label_v1'])) {
            if (!empty($map['custom_label_v1'])) {
                $model->customLabelV1 = $map['custom_label_v1'];
            }
        }
        if (isset($map['custom_label_v2'])) {
            if (!empty($map['custom_label_v2'])) {
                $model->customLabelV2 = $map['custom_label_v2'];
            }
        }

        return $model;
    }
}
