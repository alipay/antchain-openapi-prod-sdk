<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionUserTeamResponse extends Model
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

    // 一级会员信息
    /**
     * @var DistributionUser[]
     */
    public $members;

    // 下级用户总数
    /**
     * @var int
     */
    public $memberNum;

    // 一级会员数
    /**
     * @var int
     */
    public $oneLevelMemberNum;

    // 分页查询当前页号
    /**
     * @var int
     */
    public $pageNum;

    // 分页查询当前页大小
    /**
     * @var int
     */
    public $pageSize;

    // 二级会员数
    /**
     * @var int
     */
    public $twoLevelMemberNum;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'members'           => 'members',
        'memberNum'         => 'member_num',
        'oneLevelMemberNum' => 'one_level_member_num',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'twoLevelMemberNum' => 'two_level_member_num',
    ];

    public function validate()
    {
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
        if (null !== $this->members) {
            $res['members'] = [];
            if (null !== $this->members && \is_array($this->members)) {
                $n = 0;
                foreach ($this->members as $item) {
                    $res['members'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->memberNum) {
            $res['member_num'] = $this->memberNum;
        }
        if (null !== $this->oneLevelMemberNum) {
            $res['one_level_member_num'] = $this->oneLevelMemberNum;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->twoLevelMemberNum) {
            $res['two_level_member_num'] = $this->twoLevelMemberNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionUserTeamResponse
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
        if (isset($map['members'])) {
            if (!empty($map['members'])) {
                $model->members = [];
                $n              = 0;
                foreach ($map['members'] as $item) {
                    $model->members[$n++] = null !== $item ? DistributionUser::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['member_num'])) {
            $model->memberNum = $map['member_num'];
        }
        if (isset($map['one_level_member_num'])) {
            $model->oneLevelMemberNum = $map['one_level_member_num'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['two_level_member_num'])) {
            $model->twoLevelMemberNum = $map['two_level_member_num'];
        }

        return $model;
    }
}
