<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateAppbaselineSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appbaselineId' => 'appbaseline_id',
        'enable' => 'enable',
        'sidecarVersion' => 'sidecar_version',
    ];
    public function validate() {
        Model::validateRequired('appbaselineId', $this->appbaselineId, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appbaselineId) {
            $res['appbaseline_id'] = $this->appbaselineId;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAppbaselineSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['appbaseline_id'])){
            $model->appbaselineId = $map['appbaseline_id'];
        }
        if(isset($map['enable'])){
            $model->enable = $map['enable'];
        }
        if(isset($map['sidecar_version'])){
            $model->sidecarVersion = $map['sidecar_version'];
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

    // 应用sidecar基线id
    /**
     * @var string
     */
    public $appbaselineId;

    // 是否开启sidecar
    /**
     * @var bool
     */
    public $enable;

    // sidecar版本号
    /**
     * @var string
     */
    public $sidecarVersion;

}
