<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class City extends Model
{
    // 省份id
    /**
     * @example 省份id
     *
     * @var string
     */
    public $pid;

    // 城市id
    /**
     * @example 城市id
     *
     * @var string
     */
    public $cid;

    // 城市名
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cname;
    protected $_name = [
        'pid'   => 'pid',
        'cid'   => 'cid',
        'cname' => 'cname',
    ];

    public function validate()
    {
        Model::validateRequired('pid', $this->pid, true);
        Model::validateRequired('cid', $this->cid, true);
        Model::validateRequired('cname', $this->cname, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->cid) {
            $res['cid'] = $this->cid;
        }
        if (null !== $this->cname) {
            $res['cname'] = $this->cname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return City
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }
        if (isset($map['cid'])) {
            $model->cid = $map['cid'];
        }
        if (isset($map['cname'])) {
            $model->cname = $map['cname'];
        }

        return $model;
    }
}
