<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateCustomflowtemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 模板名称
    /**
     * @var string
     */
    public $name;

    // 模板描述
    /**
     * @var string
     */
    public $description;

    // 模板id
    /**
     * @var string
     */
    public $templateId;

    // 模板类型
    /**
     * @var string
     */
    public $templateType;

    // 模板二级类型
    /**
     * @var string
     */
    public $subTemplateType;

    // 模板版本
    /**
     * @var int
     */
    public $templateVersion;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;

    // 自定义流程列表
    /**
     * @var OpsActionWithCommand[]
     */
    public $actionList;

    // 自定义流程策略配置
    /**
     * @var OpsActionPolicy[]
     */
    public $actionPolicies;

    // 可见范围
    /**
     * @var string
     */
    public $scope;

    // 可见范围id
    /**
     * @var string[]
     */
    public $scopeIds;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenant'          => 'tenant',
        'name'            => 'name',
        'description'     => 'description',
        'templateId'      => 'template_id',
        'templateType'    => 'template_type',
        'subTemplateType' => 'sub_template_type',
        'templateVersion' => 'template_version',
        'workspace'       => 'workspace',
        'actionList'      => 'action_list',
        'actionPolicies'  => 'action_policies',
        'scope'           => 'scope',
        'scopeIds'        => 'scope_ids',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('templateType', $this->templateType, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
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
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIds) {
            $res['scope_ids'] = $this->scopeIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCustomflowtemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
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
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
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
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_ids'])) {
            if (!empty($map['scope_ids'])) {
                $model->scopeIds = $map['scope_ids'];
            }
        }

        return $model;
    }
}
