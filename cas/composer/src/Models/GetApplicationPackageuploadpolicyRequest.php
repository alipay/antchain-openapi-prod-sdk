<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationPackageuploadpolicyRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // appId
    /**
     * @var string
     */
    public $appId;

    // workspaceId
    /**
     * @var string
     */
    public $workspaceId;

    // version
    /**
     * @var string
     */
    public $appVersion;
    protected $_name = [
        'authToken'   => 'auth_token',
        'appId'       => 'app_id',
        'workspaceId' => 'workspace_id',
        'appVersion'  => 'app_version',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetApplicationPackageuploadpolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }

        return $model;
    }
}
