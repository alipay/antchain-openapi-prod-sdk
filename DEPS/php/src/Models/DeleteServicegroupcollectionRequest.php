<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteServicegroupcollectionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'arrangementId' => 'arrangement_id',
        'processDefinitionId' => 'process_definition_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteServicegroupcollectionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
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

    // arrangement_id
    /**
     * @var string
     */
    public $arrangementId;

    // process_definition_id
    /**
     * @var string
     */
    public $processDefinitionId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
