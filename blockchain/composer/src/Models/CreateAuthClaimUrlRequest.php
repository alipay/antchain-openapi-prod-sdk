<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAuthClaimUrlRequest extends Model
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

    // 授权声明内容
    /**
     * @var string
     */
    public $claimValue;

    // 被授权企业did
    /**
     * @var string
     */
    public $corpDid;

    // 过期时间选项
    /**
     * @var ValueUnitPair[]
     */
    public $expireOptions;

    // 授权是否可撤销
    /**
     * @var bool
     */
    public $revocable;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'claimValue'        => 'claim_value',
        'corpDid'           => 'corp_did',
        'expireOptions'     => 'expire_options',
        'revocable'         => 'revocable',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('claimValue', $this->claimValue, true);
        Model::validateRequired('corpDid', $this->corpDid, true);
        Model::validateRequired('expireOptions', $this->expireOptions, true);
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
        if (null !== $this->claimValue) {
            $res['claim_value'] = $this->claimValue;
        }
        if (null !== $this->corpDid) {
            $res['corp_did'] = $this->corpDid;
        }
        if (null !== $this->expireOptions) {
            $res['expire_options'] = [];
            if (null !== $this->expireOptions && \is_array($this->expireOptions)) {
                $n = 0;
                foreach ($this->expireOptions as $item) {
                    $res['expire_options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->revocable) {
            $res['revocable'] = $this->revocable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAuthClaimUrlRequest
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
        if (isset($map['claim_value'])) {
            $model->claimValue = $map['claim_value'];
        }
        if (isset($map['corp_did'])) {
            $model->corpDid = $map['corp_did'];
        }
        if (isset($map['expire_options'])) {
            if (!empty($map['expire_options'])) {
                $model->expireOptions = [];
                $n                    = 0;
                foreach ($map['expire_options'] as $item) {
                    $model->expireOptions[$n++] = null !== $item ? ValueUnitPair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['revocable'])) {
            $model->revocable = $map['revocable'];
        }

        return $model;
    }
}
