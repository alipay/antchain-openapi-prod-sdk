<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class StaticDataModuleDetail extends Model
{
    // 描述
    /**
     * @example 企业
     *
     * @var string
     */
    public $propertyText;

    // 商户类型
    /**
     * @example 01
     *
     * @var string
     */
    public $propertyValue;

    // 图标
    /**
     * @example 图标
     *
     * @var string
     */
    public $icon;

    // 置灰图标
    /**
     * @example 置灰图标
     *
     * @var string
     */
    public $greyIcon;

    // 叶子结点，目前存的一级类目下的二级类目
    /**
     * @example [{"propertyText":"123","propertyValue":"123"}]
     *
     * @var string
     */
    public $childrenDetailList;

    // 是否有叶子结点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasChildren;
    protected $_name = [
        'propertyText'       => 'property_text',
        'propertyValue'      => 'property_value',
        'icon'               => 'icon',
        'greyIcon'           => 'grey_icon',
        'childrenDetailList' => 'children_detail_list',
        'hasChildren'        => 'has_children',
    ];

    public function validate()
    {
        Model::validateRequired('propertyText', $this->propertyText, true);
        Model::validateRequired('propertyValue', $this->propertyValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->propertyText) {
            $res['property_text'] = $this->propertyText;
        }
        if (null !== $this->propertyValue) {
            $res['property_value'] = $this->propertyValue;
        }
        if (null !== $this->icon) {
            $res['icon'] = $this->icon;
        }
        if (null !== $this->greyIcon) {
            $res['grey_icon'] = $this->greyIcon;
        }
        if (null !== $this->childrenDetailList) {
            $res['children_detail_list'] = $this->childrenDetailList;
        }
        if (null !== $this->hasChildren) {
            $res['has_children'] = $this->hasChildren;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StaticDataModuleDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['property_text'])) {
            $model->propertyText = $map['property_text'];
        }
        if (isset($map['property_value'])) {
            $model->propertyValue = $map['property_value'];
        }
        if (isset($map['icon'])) {
            $model->icon = $map['icon'];
        }
        if (isset($map['grey_icon'])) {
            $model->greyIcon = $map['grey_icon'];
        }
        if (isset($map['children_detail_list'])) {
            $model->childrenDetailList = $map['children_detail_list'];
        }
        if (isset($map['has_children'])) {
            $model->hasChildren = $map['has_children'];
        }

        return $model;
    }
}
