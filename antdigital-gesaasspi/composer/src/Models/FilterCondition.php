<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class FilterCondition extends Model
{
    // 过滤列
    /**
     * @example biz_date
     *
     * @var string
     */
    public $filterColumn;

    // 过滤方式
    /**
     * @example BETWEEN
     *
     * @var string
     */
    public $filterType;

    // 值列表
    /**
     * @example ["20240303", "20250303"]
     *
     * @var string[]
     */
    public $valueList;
    protected $_name = [
        'filterColumn' => 'filter_column',
        'filterType'   => 'filter_type',
        'valueList'    => 'value_list',
    ];

    public function validate()
    {
        Model::validateRequired('filterColumn', $this->filterColumn, true);
        Model::validateRequired('valueList', $this->valueList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filterColumn) {
            $res['filter_column'] = $this->filterColumn;
        }
        if (null !== $this->filterType) {
            $res['filter_type'] = $this->filterType;
        }
        if (null !== $this->valueList) {
            $res['value_list'] = $this->valueList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FilterCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['filter_column'])) {
            $model->filterColumn = $map['filter_column'];
        }
        if (isset($map['filter_type'])) {
            $model->filterType = $map['filter_type'];
        }
        if (isset($map['value_list'])) {
            if (!empty($map['value_list'])) {
                $model->valueList = $map['value_list'];
            }
        }

        return $model;
    }
}
