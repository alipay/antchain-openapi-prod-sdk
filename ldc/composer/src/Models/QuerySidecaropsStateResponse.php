<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecaropsStateResponse extends Model
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

    // sidecar运维状态列表
    /**
     * @var SidecarReleaseStatus[]
     */
    public $releaseInfo;

    // 状态
    /**
     * @var string
     */
    public $state;

    // 变更核心所需变更后改动的podIp
    /**
     * @var string
     */
    public $changeTargets;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'releaseInfo'   => 'release_info',
        'state'         => 'state',
        'changeTargets' => 'change_targets',
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
        if (null !== $this->releaseInfo) {
            $res['release_info'] = [];
            if (null !== $this->releaseInfo && \is_array($this->releaseInfo)) {
                $n = 0;
                foreach ($this->releaseInfo as $item) {
                    $res['release_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->changeTargets) {
            $res['change_targets'] = $this->changeTargets;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecaropsStateResponse
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
        if (isset($map['release_info'])) {
            if (!empty($map['release_info'])) {
                $model->releaseInfo = [];
                $n                  = 0;
                foreach ($map['release_info'] as $item) {
                    $model->releaseInfo[$n++] = null !== $item ? SidecarReleaseStatus::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['change_targets'])) {
            $model->changeTargets = $map['change_targets'];
        }

        return $model;
    }
}
