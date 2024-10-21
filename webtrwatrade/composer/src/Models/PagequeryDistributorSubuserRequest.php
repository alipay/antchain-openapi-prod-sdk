<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class PagequeryDistributorSubuserRequest extends Model
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

    // 当前页码(默认为第一页)
    /**
     * @var int
     */
    public $pageNum;

    // 页面显示条数(默认10，最小为5)
    /**
     * @var int
     */
    public $pageSize;

    // 钱包地址
    /**
     * @var string
     */
    public $walletAddress;

    // 项目合约地址
    /**
     * @var string
     */
    public $assetProjectAddress;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 数据类型
    // REDEEM
    // ISSUE
    // 不传为全部
    /**
     * @var string
     */
    public $transactionType;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'pageNum'             => 'page_num',
        'pageSize'            => 'page_size',
        'walletAddress'       => 'wallet_address',
        'assetProjectAddress' => 'asset_project_address',
        'projectName'         => 'project_name',
        'projectId'           => 'project_id',
        'transactionType'     => 'transaction_type',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->walletAddress) {
            $res['wallet_address'] = $this->walletAddress;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryDistributorSubuserRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['wallet_address'])) {
            $model->walletAddress = $map['wallet_address'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }

        return $model;
    }
}
