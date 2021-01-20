<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppserviceenvparamQuerywithdiffRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appServiceId' => 'app_service_id',
        'buildpackId' => 'buildpack_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppserviceenvparamQuerywithdiffRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_service_id'])){
            $model->appServiceId = $map['app_service_id'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // appServiceId
    /**
     * @var string
     */
    public $appServiceId;

    // buildpackId
    /**
     * @var string
     */
    public $buildpackId;

}
