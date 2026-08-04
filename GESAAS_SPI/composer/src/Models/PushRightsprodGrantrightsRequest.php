<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class PushRightsprodGrantrightsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId' => 'user_id',
        'phoneNumber' => 'phone_number',
        'merchantNo' => 'merchant_no',
        'supplyRightsCode' => 'supply_rights_code',
        'grantNum' => 'grant_num',
        'outGrantOrderNo' => 'out_grant_order_no',
        'grantInfo' => 'grant_info',
        'openId' => 'open_id',
        'appId' => 'app_id',
    ];
    public function validate() {
        Model::validateRequired('supplyRightsCode', $this->supplyRightsCode, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }
        if (null !== $this->supplyRightsCode) {
            $res['supply_rights_code'] = $this->supplyRightsCode;
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushRightsprodGrantrightsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['merchant_no'])){
            $model->merchantNo = $map['merchant_no'];
        }
        if(isset($map['supply_rights_code'])){
            $model->supplyRightsCode = $map['supply_rights_code'];
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
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
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

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 商户编码
    /**
     * @var string
     */
    public $merchantNo;

    // 权益编码
    /**
     * @var string
     */
    public $supplyRightsCode;

    // 发放数量，可根据权益信息grantMulti判断是否可发多张
    /**
     * @var int
     */
    public $grantNum;

    // 外部发放订单号
    /**
     * @var string
     */
    public $outGrantOrderNo;

    // 发放扩展信息，如活动ID等信息，暂时可以不传
    /**
     * @var string
     */
    public $grantInfo;

    // 208898234892XXX01
    /**
     * @var string
     */
    public $openId;

    // 应用ID
    /**
     * @var string
     */
    public $appId;

}
