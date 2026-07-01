<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetPrivatecontractSignurlRequest extends Model
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

    // 私有云实例id
    /**
     * @var string
     */
    public $instanceId;

    // 签署流程ID
    /**
     * @var string
     */
    public $flowId;

    // 签署用户的内部ID
    /**
     * @var string
     */
    public $userInnerId;

    // 签署平台，默认为H5页面，浏览器打开；也可填写ALIPAY，使用支付宝小程序打开
    /**
     * @var string
     */
    public $signPlatform;

    // 签署流程过期时间
    /**
     * @var int
     */
    public $expirationTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'flowId'            => 'flow_id',
        'userInnerId'       => 'user_inner_id',
        'signPlatform'      => 'sign_platform',
        'expirationTime'    => 'expiration_time',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('userInnerId', $this->userInnerId, true);
        Model::validateRequired('expirationTime', $this->expirationTime, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->userInnerId) {
            $res['user_inner_id'] = $this->userInnerId;
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->expirationTime) {
            $res['expiration_time'] = $this->expirationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetPrivatecontractSignurlRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['user_inner_id'])) {
            $model->userInnerId = $map['user_inner_id'];
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['expiration_time'])) {
            $model->expirationTime = $map['expiration_time'];
        }

        return $model;
    }
}
