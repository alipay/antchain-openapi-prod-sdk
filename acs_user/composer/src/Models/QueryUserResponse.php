<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class QueryUserResponse extends Model
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

    // 用户列表
    /**
     * @var ACSUserInfo[]
     */
    public $userInfos;

    // 传入的页码，没有传入，则取默认值1
    /**
     * @var int
     */
    public $pageNum;

    // 传入的页大小，如果没有传入，则取默认值20
    /**
     * @var int
     */
    public $pageSize;

    // 查询结果的总条目数量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'userInfos'  => 'user_infos',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'totalCount' => 'total_count',
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
        if (null !== $this->userInfos) {
            $res['user_infos'] = [];
            if (null !== $this->userInfos && \is_array($this->userInfos)) {
                $n = 0;
                foreach ($this->userInfos as $item) {
                    $res['user_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserResponse
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
        if (isset($map['user_infos'])) {
            if (!empty($map['user_infos'])) {
                $model->userInfos = [];
                $n                = 0;
                foreach ($map['user_infos'] as $item) {
                    $model->userInfos[$n++] = null !== $item ? ACSUserInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
