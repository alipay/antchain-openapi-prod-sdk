<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryXdatasourceSearchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $workspaceName;

    /**
     * @var string
     */
    public $name;

    /**
     * @var bool
     */
    public $enabled;

    /**
     * @var string
     */
    public $targetResourceKind;

    /**
     * @var string
     */
    public $targetResourceName;

    /**
     * @var string
     */
    public $ruleType;

    /**
     * @var string
     */
    public $createdBy;

    /**
     * @var string
     */
    public $parentUuid;

    /**
     * @var string
     */
    public $datasourceType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceName'      => 'workspace_name',
        'name'               => 'name',
        'enabled'            => 'enabled',
        'targetResourceKind' => 'target_resource_kind',
        'targetResourceName' => 'target_resource_name',
        'ruleType'           => 'rule_type',
        'createdBy'          => 'created_by',
        'parentUuid'         => 'parent_uuid',
        'datasourceType'     => 'datasource_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->targetResourceKind) {
            $res['target_resource_kind'] = $this->targetResourceKind;
        }
        if (null !== $this->targetResourceName) {
            $res['target_resource_name'] = $this->targetResourceName;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->createdBy) {
            $res['created_by'] = $this->createdBy;
        }
        if (null !== $this->parentUuid) {
            $res['parent_uuid'] = $this->parentUuid;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryXdatasourceSearchRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['target_resource_kind'])) {
            $model->targetResourceKind = $map['target_resource_kind'];
        }
        if (isset($map['target_resource_name'])) {
            $model->targetResourceName = $map['target_resource_name'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['created_by'])) {
            $model->createdBy = $map['created_by'];
        }
        if (isset($map['parent_uuid'])) {
            $model->parentUuid = $map['parent_uuid'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }

        return $model;
    }
}
