<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class RequestParams extends Model
{
    // req_type
    /**
     * @example req_type
     *
     * @var string
     */
    public $reqType;

    // condition
    /**
     * @example condition
     *
     * @var Condition
     */
    public $condition;

    // dimCondition
    /**
     * @example dimCondition
     *
     * @var PontusTrendRequest
     */
    public $dimCondition;

    // tenant
    /**
     * @example tenant
     *
     * @var string
     */
    public $tenant;

    // zones
    /**
     * @example zones
     *
     * @var string
     */
    public $zones;

    // from_front
    /**
     * @example from_front
     *
     * @var bool
     */
    public $fromFront;

    // fuzzy
    /**
     * @example fuzzy
     *
     * @var bool
     */
    public $fuzzy;

    // validKeyCount
    /**
     * @example validKeyCount
     *
     * @var int
     */
    public $validKeyCount;

    // can_switch
    /**
     * @example can_switch
     *
     * @var bool
     */
    public $canSwitch;
    protected $_name = [
        'reqType'       => 'req_type',
        'condition'     => 'condition',
        'dimCondition'  => 'dim_condition',
        'tenant'        => 'tenant',
        'zones'         => 'zones',
        'fromFront'     => 'from_front',
        'fuzzy'         => 'fuzzy',
        'validKeyCount' => 'valid_key_count',
        'canSwitch'     => 'can_switch',
    ];

    public function validate()
    {
        Model::validateRequired('reqType', $this->reqType, true);
        Model::validateRequired('condition', $this->condition, true);
        Model::validateRequired('dimCondition', $this->dimCondition, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('zones', $this->zones, true);
        Model::validateRequired('fromFront', $this->fromFront, true);
        Model::validateRequired('fuzzy', $this->fuzzy, true);
        Model::validateRequired('validKeyCount', $this->validKeyCount, true);
        Model::validateRequired('canSwitch', $this->canSwitch, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqType) {
            $res['req_type'] = $this->reqType;
        }
        if (null !== $this->condition) {
            $res['condition'] = null !== $this->condition ? $this->condition->toMap() : null;
        }
        if (null !== $this->dimCondition) {
            $res['dim_condition'] = null !== $this->dimCondition ? $this->dimCondition->toMap() : null;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->fromFront) {
            $res['from_front'] = $this->fromFront;
        }
        if (null !== $this->fuzzy) {
            $res['fuzzy'] = $this->fuzzy;
        }
        if (null !== $this->validKeyCount) {
            $res['valid_key_count'] = $this->validKeyCount;
        }
        if (null !== $this->canSwitch) {
            $res['can_switch'] = $this->canSwitch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RequestParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_type'])) {
            $model->reqType = $map['req_type'];
        }
        if (isset($map['condition'])) {
            $model->condition = Condition::fromMap($map['condition']);
        }
        if (isset($map['dim_condition'])) {
            $model->dimCondition = PontusTrendRequest::fromMap($map['dim_condition']);
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['zones'])) {
            $model->zones = $map['zones'];
        }
        if (isset($map['from_front'])) {
            $model->fromFront = $map['from_front'];
        }
        if (isset($map['fuzzy'])) {
            $model->fuzzy = $map['fuzzy'];
        }
        if (isset($map['valid_key_count'])) {
            $model->validKeyCount = $map['valid_key_count'];
        }
        if (isset($map['can_switch'])) {
            $model->canSwitch = $map['can_switch'];
        }

        return $model;
    }
}
