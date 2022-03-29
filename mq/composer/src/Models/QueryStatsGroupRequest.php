<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryStatsGroupRequest extends Model
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

    // 是否降序，默认为降序
    /**
     * @var bool
     */
    public $desc;

    // Group ID 过滤
    /**
     * @var string
     */
    public $groupId;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 排序字段
    /**
     * @var int
     */
    public $orderIndex;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示条数
    /**
     * @var int
     */
    public $pageSize;

    // Unix 时间戳
    /**
     * @var int
     */
    public $timestampSec;

    // Topic 过滤
    /**
     * @var string
     */
    public $topic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'desc'              => 'desc',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'orderIndex'        => 'order_index',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'timestampSec'      => 'timestamp_sec',
        'topic'             => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('timestampSec', $this->timestampSec, true);
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->orderIndex) {
            $res['order_index'] = $this->orderIndex;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->timestampSec) {
            $res['timestamp_sec'] = $this->timestampSec;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStatsGroupRequest
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
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['order_index'])) {
            $model->orderIndex = $map['order_index'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['timestamp_sec'])) {
            $model->timestampSec = $map['timestamp_sec'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
