<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceConfigResponse extends Model
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

    // 链路配置
    /**
     * @var TraceSpanSearchTagConfig[]
     */
    public $tags;

    // 链路搜索的大类
    /**
     * @var string[]
     */
    public $categories;

    // 数据库配置
    /**
     * @var TraceSpanSearchDbConfig[]
     */
    public $dbconfigs;

    // 消息队列的kind取值范围
    /**
     * @var string[]
     */
    public $mqkinds;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tags'       => 'tags',
        'categories' => 'categories',
        'dbconfigs'  => 'dbconfigs',
        'mqkinds'    => 'mqkinds',
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
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->categories) {
            $res['categories'] = $this->categories;
        }
        if (null !== $this->dbconfigs) {
            $res['dbconfigs'] = [];
            if (null !== $this->dbconfigs && \is_array($this->dbconfigs)) {
                $n = 0;
                foreach ($this->dbconfigs as $item) {
                    $res['dbconfigs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mqkinds) {
            $res['mqkinds'] = $this->mqkinds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceConfigResponse
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
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? TraceSpanSearchTagConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['categories'])) {
            if (!empty($map['categories'])) {
                $model->categories = $map['categories'];
            }
        }
        if (isset($map['dbconfigs'])) {
            if (!empty($map['dbconfigs'])) {
                $model->dbconfigs = [];
                $n                = 0;
                foreach ($map['dbconfigs'] as $item) {
                    $model->dbconfigs[$n++] = null !== $item ? TraceSpanSearchDbConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mqkinds'])) {
            if (!empty($map['mqkinds'])) {
                $model->mqkinds = $map['mqkinds'];
            }
        }

        return $model;
    }
}
