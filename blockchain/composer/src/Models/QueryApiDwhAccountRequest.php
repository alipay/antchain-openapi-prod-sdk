<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryApiDwhAccountRequest extends Model
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

    // 账户hash ，如果根据账户hash查询账户信息可以填写该字段
    /**
     * @var string
     */
    public $accountHash;

    // 链id
    /**
     * @var string
     */
    public $bizId;

    // 结束时间，如果查询时间段创建的账户，可以填写该字段
    /**
     * @var int
     */
    public $endTimestamp;

    // 页数，分页使用，从1开始
    /**
     * @var int
     */
    public $pageNo;

    // 分页大小，取值不能超过100，默认100
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间，如果查询时间段创建的账户，可以填写该字段
    /**
     * @var int
     */
    public $startTimestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountHash'       => 'account_hash',
        'bizId'             => 'biz_id',
        'endTimestamp'      => 'end_timestamp',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'startTimestamp'    => 'start_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->accountHash) {
            $res['account_hash'] = $this->accountHash;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
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
     * @return QueryApiDwhAccountRequest
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
        if (isset($map['account_hash'])) {
            $model->accountHash = $map['account_hash'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
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
