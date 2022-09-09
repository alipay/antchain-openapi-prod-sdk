<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BindAuthPoapRequest extends Model
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

    // 长度不超过64字符的业务流水唯一id，可作幂等处理
    /**
     * @var string
     */
    public $bizId;

    // 徽章元数据ID
    /**
     * @var string
     */
    public $poapMetaId;

    // 支付宝UID，2088开头
    /**
     * @var string
     */
    public $userId;

    // 用户真实姓名
    /**
     * @var string
     */
    public $userName;

    // 用户手机号
    /**
     * @var string
     */
    public $userCertNo;

    // 用户手机号
    /**
     * @var string
     */
    public $userMobile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'poapMetaId'        => 'poap_meta_id',
        'userId'            => 'user_id',
        'userName'          => 'user_name',
        'userCertNo'        => 'user_cert_no',
        'userMobile'        => 'user_mobile',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('poapMetaId', $this->poapMetaId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->poapMetaId) {
            $res['poap_meta_id'] = $this->poapMetaId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
        }
        if (null !== $this->userMobile) {
            $res['user_mobile'] = $this->userMobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindAuthPoapRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['poap_meta_id'])) {
            $model->poapMetaId = $map['poap_meta_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
        }
        if (isset($map['user_mobile'])) {
            $model->userMobile = $map['user_mobile'];
        }

        return $model;
    }
}
