<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QuotaKv extends Model
{
    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // quota
    /**
     * @example
     *
     * @var int
     */
    public $quota;
    protected $_name = [
        'type'  => 'type',
        'quota' => 'quota',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('quota', $this->quota, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->quota) {
            $res['quota'] = $this->quota;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuotaKv
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['quota'])) {
            $model->quota = $map['quota'];
        }

        return $model;
    }
}
