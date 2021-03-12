<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NodeDetail extends Model
{
    // 节点审批意见
    /**
     * @example agree comment
     *
     * @var string
     */
    public $comment;

    // 节点ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $nodeId;

    // 节点名称
    /**
     * @example Bob
     *
     * @var string
     */
    public $nodeName;

    // 节点状态
    /**
     * @example Agree
     *
     * @var string
     */
    public $nodeStatus;

    // 节点审批时间
    /**
     * @example 1592883002497
     *
     * @var int
     */
    public $operateTime;

    // 扩展参数
    /**
     * @example test
     *
     * @var string
     */
    public $extensionInfo;
    protected $_name = [
        'comment'       => 'comment',
        'nodeId'        => 'node_id',
        'nodeName'      => 'node_name',
        'nodeStatus'    => 'node_status',
        'operateTime'   => 'operate_time',
        'extensionInfo' => 'extension_info',
    ];

    public function validate()
    {
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('nodeStatus', $this->nodeStatus, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeStatus) {
            $res['node_status'] = $this->nodeStatus;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_status'])) {
            $model->nodeStatus = $map['node_status'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }

        return $model;
    }
}
