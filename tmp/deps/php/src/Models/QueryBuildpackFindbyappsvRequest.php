<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackFindbyappsvRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appIds' => 'app_ids',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBuildpackFindbyappsvRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_ids'])){
            if(!empty($map['app_ids'])){
                $model->appIds = $map['app_ids'];
            }
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // appIds
    /**
     * @var string[]
     */
    public $appIds;

    // workspaceId
    /**
     * @var string
     */
    public $workspaceId;

}
