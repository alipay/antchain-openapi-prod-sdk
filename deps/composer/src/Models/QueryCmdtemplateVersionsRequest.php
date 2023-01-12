<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryCmdtemplateVersionsRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $id;

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

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenant'       => 'tenant',
        'id'           => 'id',
        'templateId'   => 'template_id',
        'templateType' => 'template_type',
        'workspace'    => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('templateId', $this->templateId, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateType) {
            $res['template_type'] = $this->templateType;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCmdtemplateVersionsRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_type'])) {
            $model->templateType = $map['template_type'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
