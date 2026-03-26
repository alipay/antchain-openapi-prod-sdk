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
     * @var SpecList[]
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
            $res['spec_list'] = [];
            if (null !== $this->specList && \is_array($this->specList)) {
                $n = 0;
                foreach ($this->specList as $item) {
                    $res['spec_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
            if (!empty($map['spec_list'])) {
                $model->specList = [];
                $n               = 0;
                foreach ($map['spec_list'] as $item) {
                    $model->specList[$n++] = null !== $item ? SpecList::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
