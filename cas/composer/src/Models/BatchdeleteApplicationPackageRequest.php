<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BatchdeleteApplicationPackageRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // List<String> versionIds
    /**
     * @var string[]
     */
    public $versionIds;
    protected $_name = [
        'authToken'  => 'auth_token',
        'appId'      => 'app_id',
        'versionIds' => 'version_ids',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('versionIds', $this->versionIds, true);
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
        if (null !== $this->versionIds) {
            $res['version_ids'] = $this->versionIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchdeleteApplicationPackageRequest
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
        if (isset($map['version_ids'])) {
            if (!empty($map['version_ids'])) {
                $model->versionIds = $map['version_ids'];
            }
        }

        return $model;
    }
}
