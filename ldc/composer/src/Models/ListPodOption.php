<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListPodOption extends Model
{
    // 根据pod number列举pod的方式：RANGE为范围查询；ARRAY为指定pod number查询；ALL查询全量
    /**
     * @example RANGE | ARRAY | ALL
     *
     * @var string
     */
    public $type;

    // [type为RANGE时生效]范围查询的左边界（包含）
    /**
     * @example 0
     *
     * @var int
     */
    public $podNumerFrom;

    // [type为RANGE时生效]范围查询的右边界（不包含）
    /**
     * @example 5
     *
     * @var int
     */
    public $podNumberTo;

    // [type为ARRAY时生效]指定pod number的查询
    /**
     * @example [0,3,7,2]
     *
     * @var int[]
     */
    public $podNumbers;
    protected $_name = [
        'type'         => 'type',
        'podNumerFrom' => 'pod_numer_from',
        'podNumberTo'  => 'pod_number_to',
        'podNumbers'   => 'pod_numbers',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->podNumerFrom) {
            $res['pod_numer_from'] = $this->podNumerFrom;
        }
        if (null !== $this->podNumberTo) {
            $res['pod_number_to'] = $this->podNumberTo;
        }
        if (null !== $this->podNumbers) {
            $res['pod_numbers'] = $this->podNumbers;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListPodOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['pod_numer_from'])) {
            $model->podNumerFrom = $map['pod_numer_from'];
        }
        if (isset($map['pod_number_to'])) {
            $model->podNumberTo = $map['pod_number_to'];
        }
        if (isset($map['pod_numbers'])) {
            if (!empty($map['pod_numbers'])) {
                $model->podNumbers = $map['pod_numbers'];
            }
        }

        return $model;
    }
}
