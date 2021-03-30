<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditCommonsignRequest extends Model
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

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 集团平台did
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 签约方did
    /**
     * @var string
     */
    public $signDid;

    // 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
    /**
     * @var string
     */
    public $applyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productId'         => 'product_id',
        'groupPlatformDid'  => 'group_platform_did',
        'signDid'           => 'sign_did',
        'applyId'           => 'apply_id',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('signDid', $this->signDid, true);
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->signDid) {
            $res['sign_did'] = $this->signDid;
        }
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditCommonsignRequest
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['sign_did'])) {
            $model->signDid = $map['sign_did'];
        }
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }

        return $model;
    }
}
