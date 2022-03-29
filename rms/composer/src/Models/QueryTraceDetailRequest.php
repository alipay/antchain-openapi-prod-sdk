<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceDetailRequest extends Model
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

    // traceId
    /**
     * @var string
     */
    public $traceId;

    // 备选的入口ip
    /**
     * @var string
     */
    public $backupEntryip;

    // 是否为第一次查询
    /**
     * @var bool
     */
    public $firstQuery;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'traceId'       => 'trace_id',
        'backupEntryip' => 'backup_entryip',
        'firstQuery'    => 'first_query',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('firstQuery', $this->firstQuery, true);
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
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->backupEntryip) {
            $res['backup_entryip'] = $this->backupEntryip;
        }
        if (null !== $this->firstQuery) {
            $res['first_query'] = $this->firstQuery;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceDetailRequest
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
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['backup_entryip'])) {
            $model->backupEntryip = $map['backup_entryip'];
        }
        if (isset($map['first_query'])) {
            $model->firstQuery = $map['first_query'];
        }

        return $model;
    }
}
