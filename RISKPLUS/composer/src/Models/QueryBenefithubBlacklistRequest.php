<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefithubBlacklistRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformCode' => 'platform_code',
        'userUniqueId' => 'user_unique_id',
        'mobile' => 'mobile',
        'certNo' => 'cert_no',
    ];
    public function validate() {
        Model::validateRequired('platformCode', $this->platformCode, true);
        Model::validateRequired('userUniqueId', $this->userUniqueId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->userUniqueId) {
            $res['user_unique_id'] = $this->userUniqueId;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBenefithubBlacklistRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['platform_code'])){
            $model->platformCode = $map['platform_code'];
        }
        if(isset($map['user_unique_id'])){
            $model->userUniqueId = $map['user_unique_id'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
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

    // 流量平台编码
    /**
     * @var string
     */
    public $platformCode;

    // 流量平台用户唯一id
    /**
     * @var string
     */
    public $userUniqueId;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

}
