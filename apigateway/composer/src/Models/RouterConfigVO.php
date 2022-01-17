<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class RouterConfigVO extends Model
{
    // argKey
    /**
     * @example arg_key1
     *
     * @var string
     */
    public $argKey;

    // argValue
    /**
     * @example arg_value1
     *
     * @var string
     */
    public $argValue;

    // matchType
    /**
     * @example IN / EQUAL
     *
     * @var string
     */
    public $matchType;

    // param_location
    /**
     * @example HEADER/COOKIE/PARAM
     *
     * @var string
     */
    public $paramLocation;

    // router_type
    /**
     * @example PATH / HEADER / WEIGHT
     *
     * @var string
     */
    public $routerType;

    // systemCluster
    /**
     * @example
     *
     * @var SystemClusterVO
     */
    public $systemCluster;

    // sys_id
    /**
     * @example z8qkEoU6QlfNQlsQ
     *
     * @var string
     */
    public $sysId;

    // weight
    /**
     * @example
     *
     * @var int
     */
    public $weight;

    // interceptionRule
    /**
     * @example interception_rule1
     *
     * @var string
     */
    public $interceptionRule;
    protected $_name = [
        'argKey'           => 'arg_key',
        'argValue'         => 'arg_value',
        'matchType'        => 'match_type',
        'paramLocation'    => 'param_location',
        'routerType'       => 'router_type',
        'systemCluster'    => 'system_cluster',
        'sysId'            => 'sys_id',
        'weight'           => 'weight',
        'interceptionRule' => 'interception_rule',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->argKey) {
            $res['arg_key'] = $this->argKey;
        }
        if (null !== $this->argValue) {
            $res['arg_value'] = $this->argValue;
        }
        if (null !== $this->matchType) {
            $res['match_type'] = $this->matchType;
        }
        if (null !== $this->paramLocation) {
            $res['param_location'] = $this->paramLocation;
        }
        if (null !== $this->routerType) {
            $res['router_type'] = $this->routerType;
        }
        if (null !== $this->systemCluster) {
            $res['system_cluster'] = null !== $this->systemCluster ? $this->systemCluster->toMap() : null;
        }
        if (null !== $this->sysId) {
            $res['sys_id'] = $this->sysId;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->interceptionRule) {
            $res['interception_rule'] = $this->interceptionRule;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['arg_key'])) {
            $model->argKey = $map['arg_key'];
        }
        if (isset($map['arg_value'])) {
            $model->argValue = $map['arg_value'];
        }
        if (isset($map['match_type'])) {
            $model->matchType = $map['match_type'];
        }
        if (isset($map['param_location'])) {
            $model->paramLocation = $map['param_location'];
        }
        if (isset($map['router_type'])) {
            $model->routerType = $map['router_type'];
        }
        if (isset($map['system_cluster'])) {
            $model->systemCluster = SystemClusterVO::fromMap($map['system_cluster']);
        }
        if (isset($map['sys_id'])) {
            $model->sysId = $map['sys_id'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['interception_rule'])) {
            $model->interceptionRule = $map['interception_rule'];
        }

        return $model;
    }
}
