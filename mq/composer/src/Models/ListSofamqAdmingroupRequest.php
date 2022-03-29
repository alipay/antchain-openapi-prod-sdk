<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSofamqAdmingroupRequest extends Model
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

    // 集群名
    /**
     * @var string
     */
    public $cluster;

    // 组名
    /**
     * @var string
     */
    public $groupId;

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 页号
    /**
     * @var int
     */
    public $pageNum;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 是否显示router group
    /**
     * @var bool
     */
    public $showRouter;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cluster'           => 'cluster',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'showRouter'        => 'show_router',
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
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->showRouter) {
            $res['show_router'] = $this->showRouter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSofamqAdmingroupRequest
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
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['show_router'])) {
            $model->showRouter = $map['show_router'];
        }

        return $model;
    }
}
