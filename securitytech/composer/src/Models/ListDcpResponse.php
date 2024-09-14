<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ListDcpResponse extends Model
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

    // 请求方租户所关联的所有入驻的车队企业信息列表
    /**
     * @var DcpInfo[]
     */
    public $dcpInfoList;

    // json格式字符串扩展信息，预留字段。
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'dcpInfoList' => 'dcp_info_list',
        'externInfo'  => 'extern_info',
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
        if (null !== $this->dcpInfoList) {
            $res['dcp_info_list'] = [];
            if (null !== $this->dcpInfoList && \is_array($this->dcpInfoList)) {
                $n = 0;
                foreach ($this->dcpInfoList as $item) {
                    $res['dcp_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return ListDcpResponse
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
        if (isset($map['dcp_info_list'])) {
            if (!empty($map['dcp_info_list'])) {
                $model->dcpInfoList = [];
                $n                  = 0;
                foreach ($map['dcp_info_list'] as $item) {
                    $model->dcpInfoList[$n++] = null !== $item ? DcpInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
