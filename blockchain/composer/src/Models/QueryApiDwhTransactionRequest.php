<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryApiDwhTransactionRequest extends Model
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

    // 链bizid
    /**
     * @var string
     */
    public $bizId;

    // block_hash
    /**
     * @var string
     */
    public $blockHash;

    // end_timestamp
    /**
     * @var int
     */
    public $endTimestamp;

    // from
    /**
     * @var string
     */
    public $from;

    // pageNo
    /**
     * @var int
     */
    public $pageNo;

    // pageSize
    /**
     * @var int
     */
    public $pageSize;

    // startTimestamp
    /**
     * @var int
     */
    public $startTimestamp;

    // to
    /**
     * @var string
     */
    public $to;

    // transactionHash
    /**
     * @var string
     */
    public $transactionHash;

    // transactionType
    /**
     * @var int
     */
    public $transactionType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'blockHash'         => 'block_hash',
        'endTimestamp'      => 'end_timestamp',
        'from'              => 'from',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'startTimestamp'    => 'start_timestamp',
        'to'                => 'to',
        'transactionHash'   => 'transaction_hash',
        'transactionType'   => 'transaction_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
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
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->endTimestamp) {
            $res['end_timestamp'] = $this->endTimestamp;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
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
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->transactionHash) {
            $res['transaction_hash'] = $this->transactionHash;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiDwhTransactionRequest
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
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['end_timestamp'])) {
            $model->endTimestamp = $map['end_timestamp'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
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
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['transaction_hash'])) {
            $model->transactionHash = $map['transaction_hash'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }

        return $model;
    }
}
