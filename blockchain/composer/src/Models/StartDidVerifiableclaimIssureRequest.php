<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVerifiableclaimIssureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 颁发证书声明
    /**
     * @var BareClaim
     */
    public $bareClaim;

    // 过期时间
    /**
     * @var int
     */
    public $expire;

    // 由谁来颁发，该did必须为调用者自己或者自己代理的did
    /**
     * @var string
     */
    public $issuer;

    // 为哪个did颁发
    /**
     * @var string
     */
    public $subject;

    // 验证声明类型，目前默认VerifiableCredential
    /**
     * @var string[]
     */
    public $type;

    // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
    /**
     * @var string
     */
    public $verifyStatusType;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bareClaim'         => 'bare_claim',
        'expire'            => 'expire',
        'issuer'            => 'issuer',
        'subject'           => 'subject',
        'type'              => 'type',
        'verifyStatusType'  => 'verify_status_type',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('bareClaim', $this->bareClaim, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('subject', $this->subject, true);
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
        if (null !== $this->bareClaim) {
            $res['bare_claim'] = null !== $this->bareClaim ? $this->bareClaim->toMap() : null;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->verifyStatusType) {
            $res['verify_status_type'] = $this->verifyStatusType;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVerifiableclaimIssureRequest
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
        if (isset($map['bare_claim'])) {
            $model->bareClaim = BareClaim::fromMap($map['bare_claim']);
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['type'])) {
            if (!empty($map['type'])) {
                $model->type = $map['type'];
            }
        }
        if (isset($map['verify_status_type'])) {
            $model->verifyStatusType = $map['verify_status_type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
