<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateFederationImagepullsecretRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // cells
    /**
     * @var string[]
     */
    public $cells;

    // labels
    /**
     * @var Label[]
     */
    public $labels;

    // image pull secret name
    /**
     * @var string
     */
    public $name;

    // image pull secret namespace
    /**
     * @var string
     */
    public $namespace;

    // fed image pull secret list
    /**
     * @var FedImagePullSecretOverrideList
     */
    public $overrides;

    // registry account
    /**
     * @var RegistryAccout
     */
    public $registryAccount;

    // workspace group name
    /**
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'cells'              => 'cells',
        'labels'             => 'labels',
        'name'               => 'name',
        'namespace'          => 'namespace',
        'overrides'          => 'overrides',
        'registryAccount'    => 'registry_account',
        'workspaceGroupName' => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('cells', $this->cells, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('overrides', $this->overrides, true);
        Model::validateRequired('registryAccount', $this->registryAccount, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->overrides) {
            $res['overrides'] = null !== $this->overrides ? $this->overrides->toMap() : null;
        }
        if (null !== $this->registryAccount) {
            $res['registry_account'] = null !== $this->registryAccount ? $this->registryAccount->toMap() : null;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFederationImagepullsecretRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = $map['cells'];
            }
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['overrides'])) {
            $model->overrides = FedImagePullSecretOverrideList::fromMap($map['overrides']);
        }
        if (isset($map['registry_account'])) {
            $model->registryAccount = RegistryAccout::fromMap($map['registry_account']);
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
