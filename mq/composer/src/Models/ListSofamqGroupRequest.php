<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSofamqGroupRequest extends Model
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

    // 查询指定 Group ID 时设置，否则查询所有 Group ID
    /**
     * @var string
     */
    public $groupId;

    // 需获取 Group ID 所对应的实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量
    /**
     * @var int
     */
    public $pageSize;

    // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
    //
    // tcp：默认值，表示该 Group ID 仅适用于 TCP 协议的消息收发。
    // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
    /**
     * @var string
     */
    public $groupType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'groupType'         => 'group_type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->groupType) {
            $res['group_type'] = $this->groupType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSofamqGroupRequest
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
        if (isset($map['group_type'])) {
            $model->groupType = $map['group_type'];
        }

        return $model;
    }
}
