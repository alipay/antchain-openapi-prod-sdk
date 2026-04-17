<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class County extends Model
{
    // 城市id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cid;

    // 区县id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $countyid;

    // 区县名
    /**
     * @example xxxx
     *
     * @var string
     */
    public $countyname;
    protected $_name = [
        'cid'        => 'cid',
        'countyid'   => 'countyid',
        'countyname' => 'countyname',
    ];

    public function validate()
    {
        Model::validateRequired('cid', $this->cid, true);
        Model::validateRequired('countyid', $this->countyid, true);
        Model::validateRequired('countyname', $this->countyname, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cid) {
            $res['cid'] = $this->cid;
        }
        if (null !== $this->countyid) {
            $res['countyid'] = $this->countyid;
        }
        if (null !== $this->countyname) {
            $res['countyname'] = $this->countyname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return County
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cid'])) {
            $model->cid = $map['cid'];
        }
        if (isset($map['countyid'])) {
            $model->countyid = $map['countyid'];
        }
        if (isset($map['countyname'])) {
            $model->countyname = $map['countyname'];
        }

        return $model;
    }
}
