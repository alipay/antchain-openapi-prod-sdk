<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class StaticDsl extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $spaceId;

    /**
     * @example
     *
     * @var string
     */
    public $flowId;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $consentOn;

    /**
     * @example
     *
     * @var string
     */
    public $parameters;
    protected $_name = [
        'spaceId'    => 'space_id',
        'flowId'     => 'flow_id',
        'consentOn'  => 'consent_on',
        'parameters' => 'parameters',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('consentOn', $this->consentOn, true);
        Model::validateRequired('parameters', $this->parameters, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->consentOn) {
            $res['consent_on'] = $this->consentOn;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = $this->parameters;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StaticDsl
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['consent_on'])) {
            $model->consentOn = $map['consent_on'];
        }
        if (isset($map['parameters'])) {
            $model->parameters = $map['parameters'];
        }

        return $model;
    }
}
