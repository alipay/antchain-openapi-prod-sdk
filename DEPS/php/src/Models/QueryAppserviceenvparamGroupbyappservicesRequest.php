<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppserviceenvparamGroupbyappservicesRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appServiceIds' => 'app_service_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppserviceenvparamGroupbyappservicesRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_service_ids'])){
            if(!empty($map['app_service_ids'])){
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // appServiceIds
    /**
     * @var string[]
     */
    public $appServiceIds;

}
