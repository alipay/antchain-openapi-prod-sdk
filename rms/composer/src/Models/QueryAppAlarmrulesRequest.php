<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppAlarmrulesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 指标栈ID
    /**
     * @var int
     */
    public $stackId;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 查询所有，还是查询当前设置的告警指标。
    /**
     * @var bool
     */
    public $all;
    protected $_name = [
        'authToken' => 'auth_token',
        'stackId'   => 'stack_id',
        'appName'   => 'app_name',
        'all'       => 'all',
    ];

    public function validate()
    {
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('all', $this->all, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->all) {
            $res['all'] = $this->all;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppAlarmrulesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['all'])) {
            $model->all = $map['all'];
        }

        return $model;
    }
}
