<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ExportDmsMsgtypeResponse extends Model
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

    // 返回的导出结果具体数据
    /**
     * @var MsgTypeDTO[]
     */
    public $msgTypeList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'msgTypeList' => 'msg_type_list',
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
        if (null !== $this->msgTypeList) {
            $res['msg_type_list'] = [];
            if (null !== $this->msgTypeList && \is_array($this->msgTypeList)) {
                $n = 0;
                foreach ($this->msgTypeList as $item) {
                    $res['msg_type_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportDmsMsgtypeResponse
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
        if (isset($map['msg_type_list'])) {
            if (!empty($map['msg_type_list'])) {
                $model->msgTypeList = [];
                $n                  = 0;
                foreach ($map['msg_type_list'] as $item) {
                    $model->msgTypeList[$n++] = null !== $item ? MsgTypeDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
