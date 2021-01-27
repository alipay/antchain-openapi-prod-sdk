<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\Tenant;

class VerifySessionTokenResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'customer' => 'customer',
        'loginName' => 'login_name',
        'tenants' => 'tenants',
        'userId' => 'user_id',
        'tenantDetails' => 'tenant_details',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->tenants) {
            $res['tenants'] = $this->tenants;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->tenantDetails) {
            $res['tenant_details'] = [];
            if(null !== $this->tenantDetails && is_array($this->tenantDetails)){
                $n = 0;
                foreach($this->tenantDetails as $item){
                    $res['tenant_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifySessionTokenResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['customer'])){
            $model->customer = $map['customer'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['tenants'])){
            if(!empty($map['tenants'])){
                $model->tenants = $map['tenants'];
            }
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['tenant_details'])){
            if(!empty($map['tenant_details'])){
                $model->tenantDetails = [];
                $n = 0;
                foreach($map['tenant_details'] as $item) {
                    $model->tenantDetails[$n++] = null !== $item ? Tenant::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 用户所在企业的唯一标识
    /**
     * @var string
     */
    public $customer;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 用户加入的租户ID列表
    /**
     * @var string[]
     */
    public $tenants;

    // session关联的用户id
    /**
     * @var string
     */
    public $userId;

    // 租户详情列表
    /**
     * @var Tenant[]
     */
    public $tenantDetails;

}
