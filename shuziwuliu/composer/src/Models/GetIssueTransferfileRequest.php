<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class GetIssueTransferfileRequest extends Model
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

    // 申请唯一流水号
    /**
     * @var string
     */
    public $applyId;

    // 回调地址
    //
    /**
     * @var string
     */
    public $callbackUrl;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 信用流转凭证集合，最大长度支持30
    /**
     * @var IssueTransferData[]
     */
    public $issueTransferDatas;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    //
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'applyId'            => 'apply_id',
        'callbackUrl'        => 'callback_url',
        'groupPlatformDid'   => 'group_platform_did',
        'issueTransferDatas' => 'issue_transfer_datas',
        'platformDid'        => 'platform_did',
        'productId'          => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('applyId', $this->applyId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('issueTransferDatas', $this->issueTransferDatas, true);
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
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issueTransferDatas) {
            $res['issue_transfer_datas'] = [];
            if (null !== $this->issueTransferDatas && \is_array($this->issueTransferDatas)) {
                $n = 0;
                foreach ($this->issueTransferDatas as $item) {
                    $res['issue_transfer_datas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return GetIssueTransferfileRequest
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
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['issue_transfer_datas'])) {
            if (!empty($map['issue_transfer_datas'])) {
                $model->issueTransferDatas = [];
                $n                         = 0;
                foreach ($map['issue_transfer_datas'] as $item) {
                    $model->issueTransferDatas[$n++] = null !== $item ? IssueTransferData::fromMap($item) : $item;
                }
            }
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
