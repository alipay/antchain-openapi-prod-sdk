<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetApplicationPackagedownloadurlRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // versionId
    /**
     * @var string
     */
    public $versionId;

    // 应用id，用于鉴权
    /**
     * @var string
     */
    public $appId;
    protected $_name = [
        'authToken' => 'auth_token',
        'versionId' => 'version_id',
        'appId'     => 'app_id',
    ];

    public function validate()
    {
        Model::validateRequired('versionId', $this->versionId, true);
        Model::validateRequired('appId', $this->appId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->versionId) {
            $res['version_id'] = $this->versionId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetApplicationPackagedownloadurlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['version_id'])) {
            $model->versionId = $map['version_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }

        return $model;
    }
}
