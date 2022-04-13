<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UidShard extends Model
{
    // UID 起始值
    /**
     * @example
     *
     * @var int
     */
    public $minUid;

    // UID 终止值
    /**
     * @example
     *
     * @var int
     */
    public $maxUid;
    protected $_name = [
        'minUid' => 'min_uid',
        'maxUid' => 'max_uid',
    ];

    public function validate()
    {
        Model::validateRequired('minUid', $this->minUid, true);
        Model::validateRequired('maxUid', $this->maxUid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->minUid) {
            $res['min_uid'] = $this->minUid;
        }
        if (null !== $this->maxUid) {
            $res['max_uid'] = $this->maxUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UidShard
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['min_uid'])) {
            $model->minUid = $map['min_uid'];
        }
        if (isset($map['max_uid'])) {
            $model->maxUid = $map['max_uid'];
        }

        return $model;
    }
}
