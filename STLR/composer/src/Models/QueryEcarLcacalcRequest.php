<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryEcarLcacalcRequest extends Model
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

    // 速算记录编号列表
    /**
     * @var string[]
     */
    public $recordNoList;

    // 开始日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $startDate;

    // 结束日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $endDate;

    // 分页查询页码，从1开始，不传时默认为1
    /**
     * @var int
     */
    public $current;

    // 每页记录条数，取值范围[10, 200]，不传时默认为20
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'recordNoList'      => 'record_no_list',
        'startDate'         => 'start_date',
        'endDate'           => 'end_date',
        'current'           => 'current',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
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
        if (null !== $this->recordNoList) {
            $res['record_no_list'] = $this->recordNoList;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEcarLcacalcRequest
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
        if (isset($map['record_no_list'])) {
            if (!empty($map['record_no_list'])) {
                $model->recordNoList = $map['record_no_list'];
            }
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
