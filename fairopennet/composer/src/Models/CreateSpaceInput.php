<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class CreateSpaceInput extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $networkId;

    /**
     * @example
     *
     * @var string
     */
    public $spaceId;
    protected $_name = [
        'networkId' => 'network_id',
        'spaceId'   => 'space_id',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSpaceInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }

        return $model;
    }
}
