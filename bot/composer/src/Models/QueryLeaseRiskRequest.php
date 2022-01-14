<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseRiskRequest extends Model
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

    // 外部系统的用户唯一ID
    /**
     * @var string
     */
    public $userId;

    // 用户姓名
    /**
     * @var string
     */
    public $userName;

    // 用户身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 用户手机号码
    /**
     * @var string
     */
    public $mobile;

    // 用户IP地址
    /**
     * @var string
     */
    public $ip;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'userName'          => 'user_name',
        'certNo'            => 'cert_no',
        'mobile'            => 'mobile',
        'ip'                => 'ip',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('ip', $this->ip, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseRiskRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}
