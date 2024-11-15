<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessruleOperateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // api名称
    /**
     * @var string
     */
    public $apiName;

    // 规则列表
    /**
     * @var BusinessRule[]
     */
    public $rules;

    // api版本（可选，传递则表示导入）
    /**
     * @var string
     */
    public $ruleVersion;
    protected $_name = [
        'authToken'   => 'auth_token',
        'apiName'     => 'api_name',
        'rules'       => 'rules',
        'ruleVersion' => 'rule_version',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('rules', $this->rules, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ruleVersion) {
            $res['rule_version'] = $this->ruleVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBusinessruleOperateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? BusinessRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rule_version'])) {
            $model->ruleVersion = $map['rule_version'];
        }

        return $model;
    }
}
