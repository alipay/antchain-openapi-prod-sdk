<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class ResultFilterDTO extends Model
{
    // 过滤器名称
    /**
     * @example resultFilter
     *
     * @var string
     */
    public $filterName;

    // 要返回的字段路径列表
    /**
     * @example
     *
     * @var string[]
     */
    public $pathList;
    protected $_name = [
        'filterName' => 'filter_name',
        'pathList'   => 'path_list',
    ];

    public function validate()
    {
        Model::validateRequired('filterName', $this->filterName, true);
        Model::validateRequired('pathList', $this->pathList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filterName) {
            $res['filter_name'] = $this->filterName;
        }
        if (null !== $this->pathList) {
            $res['path_list'] = $this->pathList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultFilterDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['filter_name'])) {
            $model->filterName = $map['filter_name'];
        }
        if (isset($map['path_list'])) {
            if (!empty($map['path_list'])) {
                $model->pathList = $map['path_list'];
            }
        }

        return $model;
    }
}
