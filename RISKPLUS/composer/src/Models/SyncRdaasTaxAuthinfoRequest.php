<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SyncRdaasTaxAuthinfoRequest extends Model
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

    // 应用id
    /**
     * @var string
     */
    public $appId;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 税号
    /**
     * @var string
     */
    public $nsrsbh;

    // 应用key
    /**
     * @var string
     */
    public $appKey;

    // 授权状态：Y-有效，N-无效
    /**
     * @var string
     */
    public $authStatus;

    // 省份编码
    /**
     * @var string
     */
    public $proCode;

    // 城市编码
    /**
     * @var string
     */
    public $cityCode;

    // 授权回调地址
    /**
     * @var string
     */
    public $authCallbackUrl;

    // 过期时间，格式: yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $expireDate;

    // 最近一次授权成功的订单号
    /**
     * @var string
     */
    public $orderNo;

    // 授权场景
    /**
     * @var string
     */
    public $authScene;

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

    // 企业名称
    /**
     * @var string
     */
    public $corpName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'authType'          => 'auth_type',
        'nsrsbh'            => 'nsrsbh',
        'appKey'            => 'app_key',
        'authStatus'        => 'auth_status',
        'proCode'           => 'pro_code',
        'cityCode'          => 'city_code',
        'authCallbackUrl'   => 'auth_callback_url',
        'expireDate'        => 'expire_date',
        'orderNo'           => 'order_no',
        'authScene'         => 'auth_scene',
        'authStartTime'     => 'auth_start_time',
        'authCreateTime'    => 'auth_create_time',
        'corpName'          => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('nsrsbh', $this->nsrsbh, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->proCode) {
            $res['pro_code'] = $this->proCode;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->authCallbackUrl) {
            $res['auth_callback_url'] = $this->authCallbackUrl;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->authScene) {
            $res['auth_scene'] = $this->authScene;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authCreateTime) {
            $res['auth_create_time'] = $this->authCreateTime;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncRdaasTaxAuthinfoRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['pro_code'])) {
            $model->proCode = $map['pro_code'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['auth_callback_url'])) {
            $model->authCallbackUrl = $map['auth_callback_url'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['auth_scene'])) {
            $model->authScene = $map['auth_scene'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_create_time'])) {
            $model->authCreateTime = $map['auth_create_time'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
