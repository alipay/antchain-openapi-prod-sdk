<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateEnterpriseTenantRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseId' => 'enterprise_id',
        'companyName' => 'company_name',
        'taxRegistrationNo' => 'tax_registration_no',
    ];
    public function validate() {
        Model::validateRequired('enterpriseId', $this->enterpriseId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('taxRegistrationNo', $this->taxRegistrationNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->enterpriseId) {
            $res['enterprise_id'] = $this->enterpriseId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->taxRegistrationNo) {
            $res['tax_registration_no'] = $this->taxRegistrationNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateEnterpriseTenantRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['enterprise_id'])){
            $model->enterpriseId = $map['enterprise_id'];
        }
        if(isset($map['company_name'])){
            $model->companyName = $map['company_name'];
        }
        if(isset($map['tax_registration_no'])){
            $model->taxRegistrationNo = $map['tax_registration_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 企业id
    /**
     * @var string
     */
    public $enterpriseId;

    // 企业全称
    /**
     * @var string
     */
    public $companyName;

    // 统一社会信用代码
    /**
     * @var string
     */
    public $taxRegistrationNo;

}
