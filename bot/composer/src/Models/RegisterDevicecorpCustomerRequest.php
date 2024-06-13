<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterDevicecorpCustomerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 项目code
    /**
     * @var string
     */
    public $projectCode;

    // 企业名称
    /**
     * @var string
     */
    public $companyName;

    // 企业品牌名称
    /**
     * @var string
     */
    public $companyBrandName;

    // 主联系人
    /**
     * @var string
     */
    public $contacts;

    // 主联系方式
    /**
     * @var string
     */
    public $contactNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'companyName'       => 'company_name',
        'companyBrandName'  => 'company_brand_name',
        'contacts'          => 'contacts',
        'contactNumber'     => 'contact_number',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('companyBrandName', $this->companyBrandName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyBrandName) {
            $res['company_brand_name'] = $this->companyBrandName;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = $this->contacts;
        }
        if (null !== $this->contactNumber) {
            $res['contact_number'] = $this->contactNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterDevicecorpCustomerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_brand_name'])) {
            $model->companyBrandName = $map['company_brand_name'];
        }
        if (isset($map['contacts'])) {
            $model->contacts = $map['contacts'];
        }
        if (isset($map['contact_number'])) {
            $model->contactNumber = $map['contact_number'];
        }

        return $model;
    }
}
