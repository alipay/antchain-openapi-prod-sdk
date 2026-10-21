<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushBenefithubBlacklistRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformCode' => 'platform_code',
        'userUniqueId' => 'user_unique_id',
        'userName' => 'user_name',
        'mobile' => 'mobile',
        'certNo' => 'cert_no',
        'reason' => 'reason',
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
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushBenefithubBlacklistRequest
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
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['reason'])){
            $model->reason = $map['reason'];
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

    // 用户姓名
    /**
     * @var string
     */
    public $userName;

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

    // 加黑名单理由
    /**
     * @var string
     */
    public $reason;

}
