<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2069749a63f8412b8e528747be987d84\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainSubnetCheck extends Model
{
    // 检查结果
    /**
     * @example OK
     *
     * @var string
     */
    public $checkResult;

    // 子链成员列表
    /**
     * @example
     *
     * @var string[]
     */
    public $consortiumMemberList;

    // 节点信息列表
    /**
     * @example
     *
     * @var ALiYunChainNodeInfo[]
     */
    public $chainNodeInfoList;

    // 联盟管理员
    /**
     * @example true, false
     *
     * @var bool
     */
    public $consortiumAdmin;

    // 子链成员列表
    /**
     * @example
     *
     * @var ALiYunMember[]
     */
    public $consortiumMemberInfoList;

    // 分页信息
    /**
     * @example
     *
     * @var ALiYunPagination
     */
    public $pagination;
    protected $_name = [
        'checkResult'              => 'check_result',
        'consortiumMemberList'     => 'consortium_member_list',
        'chainNodeInfoList'        => 'chain_node_info_list',
        'consortiumAdmin'          => 'consortium_admin',
        'consortiumMemberInfoList' => 'consortium_member_info_list',
        'pagination'               => 'pagination',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }
        if (null !== $this->consortiumMemberList) {
            $res['consortium_member_list'] = $this->consortiumMemberList;
        }
        if (null !== $this->chainNodeInfoList) {
            $res['chain_node_info_list'] = [];
            if (null !== $this->chainNodeInfoList && \is_array($this->chainNodeInfoList)) {
                $n = 0;
                foreach ($this->chainNodeInfoList as $item) {
                    $res['chain_node_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consortiumAdmin) {
            $res['consortium_admin'] = $this->consortiumAdmin;
        }
        if (null !== $this->consortiumMemberInfoList) {
            $res['consortium_member_info_list'] = [];
            if (null !== $this->consortiumMemberInfoList && \is_array($this->consortiumMemberInfoList)) {
                $n = 0;
                foreach ($this->consortiumMemberInfoList as $item) {
                    $res['consortium_member_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainSubnetCheck
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }
        if (isset($map['consortium_member_list'])) {
            if (!empty($map['consortium_member_list'])) {
                $model->consortiumMemberList = $map['consortium_member_list'];
            }
        }
        if (isset($map['chain_node_info_list'])) {
            if (!empty($map['chain_node_info_list'])) {
                $model->chainNodeInfoList = [];
                $n                        = 0;
                foreach ($map['chain_node_info_list'] as $item) {
                    $model->chainNodeInfoList[$n++] = null !== $item ? ALiYunChainNodeInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consortium_admin'])) {
            $model->consortiumAdmin = $map['consortium_admin'];
        }
        if (isset($map['consortium_member_info_list'])) {
            if (!empty($map['consortium_member_info_list'])) {
                $model->consortiumMemberInfoList = [];
                $n                               = 0;
                foreach ($map['consortium_member_info_list'] as $item) {
                    $model->consortiumMemberInfoList[$n++] = null !== $item ? ALiYunMember::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }

        return $model;
    }
}
