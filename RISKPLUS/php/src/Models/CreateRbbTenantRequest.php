<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRbbTenantRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'effectiveEndDate' => 'effective_end_date',
        'tenantCode' => 'tenant_code',
        'tenantName' => 'tenant_name',
        'tenantPropertyJson' => 'tenant_property_json',
    ];
    public function validate() {
        Model::validatePattern('effectiveEndDate', $this->effectiveEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateMaxLength('tenantCode', $this->tenantCode, 64);
        Model::validateMaxLength('tenantName', $this->tenantName, 64);
        Model::validateMinLength('tenantCode', $this->tenantCode, 2);
        Model::validateMinLength('tenantName', $this->tenantName, 2);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->effectiveEndDate) {
            $res['effective_end_date'] = $this->effectiveEndDate;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->tenantPropertyJson) {
            $res['tenant_property_json'] = $this->tenantPropertyJson;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateRbbTenantRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['effective_end_date'])){
            $model->effectiveEndDate = $map['effective_end_date'];
        }
        if(isset($map['tenant_code'])){
            $model->tenantCode = $map['tenant_code'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['tenant_property_json'])){
            $model->tenantPropertyJson = $map['tenant_property_json'];
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

    // 租户过期时间，不填表示永不过期
    /**
     * @var string
     */
    public $effectiveEndDate;

    // 租户编码，必须全局唯一
    /**
     * @var string
     */
    public $tenantCode;

    // 租户名称
    /**
     * @var string
     */
    public $tenantName;

    // 租户自定义属性，JSON格式，可以为空
    /**
     * @var string
     */
    public $tenantPropertyJson;

}
