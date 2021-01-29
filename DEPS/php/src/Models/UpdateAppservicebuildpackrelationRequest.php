<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\BuildpackAppService;

class UpdateAppservicebuildpackrelationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'newAppService' => 'new_app_service',
        'originalAppService' => 'original_app_service',
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
        if (null !== $this->newAppService) {
            $res['new_app_service'] = null !== $this->newAppService ? $this->newAppService->toMap() : null;
        }
        if (null !== $this->originalAppService) {
            $res['original_app_service'] = null !== $this->originalAppService ? $this->originalAppService->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAppservicebuildpackrelationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['new_app_service'])){
            $model->newAppService = BuildpackAppService::fromMap($map['new_app_service']);
        }
        if(isset($map['original_app_service'])){
            $model->originalAppService = BuildpackAppService::fromMap($map['original_app_service']);
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

    // new_app_service
    /**
     * @var BuildpackAppService
     */
    public $newAppService;

    // original_app_service
    /**
     * @var BuildpackAppService
     */
    public $originalAppService;

}
