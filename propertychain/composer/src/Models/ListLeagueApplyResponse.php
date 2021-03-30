<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListLeagueApplyResponse extends Model
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

    // 申请类型【NONE,JOIN,CREATE,ALL】
    /**
     * @var string
     */
    public $applyType;

    // 申请内容
    /**
     * @var LeagueApplyInfo[]
     */
    public $leagueApplyInfoList;

    // 总条目
    /**
     * @var int
     */
    public $totalCount;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'applyType'           => 'apply_type',
        'leagueApplyInfoList' => 'league_apply_info_list',
        'totalCount'          => 'total_count',
        'totalPage'           => 'total_page',
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
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->leagueApplyInfoList) {
            $res['league_apply_info_list'] = [];
            if (null !== $this->leagueApplyInfoList && \is_array($this->leagueApplyInfoList)) {
                $n = 0;
                foreach ($this->leagueApplyInfoList as $item) {
                    $res['league_apply_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListLeagueApplyResponse
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
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['league_apply_info_list'])) {
            if (!empty($map['league_apply_info_list'])) {
                $model->leagueApplyInfoList = [];
                $n                          = 0;
                foreach ($map['league_apply_info_list'] as $item) {
                    $model->leagueApplyInfoList[$n++] = null !== $item ? LeagueApplyInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
