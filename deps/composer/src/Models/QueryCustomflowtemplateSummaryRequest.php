<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomflowtemplateSummaryRequest extends Model
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

    // 工作空间
    /**
     * @var string
     */
    public $workspace;

    // 模板类型
    /**
     * @var string
     */
    public $templateType;

    // 模板子类型
    /**
     * @var string
     */
    public $subTemplateType;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenant'          => 'tenant',
        'workspace'       => 'workspace',
        'templateType'    => 'template_type',
        'subTemplateType' => 'sub_template_type',
    ];

    public function validate()
    {
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
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->subTemplateType) {
            $res['sub_template_type'] = $this->subTemplateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomflowtemplateSummaryRequest
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
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['sub_template_type'])) {
            $model->subTemplateType = $map['sub_template_type'];
        }

        return $model;
    }
}
