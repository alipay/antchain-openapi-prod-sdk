<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetTenantIaasaccountRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'sourceId' => 'source_id',
    ];
    public function validate() {
        Model::validateRequired('tenant', $this->tenant, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->sourceId) {
            $res['source_id'] = $this->sourceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTenantIaasaccountRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['source_id'])){
            $model->sourceId = $map['source_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户唯一标识
    /**
     * @var string
     */
    public $tenant;

    // 一方化调用参数，阿里云服务名
    /**
     * @var string
     */
    public $sourceId;

}
