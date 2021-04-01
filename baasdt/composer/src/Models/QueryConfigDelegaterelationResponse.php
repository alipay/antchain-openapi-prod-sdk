<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConfigDelegaterelationResponse extends Model
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

    // 代理授权关系信息
    /**
     * @var DelegateRelationInfo[]
     */
    public $delegateRelationInfos;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'delegateRelationInfos' => 'delegate_relation_infos',
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
        if (null !== $this->delegateRelationInfos) {
            $res['delegate_relation_infos'] = [];
            if (null !== $this->delegateRelationInfos && \is_array($this->delegateRelationInfos)) {
                $n = 0;
                foreach ($this->delegateRelationInfos as $item) {
                    $res['delegate_relation_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConfigDelegaterelationResponse
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
        if (isset($map['delegate_relation_infos'])) {
            if (!empty($map['delegate_relation_infos'])) {
                $model->delegateRelationInfos = [];
                $n                            = 0;
                foreach ($map['delegate_relation_infos'] as $item) {
                    $model->delegateRelationInfos[$n++] = null !== $item ? DelegateRelationInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
