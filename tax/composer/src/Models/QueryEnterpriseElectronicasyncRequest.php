<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryEnterpriseElectronicasyncRequest extends Model
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

    // 授权类型，401
    /**
     * @var string
     */
    public $authType;

    // 调用机构编码
    /**
     * @var string
     */
    public $instCode;

    // 本次调用id
    /**
     * @var string
     */
    public $bizUniqueId;

    // 身份id，统一社会信用编码or其他
    /**
     * @var string
     */
    public $identityId;

    // 授权单号，使用授权接口返回的orderNo
    /**
     * @var string
     */
    public $orderNo;

    // 地区行政编码
    /**
     * @var string
     */
    public $areaCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authType'          => 'auth_type',
        'instCode'          => 'inst_code',
        'bizUniqueId'       => 'biz_unique_id',
        'identityId'        => 'identity_id',
        'orderNo'           => 'order_no',
        'areaCode'          => 'area_code',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('bizUniqueId', $this->bizUniqueId, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('areaCode', $this->areaCode, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->bizUniqueId) {
            $res['biz_unique_id'] = $this->bizUniqueId;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEnterpriseElectronicasyncRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['biz_unique_id'])) {
            $model->bizUniqueId = $map['biz_unique_id'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }

        return $model;
    }
}
