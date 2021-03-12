<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Result extends Model
{
    // 联盟id
    /**
     * @example 00001
     *
     * @var string
     */
    public $consortiumId;
    protected $_name = [
        'consortiumId' => 'consortium_id',
    ];

    public function validate()
    {
        Model::validateRequired('consortiumId', $this->consortiumId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Result
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }

        return $model;
    }
}
