<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryStackAlarmruleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 栈实体对象复合ID
    /**
     * @var string
     */
    public $stackUniversalTableId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'workspaceName'         => 'workspace_name',
        'stackUniversalTableId' => 'stack_universal_table_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('stackUniversalTableId', $this->stackUniversalTableId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStackAlarmruleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }

        return $model;
    }
}
