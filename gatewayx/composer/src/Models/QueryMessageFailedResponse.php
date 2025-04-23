<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class QueryMessageFailedResponse extends Model
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

    // 每页条数
    /**
     * @var string
     */
    public $pageSize;

    // 第几页
    /**
     * @var string
     */
    public $pageNum;

    // 总条数
    /**
     * @var string
     */
    public $totalNum;

    // 最终失败的消息列表
    /**
     * @var XMessageInfo[]
     */
    public $msgList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pageSize'   => 'page_size',
        'pageNum'    => 'page_num',
        'totalNum'   => 'total_num',
        'msgList'    => 'msg_list',
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->msgList) {
            $res['msg_list'] = [];
            if (null !== $this->msgList && \is_array($this->msgList)) {
                $n = 0;
                foreach ($this->msgList as $item) {
                    $res['msg_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMessageFailedResponse
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['msg_list'])) {
            if (!empty($map['msg_list'])) {
                $model->msgList = [];
                $n              = 0;
                foreach ($map['msg_list'] as $item) {
                    $model->msgList[$n++] = null !== $item ? XMessageInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
