<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsCustomFlowTemplate extends Model
{
    // 可见范围
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $scope;

    // 可见范围id
    /**
     * @example []
     *
     * @var string[]
     */
    public $scopeIds;

    // id
    /**
     * @example 00001
     *
     * @var string
     */
    public $id;

    // 模板名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 模板描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 模板id
    /**
     * @example 202208251515248909
     *
     * @var string
     */
    public $templateId;

    // 模板类型
    /**
     * @example GROUP_RELEASE
     *
     * @var string
     */
    public $templateType;

    // 模板二级类型
    //
    /**
     * @example DEPLOY_SERVICE
     *
     * @var string
     */
    public $subTemplateType;

    // 模板版本
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $templateVersion;

    // 工作空间id
    //
    /**
     * @example 0000001
     *
     * @var string
     */
    public $workspaceId;

    // 自定义流程列表
    //
    /**
     * @example []
     *
     * @var OpsActionWithCommand[]
     */
    public $actionList;

    // 自定义流程策略配置
    //
    /**
     * @example []
     *
     * @var OpsActionPolicy[]
     */
    public $actionPolicies;
    protected $_name = [
        'scope'           => 'scope',
        'scopeIds'        => 'scope_ids',
        'id'              => 'id',
        'name'            => 'name',
        'description'     => 'description',
        'templateId'      => 'template_id',
        'templateType'    => 'template_type',
        'subTemplateType' => 'sub_template_type',
        'templateVersion' => 'template_version',
        'workspaceId'     => 'workspace_id',
        'actionList'      => 'action_list',
        'actionPolicies'  => 'action_policies',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('templateType', $this->templateType, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIds) {
            $res['scope_ids'] = $this->scopeIds;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->subTemplateType) {
            $res['sub_template_type'] = $this->subTemplateType;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->actionList) {
            $res['action_list'] = [];
            if (null !== $this->actionList && \is_array($this->actionList)) {
                $n = 0;
                foreach ($this->actionList as $item) {
                    $res['action_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->actionPolicies) {
            $res['action_policies'] = [];
            if (null !== $this->actionPolicies && \is_array($this->actionPolicies)) {
                $n = 0;
                foreach ($this->actionPolicies as $item) {
                    $res['action_policies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsCustomFlowTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_ids'])) {
            if (!empty($map['scope_ids'])) {
                $model->scopeIds = $map['scope_ids'];
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['sub_template_type'])) {
            $model->subTemplateType = $map['sub_template_type'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['action_list'])) {
            if (!empty($map['action_list'])) {
                $model->actionList = [];
                $n                 = 0;
                foreach ($map['action_list'] as $item) {
                    $model->actionList[$n++] = null !== $item ? OpsActionWithCommand::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['action_policies'])) {
            if (!empty($map['action_policies'])) {
                $model->actionPolicies = [];
                $n                     = 0;
                foreach ($map['action_policies'] as $item) {
                    $model->actionPolicies[$n++] = null !== $item ? OpsActionPolicy::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
