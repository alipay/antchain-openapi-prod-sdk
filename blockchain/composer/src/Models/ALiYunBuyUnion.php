<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunBuyUnion extends Model
{
    // consortium_name
    /**
     * @example consortium_name
     *
     * @var string
     */
    public $consortiumName;

    // consortium_id
    /**
     * @example consortium_id
     *
     * @var string
     */
    public $consortiumId;
    protected $_name = [
        'consortiumName' => 'consortium_name',
        'consortiumId'   => 'consortium_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consortiumName) {
            $res['consortium_name'] = $this->consortiumName;
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunBuyUnion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consortium_name'])) {
            $model->consortiumName = $map['consortium_name'];
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }

        return $model;
    }
}
