<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ProcessNode extends Model
{
    // 审批节点ID
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

    // 节点序号，从1开始编号
    /**
     * @example 1
     *
     * @var int
     */
    public $nodeNum;
    protected $_name = [
        'nodeId'   => 'node_id',
        'nodeName' => 'node_name',
        'nodeNum'  => 'node_num',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('nodeNum', $this->nodeNum, true);
        Model::validateMaxLength('nodeId', $this->nodeId, 100);
        Model::validateMaxLength('nodeName', $this->nodeName, 64);
        Model::validateMinimum('nodeNum', $this->nodeNum, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeNum) {
            $res['node_num'] = $this->nodeNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_num'])) {
            $model->nodeNum = $map['node_num'];
        }

        return $model;
    }
}
