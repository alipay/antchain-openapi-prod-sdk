<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ApplyUserSmsRequest extends Model
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

    // 邮箱 or 短信 二选一
    /**
     * @var string
     */
    public $telphone;

    // 过期时间（单位：秒），默认30分钟
    /**
     * @var int
     */
    public $expires;

    // 重发短信时间（单位：S），默认60s
    /**
     * @var int
     */
    public $intervals;

    // 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
    /**
     * @var int
     */
    public $sendDirect;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 邮箱
    /**
     * @var string
     */
    public $email;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'telphone'          => 'telphone',
        'expires'           => 'expires',
        'intervals'         => 'intervals',
        'sendDirect'        => 'send_direct',
        'tenantId'          => 'tenant_id',
        'email'             => 'email',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->telphone) {
            $res['telphone'] = $this->telphone;
        }
        if (null !== $this->expires) {
            $res['expires'] = $this->expires;
        }
        if (null !== $this->intervals) {
            $res['intervals'] = $this->intervals;
        }
        if (null !== $this->sendDirect) {
            $res['send_direct'] = $this->sendDirect;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUserSmsRequest
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
        if (isset($map['telphone'])) {
            $model->telphone = $map['telphone'];
        }
        if (isset($map['expires'])) {
            $model->expires = $map['expires'];
        }
        if (isset($map['intervals'])) {
            $model->intervals = $map['intervals'];
        }
        if (isset($map['send_direct'])) {
            $model->sendDirect = $map['send_direct'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }

        return $model;
    }
}
