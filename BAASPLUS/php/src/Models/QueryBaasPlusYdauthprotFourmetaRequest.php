<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusYdauthprotFourmetaRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'cardNo' => 'card_no',
        'certNo' => 'cert_no',
        'mobile' => 'mobile',
        'userName' => 'user_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusYdauthprotFourmetaRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['card_no'])){
            $model->cardNo = $map['card_no'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 被核验用户的银行卡号
    /**
     * @var string
     */
    public $cardNo;

    // 被核验用户的身份证号
    /**
     * @var string
     */
    public $certNo;

    // 被核验用户的手机号
    /**
     * @var string
     */
    public $mobile;

    // 被核验用户的姓名
    /**
     * @var string
     */
    public $userName;

}
