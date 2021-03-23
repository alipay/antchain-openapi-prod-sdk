<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class AccessFilterDTO extends Model
{
    // 过滤器名称
    /**
     * @example typeFilter
     *
     * @var string
     */
    public $filterName;

    // 要过滤的字段路径
    /**
     * @example /body/type
     *
     * @var string
     */
    public $path;

    // 路径字段的取值范围
    /**
     * @example ["Type1", "Type2"]
     *
     * @var string[]
     */
    public $target;
    protected $_name = [
        'filterName' => 'filter_name',
        'path'       => 'path',
        'target'     => 'target',
    ];

    public function validate()
    {
        Model::validateRequired('filterName', $this->filterName, true);
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('target', $this->target, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filterName) {
            $res['filter_name'] = $this->filterName;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccessFilterDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['filter_name'])) {
            $model->filterName = $map['filter_name'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['target'])) {
            if (!empty($map['target'])) {
                $model->target = $map['target'];
            }
        }

        return $model;
    }
}
