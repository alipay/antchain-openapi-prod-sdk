<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditConsignorRequest extends Model
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

    // 申请id
    /**
     * @var string
     */
    public $applyId;

    // 货主分布式数字身份
    /**
     * @var string
     */
    public $did;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 产品id
    // A模式： PRODUCT_MYBANK,
    // A+模式： PRODUCT_MYBANK_A_PLUS,
    // B模式： PRODUCT_MYBANK_B,
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyId'           => 'apply_id',
        'did'               => 'did',
        'groupPlatformDid'  => 'group_platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('productId', $this->productId, true);
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditConsignorRequest
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
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }

        return $model;
    }
}
