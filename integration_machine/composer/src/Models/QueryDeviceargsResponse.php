<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceargsResponse extends Model
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

    // 设备参数列表
    /**
     * @var ArgsNameValue[]
     */
    public $argsNameValueList;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'argsNameValueList' => 'args_name_value_list',
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
        if (null !== $this->argsNameValueList) {
            $res['args_name_value_list'] = [];
            if (null !== $this->argsNameValueList && \is_array($this->argsNameValueList)) {
                $n = 0;
                foreach ($this->argsNameValueList as $item) {
                    $res['args_name_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceargsResponse
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
        if (isset($map['args_name_value_list'])) {
            if (!empty($map['args_name_value_list'])) {
                $model->argsNameValueList = [];
                $n                        = 0;
                foreach ($map['args_name_value_list'] as $item) {
                    $model->argsNameValueList[$n++] = null !== $item ? ArgsNameValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
