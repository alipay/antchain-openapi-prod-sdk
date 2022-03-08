<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class GrayRuleConfigVO extends Model
{
    // lable
    /**
     * @example lable
     *
     * @var string
     */
    public $lable;

    // weight
    /**
     * @example
     *
     * @var int
     */
    public $weight;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // arg_key
    /**
     * @example arg_key
     *
     * @var string
     */
    public $argKey;

    // match_type
    /**
     * @example match_type
     *
     * @var string
     */
    public $matchType;

    // arg_value
    /**
     * @example arg_value
     *
     * @var string
     */
    public $argValue;
    protected $_name = [
        'lable'     => 'lable',
        'weight'    => 'weight',
        'appName'   => 'app_name',
        'argKey'    => 'arg_key',
        'matchType' => 'match_type',
        'argValue'  => 'arg_value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lable) {
            $res['lable'] = $this->lable;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->argKey) {
            $res['arg_key'] = $this->argKey;
        }
        if (null !== $this->matchType) {
            $res['match_type'] = $this->matchType;
        }
        if (null !== $this->argValue) {
            $res['arg_value'] = $this->argValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayRuleConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lable'])) {
            $model->lable = $map['lable'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['arg_key'])) {
            $model->argKey = $map['arg_key'];
        }
        if (isset($map['match_type'])) {
            $model->matchType = $map['match_type'];
        }
        if (isset($map['arg_value'])) {
            $model->argValue = $map['arg_value'];
        }

        return $model;
    }
}
