<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ListDcpAccountbookResponse extends Model
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

    // 请求车队企业关联的所有司机签约信息列表
    /**
     * @var SignInfo[]
     */
    public $signInfoList;

    // json格式字符串扩展信息，预留字段。
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'signInfoList' => 'sign_info_list',
        'externInfo'   => 'extern_info',
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
        if (null !== $this->signInfoList) {
            $res['sign_info_list'] = [];
            if (null !== $this->signInfoList && \is_array($this->signInfoList)) {
                $n = 0;
                foreach ($this->signInfoList as $item) {
                    $res['sign_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDcpAccountbookResponse
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
        if (isset($map['sign_info_list'])) {
            if (!empty($map['sign_info_list'])) {
                $model->signInfoList = [];
                $n                   = 0;
                foreach ($map['sign_info_list'] as $item) {
                    $model->signInfoList[$n++] = null !== $item ? SignInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
