<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateMetaDeploymentcellRequest extends Model
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

    // deployment_cell
    /**
     * @var string
     */
    public $deploymentCell;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'tenant'         => 'tenant',
        'deploymentCell' => 'deployment_cell',
        'workspace'      => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('deploymentCell', $this->deploymentCell, true);
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
        if (null !== $this->deploymentCell) {
            $res['deployment_cell'] = $this->deploymentCell;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMetaDeploymentcellRequest
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
        if (isset($map['deployment_cell'])) {
            $model->deploymentCell = $map['deployment_cell'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
