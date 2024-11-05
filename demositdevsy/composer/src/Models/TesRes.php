<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSITDEVSY\Models;

use AlibabaCloud\Tea\Model;

class TesRes extends Model
{
    // 证件号
    /**
     * @example 12345
     *
     * @var string
     */
    public $idcard;
    protected $_name = [
        'idcard' => 'idcard',
    ];

    public function validate()
    {
        Model::validateRequired('idcard', $this->idcard, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->idcard) {
            $res['idcard'] = $this->idcard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TesRes
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['idcard'])) {
            $model->idcard = $map['idcard'];
        }

        return $model;
    }
}
