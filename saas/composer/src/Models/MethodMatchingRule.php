<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class MethodMatchingRule extends Model
{
    // 网关api
    /**
     * @example saas.antchain.metering.rule.query
     *
     * @var string
     */
    public $method;

    // 匹配规则
    /**
     * @example request.result_code == 200
     *
     * @var string
     */
    public $matchingRule;
    protected $_name = [
        'method'       => 'method',
        'matchingRule' => 'matching_rule',
    ];

    public function validate()
    {
        Model::validateRequired('method', $this->method, true);
        Model::validateRequired('matchingRule', $this->matchingRule, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->matchingRule) {
            $res['matching_rule'] = $this->matchingRule;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MethodMatchingRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['matching_rule'])) {
            $model->matchingRule = $map['matching_rule'];
        }

        return $model;
    }
}
