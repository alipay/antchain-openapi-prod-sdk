<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcSharebatchResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // VC分享的结果列表，分别带有结果tx_hash
    /**
     * @var VcShareResult[]
     */
    public $vcShareResults;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'vcShareResults' => 'vc_share_results',
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
        if (null !== $this->vcShareResults) {
            $res['vc_share_results'] = [];
            if (null !== $this->vcShareResults && \is_array($this->vcShareResults)) {
                $n = 0;
                foreach ($this->vcShareResults as $item) {
                    $res['vc_share_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcSharebatchResponse
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
        if (isset($map['vc_share_results'])) {
            if (!empty($map['vc_share_results'])) {
                $model->vcShareResults = [];
                $n                     = 0;
                foreach ($map['vc_share_results'] as $item) {
                    $model->vcShareResults[$n++] = null !== $item ? VcShareResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
