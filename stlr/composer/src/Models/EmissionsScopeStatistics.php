<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsScopeStatistics extends Model
{
    // 盘查范围编码
    /**
     * @example 002
     *
     * @var string
     */
    public $inventoryScopeNo;

    // 盘查范围名称
    /**
     * @example 范围一
     *
     * @var string
     */
    public $inventoryScopeName;

    // 碳排放量
    /**
     * @example 222.33
     *
     * @var int
     */
    public $emissions;

    // 排放占比
    /**
     * @example 0.11
     *
     * @var int
     */
    public $percentage;

    // 范围下各分类排放数据
    /**
     * @example
     *
     * @var EmissionsCategoryStatistics[]
     */
    public $categoryEmissionsList;
    protected $_name = [
        'inventoryScopeNo'      => 'inventory_scope_no',
        'inventoryScopeName'    => 'inventory_scope_name',
        'emissions'             => 'emissions',
        'percentage'            => 'percentage',
        'categoryEmissionsList' => 'category_emissions_list',
    ];

    public function validate()
    {
        Model::validateRequired('inventoryScopeNo', $this->inventoryScopeNo, true);
        Model::validateRequired('inventoryScopeName', $this->inventoryScopeName, true);
        Model::validateRequired('emissions', $this->emissions, true);
        Model::validateRequired('percentage', $this->percentage, true);
        Model::validateRequired('categoryEmissionsList', $this->categoryEmissionsList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->inventoryScopeNo) {
            $res['inventory_scope_no'] = $this->inventoryScopeNo;
        }
        if (null !== $this->inventoryScopeName) {
            $res['inventory_scope_name'] = $this->inventoryScopeName;
        }
        if (null !== $this->emissions) {
            $res['emissions'] = $this->emissions;
        }
        if (null !== $this->percentage) {
            $res['percentage'] = $this->percentage;
        }
        if (null !== $this->categoryEmissionsList) {
            $res['category_emissions_list'] = [];
            if (null !== $this->categoryEmissionsList && \is_array($this->categoryEmissionsList)) {
                $n = 0;
                foreach ($this->categoryEmissionsList as $item) {
                    $res['category_emissions_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionsScopeStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inventory_scope_no'])) {
            $model->inventoryScopeNo = $map['inventory_scope_no'];
        }
        if (isset($map['inventory_scope_name'])) {
            $model->inventoryScopeName = $map['inventory_scope_name'];
        }
        if (isset($map['emissions'])) {
            $model->emissions = $map['emissions'];
        }
        if (isset($map['percentage'])) {
            $model->percentage = $map['percentage'];
        }
        if (isset($map['category_emissions_list'])) {
            if (!empty($map['category_emissions_list'])) {
                $model->categoryEmissionsList = [];
                $n                            = 0;
                foreach ($map['category_emissions_list'] as $item) {
                    $model->categoryEmissionsList[$n++] = null !== $item ? EmissionsCategoryStatistics::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
