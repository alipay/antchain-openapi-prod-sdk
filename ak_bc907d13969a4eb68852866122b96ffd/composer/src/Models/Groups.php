<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class Groups extends Model
{
    // groupid
    /**
     * @example groupid
     *
     * @var string
     */
    public $groupid;

    // groupname
    /**
     * @example groupname
     *
     * @var string
     */
    public $groupname;
    protected $_name = [
        'groupid'   => 'groupid',
        'groupname' => 'groupname',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupid) {
            $res['groupid'] = $this->groupid;
        }
        if (null !== $this->groupname) {
            $res['groupname'] = $this->groupname;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Groups
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['groupid'])) {
            $model->groupid = $map['groupid'];
        }
        if (isset($map['groupname'])) {
            $model->groupname = $map['groupname'];
        }

        return $model;
    }
}
