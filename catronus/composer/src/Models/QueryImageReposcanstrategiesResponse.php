<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryImageReposcanstrategiesResponse extends Model
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

    // 镜像扫描策略
    /**
     * @var RepoScanStrategy[]
     */
    public $repoStrategies;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'repoStrategies' => 'repo_strategies',
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
        if (null !== $this->repoStrategies) {
            $res['repo_strategies'] = [];
            if (null !== $this->repoStrategies && \is_array($this->repoStrategies)) {
                $n = 0;
                foreach ($this->repoStrategies as $item) {
                    $res['repo_strategies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImageReposcanstrategiesResponse
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
        if (isset($map['repo_strategies'])) {
            if (!empty($map['repo_strategies'])) {
                $model->repoStrategies = [];
                $n                     = 0;
                foreach ($map['repo_strategies'] as $item) {
                    $model->repoStrategies[$n++] = null !== $item ? RepoScanStrategy::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
