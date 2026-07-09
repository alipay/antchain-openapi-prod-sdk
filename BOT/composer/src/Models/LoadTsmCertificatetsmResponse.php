<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class LoadTsmCertificatetsmResponse extends Model
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

    // LoadCertificateTSMCmdResponse implements Serializable
    /**
     * @var TsmCommonCmd[]
     */
    public $cmdList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'cmdList'    => 'cmd_list',
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
        if (null !== $this->cmdList) {
            $res['cmd_list'] = [];
            if (null !== $this->cmdList && \is_array($this->cmdList)) {
                $n = 0;
                foreach ($this->cmdList as $item) {
                    $res['cmd_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadTsmCertificatetsmResponse
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
        if (isset($map['cmd_list'])) {
            if (!empty($map['cmd_list'])) {
                $model->cmdList = [];
                $n              = 0;
                foreach ($map['cmd_list'] as $item) {
                    $model->cmdList[$n++] = null !== $item ? TsmCommonCmd::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
