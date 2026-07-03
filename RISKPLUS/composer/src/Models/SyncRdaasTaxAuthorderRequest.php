<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SyncRdaasTaxAuthorderRequest extends Model
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

    // 租户号
    /**
     * @var string
     */
    public $instCode;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 税号
    /**
     * @var string
     */
    public $identityId;

    // 授权因子
    /**
     * @var string
     */
    public $factorValue;

    // 第二授权因子
    /**
     * @var string
     */
    public $secondFactorValue;

    // 授权订单号
    /**
     * @var string
     */
    public $orderNo;

    // 内容
    /**
     * @var string
     */
    public $content;

    // 过期时间
    /**
     * @var string
     */
    public $expireTime;

    // 授权场景
    /**
     * @var string
     */
    public $authScene;

    // 授权状态
    /**
     * @var string
     */
    public $authStatus;

    // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $authStartTime;

    // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $authCreateTime;

    // 名称
    /**
     * @var string
     */
    public $identityName;

    // 企业实际所属税局地区编码
    /**
     * @var string
     */
    public $taxZoneCode;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instCode'          => 'inst_code',
        'authType'          => 'auth_type',
        'identityId'        => 'identity_id',
        'factorValue'       => 'factor_value',
        'secondFactorValue' => 'second_factor_value',
        'orderNo'           => 'order_no',
        'content'           => 'content',
        'expireTime'        => 'expire_time',
        'authScene'         => 'auth_scene',
        'authStatus'        => 'auth_status',
        'authStartTime'     => 'auth_start_time',
        'authCreateTime'    => 'auth_create_time',
        'identityName'      => 'identity_name',
        'taxZoneCode'       => 'tax_zone_code',
        'failReason'        => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->factorValue) {
            $res['factor_value'] = $this->factorValue;
        }
        if (null !== $this->secondFactorValue) {
            $res['second_factor_value'] = $this->secondFactorValue;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->authScene) {
            $res['auth_scene'] = $this->authScene;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authCreateTime) {
            $res['auth_create_time'] = $this->authCreateTime;
        }
        if (null !== $this->identityName) {
            $res['identity_name'] = $this->identityName;
        }
        if (null !== $this->taxZoneCode) {
            $res['tax_zone_code'] = $this->taxZoneCode;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncRdaasTaxAuthorderRequest
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
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['factor_value'])) {
            $model->factorValue = $map['factor_value'];
        }
        if (isset($map['second_factor_value'])) {
            $model->secondFactorValue = $map['second_factor_value'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['auth_scene'])) {
            $model->authScene = $map['auth_scene'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_create_time'])) {
            $model->authCreateTime = $map['auth_create_time'];
        }
        if (isset($map['identity_name'])) {
            $model->identityName = $map['identity_name'];
        }
        if (isset($map['tax_zone_code'])) {
            $model->taxZoneCode = $map['tax_zone_code'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
