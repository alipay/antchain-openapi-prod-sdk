<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceabilityBlockchainInfosResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 异常的节点数
    /**
     * @var int
     */
    public $abnormalNodes;

    // 区块链id
    /**
     * @var string
     */
    public $bizid;

    // 区块高度
    /**
     * @var int
     */
    public $blockHeight;

    // 创建时间
    /**
     * @var string
     */
    public $createTime;

    // 链的状态，是否正常
    /**
     * @var bool
     */
    public $isNormal;

    // 是否为管理员权限
    /**
     * @var bool
     */
    public $isRole;

    // 链的名字
    /**
     * @var string
     */
    public $name;

    // 节点信息
    /**
     * @var NodeInfo[]
     */
    public $nodeInfoList;

    // 节点数
    /**
     * @var int
     */
    public $nodeNumber;

    // 链上交易数
    /**
     * @var int
     */
    public $transactionSum;

    // 链的版本
    /**
     * @var string
     */
    public $version;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'abnormalNodes'  => 'abnormal_nodes',
        'bizid'          => 'bizid',
        'blockHeight'    => 'block_height',
        'createTime'     => 'create_time',
        'isNormal'       => 'is_normal',
        'isRole'         => 'is_role',
        'name'           => 'name',
        'nodeInfoList'   => 'node_info_list',
        'nodeNumber'     => 'node_number',
        'transactionSum' => 'transaction_sum',
        'version'        => 'version',
    ];

    public function validate()
    {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->abnormalNodes) {
            $res['abnormal_nodes'] = $this->abnormalNodes;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->isNormal) {
            $res['is_normal'] = $this->isNormal;
        }
        if (null !== $this->isRole) {
            $res['is_role'] = $this->isRole;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nodeInfoList) {
            $res['node_info_list'] = [];
            if (null !== $this->nodeInfoList && \is_array($this->nodeInfoList)) {
                $n = 0;
                foreach ($this->nodeInfoList as $item) {
                    $res['node_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nodeNumber) {
            $res['node_number'] = $this->nodeNumber;
        }
        if (null !== $this->transactionSum) {
            $res['transaction_sum'] = $this->transactionSum;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceabilityBlockchainInfosResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['abnormal_nodes'])) {
            $model->abnormalNodes = $map['abnormal_nodes'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['is_normal'])) {
            $model->isNormal = $map['is_normal'];
        }
        if (isset($map['is_role'])) {
            $model->isRole = $map['is_role'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['node_info_list'])) {
            if (!empty($map['node_info_list'])) {
                $model->nodeInfoList = [];
                $n                   = 0;
                foreach ($map['node_info_list'] as $item) {
                    $model->nodeInfoList[$n++] = null !== $item ? NodeInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['node_number'])) {
            $model->nodeNumber = $map['node_number'];
        }
        if (isset($map['transaction_sum'])) {
            $model->transactionSum = $map['transaction_sum'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
