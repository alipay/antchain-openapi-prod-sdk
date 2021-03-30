<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssuefinanceRequest extends Model
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

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 融资申请方分布式数字身份
    /**
     * @var string
     */
    public $loanerDid;

    // 全局业务号，保证唯一性，如融资业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'groupPlatformDid'  => 'group_platform_did',
        'loanerDid'         => 'loaner_did',
        'outBizNo'          => 'out_biz_no',
        'platformDid'       => 'platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('loanerDid', $this->loanerDid, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
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
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->loanerDid) {
            $res['loaner_did'] = $this->loanerDid;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditIssuefinanceRequest
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
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['loaner_did'])) {
            $model->loanerDid = $map['loaner_did'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }

        return $model;
    }
}
