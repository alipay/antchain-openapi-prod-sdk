<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsCommand extends Model
{
    // ID
    /**
     * @example 0000000000000001
     *
     * @var string
     */
    public $id;

    // 描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 工作空间id
    /**
     * @example 0000009455
     *
     * @var string
     */
    public $workspaceId;

    // 租户id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $tenantId;

    // 创建者
    /**
     * @example 0000000002
     *
     * @var string
     */
    public $creator;

    // 执行账户
    /**
     * @example root
     *
     * @var string
     */
    public $executeCcount;

    // 模板类型
    /**
     * @example SIMPLE_COMMAND
     *
     * @var string
     */
    public $commandType;

    // 命令
    /**
     * @example ls
     *
     * @var string
     */
    public $fullCommand;

    // 脚本
    /**
     * @example
     *
     * @var string
     */
    public $script;

    // 参数
    /**
     * @example 121
     *
     * @var string
     */
    public $params;

    // 重试次数
    /**
     * @example 3
     *
     * @var int
     */
    public $retryTimes;

    // 延迟间隔
    /**
     * @example 10
     *
     * @var int
     */
    public $backoffPeriod;

    // 超时时间
    /**
     * @example 30
     *
     * @var int
     */
    public $timeout;
    protected $_name = [
        'id'            => 'id',
        'description'   => 'description',
        'workspaceId'   => 'workspace_id',
        'tenantId'      => 'tenant_id',
        'creator'       => 'creator',
        'executeCcount' => 'execute_ccount',
        'commandType'   => 'command_type',
        'fullCommand'   => 'full_command',
        'script'        => 'script',
        'params'        => 'params',
        'retryTimes'    => 'retry_times',
        'backoffPeriod' => 'backoff_period',
        'timeout'       => 'timeout',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->executeCcount) {
            $res['execute_ccount'] = $this->executeCcount;
        }
        if (null !== $this->commandType) {
            $res['command_type'] = $this->commandType;
        }
        if (null !== $this->fullCommand) {
            $res['full_command'] = $this->fullCommand;
        }
        if (null !== $this->script) {
            $res['script'] = $this->script;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->retryTimes) {
            $res['retry_times'] = $this->retryTimes;
        }
        if (null !== $this->backoffPeriod) {
            $res['backoff_period'] = $this->backoffPeriod;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsCommand
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['execute_ccount'])) {
            $model->executeCcount = $map['execute_ccount'];
        }
        if (isset($map['command_type'])) {
            $model->commandType = $map['command_type'];
        }
        if (isset($map['full_command'])) {
            $model->fullCommand = $map['full_command'];
        }
        if (isset($map['script'])) {
            $model->script = $map['script'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['retry_times'])) {
            $model->retryTimes = $map['retry_times'];
        }
        if (isset($map['backoff_period'])) {
            $model->backoffPeriod = $map['backoff_period'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }

        return $model;
    }
}
