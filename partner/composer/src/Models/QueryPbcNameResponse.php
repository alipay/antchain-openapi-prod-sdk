<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPbcNameResponse extends Model
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

    // 查询到的支行信息列表
    /**
     * @var PbcInfo[]
     */
    public $pbcInfos;

    // 错误描述
    /**
     * @var string
     */
    public $errorMessage;

    // 结果码
    /**
     * @var string
     */
    public $code;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'pbcInfos'     => 'pbc_infos',
        'errorMessage' => 'error_message',
        'code'         => 'code',
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
        if (null !== $this->pbcInfos) {
            $res['pbc_infos'] = [];
            if (null !== $this->pbcInfos && \is_array($this->pbcInfos)) {
                $n = 0;
                foreach ($this->pbcInfos as $item) {
                    $res['pbc_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPbcNameResponse
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
        if (isset($map['pbc_infos'])) {
            if (!empty($map['pbc_infos'])) {
                $model->pbcInfos = [];
                $n               = 0;
                foreach ($map['pbc_infos'] as $item) {
                    $model->pbcInfos[$n++] = null !== $item ? PbcInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
