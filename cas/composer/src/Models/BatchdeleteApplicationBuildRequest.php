<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BatchdeleteApplicationBuildRequest extends Model
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

    // build_ids
    /**
     * @var string[]
     */
    public $buildIds;
    protected $_name = [
        'authToken' => 'auth_token',
        'appId'     => 'app_id',
        'buildIds'  => 'build_ids',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('buildIds', $this->buildIds, true);
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
        if (null !== $this->buildIds) {
            $res['build_ids'] = $this->buildIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchdeleteApplicationBuildRequest
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
        if (isset($map['build_ids'])) {
            if (!empty($map['build_ids'])) {
                $model->buildIds = $map['build_ids'];
            }
        }

        return $model;
    }
}
