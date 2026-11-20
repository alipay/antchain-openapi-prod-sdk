<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushRightsprodGrantRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userType' => 'user_type',
        'userIdentifier' => 'user_identifier',
        'appId' => 'app_id',
        'rightsCode' => 'rights_code',
        'grantNum' => 'grant_num',
        'outGrantOrderNo' => 'out_grant_order_no',
        'grantInfo' => 'grant_info',
        'techTenantId' => 'tech_tenant_id',
    ];
    public function validate() {
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('userIdentifier', $this->userIdentifier, true);
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('grantNum', $this->grantNum, true);
        Model::validateRequired('outGrantOrderNo', $this->outGrantOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userIdentifier) {
            $res['user_identifier'] = $this->userIdentifier;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->grantNum) {
            $res['grant_num'] = $this->grantNum;
        }
        if (null !== $this->outGrantOrderNo) {
            $res['out_grant_order_no'] = $this->outGrantOrderNo;
        }
        if (null !== $this->grantInfo) {
            $res['grant_info'] = $this->grantInfo;
        }
        if (null !== $this->techTenantId) {
            $res['tech_tenant_id'] = $this->techTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushRightsprodGrantRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['user_type'])){
            $model->userType = $map['user_type'];
        }
        if(isset($map['user_identifier'])){
            $model->userIdentifier = $map['user_identifier'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['rights_code'])){
            $model->rightsCode = $map['rights_code'];
        }
        if(isset($map['grant_num'])){
            $model->grantNum = $map['grant_num'];
        }
        if(isset($map['out_grant_order_no'])){
            $model->outGrantOrderNo = $map['out_grant_order_no'];
        }
        if(isset($map['grant_info'])){
            $model->grantInfo = $map['grant_info'];
        }
        if(isset($map['tech_tenant_id'])){
            $model->techTenantId = $map['tech_tenant_id'];
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

    // 用户类型
    // 支付宝UID： alipay_uid
    // 手机号：phone_number
    // 微信OpenID： wechat_openId
    // 平台UID： platform_uid
    /**
     * @var string
     */
    public $userType;

    // 用户身份标识
    /**
     * @var string
     */
    public $userIdentifier;

    // 应用ID
    /**
     * @var string
     */
    public $appId;

    // 权益编码
    /**
     * @var string
     */
    public $rightsCode;

    // 发放数量
    /**
     * @var int
     */
    public $grantNum;

    // 外部发放订单号
    /**
     * @var string
     */
    public $outGrantOrderNo;

    // 发放信息,如活动ID等信息
    /**
     * @var string
     */
    public $grantInfo;

    // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传参数）
    /**
     * @var string
     */
    public $techTenantId;

}
