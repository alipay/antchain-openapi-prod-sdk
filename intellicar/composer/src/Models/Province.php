<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class Province extends Model
{
    // 省份id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $pid;

    // 省份名
    /**
     * @example 1
     *
     * @var string
     */
    public $pname;
    protected $_name = [
        'pid'   => 'pid',
        'pname' => 'pname',
    ];

    public function validate()
    {
        Model::validateRequired('pid', $this->pid, true);
        Model::validateRequired('pname', $this->pname, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->pname) {
            $res['pname'] = $this->pname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Province
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }
        if (isset($map['pname'])) {
            $model->pname = $map['pname'];
        }

        return $model;
    }
}
