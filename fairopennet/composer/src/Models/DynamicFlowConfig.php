<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class DynamicFlowConfig extends Model
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

    /**
     * @example
     *
     * @var DynamicDsl
     */
    public $dsl;
    protected $_name = [
        'networkId' => 'network_id',
        'spaceId'   => 'space_id',
        'dsl'       => 'dsl',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('dsl', $this->dsl, true);
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
        if (null !== $this->dsl) {
            $res['dsl'] = null !== $this->dsl ? $this->dsl->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DynamicFlowConfig
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
        if (isset($map['dsl'])) {
            $model->dsl = DynamicDsl::fromMap($map['dsl']);
        }

        return $model;
    }
}
