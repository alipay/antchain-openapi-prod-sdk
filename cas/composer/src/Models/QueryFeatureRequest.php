<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryFeatureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // paas_region_id cafe的region_id，是一串数字
    /**
     * @var string
     */
    public $paasRegionId;

    // project_id
    /**
     * @var string
     */
    public $projectId;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // 要查询的功能
    /**
     * @var string
     */
    public $featureName;
    protected $_name = [
        'authToken'    => 'auth_token',
        'paasRegionId' => 'paas_region_id',
        'projectId'    => 'project_id',
        'workspaceId'  => 'workspace_id',
        'featureName'  => 'feature_name',
    ];

    public function validate()
    {
        Model::validateRequired('paasRegionId', $this->paasRegionId, true);
        Model::validateRequired('projectId', $this->projectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->paasRegionId) {
            $res['paas_region_id'] = $this->paasRegionId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->featureName) {
            $res['feature_name'] = $this->featureName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFeatureRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['paas_region_id'])) {
            $model->paasRegionId = $map['paas_region_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['feature_name'])) {
            $model->featureName = $map['feature_name'];
        }

        return $model;
    }
}
