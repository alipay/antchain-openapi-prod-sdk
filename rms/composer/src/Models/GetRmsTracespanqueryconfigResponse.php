<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetRmsTracespanqueryconfigResponse extends Model
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

    // 支持的tags列表
    /**
     * @var TraceSpanSearchTagConfig[]
     */
    public $tagConfigs;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tagConfigs' => 'tag_configs',
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
        if (null !== $this->tagConfigs) {
            $res['tag_configs'] = [];
            if (null !== $this->tagConfigs && \is_array($this->tagConfigs)) {
                $n = 0;
                foreach ($this->tagConfigs as $item) {
                    $res['tag_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRmsTracespanqueryconfigResponse
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
        if (isset($map['tag_configs'])) {
            if (!empty($map['tag_configs'])) {
                $model->tagConfigs = [];
                $n                 = 0;
                foreach ($map['tag_configs'] as $item) {
                    $model->tagConfigs[$n++] = null !== $item ? TraceSpanSearchTagConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
