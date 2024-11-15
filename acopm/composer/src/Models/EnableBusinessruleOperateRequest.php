<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class EnableBusinessruleOperateRequest extends Model
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

    // 环境
    /**
     * @var string
     */
    public $env;

    // 版本（不传为创建新版）
    /**
     * @var string
     */
    public $ruleVersion;
    protected $_name = [
        'authToken'   => 'auth_token',
        'apiName'     => 'api_name',
        'env'         => 'env',
        'ruleVersion' => 'rule_version',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('ruleVersion', $this->ruleVersion, true);
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
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->ruleVersion) {
            $res['rule_version'] = $this->ruleVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableBusinessruleOperateRequest
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
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['rule_version'])) {
            $model->ruleVersion = $map['rule_version'];
        }

        return $model;
    }
}
