<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryFoundationProtobufResponse extends Model
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

    // api probuf信息
    /**
     * @var ApiInfo[]
     */
    public $apiInfoList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'apiInfoList' => 'api_info_list',
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
        if (null !== $this->apiInfoList) {
            $res['api_info_list'] = [];
            if (null !== $this->apiInfoList && \is_array($this->apiInfoList)) {
                $n = 0;
                foreach ($this->apiInfoList as $item) {
                    $res['api_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFoundationProtobufResponse
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
        if (isset($map['api_info_list'])) {
            if (!empty($map['api_info_list'])) {
                $model->apiInfoList = [];
                $n                  = 0;
                foreach ($map['api_info_list'] as $item) {
                    $model->apiInfoList[$n++] = null !== $item ? ApiInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
