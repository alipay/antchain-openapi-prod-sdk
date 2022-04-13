<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RollbackDeploymentApplicationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

    // 待回滚的应用名称，必须是部署单中包含的应用
    /**
     * @var string
     */
    public $applicationName;

    // 应用的回滚版本，如果不指定，默认回滚到最近一次发布成功的版本
    /**
     * @var string
     */
    public $versionNo;

    // 回滚时的分组策略，取值为：
    // QUICK：快速分组；
    // EACH_ONE：每台一组；
    // UNIT：按逻辑单元分组；
    // CELL：按部署单元分组；
    // 默认为QUICK
    //
    /**
     * @var string
     */
    public $groupStrategy;

    // 分组数，默认为3
    /**
     * @var int
     */
    public $groupCount;

    // 回滚原因
    /**
     * @var string
     */
    public $reason;

    // 操作人
    /**
     * @var string
     */
    public $operatorName;
    protected $_name = [
        'authToken'       => 'auth_token',
        'operationId'     => 'operation_id',
        'applicationName' => 'application_name',
        'versionNo'       => 'version_no',
        'groupStrategy'   => 'group_strategy',
        'groupCount'      => 'group_count',
        'reason'          => 'reason',
        'operatorName'    => 'operator_name',
    ];

    public function validate()
    {
        Model::validateRequired('operationId', $this->operationId, true);
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->versionNo) {
            $res['version_no'] = $this->versionNo;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->groupCount) {
            $res['group_count'] = $this->groupCount;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackDeploymentApplicationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }
        if (isset($map['version_no'])) {
            $model->versionNo = $map['version_no'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['group_count'])) {
            $model->groupCount = $map['group_count'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }

        return $model;
    }
}
