<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Spm extends Model
{
    // resultDim
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $resultDim;

    // costDim
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $costDim;

    // countDim
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $countDim;
    protected $_name = [
        'resultDim' => 'result_dim',
        'costDim'   => 'cost_dim',
        'countDim'  => 'count_dim',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resultDim) {
            $res['result_dim'] = null !== $this->resultDim ? $this->resultDim->toMap() : null;
        }
        if (null !== $this->costDim) {
            $res['cost_dim'] = null !== $this->costDim ? $this->costDim->toMap() : null;
        }
        if (null !== $this->countDim) {
            $res['count_dim'] = null !== $this->countDim ? $this->countDim->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Spm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result_dim'])) {
            $model->resultDim = UniqueDim::fromMap($map['result_dim']);
        }
        if (isset($map['cost_dim'])) {
            $model->costDim = UniqueDim::fromMap($map['cost_dim']);
        }
        if (isset($map['count_dim'])) {
            $model->countDim = UniqueDim::fromMap($map['count_dim']);
        }

        return $model;
    }
}
