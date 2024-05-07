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

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 企业名称
    /**
     * @var string
     */
    public $customerName;

    // 厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 厂商value
    /**
     * @var string
     */
    public $corpValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectName'       => 'project_name',
        'categoryCode'      => 'category_code',
        'customerName'      => 'customer_name',
        'corpName'          => 'corp_name',
        'corpValue'         => 'corp_value',
    ];

    public function validate()
    {
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('corpValue', $this->corpValue, true);
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
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->corpValue) {
            $res['corp_value'] = $this->corpValue;
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
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['corp_value'])) {
            $model->corpValue = $map['corp_value'];
        }

        return $model;
    }
}
