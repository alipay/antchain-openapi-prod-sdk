<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class CreateApiAuthurlRequest extends Model
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

    // 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
    /**
     * @var string
     */
    public $authType;

    // 纳税人识别号
    /**
     * @var string
     */
    public $nsrsbh;

    // 企业名称
    /**
     * @var string
     */
    public $corpName;

    // 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
    /**
     * @var string
     */
    public $callBackUrl;

    // 机构代码
    /**
     * @var string
     */
    public $instCode;

    // 已认证的法人手机号
    /**
     * @var string
     */
    public $cognizantMobile;

    // 已认证的法人姓名
    /**
     * @var string
     */
    public $cognizantName;

    // 已认证的法人身份证号
    /**
     * @var string
     */
    public $identityNumber;

    // 订单号，用于幂等控制，每次新生成，如果不填我方会自动生成一个
    /**
     * @var string
     */
    public $orderNo;

    // 登录方式，ACCOUNT_PASS：账密，ALL：全部(包括账密和扫码)，默认为ALL（全部）
    /**
     * @var string
     */
    public $loginMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authType'          => 'auth_type',
        'nsrsbh'            => 'nsrsbh',
        'corpName'          => 'corp_name',
        'callBackUrl'       => 'call_back_url',
        'instCode'          => 'inst_code',
        'cognizantMobile'   => 'cognizant_mobile',
        'cognizantName'     => 'cognizant_name',
        'identityNumber'    => 'identity_number',
        'orderNo'           => 'order_no',
        'loginMode'         => 'login_mode',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('nsrsbh', $this->nsrsbh, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('callBackUrl', $this->callBackUrl, true);
        Model::validateRequired('instCode', $this->instCode, true);
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
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->callBackUrl) {
            $res['call_back_url'] = $this->callBackUrl;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->cognizantMobile) {
            $res['cognizant_mobile'] = $this->cognizantMobile;
        }
        if (null !== $this->cognizantName) {
            $res['cognizant_name'] = $this->cognizantName;
        }
        if (null !== $this->identityNumber) {
            $res['identity_number'] = $this->identityNumber;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->loginMode) {
            $res['login_mode'] = $this->loginMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApiAuthurlRequest
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
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['call_back_url'])) {
            $model->callBackUrl = $map['call_back_url'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['cognizant_mobile'])) {
            $model->cognizantMobile = $map['cognizant_mobile'];
        }
        if (isset($map['cognizant_name'])) {
            $model->cognizantName = $map['cognizant_name'];
        }
        if (isset($map['identity_number'])) {
            $model->identityNumber = $map['identity_number'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['login_mode'])) {
            $model->loginMode = $map['login_mode'];
        }

        return $model;
    }
}
