<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryMetaDeploymentcellRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'ids' => 'ids',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMetaDeploymentcellRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['ids'])){
            if(!empty($map['ids'])){
                $model->ids = $map['ids'];
            }
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

    // ids
    /**
     * @var string[]
     */
    public $ids;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
