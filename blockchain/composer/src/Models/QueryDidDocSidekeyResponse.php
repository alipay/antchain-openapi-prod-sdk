<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidDocSidekeyResponse extends Model
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

    // side可以查找到的所有did doc数组，以json方式输出
    /**
     * @var string
     */
    public $doc;

    // 总个数
    /**
     * @var int
     */
    public $totalNum;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'doc'        => 'doc',
        'totalNum'   => 'total_num',
        'totalPage'  => 'total_page',
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
        if (null !== $this->doc) {
            $res['doc'] = $this->doc;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidDocSidekeyResponse
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
        if (isset($map['doc'])) {
            $model->doc = $map['doc'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
