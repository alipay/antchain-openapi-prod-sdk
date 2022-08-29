<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bb3e5638866e4c77aa9ae8ac5c14e933\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoAaaaFffDdResponse extends Model
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

    // aaa
    /**
     * @var string
     */
    public $aaa;

    // bbb
    /**
     * @var string
     */
    public $bbb;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'aaa'        => 'aaa',
        'bbb'        => 'bbb',
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
        if (null !== $this->aaa) {
            $res['aaa'] = $this->aaa;
        }
        if (null !== $this->bbb) {
            $res['bbb'] = $this->bbb;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoAaaaFffDdResponse
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
        if (isset($map['aaa'])) {
            $model->aaa = $map['aaa'];
        }
        if (isset($map['bbb'])) {
            $model->bbb = $map['bbb'];
        }

        return $model;
    }
}
