<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AddLoadbalanceAssignRequest extends Model
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

    // appServiceId
    /**
     * @var string
     */
    public $appServiceId;

    // ids
    /**
     * @var string[]
     */
    public $ids;
    protected $_name = [
        'authToken'    => 'auth_token',
        'appId'        => 'app_id',
        'appServiceId' => 'app_service_id',
        'ids'          => 'ids',
    ];

    public function validate()
    {
        Model::validateRequired('ids', $this->ids, true);
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
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddLoadbalanceAssignRequest
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
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }

        return $model;
    }
}
