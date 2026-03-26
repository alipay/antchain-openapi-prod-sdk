<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class SpecResult extends Model
{
    // 下一页数据拉取传递的值
    /**
     * @example 10001
     *
     * @var string
     */
    public $afterSpecId;

    // 车型Id列表
    /**
     * @example
     *
     * @var SpecList
     */
    public $specList;
    protected $_name = [
        'afterSpecId' => 'after_spec_id',
        'specList'    => 'spec_list',
    ];

    public function validate()
    {
        Model::validateRequired('afterSpecId', $this->afterSpecId, true);
        Model::validateRequired('specList', $this->specList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->afterSpecId) {
            $res['after_spec_id'] = $this->afterSpecId;
        }
        if (null !== $this->specList) {
            $res['spec_list'] = null !== $this->specList ? $this->specList->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpecResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['after_spec_id'])) {
            $model->afterSpecId = $map['after_spec_id'];
        }
        if (isset($map['spec_list'])) {
            $model->specList = SpecList::fromMap($map['spec_list']);
        }

        return $model;
    }
}
