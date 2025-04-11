<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryModelWorkscoreRequest extends Model
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

    // 用户名
    /**
     * @var string
     */
    public $name;

    // 身份证号码
    /**
     * @var string
     */
    public $cardNo;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 单位名称，以个体工商户、人才市场等方式缴纳的属于灵活就业人员，单位名称请填：GR
    /**
     * @var string
     */
    public $enterpriseName;

    // 单位统一社会信用代码，
    // 单位名称为GR传空。
    /**
     * @var string
     */
    public $organizationCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'cardNo'            => 'card_no',
        'phone'             => 'phone',
        'enterpriseName'    => 'enterprise_name',
        'organizationCode'  => 'organization_code',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->organizationCode) {
            $res['organization_code'] = $this->organizationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryModelWorkscoreRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['organization_code'])) {
            $model->organizationCode = $map['organization_code'];
        }

        return $model;
    }
}
