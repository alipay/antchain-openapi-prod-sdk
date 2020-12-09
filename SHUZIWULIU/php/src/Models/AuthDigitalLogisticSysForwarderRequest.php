<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class AuthDigitalLogisticSysForwarderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'clientId' => 'client_id',
        'clientSecret' => 'client_secret',
        'intRefId' => 'int_ref_id',
        'tenantId' => 'tenant_id',
        'source' => 'source',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->clientSecret) {
            $res['client_secret'] = $this->clientSecret;
        }
        if (null !== $this->intRefId) {
            $res['int_ref_id'] = $this->intRefId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AuthDigitalLogisticSysForwarderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['client_secret'])){
            $model->clientSecret = $map['client_secret'];
        }
        if(isset($map['int_ref_id'])){
            $model->intRefId = $map['int_ref_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
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
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 客户端id
    /**
     * @var string
     */
    public $clientId;

    // 密钥
    /**
     * @var string
     */
    public $clientSecret;

    // 货代did
    /**
     * @var string
     */
    public $intRefId;

    // For HOME application internal
    /**
     * @var string
     */
    public $tenantId;

    // 渠道source
    /**
     * @var string
     */
    public $source;

}
