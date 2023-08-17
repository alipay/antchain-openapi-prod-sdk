<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class AssignConfig extends Model
{
    // AVG_SIZE
    /**
     * @example AVG_SIZE
     *
     * @var string
     */
    public $assigntype;

    // AssignSubTaskCount
    /**
     * @example 1
     *
     * @var int
     */
    public $assignsubtaskcount;
    protected $_name = [
        'assigntype'         => 'assigntype',
        'assignsubtaskcount' => 'assignsubtaskcount',
    ];

    public function validate()
    {
        Model::validateRequired('assigntype', $this->assigntype, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assigntype) {
            $res['assigntype'] = $this->assigntype;
        }
        if (null !== $this->assignsubtaskcount) {
            $res['assignsubtaskcount'] = $this->assignsubtaskcount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssignConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['assigntype'])) {
            $model->assigntype = $map['assigntype'];
        }
        if (isset($map['assignsubtaskcount'])) {
            $model->assignsubtaskcount = $map['assignsubtaskcount'];
        }

        return $model;
    }
}
