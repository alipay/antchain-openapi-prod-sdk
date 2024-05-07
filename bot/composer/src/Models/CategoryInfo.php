<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CategoryInfo extends Model
{
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

    // 描述内容
    /**
     * @example 这是描述
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'categoryName' => 'category_name',
        'categoryCode' => 'category_code',
        'remark'       => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
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
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
