<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateSidecarRuleRequest extends Model
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

    // 规则描述
    /**
     * @var string
     */
    public $description;

    // 规则优先级
    /**
     * @var int
     */
    public $level;

    // sidecar生效范围：workspace、workspace_group、region
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    //
    /**
     * @var string
     */
    public $scopeIdentity;

    // sidecar版本实例id
    /**
     * @var string
     */
    public $sidecarVersionInstanceId;
    protected $_name = [
        'authToken'                => 'auth_token',
        'tenant'                   => 'tenant',
        'description'              => 'description',
        'level'                    => 'level',
        'scope'                    => 'scope',
        'scopeIdentity'            => 'scope_identity',
        'sidecarVersionInstanceId' => 'sidecar_version_instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('sidecarVersionInstanceId', $this->sidecarVersionInstanceId, true);
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarVersionInstanceId) {
            $res['sidecar_version_instance_id'] = $this->sidecarVersionInstanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSidecarRuleRequest
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
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_identity'])) {
            $model->scopeIdentity = $map['scope_identity'];
        }
        if (isset($map['sidecar_version_instance_id'])) {
            $model->sidecarVersionInstanceId = $map['sidecar_version_instance_id'];
        }

        return $model;
    }
}
