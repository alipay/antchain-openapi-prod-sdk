<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateApplicationPackageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // manifest
    /**
     * @var AppManifest
     */
    public $manifest;
    protected $_name = [
        'authToken' => 'auth_token',
        'appId'     => 'app_id',
        'manifest'  => 'manifest',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('manifest', $this->manifest, true);
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
        if (null !== $this->manifest) {
            $res['manifest'] = null !== $this->manifest ? $this->manifest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApplicationPackageRequest
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
        if (isset($map['manifest'])) {
            $model->manifest = AppManifest::fromMap($map['manifest']);
        }

        return $model;
    }
}
