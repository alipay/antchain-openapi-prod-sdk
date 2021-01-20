<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackSumpackagessizeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'regionIds' => 'region_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regionIds) {
            $res['region_ids'] = $this->regionIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBuildpackSumpackagessizeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['region_ids'])){
            if(!empty($map['region_ids'])){
                $model->regionIds = $map['region_ids'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // regionIds
    /**
     * @var string[]
     */
    public $regionIds;

}
