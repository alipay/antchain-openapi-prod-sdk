<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class DemoTestx extends Model
{
    // ability_id
    /**
     * @example 8000
     *
     * @var string
     */
    public $abilityId;
    protected $_name = [
        'abilityId' => 'ability_id',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DemoTestx
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }

        return $model;
    }
}
