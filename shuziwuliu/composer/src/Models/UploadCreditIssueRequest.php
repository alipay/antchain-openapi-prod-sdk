<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadCreditIssueRequest extends Model
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

    // 批次号
    /**
     * @var string
     */
    public $batchId;

    // 发行结果回调url
    /**
     * @var string
     */
    public $callbackUrl;

    // 货主分布式数字身份
    /**
     * @var string
     */
    public $consignorDid;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 发行信用流转信息列表
    /**
     * @var IssueApplyInfo[]
     */
    public $issueApplyInfos;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id 目前填PRODUCT_MYBANK
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId'           => 'batch_id',
        'callbackUrl'       => 'callback_url',
        'consignorDid'      => 'consignor_did',
        'groupPlatformDid'  => 'group_platform_did',
        'issueApplyInfos'   => 'issue_apply_infos',
        'platformDid'       => 'platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('consignorDid', $this->consignorDid, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('issueApplyInfos', $this->issueApplyInfos, true);
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issueApplyInfos) {
            $res['issue_apply_infos'] = [];
            if (null !== $this->issueApplyInfos && \is_array($this->issueApplyInfos)) {
                $n = 0;
                foreach ($this->issueApplyInfos as $item) {
                    $res['issue_apply_infos'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return UploadCreditIssueRequest
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['issue_apply_infos'])) {
            if (!empty($map['issue_apply_infos'])) {
                $model->issueApplyInfos = [];
                $n                      = 0;
                foreach ($map['issue_apply_infos'] as $item) {
                    $model->issueApplyInfos[$n++] = null !== $item ? IssueApplyInfo::fromMap($item) : $item;
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
