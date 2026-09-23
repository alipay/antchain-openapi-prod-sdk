<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AIOperationTenant extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'merchantId' => 'merchant_id',
        'companyName' => 'company_name',
        'serviceTenantId' => 'service_tenant_id',
        'serviceCompanyName' => 'service_company_name',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('serviceTenantId', $this->serviceTenantId, true);
        Model::validateRequired('serviceCompanyName', $this->serviceCompanyName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->serviceTenantId) {
            $res['service_tenant_id'] = $this->serviceTenantId;
        }
        if (null !== $this->serviceCompanyName) {
            $res['service_company_name'] = $this->serviceCompanyName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AIOperationTenant
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['company_name'])){
            $model->companyName = $map['company_name'];
        }
        if(isset($map['service_tenant_id'])){
            $model->serviceTenantId = $map['service_tenant_id'];
        }
        if(isset($map['service_company_name'])){
            $model->serviceCompanyName = $map['service_company_name'];
        }
        return $model;
    }
    // 租户id
    /**
     * @example LDCJAHSJ
     * @var string
     */
    public $tenantId;

    // 统一社会信用代码
    /**
     * @example 91301010101010101A
     * @var string
     */
    public $merchantId;

    // 企业名称
    /**
     * @example 测试企业
     * @var string
     */
    public $companyName;

    // 直连商户/一级服务商租户id
    /**
     * @example 91301010101010101A
     * @var string
     */
    public $serviceTenantId;

    // 直连商户/一级服务商企业名称
    /**
     * @example 测试服务商企业
     * @var string
     */
    public $serviceCompanyName;

}
