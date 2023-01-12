<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteCustomflowtemplateRequest extends Model
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

    // 流程模板id
    /**
     * @var string
     */
    public $templateId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'tenant'     => 'tenant',
        'workspace'  => 'workspace',
        'templateId' => 'template_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('templateId', $this->templateId, true);
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
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteCustomflowtemplateRequest
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
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }

        return $model;
    }
}
