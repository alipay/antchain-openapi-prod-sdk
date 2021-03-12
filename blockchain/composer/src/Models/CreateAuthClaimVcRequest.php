<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAuthClaimVcRequest extends Model
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

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 被授权者did
    /**
     * @var string
     */
    public $subjectDid;

    // 授权内容
    /**
     * @var string
     */
    public $content;

    // 授权发起者did
    /**
     * @var string
     */
    public $issuerDid;

    // 过期时间，长期为-1, 单位为毫秒
    /**
     * @var int
     */
    public $expire;

    // 授权是否可撤销
    /**
     * @var bool
     */
    public $revocable;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'bizId'             => 'biz_id',
        'subjectDid'        => 'subject_did',
        'content'           => 'content',
        'issuerDid'         => 'issuer_did',
        'expire'            => 'expire',
        'revocable'         => 'revocable',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('subjectDid', $this->subjectDid, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('issuerDid', $this->issuerDid, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('revocable', $this->revocable, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->revocable) {
            $res['revocable'] = $this->revocable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAuthClaimVcRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['revocable'])) {
            $model->revocable = $map['revocable'];
        }

        return $model;
    }
}
