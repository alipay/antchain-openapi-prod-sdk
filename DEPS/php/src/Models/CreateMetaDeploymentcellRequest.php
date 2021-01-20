<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateMetaDeploymentcellRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'deploymentCell' => 'deployment_cell',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
     * @return CreateMetaDeploymentcellRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['deployment_cell'])){
            $model->deploymentCell = $map['deployment_cell'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

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

}
