<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreatePlanAdvancedRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'opsPlan' => 'ops_plan',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->opsPlan) {
            $res['ops_plan'] = $this->opsPlan;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreatePlanAdvancedRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['ops_plan'])){
            $model->opsPlan = $map['ops_plan'];
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

    // plan
    /**
     * @var string
     */
    public $opsPlan;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
