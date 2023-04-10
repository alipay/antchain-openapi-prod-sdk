<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class StaticFlowConfig extends Model
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
     * @var StaticDsl
     */
    public $dsl;
    protected $_name = [
        'networkId' => 'network_id',
        'dsl'       => 'dsl',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('dsl', $this->dsl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->dsl) {
            $res['dsl'] = null !== $this->dsl ? $this->dsl->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StaticFlowConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['dsl'])) {
            $model->dsl = StaticDsl::fromMap($map['dsl']);
        }

        return $model;
    }
}
