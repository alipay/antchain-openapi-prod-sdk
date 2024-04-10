<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CategoryInfo extends Model
{
    // 行业
    /**
     * @example 工业
     *
     * @var string
     */
    public $industry;

    // 场景
    /**
     * @example 智能工业
     *
     * @var string
     */
    public $scene;

    // 品类名称
    /**
     * @example 电力仪表
     *
     * @var string
     */
    public $categoryName;

    // 品类编码
    /**
     * @example ant_power_meter
     *
     * @var string
     */
    public $categoryCode;

    // 品类类型
    /**
     * @example standard
     *
     * @var string
     */
    public $categoryType;

    // 描述内容
    /**
     * @example 这是描述
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'industry'     => 'industry',
        'scene'        => 'scene',
        'categoryName' => 'category_name',
        'categoryCode' => 'category_code',
        'categoryType' => 'category_type',
        'remark'       => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('categoryType', $this->categoryType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->categoryType) {
            $res['category_type'] = $this->categoryType;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CategoryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['category_type'])) {
            $model->categoryType = $map['category_type'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
