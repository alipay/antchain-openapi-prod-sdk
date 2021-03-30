<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssuebyidRequest extends Model
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

    // 信用流转发行批次号
    /**
     * @var string
     */
    public $batchId;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 是否只返回已发行凭证信息
    /**
     * @var bool
     */
    public $issuedOnly;

    // 信用流转发行凭证Id
    /**
     * @var string
     */
    public $issueId;

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量 不超过100
    /**
     * @var int
     */
    public $pageSize;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK，
    // A+模式：PRODUCT_MYBANK_A_PLUS，
    // B模式：PRODUCT_MYBANK_B
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId'           => 'batch_id',
        'groupPlatformDid'  => 'group_platform_did',
        'issuedOnly'        => 'issued_only',
        'issueId'           => 'issue_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'platformDid'       => 'platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('issuedOnly', $this->issuedOnly, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issuedOnly) {
            $res['issued_only'] = $this->issuedOnly;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
     * @return QueryCreditIssuebyidRequest
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
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['issued_only'])) {
            $model->issuedOnly = $map['issued_only'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
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
