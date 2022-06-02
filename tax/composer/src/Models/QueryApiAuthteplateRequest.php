<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiAuthteplateRequest extends Model
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

    // 业务订单号
    /**
     * @var string
     */
    public $orderNo;

    // 身份ID 身份证或者统一社会信用编码
    /**
     * @var string
     */
    public $identityId;

    // 名称
    /**
     * @var string
     */
    public $identityName;

    // 业务类型
    // 11 税
    // 12票
    // 13税+票
    /**
     * @var string
     */
    public $authType;

    // 法人名称
    /**
     * @var string
     */
    public $cognizantName;

    // 法人证件号
    /**
     * @var string
     */
    public $coidentityNumber;

    // 法人手机号
    /**
     * @var string
     */
    public $cognizantMobile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'identityId'        => 'identity_id',
        'identityName'      => 'identity_name',
        'authType'          => 'auth_type',
        'cognizantName'     => 'cognizant_name',
        'coidentityNumber'  => 'coidentity_number',
        'cognizantMobile'   => 'cognizant_mobile',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('identityName', $this->identityName, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('cognizantName', $this->cognizantName, true);
        Model::validateRequired('coidentityNumber', $this->coidentityNumber, true);
        Model::validateRequired('cognizantMobile', $this->cognizantMobile, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->identityName) {
            $res['identity_name'] = $this->identityName;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->cognizantName) {
            $res['cognizant_name'] = $this->cognizantName;
        }
        if (null !== $this->coidentityNumber) {
            $res['coidentity_number'] = $this->coidentityNumber;
        }
        if (null !== $this->cognizantMobile) {
            $res['cognizant_mobile'] = $this->cognizantMobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiAuthteplateRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['identity_name'])) {
            $model->identityName = $map['identity_name'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['cognizant_name'])) {
            $model->cognizantName = $map['cognizant_name'];
        }
        if (isset($map['coidentity_number'])) {
            $model->coidentityNumber = $map['coidentity_number'];
        }
        if (isset($map['cognizant_mobile'])) {
            $model->cognizantMobile = $map['cognizant_mobile'];
        }

        return $model;
    }
}
