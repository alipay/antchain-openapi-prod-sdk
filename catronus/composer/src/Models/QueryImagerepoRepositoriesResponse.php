<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryImagerepoRepositoriesResponse extends Model
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

    // 仓库列表
    /**
     * @var Repository[]
     */
    public $repositories;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'repositories' => 'repositories',
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
        if (null !== $this->repositories) {
            $res['repositories'] = [];
            if (null !== $this->repositories && \is_array($this->repositories)) {
                $n = 0;
                foreach ($this->repositories as $item) {
                    $res['repositories'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImagerepoRepositoriesResponse
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
        if (isset($map['repositories'])) {
            if (!empty($map['repositories'])) {
                $model->repositories = [];
                $n                   = 0;
                foreach ($map['repositories'] as $item) {
                    $model->repositories[$n++] = null !== $item ? Repository::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
