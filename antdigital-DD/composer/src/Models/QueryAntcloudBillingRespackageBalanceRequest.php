<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudBillingRespackageBalanceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'deductProductCode' => 'deduct_product_code',
        'gmtService' => 'gmt_service',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('deductProductCode', $this->deductProductCode, true);
        Model::validateRequired('gmtService', $this->gmtService, true);
        Model::validatePattern('gmtService', $this->gmtService, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->deductProductCode) {
            $res['deduct_product_code'] = $this->deductProductCode;
        }
        if (null !== $this->gmtService) {
            $res['gmt_service'] = $this->gmtService;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudBillingRespackageBalanceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['deduct_product_code'])){
            $model->deductProductCode = $map['deduct_product_code'];
        }
        if(isset($map['gmt_service'])){
            $model->gmtService = $map['gmt_service'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 抵扣资源包的量价商品码
    /**
     * @var string
     */
    public $deductProductCode;

    // 业务时间(不同时间余量不一样)
    /**
     * @var string
     */
    public $gmtService;

}
