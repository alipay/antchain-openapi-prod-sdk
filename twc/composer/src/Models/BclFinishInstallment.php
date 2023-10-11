<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclFinishInstallment extends Model
{
    // 期次号
    /**
     * @example 1
     *
     * @var int
     */
    public $termNo;
    protected $_name = [
        'termNo' => 'term_no',
    ];

    public function validate()
    {
        Model::validateRequired('termNo', $this->termNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->termNo) {
            $res['term_no'] = $this->termNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclFinishInstallment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term_no'])) {
            $model->termNo = $map['term_no'];
        }

        return $model;
    }
}
