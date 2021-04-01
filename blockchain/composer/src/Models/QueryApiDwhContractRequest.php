<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryApiDwhContractRequest extends Model
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

    // biz_id 链id
    /**
     * @var string
     */
    public $bizId;

    // 合约地址：如果根据合约地址查询，可以填该字段
    /**
     * @var string
     */
    public $contract;

    // 结束时间：如果根据时间范围查询创建的合约，可以填写该字段
    /**
     * @var int
     */
    public $endTimestamp;

    // 页数，分页使用，从1开始默认为1
    /**
     * @var int
     */
    public $pageNo;

    // 分页大小，取值不能超过100，默认100
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间：如果根据时间范围查询创建的账户，可以填写该字段
    /**
     * @var int
     */
    public $startTimestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contract'          => 'contract',
        'endTimestamp'      => 'end_timestamp',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'startTimestamp'    => 'start_timestamp',
    ];

    public function validate()
    {
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 0);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->endTimestamp) {
            $res['end_timestamp'] = $this->endTimestamp;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->startTimestamp) {
            $res['start_timestamp'] = $this->startTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiDwhContractRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['end_timestamp'])) {
            $model->endTimestamp = $map['end_timestamp'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start_timestamp'])) {
            $model->startTimestamp = $map['start_timestamp'];
        }

        return $model;
    }
}
