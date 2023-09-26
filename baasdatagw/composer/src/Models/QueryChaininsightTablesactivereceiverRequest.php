<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class QueryChaininsightTablesactivereceiverRequest extends Model
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

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 链ID列表
    /**
     * @var string[]
     */
    public $bizIds;

    // 时间范围，单位小时，默认24小时
    /**
     * @var int
     */
    public $timeRange;

    // 页码，默认1
    /**
     * @var int
     */
    public $pageNo;

    // 页面大小，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 租户ID，留空
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'bizIds'            => 'biz_ids',
        'timeRange'         => 'time_range',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateMaximum('timeRange', $this->timeRange, 168);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('timeRange', $this->timeRange, 0);
        Model::validateMinimum('pageNo', $this->pageNo, 1);
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->bizIds) {
            $res['biz_ids'] = $this->bizIds;
        }
        if (null !== $this->timeRange) {
            $res['time_range'] = $this->timeRange;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChaininsightTablesactivereceiverRequest
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['biz_ids'])) {
            if (!empty($map['biz_ids'])) {
                $model->bizIds = $map['biz_ids'];
            }
        }
        if (isset($map['time_range'])) {
            $model->timeRange = $map['time_range'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
